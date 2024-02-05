package SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Repository;

import SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
