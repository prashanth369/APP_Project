# TweetAnalytics

SOEN6441 Assignments.

## Running

Run this using [sbt](http://www.scala-sbt.org/).  

```
sbt run
```

And then go to http://localhost:9000 to see the running web application.


## Controllers

There are several demonstration files available in this template.

- TwitterController.java:

  Home to the TweetAnalytics application. Handles searching for the last 10 tweets based on a keyword, 
  and displays the latest tweets of a user.

- HomeController.java:

  Index page.

  
## Models

There are several models used in this project. They are simple POJO (Plain Old Java Object) used by Jackon's Object Mapper to map the JSON returned by Twitter's API to a Java Object.

- SearchResult.java:

  Handles the JSON object returned by Twitter's search API.
  
- Status.java:

  Handles the status included in both Search and Profile.
  
- User.java:

  Handles the user included in both Search and Profile.
  
- Keyword.java:

  Shows the form to enter the keyword.
  
## TwitterController Methods

- searchForm:

  searchForm method gets the previous tweets from the cache.If cache is empty an 
  empty arraylist is created to avoid having an exception thrown.
  
- getsearchJson:

  This method is used to display the search file and to  get, update the status of the cache.
  
- getProfileJson:

  This method displays the profile file.
 
- searchPost:

  This method will displays the keyword form ,retrieve the latest tweets given a keyword. 
 
- profile:

  This method will display the latest status of the profile.
 
- auth:

  login into twitter application user interface using oAuth.
  

