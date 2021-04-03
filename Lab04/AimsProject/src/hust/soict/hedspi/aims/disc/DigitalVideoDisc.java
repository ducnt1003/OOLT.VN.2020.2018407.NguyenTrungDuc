package hust.soict.hedspi.aims.disc;

import java.util.StringTokenizer;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public boolean search(String title) {		
		StringTokenizer strToken2 = new StringTokenizer(title);
		String token;
		int n = 0;
		int dem = 0;
		int numOfTitle = strToken2.countTokens();
		
		while(strToken2.hasMoreTokens()) {
			token = strToken2.nextToken();
			StringTokenizer strToken1 = new StringTokenizer(this.title);			 
			while(strToken1.hasMoreTokens()) {
				if ( token.compareTo(strToken1.nextToken()) == 0) n++;
			}
			if ( n > 0 ) {
				dem ++;
				n = 0;
			}			
		}
		if ( dem == numOfTitle) return true;
		else return false;		
	}
}
