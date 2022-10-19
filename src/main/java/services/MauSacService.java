package services;

import domainmodels.MauSac;
import java.util.List;
import java.util.UUID;
import viewmodels.MauSacResponse;

public interface MauSacService {
    
    List<MauSacResponse> getAllResponse();

    String insert(MauSac mauSac);

    String delete(UUID id);

    String update(MauSac mauSac);
    
    List<MauSac> getAll();
}
