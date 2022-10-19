package services;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import viewmodels.ChiTietSPResponse;
import viewmodels.GioHangChiTietResponse;

public interface ChiTietSPService {
    
    boolean updateSoLuong(Map<UUID, GioHangChiTietResponse> list);

    List<ChiTietSPResponse> getAll(String name);
}
