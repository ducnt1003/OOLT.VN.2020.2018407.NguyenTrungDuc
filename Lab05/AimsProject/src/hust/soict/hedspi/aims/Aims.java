package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		Book book1 = new Book();
		
		book1.setTitle("Sherlock");
		book1.setCategory("Detective");
		book1.setCost(12.3f);
		book1.addAuthor("Conan Doyle");
		book1.addAuthor("Trung Duc");
		book1.print();
		book1.removeAuthor("Trung Duc");
		book1.print();
		
		
		//System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());
		
		//anOrder.removeDigitalVideoDisc(dvd2);
		
		//System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());
		//anOrder.getOrder();	
		//if(dvd1.search("The King")) System.out.println("T");
		//anOrder.getALuckyItem();
		//anOrder.getOrder();	
	}

}
