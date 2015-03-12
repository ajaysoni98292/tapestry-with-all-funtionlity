Steps to create tapestry project with command line

Tapestry is a framework for java web based application. It has so many functionality which it makes very powerful.
So first of all steps to create the sample tapestry project.

STEP-1 Install the maven in your system. You must have maven to create sample project from tapestry.
STEP-2 Once you installed the maven then run this command =>> mvn archetype:generate -DarchetypeCatalog=http://tapestry.apache.org
STEP-3 When you run this command it will ask you to choose the archetype, it is will ask to enter number. You can see following log 
       1: http://tapestry.apache.org -> org.apache.tapestry:quickstart (Tapestry 5 Quickstart Project)
       2: http://tapestry.apache.org -> org.apache.tapestry:tapestry-archetype (Tapestry 4.1.6 Archetype)

       So you want to create the Tapestry 5 quickStart project then enter 1 and if you want to create the Tapestry 4.1.6 then enter 2.
       
STEP-4 Now according to your choice in step 3 it will show the corresponding versions in a list. For example -
       Choose version:
       1: 5.0.19
       2: 5.1.0.5
       3: 5.2.6
       4: 5.3.7
       So from this you should enter the number of the version. In this i am choosing the number 4.
       
Step-5 Now your project base is ready. Now you have to enter the some basic information of the maven project.
       Define value for property 'groupId': : com.sample.tapestry
       Define value for property 'artifactId': : app
       Define value for property 'version':  1.0-SNAPSHOT: 
       Define value for property 'package':  com.sample.tapestry: : com.sample.tapestry.app
       
STEP-6 And finally it shows you Y: : 
       when shows you like this hit the enter button and you can see the logs. It will show you that build is successful. 
       
       Finally your project is ready. You can delete the gradle files from the project.
       You can use git init command to initialize the git in the project.
