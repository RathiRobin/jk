package com.nv;

import com.nv.service.ChatService;
import com.nv.service.MyException;

public class MainChat {
	
	public static void main(String[] args) throws MyException {
		
		ChatService cs =  new ChatService();
		String info = cs.sendChatInformation("Hello");
		System.out.println(info);
	}


}
