package com.sparky.hackathon;

import javax.persistence.*;
import java.util.List;

@Entity
public class ImageMap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String imageUrl;

    @OneToMany
    private List<Product> products;


    public String getImageUrl() {
        return imageUrl;
    }

    public List<Product> getProducts() {
        return products;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
