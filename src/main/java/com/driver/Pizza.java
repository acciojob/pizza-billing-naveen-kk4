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
        this.price+=basePrice;
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
        if(!extraCheese){
            this.extraCheese = true;
            this.price+=cheesePrice;

        }


    }
    public void setExtraToppings() {
        if(!extraToppings){
            this.extraToppings = true;
            toppingsPrice = isVeg?vegToppings:nonVegToppings;
            this.price+=toppingsPrice;

        }

    }

    public int getPrice(){

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
            this.price+=takeAwayPrice;

        }
    }

    public String getBill(){

        return finalBill.Bill(this);




       // return this.bill;
    }


}