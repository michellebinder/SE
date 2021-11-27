package hw7Task1;

public class Electronic implements HouseholdItem{

    String name;
    int length;
    int width;
    int height;
    int weight;
    Boolean fragile;

    public Electronic(String name, int length, int width, int height, int weight, Boolean fragile) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.fragile = fragile;
    }


//Getters and Setters

    public int getHeight() {
        return height;}

    public void setHeight(Integer height) {
        this.height = height;}

    public int getLength() {
        return length;}

    public void setLength(Integer length) {
        this.length = length;}

    public int getWidth() {
        return width;}

    public void setWidth(Integer width) {
        this.width = width;}

    public Integer getWeight() {
        return weight;}

    public void setWeight(Integer weight) {
        this.weight = weight;}

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public Boolean getFragile() {
        return fragile;}

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;}

    // fragile items -> 5 € per 10 kg // non-fragile items -> 5 € per 15 kg
    public void price() {

        if (getFragile() == false) {
            double price = (double) getWeight() / 15 * 5;
            System.out.println("Total cost for " + getName() + " is: " + price + " €");
        }
        else if(getFragile() == true) {
            double price = (double) getWeight() / 10 * 5;
            System.out.println("Total cost for " + getName() + " is: " + price + " €");
        }
    }

    public void packingInstruction() {

        int len = getLength()+1;
        int hei = getHeight()+1;
        int wid = getWidth()+1;
        System.out.println(getName() + ":\n" + " should be covered with Polyethylene foam film and packed in a box with dimensions: " + len +"x" + hei + "x" + wid);
    }
}


