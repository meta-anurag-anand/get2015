package Jdbc1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * Name: Helper
 * @author Anurag
 * Since: 16 September,2015
 * Description: Connects to Database and performs Operation
 **/
public class Helper 
{
	// To store the title name
	String titleName;
	// Getter of TitleName
	public String getTitleName()
	{
		return titleName;
	}
	// Setter of title NAme
	public void setTitleName(String titleName)
	{
		this.titleName = titleName;
	}
	// ArrayList to Store the title List
	static ArrayList<Helper> titleList = new ArrayList<Helper>();
	/**
	 * Name: getBooksByAuthorName
	 * @param authorName
	 * @return
	 * Description: Fetch the books which is matched by the author name
	 **/
	public static ArrayList<Helper> getBooksByAuthorName(String authorName) 
	{
		// Query to find the required result
		String query = "SELECT TITLE_NAME FROM TITLE WHERE TITLE_ID IN (SELECT TITLE_ID FROM TITLE_AUTHOR WHERE AUTHOR_ID IN (SELECT AUTHOR_ID FROM AUTHOR WHERE AUTHOR_NAME = '"
				+ authorName + "' ));";
		// Connection open
		Connection con = null;
		// Resultset to store the result
		ResultSet rs = null;
		Statement stmt = null;
		// Establishing the connection
		ConnectionUtil conUtil = new ConnectionUtil();
		// Object Creation
		Helper title = null;
		con = conUtil.getConnection();
		try 
		{
			// Executing the statement
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next())
			{
				title = new Helper();
				title.setTitleName(rs.getString(1));
				titleList.add(title);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return titleList;
	}
	/**
	 * Name:bookIssueByBookName
	 * @param bookName
	 * @return
	 * Description: Issue the books by the name
	 **/
	public static int bookIssueByBookName(String bookName)
	{
		// Query to update the Table
		String query = "INSERT INTO Book_Issue(issue_date,accession_No, member_id, due_Date) VALUES(now(),(select accession_no  from books where status=0 and title_id =( select title_id from title where title_name= '"
				+ bookName+ "' ) limit 0,1), (select member_id from members where member_name like  'gau%'),'2015-11-06');";
		// Query to update the status
		String nextQuery = "update books set status=1 where  title_id =( select title_id from title where title_name= '"+ bookName + "') and status =0 limit 1;";
		// Checking the flag for no of query Updated
		int flag = 0;
		Connection con = null;
		Statement statement = null;
		Statement nextStatement = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		try
		{
			// creating statment
			statement = con.createStatement();
			// Calling the Query
			flag = statement.executeUpdate(query);
			if (flag != 0)
			{
				// Calling the nextQuery
				nextStatement = con.createStatement();
				nextStatement.executeUpdate(nextQuery);
			}
		} 
		catch (SQLException e) 
		{
			return flag;
		}
		return flag;
	}
	/**
	 * Name: deleteBooksLaterThan1Year
	 * @return
	 * Description: Deleting the books not issued in 1 year
	 **/
	public static int deleteBooksLaterThan1Year() 
	{
		// Query to delete the Value
		String query = "DELETE FROM Books WHERE accession_no IN (SELECT accession_no " + "FROM(SELECT DISTINCT b.accession_no " + "FROM Book_issue bi,Books b "+ "WHERE (DATEDIFF(now(),b.purchase_date)>=365"  + " AND b.accession_no NOT IN (SELECT accession_no FROM Book_issue)) "
				+ "OR b.accession_no IN(SELECT br.accession_no "+ "FROM book_return br, books b " + "WHERE(DATEDIFF(now(),IF(br.return_date = NULL, purchase_date, br.return_date)) >= 365) "
				+ "AND br.accession_no IN (SELECT accession_no FROM Books WHERE status = 0))) AS a);";
		// To store the Deleted Books
		int deletedBooks = 0;
		Connection con = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		try 
		{
			// Calling the Connection
			stmt = con.createStatement();
			// Exexcuting the Query
			deletedBooks = stmt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return deletedBooks;
		}
		return deletedBooks;
	}
}
