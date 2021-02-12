package vendingmachine;

import java.util.List;

/**
 * VendingMachine
 */
public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange();
    public void reset();
}