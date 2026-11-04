package com.joysistvi.day15.oopintro.miniactivity;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();

        shirt.brand = "Uniqlo";
        shirt.color = "Black";
        shirt.size = "Large";
        shirt.material = "Cotton";
        shirt.shirtType = "Polo Shirt";
        shirt.price = 599.00;

        shirt.wearShirt();
        shirt.washShirt();
        shirt.foldShirt();
        shirt.ironShirt();


        Shirt shirt2 = new Shirt();

        shirt2.brand = "Nike";
        shirt2.color = "White";
        shirt2.size = "Large";
        shirt2.material = "Fabric";
        shirt2.shirtType = "Sports Shirt";
        shirt2.price = 799.50;

        shirt.foldShirt();
        shirt.washShirt();
        shirt.ironShirt();


        Shirt shirt3 = new Shirt();

        shirt3.brand = "H&M";
        shirt3.color = "Navy Blue";
        shirt3.size = "Large";
        shirt3.material = "Linen";
        shirt3.shirtType = "Casual Shirt";
        shirt3.price = 999.99;

        shirt.foldShirt();
        shirt.wearShirt();
        shirt.washShirt();
    }
}
