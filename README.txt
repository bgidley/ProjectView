This is a simple tapestry application to help show project status.

Running Notes

To run in IntelliJ
* Import the project from the pom.xml
* Run mvn gae:unpack (this fetches the sdk)
* In project setting add a google app engine facet
* Set the GAE path to YOUR_REPO/repository/com/google/appengine/appengine-java-sdk/1.3.1/appengine-java-sdk-1.3.1
* In Artifacts tick build exploded war on make
* Create a run target for GAE
Done...



