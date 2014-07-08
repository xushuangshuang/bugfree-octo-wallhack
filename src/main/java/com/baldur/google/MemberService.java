package com.baldur.google;

public class MemberService 
{
	private final MemberDao memberDao;

	public MemberService(MemberDao memberDao)
	{
		this.memberDao = memberDao;
	}

	public Member save(Member member)
	{
		String username = member.getUsername();
		if(username != null && username.trim().length() > 0)
		{
			return memberDao.save(member);	
		}
		return member;
	}

	public Member update(Member member)
	{

		return memberDao.update(member);
	}


}
