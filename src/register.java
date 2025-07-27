public class register {
    private int bill;
    private int register;
    private lineAccount line;

    public register() {
        this.bill = 0;
        this.register = 0;
        this.line = new lineAccount();
    }

    public register(int startingSum) {
        this.bill = 0;
        this.register = startingSum;
        this.line = new lineAccount();
    }

    public void addItem(String newItem, int quantity) {
        if (!item.exists(newItem)) {
            System.out.println("Item does not exist.");
            return;
        }
        int price = item.getPrice(newItem);
        item p = new item(newItem, price);
        accountRow row = new accountRow(p, quantity);
        line.addRow(row);
        bill += price * quantity;
    }

    public int bill(int dummy) {
        return bill;
    }

    public int payment(int money) {
        line.printAccount();
        register += bill;
        int change = money - bill;
        bill = 0;
        line.resetAccount();
        return change;
    }
}
