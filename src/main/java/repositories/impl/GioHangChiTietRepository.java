package repositories.impl;

import domainmodels.GioHangChiTiet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import repositories.CrudRepository;
import utillies.HibernateUtil;
import viewmodels.GioHangChiTietResponse;

public class GioHangChiTietRepository extends CrudRepository<UUID, GioHangChiTiet, GioHangChiTietResponse> {

    public GioHangChiTietRepository() {
        className = GioHangChiTiet.class.getName();
    }

    public List<GioHangChiTietResponse> getListGioHangChiTietTheoMaHoaDon(String maHoaDon) {
        List<GioHangChiTietResponse> list = new ArrayList<>();
        session = HibernateUtil.getSession();
        try {
            Query query = session.createQuery("SELECT new viewmodels.GioHangChiTietResponse "
                    + "(a.IdChiTietSP.id, a.IdGioHang.id, a.IdChiTietSP.sanPham.ma, a.IdChiTietSP.sanPham.ten, a.soLuong, a.donGia)"
                    + " FROM GioHangChiTiet a WHERE a.IdGioHang.ma = :ma");
            query.setParameter("ma", maHoaDon);
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean deleteByMaGioHang(String ma) {
        try {
            List<GioHangChiTiet> listGioHangChiTiet = getAll();
            if (listGioHangChiTiet == null) {
                return false;
            }
            session = HibernateUtil.getSession();
            trans = session.beginTransaction();
            for (GioHangChiTiet xx : listGioHangChiTiet) {
                if(ma.equals(xx.getIdGioHang().getMa())){
                    session.delete(xx);
                }
            }
            trans.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
            return false;
        }
        return true;
    }

}
