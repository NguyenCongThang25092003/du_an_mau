package services;

import domainmodels.GioHang;

public interface GioHangService {
    
    GioHang save(GioHang gioHang);
    
    boolean deleteByMa(String ma);
    
    GioHang findByMa(String ma);
}
