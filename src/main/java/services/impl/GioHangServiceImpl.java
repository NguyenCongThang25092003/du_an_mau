package services.impl;

import domainmodels.GioHang;
import repositories.impl.GioHangRepository;
import services.GioHangService;

public class GioHangServiceImpl implements GioHangService {

    private GioHangRepository gioHangRepository;

    public GioHangServiceImpl() {
        gioHangRepository = new GioHangRepository();
    }

    @Override
    public GioHang save(GioHang gioHang) {
        GioHang gioHangFindByMa = gioHangRepository.findByMa(gioHang.getMa());
        GioHang check = null;
        if (gioHangFindByMa == null) {
            check = gioHangRepository.saveOrUpdate(gioHang);
        }
        if (check != null) {
            return check;
        } else {
            return gioHangFindByMa;
        }
    }

    @Override
    public boolean deleteByMa(String ma) {
        GioHang gioHangFindByMa = gioHangRepository.findByMa(ma);
        if(gioHangFindByMa == null){
            return false;
        }
        gioHangRepository.detele(gioHangFindByMa);
        return true;
    }

    @Override
    public GioHang findByMa(String ma) {
        return gioHangRepository.findByMa(ma);
    }
    
}
