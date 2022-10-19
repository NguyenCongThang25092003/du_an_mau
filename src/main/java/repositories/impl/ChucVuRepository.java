package repositories.impl;

import domainmodels.ChucVu;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.ChucVuResponse;

public class ChucVuRepository extends CrudRepository<UUID, ChucVu, ChucVuResponse> {

    public ChucVuRepository() {
        className = ChucVu.class.getName();
        res = "new viewmodels.ChucVuResponse(a.id, a.ma, a.ten)";
    }

}
