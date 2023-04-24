/*Output:

Adding items to the basket:
Item: 1
Name: Apple
Price: 50.0
Amount: 3
Item: 2
Name: Ball
Price: 70.0
Amount: 2
Item: 3
Name: Book
Price: 60.0
Amount: 1
Item: 4
Name: Headphones
Price: 120.0
Amount: 2
Total: 590.0

The basket after removing:
Item: 2
Name: Ball
Price: 70.0
Amount: 2
Item: 3
Name: Book
Price: 60.0
Amount: 1
Item: 4
Name: Headphones
Price: 120.0
Amount: 2
Total: 440.0

The basket after removing:
Item: 2
Name: Ball
Price: 70.0
Amount: 2
Item: 3
Name: Book
Price: 60.0
Amount: 1
Item: 4
Name: Headphones
Price: 120.0
Amount: 1
Total: 320.0

The basket after updating:
Item: 5
Name: Banana
Price: 20.0
Amount: 4
Item: 3
Name: Book
Price: 60.0
Amount: 1
Item: 4
Name: Headphones
Price: 120.0
Amount: 1
Total: 260.0
*/

package lab6.Task2;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();

        Item item1 = new Item();
        item1.setName("Apple");
        item1.setPrice(50.00);
        item1.setAmount(3);

        Item item2 = new Item();
        item2.setName("Ball");
        item2.setPrice(70.00);
        item2.setAmount(2);

        Item item3 = new Item();
        item3.setName("Book");
        item3.setPrice(60.00);
        item3.setAmount(1);

        Item item4 = new Item();
        item4.setName("Headphones");
        item4.setPrice(120.00);
        item4.setAmount(2);

        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item4);
        System.out.println("Adding items to the basket:");
        basket.displayBasket();
        System.out.println("Total: " + basket.getTotal());

        basket.removeItem(0, 3);
        System.out.println();
        System.out.println("The basket after removing:");
        basket.displayBasket();
        System.out.println("Total: " + basket.getTotal());

        basket.removeItem(2, 1);
        System.out.println();
        System.out.println("The basket after removing:");
        basket.displayBasket();
        System.out.println("Total: " + basket.getTotal());

        Item item5 = new Item();
        item5.setName("Banana");
        item5.setPrice(20.00);
        item5.setAmount(4);

        basket.updateItem(item5, 0);
        System.out.println();
        System.out.println("The basket after updating:");
        basket.displayBasket();
        System.out.println("Total: " + basket.getTotal());
    }
}
