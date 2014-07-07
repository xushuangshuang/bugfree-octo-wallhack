package com.baldur;

import com.unit.XuShuangShuangJunit;
import com.baldur.google.Member;

public class MemberTest extends XuShuangShuangJunit
{
	public void test_benben_should_be_benben()
	{
		Member member = new Member();
		String benben = "benben";

		member.setUsername(benben);

		assertEquals("benben", member.getUsername());
		
	}
	
}
