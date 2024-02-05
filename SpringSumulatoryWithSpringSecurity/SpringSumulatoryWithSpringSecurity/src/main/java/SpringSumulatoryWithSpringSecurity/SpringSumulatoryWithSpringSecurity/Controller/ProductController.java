package SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Controller;

import SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Model.Product;
import SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    public List<Product> displayData()
    {
        return productService.displayData();
    }
    //-------------------------------------------
}
