package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String>author = new ArrayList<String>();

	

	public Book() {
		// TODO Auto-generated constructor stub		
	}

	public List<String> getAuthor() {
		return author;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}
	
	public void addAuthor(String authourName) {
		if (!this.author.contains(authourName)) 
			this.author.add(authourName);		
	}
	public void removeAuthor(String authorName) {
		if(this.author.contains(authorName))
			this.author.remove(authorName);
	}
	public void print() {
		for (String name : this.author ) {
			System.out.println(name + " ");
		}
	}
}
