package com.baldur.google;

public interface MemberDao
{
	public Member save(Member member);
	public Member update(Member member);
	public Member getMemberById(Long id);
}
