package repositories.impl;

import domainmodels.SanPham;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.SanPhamResponse;

public class SanPhamRepository extends CrudRepository<UUID, SanPham, SanPhamResponse> {

    public SanPhamRepository() {
        className = SanPham.class.getName();
        res = "new viewmodels.SanPhamResponse(a.id, a.ma, a.ten)";
    }

}
