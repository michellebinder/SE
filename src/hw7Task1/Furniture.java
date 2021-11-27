package hw7Task1;

public class Furniture implements HouseholdItem{

    String name;
    String type;
    int length;
    int width;
    int height;
    int weight;

    public Furniture(String name, String type, int length, int width, int height, int weight) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
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
        return width;	}

    public void setWidth(Integer width) {
        this.width = width;}

    public int getWeight() {
        return weight;}

    public void setWeight(Integer weight) {
        this.weight = weight;}

    public String getType() {
        return type;}

    public void setType(String type) {
        this.type = type;}

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    // price based on weight of the item (5 € per 20 kg)
    public void price() {

        double price = (double) getWeight() / 20 * 5;
        System.out.println("Total cost for " + getName() + " is: " + price + " €");

    }

    public void packingInstruction() {

        System.out.println(getName() + ":\n" + " should be covered with waterproof covers with area of: " +  getLength() + "x" + getWidth());
    }
}

