package com.baldur;

import com.unit.XuShuangShuangJunit;
import com.baldur.google.Member;
import com.baldur.google.MemberService;

public class MemberServiceTest extends XuShuangShuangJunit
{
	public void test_benben_is_empty_should_be_save()
	{
		Member member = new Member();
		member.setUsername("benben");

		MockMemberDao memberDao = new MockMemberDao();
		MemberService memberService = new MemberService(memberDao);
		memberService.save(member);
		
		assertTrue(memberDao.saveHasInvoked);
	}
}
