import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class healthz extends HttpServlet {
  public void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String status = "OK";
    response.setStatus(HttpServletResponse.SC_OK);
		ServletOutputStream ouputStream = response.getOutputStream();
		byte buf[] = status.getBytes();
    response.setContentLength(buf.length);
    ouputStream.write(buf, 0, buf.length);
    ouputStream.flush();
    ouputStream.close();
  }
}
