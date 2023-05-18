
package data;

/**
 *
 * @author minat
 */
public class Shoe extends ShopStuff {

    public Shoe(String id, String name, int price, String brandName) {
        super(id, name, price, brandName);
    }

    @Override
    public void showInfoProducts() {
        String mess;
        mess = String.format("|%5s|%-15s|  %7d|   %10s|         |          |",
                id, name, price, brandName);
        System.out.println(mess);
    }

    

}
