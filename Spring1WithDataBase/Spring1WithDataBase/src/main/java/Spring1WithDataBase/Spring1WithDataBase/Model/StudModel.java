package Spring1WithDataBase.Spring1WithDataBase.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "students")
public class StudModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sId")
    private int sId;
    @Column(name = "sName")
    private String sName;
    @Column(name = "sContNo")
    private long sContNo;
    @Column(name = "sPer")
    private double sPer;

    public StudModel() {
    }

    public StudModel(String sName, long sContNo, double sPer) {
        this.sName = sName;
        this.sContNo = sContNo;
        this.sPer = sPer;
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

    public double getsPer() {
        return sPer;
    }

    public void setsPer(double sPer) {
        this.sPer = sPer;
    }
}
