package com.samples.set;
import java.util.HashSet;
import java.util.Set;

public class testDemo {
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<>();
		s.add("a");
		s.add("b");
		s.add("c");
		//System.out.println(s);
		
		Set<Book> b=new HashSet<Book>();
		Book b1=new Book("R k Naranyan","MalgudiDays",1942);
		Book b2=new Book("DayDreamer","Sanem",2019);
		
		b.add(b1);
		System.out.println(b1.hashCode());
		System.out.println(b);
		
		
		b.add(b2);
		System.out.println(b2.hashCode());
		System.out.println(b);
	
		
	}

}
class Book
{
	private String title;
	private String author;
	private int year;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}

	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	private String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
