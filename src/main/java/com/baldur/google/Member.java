package com.baldur.google;

public class Member
{
	private String username;
	private Long id;

	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getId()
	{
		return id;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUsername()
	{
		return username;
	}
}
