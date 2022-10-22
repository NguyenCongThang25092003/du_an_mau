package repositories.impl;

import domainmodels.NhanVien;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.NhanVienResponse;

public class NhanVienRepository extends CrudRepository<UUID, NhanVien, NhanVienResponse>{

    public NhanVienRepository() {
        className = NhanVien.class.getName();
        res = "new viewmodels.NhanVienResponse (a.id, a.ma, a.ten, a.tenDem, a.ho, "
                + "a.gioiTinh, a.ngaySinh, a.diaChi, a.sdt, a.matKhau, "
                + "a.cuaHang.ten, a.chucVu.ten, a.nhanVien.id, a.trangThai)";
    }
    
}
