package repositories.impl;

import domainmodels.MauSac;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.MauSacResponse;

public class MauSacRepository extends CrudRepository<UUID, MauSac, MauSacResponse> {

    public MauSacRepository() {
        className = MauSac.class.getName();
        res = "new viewmodels.MauSacResponse(a.id, a.ma, a.ten)";
    }

}
