package catalog.first.springboot1.info;

import catalog.first.springboot1.entity.Product;
import catalog.first.springboot1.repository.ProductR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductR repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> product) {
        return repository.saveAll(product);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }
   public Product getProductByBrand(String brand) {
        return repository.findByName(brand);
    }


    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product products) {
        Product existingProduct;
        existingProduct = repository.findById(product.getId()).orElse(null);

        assert existingProduct != null;
        existingProduct.setName(products.getName());
        existingProduct.setQuantity(products.getQuantity());
        existingProduct.setPrice(products.getPrice());
        existingProduct.setBrand(products.getBrand());
        existingProduct.setCategory(products.getCategory());
        return repository.save(existingProducts);

    }


}
