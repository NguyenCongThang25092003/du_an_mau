package services;

import domainmodels.CuaHang;
import java.util.List;
import java.util.UUID;

public interface CuaHangService {

    List<CuaHang> getAll();

    String insert(CuaHang cuaHang);

    String delete(UUID id);

    String update(UUID id, CuaHang cuaHang);
}
