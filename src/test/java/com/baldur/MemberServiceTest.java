package com.baldur;

import com.unit.XuShuangShuangJunit;
import com.baldur.google.Member;
import com.baldur.google.MemberService;

public class MemberServiceTest extends XuShuangShuangJunit
{
	MockMemberDao memberDao = new MockMemberDao();
	MemberService memberService = new MemberService(memberDao);
	public void test_benben_is_not_empty_should_be_save()
	{
		Member member = new Member();
		member.setUsername("benben");
		memberService.save(member);
		assertTrue(memberDao.saveHasInvoked);
	}

	public void test_username_is_empty_should_not_save()
	{
		Member member = new Member();
		member.setUsername("  ");
		memberService.save(member);
		assertFalse(memberDao.saveHasInvoked);
	}
}
