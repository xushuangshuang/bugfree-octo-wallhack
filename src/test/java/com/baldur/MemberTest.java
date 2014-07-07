package com.baldur;

import java.util.Date;

public class MemberTest extends BaldurGoogleTestCase
{
	public void test_benben_should_be_set()
	{
		String benben = "benben";
		assertEquals("benben", creatMemberWithUsername(benben).getUsername());
	}

	public void test_xushuangshuang_should_be_set()
	{
		String xushuangshuang = "xushuangshuang";
		assertEquals("xushuangshuang",creatMemberWithUsername(xushuangshuang).getUsername());
	}
	
	public void test_id_should_be_set()
	{
		Long id = new Date().getTime();
		assertEquals(id, creatMemberById(id).getId());
	
	}
}
