package HQLCrudOperationWithDataBase.HQLCrudOperationWithDataBase.Model;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "student_hql")
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter

public class StudModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sId")
    private int sId;
    @Column(name = "sName")
    private String sName;
    @Column(name = "sContNo")
    private long sContNo;
    @Column(name = "sMarks")
    private double sMarks;

    public StudModel() {
    }

    public StudModel(int sId, String sName, long sContNo, double sMarks) {
        this.sId = sId;
        this.sName = sName;
        this.sContNo = sContNo;
        this.sMarks = sMarks;
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

    public double getsMarks() {
        return sMarks;
    }

    public void setsMarks(double sMarks) {
        this.sMarks = sMarks;
    }
}
