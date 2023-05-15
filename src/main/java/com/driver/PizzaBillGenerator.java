package com.driver;

public class PizzaBillGenerator implements BillGenerator{

    String bill = "";
    public String Bill(Pizza a){
         bill+="Base Price Of The Pizza: "+a.basePrice+"\n";
        if(a.isExtraCheese())bill+=" Extra Cheese Added: "+a.cheesePrice+"\n";
        if(a.isExtraToppings())bill+=" Extra Toppings Added: "+a.toppingsPrice+"\n";
        if(a.isTakeAway())bill+=" Paperbag Added: "+a.takeAwayPrice+"\n";
        bill+="Total Price: "+a.getPrice()+"\n";
        return bill;

    }
}
