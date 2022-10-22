package repositories.impl;

import domainmodels.DongSP;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.DongSPResponse;

public class DongSPRepository extends CrudRepository<UUID, DongSP, DongSPResponse> {

    public DongSPRepository() {
        className = DongSP.class.getName();
        res = "new viewmodel.DongSPResponse(a.id, a.ten, a.ma)";
    }
}
