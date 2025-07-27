import java.util.HashMap;

public class item {
    private String name;
    private int price;
    private static HashMap<String, Integer> list = new HashMap<>();

    static {
        list.put("milk", 6);
        list.put("cheese", 20);
        list.put("meat", 57);
        list.put("eggs", 12);
        list.put("chicken", 42);
        list.put("tomato", 3);
        list.put("cucumber", 2);
        list.put("broccoli", 9);
        list.put("chocolate", 14);
        list.put("ice_cream", 26);
        list.put("pasta", 19);
        list.put("corn", 11);
        list.put("bread", 8);
        list.put("jam", 16);
        list.put("cookies", 23);
    }

    public item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static boolean exists(String name) {
        return list.containsKey(name);
    }

    public static int getPrice(String name) {
        return list.getOrDefault(name, 0);
    }

    public static void printManu() {
        System.out.println("Groceries:");
        for (String name : list.keySet()) {
            System.out.println(name + "     " + list.get(name));
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
