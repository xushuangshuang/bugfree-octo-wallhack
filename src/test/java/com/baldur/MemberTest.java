package com.baldur;

import com.unit.XuShuangShuangJunit;
import com.baldur.google.Member;

public class MemberTest extends XuShuangShuangJunit
{
	Member member = new Member();
	public void test_benben_should_be_benben()
	{
		String benben = "benben";
		member.setUsername(benben);
		assertEquals("benben", member.getUsername());
	}

	public void test_xushuangshuang_should_be_xushuangshuang()
	{
		String xushuangshuang = "xushuangshuang";
		member.setUsername(xushuangshuang);
		assertEquals("xushuangshuang", member.getUsername());
	}
	
}
