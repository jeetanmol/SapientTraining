package com.training.tags;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;





public class ForEachTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String items;
	
	public void setItems(String items) {
		this.items = items;
	}


	@SuppressWarnings("unchecked")
	@Override
	public int doStartTag() throws JspException {
		try {
			
			JspWriter out = pageContext.getOut();
			
			List<String> itemsList = (List<String>)pageContext.getRequest().getAttribute(items);
			
			for(String s:itemsList){
				out.println(s + "\n");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return Tag.SKIP_BODY;
	}
	

}
