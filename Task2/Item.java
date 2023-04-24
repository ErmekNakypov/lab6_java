package lab6.Task2;

public class Item {
    private Integer id;
    private String name;
    private Double price;
    private Integer amount;

    public Item() {
        this.id = IdProvider.getInstance().getUniqueId();
    }

    public Item(String name, Double price, Integer amount) {
        this.id = IdProvider.getInstance().getUniqueId();
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("Invalid name");
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Invalid price");
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        if (amount >= 0)
            this.amount = amount;
        else
            throw new IllegalArgumentException("Invalid amount");
    }
}
