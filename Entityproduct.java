package catalog.first.springboot1.entity;
import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
public class Product {


    @Id
    @GeneratedValue
    private int id;
public int getId(){
    return id;
}
    private String name;
    public String getName(){
        return name;}
    private int quantity;
        public int getQuantity(){
            return quantity;}
    private double price;
            public double getPrice(){
                return price;}
    private String brand;
                public String getBrand(){
                    return brand;}
    private String category;
                    public String getCategory(){
                        return category;}
    public void setId(int id){
                        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setCategory(String category){
        this.category=category;
    }


}


