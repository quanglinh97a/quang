package vn.edu.fpt.aptech;

public class Book {
	private String id;
	private String nameBook;
	private String authorBook;
	private String publish;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAuthorBook() {
		return authorBook;
	}

	public void setAuthorBook(String authorBook) {
		this.authorBook = authorBook;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}
	
	public Book(String id, String nameBook, String authorBook, String publish) {
		super();
		this.id = id;
		this.nameBook = nameBook;
		this.authorBook = authorBook;
		this.publish = publish;
	}
	
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return " - Mã sách : "+this.id+"\n - Tên sách : "+this.nameBook+
				"\n - Tác giả : "+this.authorBook+"\n - Nhà xuất bản : "+this.publish;
	}
	
	
}
