package com.test.helpers;

import com.test.exception.TestCaseFailed;

public class AssertionMethods
{
	
	
	/** Method to verify video title
	*/
	public void checkTitle(String title,String fav_Title) throws TestCaseFailed
	{
		
     	System.out.println(title);
		System.out.println(fav_Title);
		
			if(!title.equals(fav_Title))
				throw new TestCaseFailed("Video Title Not Matched,   Recemmended Title   : "+title +"Video title from favouirite_title" +fav_Title, fav_Title);
		
		else
		{
			
				
		System.out.print("Titles are same");
		}
	
	}
			/** Method to verify video Description
			*/
			public void checkDescription(String title,String fav_Title) throws TestCaseFailed
			{
				
		     	System.out.println(title);
				System.out.println(fav_Title);
				
					if(!title.equals(fav_Title))
						throw new TestCaseFailed("Video Title Not Matched,   Recemmended Title   : "+title +"Video title from favouirite_title" +fav_Title, fav_Title);
				
				else
				{
					
						
				System.out.print("Titles are same");
				}
			
	
	

	}	
}
