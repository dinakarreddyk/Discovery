Feature: Add Recommonded videos to favorites
@AddVideos_To_Favorites
Scenario: Add recommended videos to favorites
      
Given user is on discovery home page
When user add recommended videos to favorite videos list
Then user should be able to see newly added videos under  favorite videos
And verify the title and descriptions of videos under favaorite matches with the recommeneded videos  