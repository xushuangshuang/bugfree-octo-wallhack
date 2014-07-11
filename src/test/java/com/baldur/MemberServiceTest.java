package com.baldur;

import com.baldur.google.MemberService;

public class MemberServiceTest extends BaldurGoogleTestCase
{
	MockMemberDao memberDao = new MockMemberDao();
	MemberService memberService = new MemberService(memberDao);
	public void test_username_is_valid_should_be_save()
	{
		memberService.save(creatMemberWithUsername("benben"));
		assertEquals("benben", memberDao.resultMember.getUsername());
		assertTrue(memberDao.saveHasInvoked);
	}

	public void test_username_is_empty_should_not_save()
	{
		memberService.save(creatMemberWithUsername(""));
		assertFalse(memberDao.saveHasInvoked);
	}
	public void test_username_is_null_should_not_save()
	{
		memberService.save(creatMemberWithUsername(null));
		assertFalse(memberDao.saveHasInvoked);
	}
	public void valid_member_changed_another_valid_member()
	{
		memberDao.expectedMember = creatMemberByIdAndUsername(1990L,"benben"); 
		memberService.update(creatMemberByIdAndUsername(2000L,"benben"));
		assertEquals(2000L, memberDao.expectedMember.getId());
	}
	public void test_xushuangshuang_id_1890_change_2004_should_be_change()
	{
		memberDao.expectedMember = creatMemberByIdAndUsername(2005L,"xushuangshuang");
		memberService.update(creatMemberByIdAndUsername(1980L,"benben"));
		assertFalse(memberDao.updateHasInvoked);
	}
}
