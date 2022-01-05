package com.company;

import com.company.Product;

public class ProductManager {



    public void takeCourse(Product product){
        System.out.println(product.getInstructor() + " isimli hocadan "
                            + product.id+": " + product.getName()
                            + " isimli ders alinmistir.");
    }

    public void addToCart(Product product){
        System.out.println(product.getName() + ": Sepete ekleme kodu cagrildi.");
    }




}
