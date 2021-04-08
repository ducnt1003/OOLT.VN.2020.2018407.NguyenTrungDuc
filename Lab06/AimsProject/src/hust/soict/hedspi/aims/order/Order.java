package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERED = 5;
	public static int nbOrder = 0;
	
	private int qtyOrdered = 0;
	
	public Order() {
		nbOrder ++;
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
		
	private ArrayList<Media> itemOrdered = new ArrayList<Media>(); 
	
	MyDate Date = new MyDate();
	
	public void addMedia(Media media) {
		itemOrdered.add(media);
	}
	
	public void removeMedia(Media media) {
		itemOrdered.remove(media);
	}
	
	public void removeMedia(String id) {
		int i  ;
		int tt = 0 ;
		for (i = 0; i < itemOrdered.size(); i++) {
			if (itemOrdered.get(i).getId().compareTo(id) == 0) {
				tt = 1;
				break;
			}
		}
		if( tt == 1) itemOrdered.remove(i);
		else System.out.println("Cant find id!!!!!");
	}
	
	public float totalCost() {	
		float f = 0;
		for (Media media : itemOrdered) {
			f += media.getCost();
		}
		return f;
	}
	public void getOrder() {
		System.out.println("************Order*************" );
		Date.print();
		for (int i = 0; i < itemOrdered.size(); i++) {
			System.out.println(i+1 +". " + itemOrdered.get(i).getId() + " - " + itemOrdered.get(i).getTitle() + " - " 
					+ itemOrdered.get(i).getCategory() + " - "  + itemOrdered.get(i).getCost() + "$");
		}		
		System.out.println("Total cost: " + totalCost());
	}
	/*
	public DigitalVideoDisc getALuckyItem() {
		int r = (int)(Math.random()*qtyOrdered);
		itemOrdered[r].setCost(0);
		return itemOrdered[r];
	}*/
	
}
