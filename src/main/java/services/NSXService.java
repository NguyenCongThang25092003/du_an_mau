package services;

import domainmodels.NSX;
import java.util.List;
import java.util.UUID;
import viewmodels.NSXResponse;

public interface NSXService {
    
    List<NSXResponse> getAllResponse();
    
    String insert(NSX nsx);
    
    String update(NSX nsx);
    
    String delete(UUID id);
    
    List<NSX> getAll();
    
}
