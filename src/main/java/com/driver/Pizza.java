package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese = false;
    private boolean extraToppings = false;
    private boolean takeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        bill = "";
       if(isVeg) {
           this.price = 300;
          bill+=" Base Price Of The Pizza: 300"+ "\n";
       }
       else {
           this.price = 400;
           bill+=" Base Price Of The Pizza: 400"+ "\n";

       }
    }

    public void setExtraCheese() {
        this.extraCheese = true;
    }
    public void setExtraToppings() {
        this.extraToppings = true;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheese){
            this.setExtraCheese();
           this.price+=80;
            bill+="Extra Cheese Added = 80"+"\n";

        }
    }

    public void addExtraToppings(){
        if(!extraToppings){
            this.setExtraToppings();
            if(isVeg){
                this.price+=70;
                bill+="Extra Toppings Added: 70"+"\n";

            }
            else {
                this.price += 120;
                bill+="Extra Toppings Added: 120"+"\n";
            }
            }


        }


    public void addTakeaway(){
        if(!takeAway){
            takeAway=true;
            this.price+=20;
            bill+="Paperbag Added: 20"+"\n";

        }
    }

    public String getBill(){
        bill+="Total Price: "+this.price;


        return this.bill;
    }


}