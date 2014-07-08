package com.baldur;

import com.baldur.google.MemberDao;
import com.baldur.google.Member;

public class MockMemberDao implements MemberDao
{
	public boolean saveHasInvoked = false;
	public boolean updateHasInvoked = false;
	public Member expectedMember;
	public Member save(Member member)
	{
		saveHasInvoked = true;
		return member;
	}

	public Member update(Member member)
	{
		updateHasInvoked = true;
		expectedMember.setUsername(member.getUsername());
		expectedMember.setId(member.getId());
		return member;
	}
}
