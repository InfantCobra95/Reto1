package com.Reto1.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.Reto1.Reto1.Model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
    public static ArrayList<Product> products = new ArrayList<>(Arrays.asList(
       new Product(1, "Dunsparce", 25000, "dunsparce.jpg"),
       new Product(2, "Umbreon", 20000, "umbreon.png"),
       new Product(3, "Pipo", 1000000, "pipo.jpg"),
       new Product(4, "Ledyba", 1551, "ledyba.png")
    ));

    @GetMapping("/product")
    public ArrayList<Product> getProducts(){
        return products;
    }

    @PostMapping("/product")
    public ArrayList<Product> postProducts(){
        return products;
    }

}   