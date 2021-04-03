package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		DigitalVideoDisc dvd[] = new DigitalVideoDisc[10];
		dvd[0] = new DigitalVideoDisc("The Lion King");
		dvd[0].setCategory("Animation");
		dvd[0].setCost(19.95f);
		dvd[0].setDirector ("Roger Allers");
		dvd[0].setLength(87);	
		
		dvd[1] = new DigitalVideoDisc("Star Wars");
		dvd[1].setCategory("Sience Fiction");
		dvd[1].setCost(24.95f);
		dvd[1].setDirector ("George Lucas");
		dvd[1].setLength(124);
		
		dvd[2] = new DigitalVideoDisc("Aladdin");
		dvd[2].setCategory("Animation");
		dvd[2].setCost(18.99f);
		dvd[2].setDirector ("John Musker");
		dvd[2].setLength(90);
		
		anOrder.addDigitalVideoDisc(dvd); 
		
		System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());
	}

}
