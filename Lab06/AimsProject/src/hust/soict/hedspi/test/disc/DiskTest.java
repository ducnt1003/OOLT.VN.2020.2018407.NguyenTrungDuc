package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {

	public static void main(String[] args) {
Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector ("Roger Allers");
		dvd1.setLength(87);		
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Sience Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector ("George Lucas");
		dvd2.setLength(124);		
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector ("John Musker");
		dvd3.setLength(90);		
		anOrder.addDigitalVideoDisc(dvd3);
				
		//anOrder.removeDigitalVideoDisc(dvd2);
		
		System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());
		anOrder.getOrder();	
		if(dvd1.search("The King")) System.out.println("T");
		anOrder.getALuckyItem();
		anOrder.getOrder();	
		System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());

	}

}
