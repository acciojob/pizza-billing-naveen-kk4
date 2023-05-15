package com.driver;

public class PizzaBillGenerator implements BillGenerator{
    int price = 0;
    String bill = "";
    public String Bill(Pizza a){
         bill+="Base Price Of The Pizza: "+a.basePrice+"\n";
         price+=a.basePrice;
        if(a.isExtraCheese()){
            bill+=" Extra Cheese Added: "+a.cheesePrice+"\n";
            price+=a.cheesePrice;
        }
        if(a.isExtraToppings()){
            bill+=" Extra Toppings Added: "+a.toppingsPrice+"\n";
            price+=a.toppingsPrice;
        }
        if(a.isTakeAway()){
            bill+=" Paperbag Added: "+a.takeAwayPrice+"\n";
            price+=a.takeAwayPrice;
        }
        bill+="Total Price: "+price+"\n";
        return bill;

    }
}
