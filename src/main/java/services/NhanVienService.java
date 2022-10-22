package services;

import domainmodels.NhanVien;
import java.util.List;
import java.util.UUID;
import viewmodels.NhanVienResponse;

public interface NhanVienService {

    List<NhanVienResponse> getAllResponse();
    
    String insert(NhanVien nhanVien);
    
    String update(NhanVien nhanVien);
    
    String delete(UUID id);
    
    List<NhanVien> getAll();
}
