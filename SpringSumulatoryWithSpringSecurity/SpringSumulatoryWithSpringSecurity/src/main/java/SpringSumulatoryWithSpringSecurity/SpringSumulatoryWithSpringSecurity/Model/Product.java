package SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "product_simulator")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pId")
    private int pId;
    @Column(name = "pName")
    private String pName;
    @Column(name = "pPrice")
    private double pPrice;
    @Column(name = "pQty")
    private int pQty;
    @Column(name = "pUserQty")
    private int pUserQty;

    public Product(String pName, double pPrice, int pQty, int pUserQty) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.pQty = pQty;
        this.pUserQty = pUserQty;
    }
}
