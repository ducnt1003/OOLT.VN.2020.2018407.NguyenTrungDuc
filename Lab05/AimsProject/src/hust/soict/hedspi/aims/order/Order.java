package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
		
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	private MyDate Date = new MyDate("second","March","twenty nineteen");
	
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		itemOrdered[qtyOrdered] = disc;
		qtyOrdered ++;	
		if (qtyOrdered > MAX_NUMBERS_ORDERED) {
			System.out.println("Too much order !!!\n Cannot order " + disc.getTitle());
			qtyOrdered --;
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int j = dvdList.length;
		for (int i = 0 ; i < j ; i++  ) {			
			if (dvdList[i] == null) break;
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("Too much order !!!\nCannot order " + dvdList[i].getTitle());
				break;
			}
			itemOrdered[qtyOrdered++] = dvdList[i];			
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Too much order !!!\nCannot order " + dvd1.getTitle());
		}else itemOrdered[qtyOrdered++] = dvd1;
		
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Too much order !!!\nCannot order " + dvd2.getTitle());
		}else itemOrdered[qtyOrdered++] = dvd2;
	}
	public float totalCost() {
		float f = 0;		
		for (int i = 0; i < qtyOrdered; i++) {
			f = f + itemOrdered[i].getCost();
		}
		return f;
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if ( itemOrdered[i] == disc ) {				
				itemOrdered[i] = itemOrdered[qtyOrdered-1];
				itemOrdered[qtyOrdered] = null;
				qtyOrdered--;
			}
		}		
	}
	public void getOrder() {
		System.out.println("************Order*************" );
		Date.print();
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(i+1 +".DVD -" + itemOrdered[i].getTitle() + " - " + itemOrdered[i].getCategory() + " - " 
					+ itemOrdered[i].getDirector() + " - " + itemOrdered[i].getLength() + " : " + itemOrdered[i].getCost() + "$");
		}		
		System.out.println("Total cost: " + totalCost());
	}
	public DigitalVideoDisc getALuckyItem() {
		int r = (int)(Math.random()*qtyOrdered);
		itemOrdered[r].setCost(0);
		return itemOrdered[r];
	}
	
}
