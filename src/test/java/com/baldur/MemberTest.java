package com.baldur;

import com.unit.XuShuangShuangJunit;

public class MemberTest extends XuShuangShuangJunit
{
	pubic void test_benben_should_be_benben()
	{
		Member member = new Member();
		String benben = "benben";

		member.setUsername(benben);

		assertEquals("benben", member.getUsername());
		
	}
	
}
