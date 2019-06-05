package com.sparky.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ImageMapperController {

        @Autowired
        ImageMapRepository imageMapRepository;

        @RequestMapping("/checkversion")
        public String forTesting() {
            return "v1";
        }

        @CrossOrigin()
        @RequestMapping("/imagemaps")
        public List<ImageMap> findAll() {
            // Iterable<ImageMap> imageMaps = imageMapRepository.findAll();
            ImageMap imageMap = new ImageMap();
            imageMap.setImageUrl("https://fake.domain.com/image.jpg");
            Product product1 = new Product();
            product1.setThumbnailUrl("https://electronics.what.com/media/12313413-thumbnail.jpg");
            product1.setName("Product 1 name");
            product1.setPrice(15.20);
            product1.setDetailUrl("https://electronics.what.com/p/12313413");
            product1.setDescription("Product 1 description");
            product1.setCoordinates(new Coordinates(20, 40, 100, 50));
            List<Product> products = new ArrayList<>();
            products.add(product1);

            imageMap.setProducts(products);

            List<ImageMap> imageMaps = new ArrayList<>();
            imageMaps.add(imageMap);
            System.out.println("Image map:"+imageMaps.size());
            return imageMaps;
        }

}
