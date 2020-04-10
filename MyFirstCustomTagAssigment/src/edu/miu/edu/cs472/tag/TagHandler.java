package edu.miu.edu.cs472.tag;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {
String color;
String Size;
LocalDate dNow = LocalDate.now();
	@Override
	public int doStartTag() throws JspException {
		
		try {
			String dateNow = dNow.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
//		JspWriter out = pageContext.getOut();
//		
//		out.println("<span style=\"color: red; font-size: 12px;\">Mon 2016.04.04 at 04:14:09 PM PDT</span>");
//		
			
			JspWriter out = pageContext.getOut();
			if (color != null)
			out.write(String.format ("<span style='color:%s; font-size:%dpx;'>"+dateNow+"</span>", color,Integer.parseInt(Size)));
			else
			out.write(String.format ("<span>dateNow</span>"));
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	return SKIP_BODY;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSize(String Size) {
		this.Size = Size;
	}

}
