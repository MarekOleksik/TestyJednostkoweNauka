package testing.meal;

public class Meal {
    private int price;
    private int quantity;
    private String name;

    public Meal() {
    }

    public Meal(int price) {
        this.price = price;
    }

    public Meal(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public Meal(int price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountedPrice(int discount){
        return this.price - discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meal meal = (Meal) o;

        if (price != meal.price) return false;
        return name.equals(meal.name);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    int sumPrice(){
        return getPrice() * getQuantity();
    }

    public String getName() {
        return this.name;
    }
}
