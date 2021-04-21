// Blanket.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-6

Create a class named Blanket with fields for a blanket’s size, color, material, and price. Include a constructor that sets default values for the fields as Twin, white, cotton, and $30.00, respectively. Include a set method for each of the first three fields. The method that sets size adds $10 to the base price for a double blanket, $25 for a queen blanket, and $40 for a king. The method that sets the material adds $20 to the price for wool and $45 to the price for cashmere.
In other words, the price for a king-sized cashmere blanket is $115. Whenever the size or material is invalid, reset the blanket to the default values. Include a toString() method that returns a description of the blanket.

Create a child class named ElectricBlanket that extends Blanket and includes two additional fields: one for the number of heat settings (settings) and one for whether the electric blanket has an automatic shutoff feature (hasAutoShutoff). The constructor should set the default values for settings and hasAutoShutoff to 1 heat setting and false for no automatic shutoff. Do not allow the number of settings to be fewer than 1 or more than 5; if it is, use the default setting of 1. Add a $5.75 premium to the price if the blanket has the automatic shutoff feature. Include get and set methods for the settings and hasAutoShutofffields. Include a toString() method that calls the parent class toString() method and combines the returned value with data about the new fields to return a complete description of features.

*/

public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;

    private final String SIZE1 = "Twin";
    private final String SIZE2 = "Double";
    private final String SIZE3 = "Queen";
    private final String SIZE4 = "King";
    protected final double BASE_PRICE = 30;
    private final double S_PRICE2 = 10;
    private final double S_PRICE3 = 25;
    private final double S_PRICE4 = 40;
    private final String MAT1 = "cotton";
    private final String MAT2 = "wool";
    private final String MAT3 = "cashmere";
    private final double M_PRICE2 = 20;
    private final double M_PRICE3 = 45;

    public Blanket() {
        setDefaults();
    }

    private void setDefaults() {
        // write your code here
    }

    public String getSize() {
        // write your code here
    }

    public String getColor() {
        // write your code here
    }

    public String getMaterial() {
        // write your code here
    }

    public void setSize(String s) {
        // write your code here              
    }

    public void setMaterial(String m) {
        // write your code here
    }

    public String toString() {
        // write your code here
    }
}