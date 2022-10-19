package services.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import repositories.impl.HoaDonChiTietRepository;
import services.HoaDonChiTietService;
import viewmodels.GioHangChiTietResponse;
import viewmodels.HoaDonChiTietResponse;

public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    private HoaDonChiTietRepository hoaDonChiTietRepository;

    public HoaDonChiTietServiceImpl() {
        hoaDonChiTietRepository = new HoaDonChiTietRepository();
    }

    @Override
    public boolean insert(UUID idHoaDon, Map<UUID, GioHangChiTietResponse> list) {
        boolean check = hoaDonChiTietRepository.insert(idHoaDon, list);
        return check;
    }

    @Override
    public List<HoaDonChiTietResponse> getListHoaDonChiTietTheoIdHoaDon(UUID id) {
        return hoaDonChiTietRepository.getListHoaDonChiTietTheoIdHoaDon(id);
    }

}
