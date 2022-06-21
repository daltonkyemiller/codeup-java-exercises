import util.Normalize;

public class Grocery {
    private String name;
    private String category;
    private int quantity;

    public Grocery(String name, String category, int quantity) {
        this.name = Normalize.capitalizeString(category);
        this.quantity = quantity;
        this.category = Normalize.capitalizeString(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
