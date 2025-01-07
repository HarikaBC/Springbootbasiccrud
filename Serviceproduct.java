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
    // First, we attempt to retrieve the product using its ID
        
    Optional<Product> optionalProduct = repository.findById(id);
    
    // Now, we check if the product was found
    if (optionalProduct.isPresent()) {
    // If the product exists, return it
        return optionalProduct.get();
    } else {
        // If the product wasn't found, return null
        return null;
    }
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

    Product foundProduct = repository.findById(product.getId()).orElse(null);

    //  Check if the product exists
    if (foundProduct == null) {
// If the product is not found, return null or handle as needed (e.g., throw an exception)
        return null;
    }

    //  Update the product details with the new data
    foundProduct.setName(product.getName());
    foundProduct.setQuantity(product.getQuantity());
    foundProduct.setPrice(product.getPrice());
    foundProduct.setBrand(product.getBrand());
    foundProduct.setCategory(product.getCategory());

    //  Save the updated product back to the repository
    return repository.save(foundProduct);
}

}
