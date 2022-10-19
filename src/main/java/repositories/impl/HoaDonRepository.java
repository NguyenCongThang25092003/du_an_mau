package repositories.impl;

import domainmodels.HoaDon;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.query.NativeQuery;
import repositories.CrudRepository;
import utillies.HibernateUtil;
import viewmodels.HoaDonResponse;

public class HoaDonRepository extends CrudRepository<UUID, HoaDon, HoaDonResponse> {

    public List<HoaDonResponse> getAll(String trangThai) {
        List<HoaDonResponse> list = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
                    String hql = "SELECT new viewmodels.HoaDonResponse"
                    + " (a.id, a.ma, a.ngayTao, b.ten, a.tinhTrang) "
                    + " FROM HoaDon a LEFT JOIN a.nhanVien b WHERE a.tinhTrang LIKE CONCAT('%',:trangThai,'%')"
                    + " ORDER BY NgayTao DESC";
            Query query = session.createQuery(hql);
            query.setParameter("trangThai", trangThai);
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean updateTrangThaiHoaDon(UUID id) {
        boolean check = false;
        session = HibernateUtil.getSession();
        trans = session.beginTransaction();
        try {
            Query query = session.createQuery("UPDATE HoaDon SET TinhTrang = 2 WHERE Id = :id");
            query.setParameter("id", id);
            query.executeUpdate();
            check = true;
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
        }
        return check;
    }

    public int genMaHoaDon() {
        String maStr = "";
        session = HibernateUtil.getSession();
        try {
            String nativeQuery = "SELECT MAX(CONVERT(INT, SUBSTRING(Ma,3,10))) from HoaDon";
            NativeQuery query = session.createNativeQuery(nativeQuery);
            if (query.getSingleResult() != null) {
                maStr = query.getSingleResult().toString();
            } else {
                maStr = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (maStr == null) {
            maStr = "0";
            int ma = Integer.parseInt(maStr);
            return ++ma;
        }
        int ma = Integer.parseInt(maStr);
        return ++ma;
    }

}
