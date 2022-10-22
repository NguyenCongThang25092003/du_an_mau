package repositories.impl;

import domainmodels.ChiTietSP;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.persistence.Query;
import repositories.CrudRepository;
import utillies.HibernateUtil;
import viewmodels.ChiTietSPResponse;
import viewmodels.GioHangChiTietResponse;

public class ChiTietSPRepository extends CrudRepository<UUID, ChiTietSP, ChiTietSPResponse> {

    public ChiTietSPRepository() {
        className = ChiTietSP.class.getName();
        res = "new viewmodels.ChiTietSPResponse (a.id, a.sanPham.ten, a.nsx.ten, a.mauSac.ten, "
                + "a.dongSP.ten, a.namBH, a.moTa, a.soLuongTon, a.giaBan, a.giaNhap)";
    }

    public boolean updateSoLuong(Map<UUID, GioHangChiTietResponse> list) {
        boolean check = false;
        String sql = "UPDATE ChiTietSP SET SoLuongTon = SoLuongTon - :soLuongMua WHERE id = :id";
        session = HibernateUtil.getSession();
        trans = session.beginTransaction();
        try {
            for (Map.Entry<UUID, GioHangChiTietResponse> entry : list.entrySet()) {
                GioHangChiTietResponse value = entry.getValue();
                Query query = session.createQuery(sql);
                query.setParameter("soLuongMua", value.getSoLuongSP());
                query.setParameter("id", value.getIdChiTietSP());
                query.executeUpdate();
            }
            check = true;
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
        }
        return check;
    }

    public List<ChiTietSPResponse> getAll(String name) {
        List<ChiTietSPResponse> list = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            String hql = "SELECT new viewmodels.ChiTietSPResponse"
                    + "(a.id, a.sanPham.ma, a.sanPham.ten, a.namBH, a.moTa, a.soLuongTon, a.giaNhap, a.giaBan) "
                    + " FROM ChiTietSP a WHERE a.sanPham.ten LIKE CONCAT('%',:name,'%')";
            Query query = session.createQuery(hql);
            query.setParameter("name", name);
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
