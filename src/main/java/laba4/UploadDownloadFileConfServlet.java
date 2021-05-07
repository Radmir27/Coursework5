package laba4;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/UploadDownloadFileServlet")
@MultipartConfig
public class UploadDownloadFileConfServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		ServletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
		
		FileItem file = fileUpload.parseRequest(request);
		
		file.write(new File("config.txt"));
	    
	    
	}
    
}