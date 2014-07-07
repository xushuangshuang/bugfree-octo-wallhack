package com.baldur;

import com.baldur.google.MemberDao;
import com.baldur.google.Member;

public class MockMemberDao implements MemberDao
{
	public boolean saveHasInvoked = false;
	public Member save(Member member)
	{
		saveHasInvoked = true;
		return member;
	}
}
