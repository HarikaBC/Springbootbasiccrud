package catalog.first.springboot1.operation_controller;

import catalog.first.springboot1.entity.Product;
import catalog.first.springboot1.info.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@valid
public class ProductC {

    @Autowired
    private ProductService ser;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return ser.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product) {
        return ser.saveProducts(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return ser.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return ser.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return ser.getProductByName(name);
    }

    @GetMapping("/productByBrand/{brand}")
    public Product findProductById(@PathVariable String Brand) {
        return ser.getProductByBrand(brand);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return ser.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return ser.deleteProduct(id);
    }


}
