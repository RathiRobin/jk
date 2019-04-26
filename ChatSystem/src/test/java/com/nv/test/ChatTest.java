package com.nv.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.nv.service.ChatService;
import com.nv.service.MyException;

@RunWith(JUnitPlatform.class)
public class ChatTest {

	@Test
	public void chatInfoTest() throws MyException {

		ChatService cs = new ChatService();
		String rs = cs.sendChatInformation("Hello");
		Assertions.assertEquals("Hello", rs);

	}

}
