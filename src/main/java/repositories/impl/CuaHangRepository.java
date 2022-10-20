package repositories.impl;

import domainmodels.CuaHang;
import java.util.List;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.CuaHangResponse;

public class CuaHangRepository extends CrudRepository<UUID, CuaHang, CuaHangResponse>{

    public CuaHangRepository() {
        className = CuaHang.class.getName();
        res = "new viewmodels.CuaHangResponse(a.id, a.ma, a.ten, a.diaChi, a.thanhPho, a.quocGia)";
    }
    
}
