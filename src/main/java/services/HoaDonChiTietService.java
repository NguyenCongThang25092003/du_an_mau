package services;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import viewmodels.GioHangChiTietResponse;
import viewmodels.HoaDonChiTietResponse;

public interface HoaDonChiTietService {

    boolean insert(UUID idHoaDon, Map<UUID, GioHangChiTietResponse> list);

    List<HoaDonChiTietResponse> getListHoaDonChiTietTheoIdHoaDon(UUID id);
}
