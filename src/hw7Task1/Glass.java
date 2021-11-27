package hw7Task1;

public class Glass implements HouseholdItem{

    String name;
    String type;
    int length;
    int width;
    int height;
    int thickness;

    public Glass(String name, int length, int width, int height, int thickness) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.thickness = thickness;

    }


//Getters and Setters

    public int getHeight() {
        return height;}

    public void setHeight(int height) {
        this.height = height;}

    public int getLength() {
        return length;}

    public void setLength(int length) {
        this.length = length;}

    public int getWidth() {
        return width;}

    public void setWidth(int width) {
        this.width = width;}

    public Integer getThickness() {
        return thickness;}

    public void setThickness(int thickness) {
        this.thickness = thickness;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void price(){
        // high fragility
        if (getThickness() == 1){
            double price = (double) 2 * getLength();
            System.out.println("Total cost for " + getName() + " is: " + price + " €");
        }
        // medium fragility
        else if (getThickness() == 2){
            double price = (double) 1.2 * getLength();
            System.out.println("Total cost for " + getName() + " is: " + price + " €");
        }
        // low fragility
        else if (getThickness() == 3){
            double price = (double) 0.7 * getLength();
            System.out.println("Total cost for " + getName() + " is: " + price + " €");
        }
    }


    public void packingInstruction() {

        int len = getLength()+1;
        int hei = getHeight()+1;
        int wid = getWidth()+1;
        System.out.println(getName() + ":\n" + " should be wrapped with bubble wraps and packed in a box with dimensions: " + hei +"x" + len + "x" + wid);
    }
}


