package com.baldur;

import com.baldur.google.MemberService;

public class MemberServiceTest extends BaldurGoogleTestCase
{
	MockMemberDao memberDao = new MockMemberDao();
	MemberService memberService = new MemberService(memberDao);
	public void test_benben_is_not_empty_should_be_save()
	{
		memberService.save(creatMemberWithUsername("benben"));
		assertTrue(memberDao.saveHasInvoked);
	}

	public void test_username_is_empty_should_not_save()
	{
		memberService.save(creatMemberWithUsername("  "));
		assertFalse(memberDao.saveHasInvoked);
	}
	public void test_username_is_null_should_not_save()
	{
		memberService.save(creatMemberWithUsername(""));
		assertFalse(memberDao.saveHasInvoked);
	}
}
