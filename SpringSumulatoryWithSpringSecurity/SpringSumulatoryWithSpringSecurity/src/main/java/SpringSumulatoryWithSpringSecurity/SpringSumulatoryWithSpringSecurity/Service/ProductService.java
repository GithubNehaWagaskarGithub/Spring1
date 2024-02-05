package SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Service;

import SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Model.Product;
import SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> displayData()
    {
        return productRepository.findAll();
    }
    //--------------------------------------------
}
