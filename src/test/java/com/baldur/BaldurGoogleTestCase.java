package com.baldur;

import com.unit.XuShuangShuangJunit;
import com.baldur.google.Member;

public class BaldurGoogleTestCase extends XuShuangShuangJunit
{
	Member creatMemberWithUsername(String username)
	{
		Member member = creatMember();
		member.setUsername(username);
		return member;
	}
	
	Member creatMemberByIdAndUsername(Long id, String username)
	{
		Member member = creatMemberWithUsername(username);
		member.setId(id);
		return member;
		
	}
	Member creatMemberById(Long id)
	{
		Member member = creatMember();
		member.setId(id);
		return member;
	}

	private static Member creatMember()
	{
		Member member = new Member();
		return member;
	}
}
