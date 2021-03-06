import java.util.*;

public class ShoppingCartList implements Subject {
	private ArrayList<ShoppingCart> lostCarts = new ArrayList<>();
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public ShoppingCartList() {
		
	}
	
	public void addLostCart(ShoppingCart cart) {
		lostCarts.add(cart);
		notifyObservers(cart.getLocation());
	}
	
	public void removeCart(ShoppingCart cart) {
		lostCarts.remove(cart);
		notifyObservers(cart.getLocation());
	}
	
	public ArrayList<ShoppingCart> getList(){
		return lostCarts;
	}

	
	 @Override
    public void registerObserver(Observer observer) {
           observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
           observers.remove(observer);

    }

    @Override
    public void notifyObservers(String location) {
           for (Observer ob : observers) {
       
                  System.out.println("Lost shopping cart detected");
                  ob.update(location);
           }

    }

}
