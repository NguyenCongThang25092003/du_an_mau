package repositories.impl;

import domainmodels.GioHang;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.GioHangResponse;

public class GioHangRepository extends CrudRepository<UUID, GioHang, GioHangResponse>{

    public GioHangRepository() {
        className = GioHang.class.getName();
    }
    
}
