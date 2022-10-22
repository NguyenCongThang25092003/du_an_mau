package repositories.impl;

import domainmodels.NSX;
import java.util.UUID;
import repositories.CrudRepository;
import viewmodels.NSXResponse;

public class NSXRepository extends CrudRepository<UUID, NSX, NSXResponse>{

    public NSXRepository() {
        className = NSX.class.getName();
        res = "new viewmodels.NSXResponse (a.id, a.ma, a.ten)";
    }
}
