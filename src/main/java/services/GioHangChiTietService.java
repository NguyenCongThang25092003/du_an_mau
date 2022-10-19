package services;

import domainmodels.GioHangChiTiet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import viewmodels.GioHangChiTietResponse;

public interface GioHangChiTietService {

    Map<UUID, GioHangChiTietResponse> convertToGioHangChiTiet(UUID idGioHang, List<GioHangChiTietResponse> listGioHangChiTietResponse);

    List<GioHangChiTietResponse> getListGioHangChiTietTheoMaHoaDon(String maHoaDon);
    
    boolean deleteByMaGioHang(String ma);
    
    boolean saveAll(List<GioHangChiTiet> list);
    
    List<GioHangChiTiet> converListGioHangChiTiet(Map<UUID, GioHangChiTietResponse> map);
    
    GioHangChiTiet convertGioHangChiTiet(GioHangChiTietResponse gioHangChiTietResponse);
    
    GioHangChiTiet saveOrUpdate(GioHangChiTiet gioHangChiTiet);
    
    GioHangChiTiet findByMa(String ma);
    
    boolean delete(GioHangChiTiet gioHangChiTiet);
}
