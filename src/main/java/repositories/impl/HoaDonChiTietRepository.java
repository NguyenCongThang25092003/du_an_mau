package repositories.impl;

import domainmodels.ChiTietSP;
import domainmodels.HoaDon;
import domainmodels.HoaDonChiTiet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.persistence.Query;
import repositories.CrudRepository;
import utillies.HibernateUtil;
import viewmodels.GioHangChiTietResponse;
import viewmodels.HoaDonChiTietResponse;

public class HoaDonChiTietRepository extends CrudRepository<UUID, HoaDonChiTiet, HoaDonChiTietResponse> {

    public boolean insert(UUID idHoaDon,Map<UUID, GioHangChiTietResponse> list) {
        boolean check = false;
        session = HibernateUtil.getSession();
        trans = session.beginTransaction();
        try {
            for (Map.Entry<UUID, GioHangChiTietResponse> entry : list.entrySet()) {
                GioHangChiTietResponse value = entry.getValue();

                HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();

                ChiTietSP chiTietSP = new ChiTietSP();
                chiTietSP.setId(value.getIdChiTietSP());
                HoaDon hoaDon = new HoaDon();
                hoaDon.setId(idHoaDon);

                hoaDonChiTiet.setIdChiTietSP(chiTietSP);
                hoaDonChiTiet.setIdHoaDon(hoaDon);
                hoaDonChiTiet.setDonGia(value.getGiaBan());
                hoaDonChiTiet.setSoLuong(value.getSoLuongSP());

                session.saveOrUpdate(hoaDonChiTiet);
            }
            trans.commit();
            check = true;
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();
        }
        return check;
    }

    public List<HoaDonChiTietResponse> getListHoaDonChiTietTheoIdHoaDon(UUID id) {
        List<HoaDonChiTietResponse> list = new ArrayList<>();
        session = HibernateUtil.getSession();
        try {
            Query query = session.createQuery("SELECT new viewmodels.HoaDonChiTietResponse "
                    + "(a.IdChiTietSP.id, a.IdHoaDon.id, a.IdChiTietSP.sanPham.ma, a.IdChiTietSP.sanPham.ten, a.soLuong, a.donGia)"
                    + " FROM HoaDonChiTiet a WHERE a.IdHoaDon.id = :id");
            query.setParameter("id", id);
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
