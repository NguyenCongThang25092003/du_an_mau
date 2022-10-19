package services;

import domainmodels.NhanVien;
import java.util.List;
import java.util.UUID;

public interface NhanVienService {

    List<NhanVien> getAll();

    String insert(NhanVien nhanVien);

    String delete(UUID id);

    String update(UUID id, NhanVien nhanVien);
}
