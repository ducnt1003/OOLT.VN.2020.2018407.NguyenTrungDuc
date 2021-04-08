package hust.soict.hedspi.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Media {	
	private String director;
	private int length;
	
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
	
	public DigitalVideoDisc(String title) {		
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length,float cost ) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public boolean search(String title) {		
		StringTokenizer strToken2 = new StringTokenizer(title);
		String token;
		int n = 0;
		int dem = 0;
		int numOfTitle = strToken2.countTokens();
		
		while(strToken2.hasMoreTokens()) {
			token = strToken2.nextToken();
			StringTokenizer strToken1 = new StringTokenizer(getTitle());			 
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
