package lab6.Task2;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items;
    private Double total;

    public Basket() {
        total = 0.0;
        items = new ArrayList<>();
    }
    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
            this.total += item.getPrice() * item.getAmount();
        }
        else
            throw new NullPointerException("Empty object");
    }

    public void displayBasket() {
        for (Item i : items) {
            System.out.println("Item: " +  i.getId());
            System.out.println("Name: " + i.getName());
            System.out.println("Price: " + i.getPrice());
            System.out.println("Amount: " + i.getAmount());
        }
    }

    public void removeItem(int index, int removeAmount) {
        if (index < 0)
            throw new IllegalStateException("Out of index");
        if (removeAmount > items.get(index).getAmount())
            throw new IllegalArgumentException("Invalid amount");
        if (removeAmount == items.get(index).getAmount()) {
            this.total -= items.get(index).getPrice() * removeAmount;
            items.remove(index);
        }
        else {
            items.get(index).setAmount(items.get(index).getAmount() - removeAmount);
            this.total -= items.get(index).getPrice() * removeAmount;
        }
    }

    public void updateItem(Item item, int index) {
        if (index < 0)
            throw new IllegalStateException("Out of index");
        if (item == null)
            throw new NullPointerException("Empty object");
        this.total -= items.get(index).getPrice() * items.get(index).getAmount();
        this.items.set(index, item);
        this.total += item.getPrice() * items.get(index).getAmount();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

}
