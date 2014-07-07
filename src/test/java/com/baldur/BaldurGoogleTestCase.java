package com.baldur;

import com.unit.XuShuangShuangJunit;
import com.baldur.google.Member;

public class BaldurGoogleTestCase extends XuShuangShuangJunit
{
	Member creatMemberWithUsername(String username)
	{
		Member member = new Member();
		member.setUsername(username);
		return member;
	}

	Member creatMemberById(Long id)
	{
		Member member = new Member();
		member.setId(id);
		return member;
	}
}
