package com.baldur.google;

public class MemberService 
{
	private final MemberDao memberDao;

	public MemberService(MemberDao memberDao)
	{
		this.memberDao = memberDao;
	}

	public void save(Member member)
	{
		memberDao.save(member);	
	}


}
