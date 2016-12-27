/**
 * @(#)BaseAction.java
 * Description:	TODO 濉啓鏂囦欢浣滅敤绠�瑕佽鏄�
 * Version :	0.0.0
 * Copyright:	Copyright (c) 鍝堝皵婊ㄦ収瀹㈡敮鐐逛俊鎭鎶�鏈夐檺鍏徃  鐗堟潈鎵�鏈�
 * Create by:	寮犺寕淇�  2016骞�10鏈�19鏃�
 */
package com.z.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;


public class BaseAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	protected String jsonOut(Object obj) {
		ObjectMapper om = new ObjectMapper();
		try {
			String json = om.writeValueAsString(obj);
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print(json);
		} catch (JsonGenerationException|JsonMappingException  e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
