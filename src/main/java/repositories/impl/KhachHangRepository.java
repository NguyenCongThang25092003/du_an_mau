package repositories.impl;

import domainmodels.KhachHang;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.KhachHangResponse;

public class KhachHangRepository extends CrudRepository<UUID, KhachHang, KhachHangResponse>{

    public KhachHangRepository() {
        className = KhachHang.class.getName();
        res = "new viewmodels.KhachHangResponse(a.id, a.ma, a.ten, a.tenDem, a.ho, a.ngaySinh, a.sdt, a.diaChi, a.thanhPho, a.quocGia, a.matKhau)";
    }
    
}
