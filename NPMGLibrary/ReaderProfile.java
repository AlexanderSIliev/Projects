package NPMGLibrary;

import java.util.Arrays;

public class ReaderProfile {
	private String name;
	private String lname; 
	private String grade;
	private String specialty;
	private String phone;
	int nextFreeIndex=0;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setSpecialty(String specialty) {
		this.specialty=specialty;
	}
	
	private Book[] takenBooks = new Book[999];
	
	public String getName() {
		return name;
	}
	public String getLname() {
		return lname;
	}
	public String getGrade() {
		return grade;
	}
	public String getSpecialty() {
		return specialty;
	}
	public String getPhone() {
		return phone;
	}
	public String getBooks() {
		return Arrays.toString(takenBooks);
	}
	
	ReaderProfile(String n, String l, String g, String s, String p){
		setName(n);
		setLname(l);
		setGrade(g);
		setSpecialty(s);
		setPhone(p);
	}
	ReaderProfile(String n, String l, String g, String s, String p, Book b){
		setName(n);
		setLname(l);
		setGrade(g);
		setSpecialty(s);
		setPhone(p);
		takenBooks[nextFreeIndex]=b;
	}
	
	public String toString() {
		
		return "Name: "+name+"\n"+
				"Last Name: "+lname+"\n"+
				"Grade: "+grade+"\n"+
				"Specialty: "+specialty+"\n"+
				"Phone: "+phone+"\n"+
				"Taken books: "+"\n"+Arrays.toString(takenBooks);
		
	}
	

}
