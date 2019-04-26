package com.nv.service;

public class ChatService {

	public String sendChatInformation(String info) throws MyException {
		
		if(info == null) {
         throw new MyException();
		}
	
		return info;
	}
	
	

}
