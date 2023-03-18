package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegToppings=0;
    private int nonVegToppings=0;
    private int paperbag=0;
    private int extraCheese=0;
    int total=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg) {
            price=300;
        }
        else {
            price=400;
        }
        total+=price;
    }

    public int getPrice(){
        return total;
    }

    public void addExtraCheese()
    {
        this.extraCheese=80;
        total+=extraCheese;
    }

    public void addExtraToppings(){
        if(isVeg) {
            this.vegToppings=70;
            total+=vegToppings;
        }
        else {
            this.nonVegToppings=120;
            total+=nonVegToppings;
        }
    }

    public void addTakeaway(){
        paperbag=20;
        total+=paperbag;
    }

    public String getBill() {
        String ans="";
        ans=ans+"Base Price Of The Pizza: "+price+"\n";

        if(this.extraCheese!=0) {
            ans=ans+"Extra Cheese Added: "+extraCheese+"\n";
        }
        if(this.vegToppings!=0) {
            ans=ans+"Extra Toppings Added: "+vegToppings+"\n";
        }
        else if(this.nonVegToppings!=0) {
            ans=ans+"Extra Toppings Added: "+nonVegToppings+"\n";
        }

        if(this.paperbag!=0) {
            ans=ans+"Paperbag Added: "+paperbag+"\n";
        }

        total=price+paperbag+extraCheese+vegToppings+nonVegToppings;
        ans+="Total Price: "+total+"\n";
        this.bill=ans;
        return ans;

    }
}
