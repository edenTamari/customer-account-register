import java.util.ArrayList;

public class lineAccount {
    private ArrayList<accountRow> accountList;

    public lineAccount() {
        accountList = new ArrayList<>();
    }

    public void addRow(accountRow row) {
        accountList.add(row);
    }

    public void resetAccount() {
        accountList.clear();
    }

    public int getTotal() {
        int total = 0;
        for (accountRow row : accountList) {
            total += row.getTotalPrice();
        }
        return total;
    }

    public void printAccount() {
        System.out.println("\n======= RECEIPT =======");
        System.out.printf("%-15s %-10s %-10s\n", "Item", "Quantity", "Total");
        System.out.println("-------------------------------");

        for (accountRow row : accountList) {
            System.out.printf("%-15s %-10d %-10d\n",
                    row.getItem().getName(),
                    row.getQuantity(),
                    row.getTotalPrice());
        }

        System.out.println("-------------------------------");
        System.out.printf("%-25s %-10d\n", "Total to pay:", getTotal());
        System.out.println("===============================\n");
    }
}
