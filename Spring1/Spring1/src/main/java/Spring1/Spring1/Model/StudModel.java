package Spring1.Spring1.Model;

import org.springframework.stereotype.Component;

@Component
public class StudModel {
    private int sId;
    private String sName;
    private long sContNo;

    public StudModel() {
    }

    public StudModel(int sId, String sName, long sContNo) {
        this.sId = sId;
        this.sName = sName;
        this.sContNo = sContNo;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public long getsContNo() {
        return sContNo;
    }

    public void setsContNo(long sContNo) {
        this.sContNo = sContNo;
    }
}
