package Spring2.Spring2.Model;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {

    private int sId;
    private String sName;
    private String sDiv;
    private double sPer;
}
//lombook
//spring web
//dev tools