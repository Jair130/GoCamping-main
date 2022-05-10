package Items;

public class HikingItem extends Item{
    private int size;
    private String description;
    private int quantity;
    /**
     * Create a specific item object
     *
     * @param size        - the amount of space it occupies, stored as an int
     * @param description - a text description of the item, stored as a String
     */

    public HikingItem(int size, String description) {
        super(size, description);
    }

    public HikingItem(int size, String description, int quantity) {
        super(size, description);
        this.size= size;
        this.description= description;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return this.description + " " + this.getSize() + " " + this.getQuantity();

}






}


