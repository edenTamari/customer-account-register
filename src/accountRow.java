public class accountRow {
    private item item;
    private int quantity;

    public accountRow(item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return item.getPrice() * quantity;
    }
}
