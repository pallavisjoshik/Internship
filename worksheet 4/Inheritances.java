package com.java.Inheritance;

class House {
    int room;
    void Total() {
        int bedrooms = 5;
        int toilets = 4;
        int hall = 2;
        int kitchen = 1;
        System.out.println("total bedrooms =  "+ bedrooms +"\n toilets="+toilets+"\n hall="+hall+"\n kitchen="+kitchen);
    }
}
//  example of single level inheritance
 class kitchen extends House{
    void food() {
        System.out.println("meals are being made");
    }
}
//example of hierarchical inheritance
 class bedroom extends House{
    void infra() {
        System.out.println("it has one bed, one dressing and one bathroom");
    }
}
//example of multilevel inheritance
class dressing extends bedroom{
    void beauty(){
        System.out.println("it has all make up products");
    }
}
class Inheritances{
    public static void main(String[]args) {
        kitchen obj = new kitchen();
        bedroom obj1 = new bedroom();
        dressing obj2 = new dressing();
        System.out.println("through single level inheritance we can know things in kitchen and house");
        obj.Total();
        obj.food();
        System.out.println("through heirarchical inheritance we can know about house, bedroom");
        obj1.Total();
        obj1.infra();
        System.out.println("through multilevel inheritance we can know about house, bedroom and dressing");
        obj2.infra();
        obj2.beauty();
        obj2.Total();
    }
}
