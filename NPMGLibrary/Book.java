package NPMGLibrary;

public class Book {
	
	static boolean isValidIsbn(String isbn)
    {
        int n=isbn.length();
        if (n!=10)
            return false;
 
        int sum=0;
        for (int i=0; i<9; i++)
        {
            int digit=isbn.charAt(i)-'0';
            if (0>digit || 9<digit)
                return false;
            sum+=(digit*(10 - i));
        }
 
        char last=isbn.charAt(9);
        if (last!='X' && (last<'0'|| last>'9'))
                            
            return false;
 
        sum+=((last=='X') ? 10 : (last-'0'));

        return (sum%1==0);
    }
	
	
	private String heading;
	private String author;
	private String phouse;
	private String isbn;
	
	public void setHeading(String heading) {
		this.heading=heading;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPhouse(String phouse) {
		this.phouse=phouse;
	}
	public void setIsbn(String isbn) {
		if(isValidIsbn(isbn)==true) {
			this.isbn=isbn;
		}
	}
	
	public String getHeading() {
		return heading;
	}
	public String getAuthor() {
		return author;
	}
	public String getPhouse() {
		return phouse;
	}
	public String getIsbn() {
		return isbn;
	}
	
	Book(){}
	
	Book(String h){
		setHeading(h);
	}
	Book(String h, String a){
		setHeading(h);
		setAuthor(a);
	}
	Book(String h, String a, String p){
		setHeading(h);
		setAuthor(a);
		setPhouse(p);
	}
	Book(String h, String a, String p, String i){
		setHeading(h);
		setAuthor(a);
		setPhouse(p);
		setIsbn(isbn);
	}
	
	public String toString() {
		return "Heading: " + heading +"\n" + 
				"Author: " + author +"\n" + 
				"Publishing House: " + phouse +"\n" + 
				"ISBN: " + isbn;
	}

}
