package com.test.exception;

public class TestCaseFailed extends Exception 
{
	/**
	 * Added serializable varibale to remove warning
	 */
	private static final long serialVersionUID = 1L;
	String message=null;
	String recom_title=null;
	String fav_Title=null;
	public TestCaseFailed() 
	{
		super();
	}
	 
	public TestCaseFailed(String recom_title,String fav_Title) 
	{
	    //super(recom_title,fav_Title);
	    this.recom_title = recom_title;
	    this.fav_Title=fav_Title;
	}
	 
}
