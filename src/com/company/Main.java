package com.company;

public class Main {

    public static void main(String[] args) {

        //Kurs özellikleri: id,hoca, dil, kurs ismi


        Product product1 = new Product(1,"Java + React" ,"Java ve reacta giris" , "Engin Demiroğ");
        Product product2 = new Product(2,"JS","JS ile Kodlama","Mustafa Murat Coskun");

        Product[] products = {product1,product2};

        for (Product p:products) {
            System.out.println(p.getName());
        }

        System.out.println("***********************");


        ProductManager productManager = new ProductManager();

        productManager.takeCourse(product1);
        productManager.takeCourse(product2);

        System.out.println("********************");

        productManager.addToCart(product1);
        productManager.addToCart(product2);



    }
}
