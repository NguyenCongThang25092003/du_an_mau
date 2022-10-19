package services.impl;

import domainmodels.ChiTietSP;
import domainmodels.GioHang;
import domainmodels.GioHangChiTiet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import repositories.impl.GioHangChiTietRepository;
import services.GioHangChiTietService;
import viewmodels.GioHangChiTietResponse;

public class GioHangChiTietServiceImpl implements GioHangChiTietService {

    private GioHangChiTietRepository gioHangChiTietRepository;

    public GioHangChiTietServiceImpl() {
        gioHangChiTietRepository = new GioHangChiTietRepository();
    }

    @Override
    public Map<UUID, GioHangChiTietResponse> convertToGioHangChiTiet(UUID idGioHang, List<GioHangChiTietResponse> listGioHangChiTietResponse) {
        Map<UUID, GioHangChiTietResponse> mapGioHangChiTietResponse = new HashMap<>();
        for (GioHangChiTietResponse xx : listGioHangChiTietResponse) {
            GioHangChiTietResponse gioHangChiTietResponse = new GioHangChiTietResponse();
            gioHangChiTietResponse.setIdChiTietSP(xx.getIdChiTietSP());
            gioHangChiTietResponse.setIdGioHang(idGioHang);
            gioHangChiTietResponse.setMaSP(xx.getMaSP());
            gioHangChiTietResponse.setTenSP(xx.getTenSP());
            gioHangChiTietResponse.setGiaBan((xx.getGiaBan()));
            gioHangChiTietResponse.setSoLuongSP((xx.getSoLuongSP()));
            mapGioHangChiTietResponse.put(gioHangChiTietResponse.getIdChiTietSP(), gioHangChiTietResponse);
        }
        return mapGioHangChiTietResponse;
    }

    @Override
    public List<GioHangChiTietResponse> getListGioHangChiTietTheoMaHoaDon(String maHoaDon) {
        return gioHangChiTietRepository.getListGioHangChiTietTheoMaHoaDon(maHoaDon);
    }

    @Override
    public boolean deleteByMaGioHang(String ma) {
        boolean check = gioHangChiTietRepository.deleteByMaGioHang(ma);
        if (check) {
            return true;
        }
        return false;
    }

    @Override
    public boolean saveAll(List<GioHangChiTiet> list) {
        boolean check = gioHangChiTietRepository.saveAll(list);
        if (check) {
            return true;
        }
        return false;
    }

    @Override
    public List<GioHangChiTiet> converListGioHangChiTiet(Map<UUID, GioHangChiTietResponse> map) {
        List<GioHangChiTiet> list = new ArrayList<>();
        for (Map.Entry<UUID, GioHangChiTietResponse> entry : map.entrySet()) {
            GioHangChiTietResponse value = entry.getValue();

            GioHangChiTiet gioHangChiTiet = convertGioHangChiTiet(value);
            list.add(gioHangChiTiet);
        }
        return list;
    }

    @Override
    public GioHangChiTiet convertGioHangChiTiet(GioHangChiTietResponse gioHangChiTietResponse) {
        GioHangChiTiet gioHangChiTiet = new GioHangChiTiet();

        ChiTietSP chiTietSP = new ChiTietSP();
        chiTietSP.setId(gioHangChiTietResponse.getIdChiTietSP());
        GioHang gioHang = new GioHang();
        gioHang.setId(gioHangChiTietResponse.getIdGioHang());

        gioHangChiTiet.setIdChiTietSP(chiTietSP);
        gioHangChiTiet.setIdGioHang(gioHang);
        gioHangChiTiet.setDonGia(gioHangChiTietResponse.getGiaBan());
        gioHangChiTiet.setSoLuong(gioHangChiTietResponse.getSoLuongSP());
        return gioHangChiTiet;
    }

    @Override
    public GioHangChiTiet saveOrUpdate(GioHangChiTiet gioHangChiTiet) {
        return gioHangChiTietRepository.saveOrUpdate(gioHangChiTiet);
    }

    @Override
    public GioHangChiTiet findByMa(String ma) {
        return gioHangChiTietRepository.findByMa(ma);
    }

    @Override
    public boolean delete(GioHangChiTiet gioHangChiTiet) {
        boolean check = gioHangChiTietRepository.detele(gioHangChiTiet);
        return check;
    }

}
