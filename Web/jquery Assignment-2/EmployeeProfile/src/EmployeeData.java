

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EmployeeData
 */
@WebServlet("/EmployeeData")
/**
 * Name: EmployeeData
 * @author Anurag
 * Since: 30 October,2015
 * Description: Sends the Data
 */
public class EmployeeData extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeData()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String empName = request.getParameter("name");
		// Stores the Details
		String detail = "";
		// Switch Case is used
		switch(empName)
		{
		case "Anurag": detail="Name: Anurag Anand Age:22 Dob:19-09-1992  Address:Bihar";break;
		case "Ankur": detail="Name: Ankur Gupta Age:22 Dob:19-09-1992  Address:Tonk";break;
		case "Gaurav": detail="Name: Gaurav Saini Age:22 Dob:19-09-1992  Address:JhunJhunu";break;
		case "Amit": detail="Name: Amit Natani Age:22 Dob:19-09-1994  Address:Jhotwara";break;
		}
		// Response is set
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(detail);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
