package viewmodels;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSPResponse {
    
    private UUID idChiTietSP;
    private String maSP;
    private String tenSP;
    private Integer namBH;
    private String moTa;
    private Integer soLuongSP;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public Object[] toDataRow(int index) {
        return new Object[]{index, maSP, tenSP, namBH, moTa, soLuongSP, giaNhap, giaBan};
    }

}
