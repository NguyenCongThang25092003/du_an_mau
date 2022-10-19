package viewmodels;

import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonResponse {

    private UUID id;
    private String maHD;
    private Date ngayTao;
    private String tenNV;
    private Integer tinhTrang;

    public Object[] toDataRow(int index) {
        return new Object[]{index, maHD, ngayTao, "Thắng", convertTrangThai()};
    }
    
    public String convertTrangThai(){
        return tinhTrang == 0 ? "Hủy" : (tinhTrang == 1 ? "Chờ thanh toán" : "Đã thanh toán");
    }

}
