package services;

import domainmodels.ChiTietSP;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import viewmodels.ChiTietSPResponse;
import viewmodels.ChiTietSPResponse;
import viewmodels.GioHangChiTietResponse;

public interface ChiTietSPService {

    boolean updateSoLuong(Map<UUID, GioHangChiTietResponse> list);

    List<ChiTietSPResponse> getAll(String name);

    List<ChiTietSPResponse> getAllResponse();

    List<ChiTietSP> getAll();

    String insert(ChiTietSP chiTietSP);

    String update(ChiTietSP chiTietSP);

    String delete(UUID id);
}
