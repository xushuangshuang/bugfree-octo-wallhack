package com.baldur;

public class MemberTest extends BaldurGoogleTestCase
{
	public void test_benben_should_be_benben()
	{
		String benben = "benben";
		assertEquals("benben", creatMemberWithUsername(benben).getUsername());
	}

	public void test_xushuangshuang_should_be_xushuangshuang()
	{
		String xushuangshuang = "xushuangshuang";
		assertEquals("xushuangshuang",creatMemberWithUsername(xushuangshuang).getUsername());
	}
	
}
