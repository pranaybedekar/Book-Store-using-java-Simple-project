package practice;
import java.util.*;
public class BookDemo {

	public static void main(String[] args) 
	{
		int BookId,count=0;
		String BookName;
		String AuthorName;
		int Prize;
		int operation;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Book book[]= new Book[n];
		while(true)
		{
			System.out.println("1.ADD BOOK");
			System.out.println("2.UPDATE BOOK");
			System.out.println("3.DELETE BOOK");
			System.out.println("SEARCH BOOK");
			System.out.println("GET ALL BOOK");
			System.out.println("6.EXIT");
			System.out.println(" ");
			System.out.println("ENTER THE CHOICE");
			operation=sc.nextInt();
			switch(operation)
			{
			case 1:
				System.out.println(" ADD BOOK ");
				//System.out.println(" Enter ");
				int a=sc.nextInt();
				for (int i=0;i<a;i++)
				{
					System.out.println("Enter the BookId ");
					BookId=sc.nextInt();
					System.out.println("Enter the BookName ");
					BookName=sc.next();
					System.out.println("Enter the AuthorName ");
					AuthorName=sc.next();
					System.out.println("Enter the Prize ");
					Prize=sc.nextInt();
					book[count]=new Book(BookId,BookName,AuthorName,Prize);
					count++;
				}
				System.out.println("Add Book Successfully ");
				break;
				
			case 2:
				System.out.println(" UPDATE BOOK ");
				System.out.println(" Enter the BookId for update");
				BookId=sc.nextInt();
				for (int i=0;i<count;i++)
				{
					if(book[i]!=null && book[i].getBookId()==BookId)
					{
					System.out.println("Enter the Book name for update ");
					BookName=sc.next();
					book[i].setBookName(BookName);
					System.out.println("Enter the AuthorName for update ");
					AuthorName=sc.next();
					book[i].setAuthorName(AuthorName);
					System.out.println("Enter the Prize for update");
					Prize=sc.nextInt();
					book[i].setPrize(Prize);
					}	
				}
				System.out.println("update Book Successfully ");
				break;
				
			case 3:
				System.out.println("DELETE BOOK");
				System.out.println(" Enter the BookId for delete");
				BookId=sc.nextInt();
				for (int i=0;i<count;i++)
				{
					if(book[i]!=null && book[i].getBookId()==BookId)
					{
						book[i]=null;
					}
			}
				System.out.println("delete Book Successfully ");
				break;
				
			case 4:
				System.out.println("SEARCH BOOK ");
				System.out.println(" Enter the BookId for search");
				BookId=sc.nextInt();
				for (int i=0;i<count;i++)
				{
					if(book[i]!=null && book[i].getBookId()==BookId)
					{
			          System.out.println(book[i]);
					}
				}
				System.out.println("search completed");
				break;
				
			case 5:
				System.out.println("ALL INFO BOOK");
				System.out.println("ALL BOOK ARE");
				for (int i=0;i<count;i++)
				{
					System.out.println(book[i]);
				}
				System.out.println("ALl BOOK ARE");
				break;
				
			case 6:
				System.exit(0);
				break;
				default:
					System.out.println("Enter right choice");
			}
		}

	}
}
