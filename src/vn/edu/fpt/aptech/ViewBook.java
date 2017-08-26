package vn.edu.fpt.aptech;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBook {
	static ArrayList<Book>listBook=new ArrayList<Book>();
	public static void menu() {
		System.out.println("1. Nhập thông tin sách");
		System.out.println("2. Hiển thị thông tin sách");
		System.out.println("3. Tìm kiếm sách");
		System.out.println("4. Thoát");
		System.out.println("Mời bạn chọn chức năng [1-4]");
		int ch=0;
		ch = new Scanner(System.in).nextInt();
		switch (ch) {
			case 1: addBook(); break;
			case 2: displayBook(); break;
			case 3: searchBook(); break;
			case 4: exit(); break;
			default: break;
		}
	}
	private static void exit() {
		System.out.println("Cảm ơn bạn đã dùng phần mềm! Ahihi");
		System.exit(0);
	}
	private static void searchBook() {
		System.out.println("==============================");
		System.out.println("Nhập thông tin cuốn sách cần tìm:\n(Mã sách, Tên sách, Tác Giả, NXB)");
		String compare = new Scanner(System.in).nextLine();
		for (Book bk:listBook) {
			// startsWith(compare) kiểm tra ký tự đầu tiên giống compare ko
			System.out.println("Sách bạn đang tìm:");
			if(bk.getId().startsWith(compare) 
				|| bk.getNameBook().startsWith(compare) 
				|| bk.getAuthorBook().startsWith(compare)
				|| bk.getPublish().startsWith(compare))
			{ 
				System.out.println(bk);
				System.out.println("-----");
			}
			else{
				System.out.println("Không có dữ liệu");
				System.out.println("-----");
			}
		}
	}
	private static void displayBook() {
		System.out.println("==============================");
		for(Book bk:listBook){
			System.out.println(bk);
			System.out.println("-----");
		}
		System.out.println("1. Sửa thông tin sách");
		System.out.println("2. Xóa thông tin sách");
		System.out.println("Mời bạn chọn chức năng [1-2]");
		int ch2=0;
		ch2 = new Scanner(System.in).nextInt();
		switch (ch2) {
			case 1: editBook(); break;
			case 2: removeBook(); break;
			default: break;
		}
	}
	private static void removeBook() {
		System.out.println("==============================");
		System.out.println("Nhập ID sách cần xóa: ");
		String removeId=new Scanner(System.in).nextLine();
		for(Book bk:listBook){
			if (bk.getId().contentEquals(removeId)) {
				System.out.println("Đã xóa sách có mã: "+bk.getId()+"\tTên: "+bk.getNameBook()+
									"\tTác giả: "+bk.getAuthorBook()+"\tNXB: "+bk.getPublish());
				listBook.remove(bk);
				System.out.println("-----");
			}else{
				System.out.println("Sách bạn đang tìm không có dữ liệu!");
				System.out.println("-----");
			}
		}
	}
	private static void editBook() {
		System.out.println("==============================");
		System.out.println("Nhập ID sách cần chỉnh sửa: ");
		String edit=new Scanner(System.in).nextLine();
		for(Book bk:listBook){
			if (bk.getId().contentEquals(edit)) {
				System.out.println("Đang sửa sách có mã: "+bk.getId()+"\tTên: "+bk.getNameBook()+
									"\tTác giả: "+bk.getAuthorBook()+"\tNXB: "+bk.getPublish());
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhập mã sách: ");
				String id=sc.nextLine();
				System.out.println("Nhập tên sách: ");
				String nameBook=sc.nextLine();
				System.out.println("Nhập tên tác giả: ");
				String authorBook=sc.nextLine();
				System.out.println("Nhập tên nhà xuất bản: ");
				String publish=sc.nextLine();
				
				bk.setId(id);
				bk.setNameBook(nameBook);
				bk.setAuthorBook(authorBook);
				bk.setPublish(publish);
				listBook.add(bk);
				System.out.println("-----");
				System.out.println("-----");
			}else{
				System.out.println("Sách bạn đang tìm không có dữ liệu!");
				System.out.println("-----");
			}
			
		}
	}
	private static void addBook() {
		Book book=new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sách: ");
		String id=sc.nextLine();
		System.out.println("Nhập tên sách: ");
		String nameBook=sc.nextLine();
		System.out.println("Nhập tên tác giả: ");
		String authorBook=sc.nextLine();
		System.out.println("Nhập tên nhà xuất bản: ");
		String publish=sc.nextLine();
		
		book.setId(id);
		book.setNameBook(nameBook);
		book.setAuthorBook(authorBook);
		book.setPublish(publish);
		listBook.add(book);
	}
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
}
