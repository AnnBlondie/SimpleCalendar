package months;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class monthsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, String> myCalendar = new HashMap<>();

	public monthsServlet() {
		super();
		setMyCalendar();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String month = request.getParameter("month").toLowerCase();
		String daysInMonth;

		out.println("<html>");

		if (myCalendar.containsKey(month)) {
			daysInMonth = myCalendar.get(month);
			out.println("<body>" + month + " has " + daysInMonth + " days"
					+ "</body>");
		} else {
			out.println("<body>unknown month :(</body>");
		}
		out.println("</html>");
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void setMyCalendar() {
		myCalendar.put("january", "31");
		myCalendar.put("february", "28 or 29");
		myCalendar.put("march", "31");
		myCalendar.put("april", "30");
		myCalendar.put("may", "31");
		myCalendar.put("juny", "30");
		myCalendar.put("july", "31");
		myCalendar.put("august", "31");
		myCalendar.put("september", "30");
		myCalendar.put("october", "31");
		myCalendar.put("november", "30");
		myCalendar.put("december", "31");
	}

}
