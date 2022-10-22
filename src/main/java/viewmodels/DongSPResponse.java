package viewmodels;

import java.util.UUID;

public class DongSPResponse {
    private UUID id;
    private String ma;
    private String ten;
    
    public Object[] toDatarow(int index) {
        return new Object[]{index, ma, ten};
    }
}