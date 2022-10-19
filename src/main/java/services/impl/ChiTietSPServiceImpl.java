package services.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import repositories.impl.ChiTietSPRepository;
import services.ChiTietSPService;
import viewmodels.ChiTietSPResponse;
import viewmodels.GioHangChiTietResponse;

public class ChiTietSPServiceImpl implements ChiTietSPService {

    private ChiTietSPRepository chiTietSPRepository;

    public ChiTietSPServiceImpl() {
        chiTietSPRepository = new ChiTietSPRepository();
    }

    @Override
    public boolean updateSoLuong(Map<UUID, GioHangChiTietResponse> list) {
        boolean check = chiTietSPRepository.updateSoLuong(list);
        return check;
    }

    @Override
    public List<ChiTietSPResponse> getAll(String name) {
        return chiTietSPRepository.getAll(name);
    }

}
