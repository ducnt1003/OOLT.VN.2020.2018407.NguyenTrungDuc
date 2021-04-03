

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	MyDate Date = new MyDate();
	
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {	
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Too much order !!!\n Cannot order " + disc.getTitle());
		}else {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
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
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if ( itemOrdered[i] == disc ) {				
				itemOrdered[i] = itemOrdered[qtyOrdered-1];
				itemOrdered[qtyOrdered] = null;
				qtyOrdered--;
			}
		}
	}
	
	
	public float totalCost() {
		float f = 0;		
		for (int i = 0; i < qtyOrdered; i++) {
			f = f + itemOrdered[i].getCost();
		}
		return f;
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
	
}
