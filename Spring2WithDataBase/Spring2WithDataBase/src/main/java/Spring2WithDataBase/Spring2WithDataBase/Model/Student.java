package Spring2WithDataBase.Spring2WithDataBase.Model;

import jakarta.persistence.*;



@Entity
@Table(name = "student1")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sId")
    private  int sId;
    @Column(name = "sName")
    private String sName;
    @Column(name = "sMarks")
    private double sMarks;

    public Student() {
    }

    public Student(String sName, double sMarks) {
        this.sName = sName;
        this.sMarks = sMarks;
    }

    public Student(int sId, String sName, double sMarks) {
        this.sId = sId;
        this.sName = sName;
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

    public double getsMarks() {
        return sMarks;
    }

    public void setsMarks(double sMarks) {
        this.sMarks = sMarks;
    }
}
//lombook
//spring web
//dev tools
//mysql
//JPA Repository