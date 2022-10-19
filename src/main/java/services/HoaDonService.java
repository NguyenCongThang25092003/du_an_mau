package services;

import domainmodels.HoaDon;
import java.util.List;
import java.util.UUID;
import viewmodels.HoaDonResponse;

public interface HoaDonService {
    
    List<HoaDonResponse> getAll(String trangThai);
    
    String insert(HoaDon hoaDon);
    
    boolean updateTrangThaiHoaDon(UUID id);
    
    int genMaHoaDon();
}
