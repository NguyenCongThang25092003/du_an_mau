package services.impl;

import domainmodels.HoaDon;
import java.util.List;
import java.util.UUID;
import repositories.impl.HoaDonRepository;
import services.HoaDonService;
import viewmodels.HoaDonResponse;

public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonRepository hoaDonRepository;

    public HoaDonServiceImpl() {
        hoaDonRepository = new HoaDonRepository();
    }

    @Override
    public List<HoaDonResponse> getAll(String trangThai) {
        return hoaDonRepository.getAll(trangThai);
    }

    @Override
    public String insert(HoaDon hoaDon) {
        HoaDon check = hoaDonRepository.saveOrUpdate(hoaDon);
        if (check != null) {
            return "Thêm hóa đơn thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public int genMaHoaDon() {
        return hoaDonRepository.genMaHoaDon();
    }

    @Override
    public boolean updateTrangThaiHoaDon(UUID id) {
        boolean check = hoaDonRepository.updateTrangThaiHoaDon(id);
        return check;
    }

}
