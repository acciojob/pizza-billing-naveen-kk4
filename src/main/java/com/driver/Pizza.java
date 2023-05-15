package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese = false;
    private boolean extraToppings = false;
    private boolean takeAway = false;
    public static int takeAwayPrice = 20;
    public static int cheesePrice = 80;
    public static int vegToppings = 70;
    public static int nonVegToppings = 120;
    public static int vegPizzaPrice = 300;
    public static int  nonVegPizzaPrice = 400;
    public static int toppingsPrice;
    public static int basePrice;
    private BillGenerator finalBill;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg?vegPizzaPrice:nonVegPizzaPrice;
        this.bill ="";
        finalBill = new PizzaBillGenerator();

    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isExtraToppings() {
        return extraToppings;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public void setExtraCheese() {
        this.extraCheese = true;
    }
    public void setExtraToppings() {
        this.extraToppings = true;
        toppingsPrice = isVeg?vegToppings:nonVegToppings;
    }

    public int getPrice(){
        this.price+= isVeg ? vegPizzaPrice:nonVegPizzaPrice;
        this.price+=extraCheese?cheesePrice:0;
        this.price+=extraToppings?isVeg?vegToppings:nonVegToppings:0;
        this.price+=takeAway?takeAwayPrice:0;
        return this.price;



    }

    public void addExtraCheese(){
        if(!extraCheese){
            this.setExtraCheese();

        }
    }

    public void addExtraToppings(){
        if(!extraToppings){
            this.setExtraToppings();

            }


        }


    public void addTakeaway(){
        if(!takeAway){
            takeAway=true;

        }
    }

    public String getBill(){
        /*Base Price Of The Pizza: 300
        Extra Cheese Added: 80
        Extra Toppings Added: 70
        Paperbag Added: 20
        Total Price: 470*/
        /*this.bill+="Base Price Of The Pizza: "+this.basePrice+"\n";
        if(extraCheese)this.bill+=" Extra Cheese Added: "+this.cheesePrice+"\n";
        if(extraToppings)this.bill+=" Extra Toppings Added: "+this.toppingsPrice+"\n";
        if(takeAway)this.bill+=" Paperbag Added: "+this.takeAwayPrice+"\n";
        this.bill+="Total Price"+this.getPrice()+"\n";*/
        return finalBill.Bill(this);




       // return this.bill;
    }


}