package hust.soict.hedspi.aims;

import java.util.Scanner;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<Media> media = new ArrayList<Media>(); 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setId("001");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector ("Roger Allers");
		dvd1.setLength(87);	
		media.add(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setId("002");
		dvd2.setCategory("Sience Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector ("George Lucas");
		dvd2.setLength(124);
		media.add(dvd2);
	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setId("003");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector ("John Musker");
		dvd3.setLength(90);	
		media.add(dvd3);
		
		Book book1 = new Book();
		book1.setId("004");
		book1.setTitle("Sherlock");
		book1.setCategory("Detective");
		book1.setCost(12.3f);
		book1.addAuthor("Conan Doyle");
		book1.addAuthor("Trung Duc");
		media.add(book1);
		
		/*
		//System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());
		
		//anOrder.removeDigitalVideoDisc(dvd2);
		
		//System.out.println("Qty Ordered: " + anOrder.getQtyOrdered() + "\nTotal Cost:" + anOrder.totalCost());
		//anOrder.getOrder();	
		//if(dvd1.search("The King")) System.out.println("T");
		//anOrder.getALuckyItem();
		//anOrder.getOrder();*/
		int choose = 5;
		String del ;
		String title = new String();
		Order order = new Order();
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner1 = new Scanner(System.in);
		while (choose != 0) {
			showMenu();
			choose = Integer.parseInt(scanner.nextLine());
			switch(choose) {
			case 1:	
				System.out.println("Create an order!!!!");
				break;
			case 2:
				int tt = 0;
				System.out.println("Input media: ");
				title = scanner.nextLine();
				for (int i = 0 ; i < media.size() ; i++ ) {
					if ( media.get(i).getTitle().compareTo(title) == 0) {
						order.addMedia(media.get(i));
						tt = 1;
					}
				}
				if ( tt == 0) System.out.println("Cant find media !!!!");
				break;
			case 3:
				System.out.println("Choose media id to delete: ");
				del = scanner.nextLine();
				order.removeMedia(del);
				
				break;
			case 4:
				order.getOrder();
				break;
			case 0:
				break;
			default :
				System.out.println("Error!!!!!!");
				break;
			}
		}
		scanner.close();		
	}
	
	
	public static void showMenu() {
		System.out.println("Order Maneger Application: ");
		System.out.println("------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

}
