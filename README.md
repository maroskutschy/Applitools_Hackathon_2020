# Video Instructions

**SEE MY YOUTUBE VIDEO with the setup of the project, 
description of my solution and demo running the tests here:**

 [youtube video](https://youtu.be/8y3Q20i2Al8) 
 
<br/><br/>
 
## Tools which I used

* Java
* Selenium
* Cucumber
* Maven
* Git
* IDEA IntelliJ
* TestNG
* Jenkins
 
 <br/><br/>

## Prerequisites

* Install and setup JDK java 8, 
* Install and setup Apache Maven
* Install Git
* Install IDEA IntelliJ
* In IDEA IntelliJ 'Cucumber for java' plugin

<br/><br/>

## Installation

1.) Create a folder on your disk and clone GIT repository:
```
git clone https://github.com/maroskutschy/Applitools_Hackathon_2020.git
```
always use 'master' branch

2.) In IDEA IntelliJ click on File > Open and choose the root folder of the 
project = folder where are all other sub-folders

3.) Go each of four sub-folders, right click on the pom.xml file and choose 'Add as maven project'

<br/><br/>

## Where is txt file with results for TraditionalTests generated:

for TraditionalTestsV1: 
```
target\Traditional-V1-TestResults.txt
```

for TraditionalTestsV2: 
```
target\Traditional-V2-TestResults.txt
```

<br/><br/>

## Applitools results links:

ModernTestsV1:

https://eyes.applitools.com/app/test-results/00000251808594431612/?accountId=xztHiIsdo0GsFfMDT7_D0g~~

ModernTestsV2:

https://eyes.applitools.com/app/test-results/00000251808593331860/?accountId=xztHiIsdo0GsFfMDT7_D0g~~


<br/><br/>

## Usage

There are 4 ways how to run the tests:

<br/><br/>

**1.) IDEA IntelliJ - Run the tests as feature file via IDEA IntelliJ Cucumber for Java plugin**

    = in any folder, open feature file:
    for ModernTestsV1/ModernTestsV2:    
```
src\test\resources\Feature_Files\AppliFashion\AppliFashion_Applitools.feature
```
   for TraditionalTestsV1/TraditionalTestsV2:
 ```
 src\test\resources\Feature_Files\AppliFashion\AppliFashion_Traditional.feature
 ```    
 Then right click on the row with 'Scenario Outline' or on the row with 'Feature '
 and choose 'Run ...'
 
 Open 'src\test\java\TestRunners\TestDefaultValues.java' and set 
 DEFAULT_OPERATING_SYSTEM to: 'Windows' or 'MacOS'
 
 For 'ModernTestsV1/ModernTestsV2' set also 'DEFAULT_BROWSER' to 'Chrome' or 'Firefox'
 (for 'TraditionalTestsV1/TraditionalTestsV2' this is done in feature file)
 
 **Where to see the result of Cucumber tests:**
 
 you can see it in the bottom left part of IntelliJ: in Run Tab
 (since validation of all Modern Applitools/Traditional checks is in the After method
 and after is not included in this report, you will not see the failure in case this 
 check failed)
 
 <br/><br/>

 
 **2.) IDEA IntelliJ - Run the tests as TestNG suite:**
 
  In IDEA IntelliJ find TestNG xml file:
 ``` 
  src\test\resources\testSuites\AppliFashion.xml
 ``` 
 right click on it and choose option 'Run ...'
 
  Open 'src\test\resources\testSuites\AppliFashion.xml' and set  
  'operatingSystem' to: 'Windows' or 'MacOS'
  
  For 'ModernTestsV1/ModernTestsV2' set also 'browser' to 'Chrome' or 'Firefox'
  (for 'TraditionalTestsV1/TraditionalTestsV2' this is done in feature file)
  
  **Where to see the result of Cucumber tests:**
  
  open this file in any browser: 
  open folder from which you run the tests (ModernTestsV1/ModernTestsV2/TraditionalTestsV1/TraditionalTestsV2)
  and then:
  ``` 
  target\site\cucumber-pretty\index.html
``` 
 In this file you can see also the result of After method - if whole test suite passed or failed
 
 <br/><br/>
 
 **3.) IDEA IntelliJ - Run the tests as maven build (this is also the way how it is running from Jenkins):**
 
  In IDEA IntelliJ on the right side in Maven Tab, choose the folder from which you want to run
  the tests, right click on Lifecycle - test > choose option 'Create'
  and write following in command line editbox: 
  
  for 'TraditionalTestsV1':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml
  ``` 

  for 'TraditionalTestsV2':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml
  ``` 

  for 'ModernTestsV1':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml
  ``` 

  for 'ModernTestsV2':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml
  ``` 
  
  
  Open 'src\test\resources\testSuites\AppliFashion.xml' and set  
    'operatingSystem' to: 'Windows' or 'MacOS'
  
  For 'ModernTestsV1/ModernTestsV2' set also 'browser' to 'Chrome' or 'Firefox'
    (for 'TraditionalTestsV1/TraditionalTestsV2' this is done in feature file)
  
  **Where to see the result of Cucumber tests:**
  

  open this file in any browser:
  open folder from which you run the tests (ModernTestsV1/ModernTestsV2/TraditionalTestsV1/TraditionalTestsV2)
  and then:
  ``` 
      target\site\cucumber-pretty\index.html
  ``` 
   In this file you can see also the result of After method - if whole test suite passed or failed
   
  
  
  <br/><br/>
  
  **4.) Jenkins**
  * Install 'Cucumber reports' Jenkins plugin
  * Create new Jenkins job (freestyle project)
  * Add git repository and credentials
  * In 'Build' section > add build step same as in point 3:
  
  for 'TraditionalTestsV1':
  
    
    clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./TraditionalTestsV1  

  for 'TraditionalTestsV2':
    
    
    clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./TraditionalTestsV2   
  
  for 'ModernTestsV1':
    
    
    clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./ModernTestsV1    

  for 'ModernTestsV2':  
    
    clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./ModernTestsV2
    
  * Add post build step:
  Cucumber reports
  click on advanced > File Include Pattern = **/*.json
  
  * for 'TraditionalTestsV1':
    add post build step: Archive the artifacts > Files to archive > 
  ```
  TraditionalTestsV1/target/Traditional-V1-TestResults.txt
   ```

 * for 'TraditionalTestsV2':
    add post build step: Archive the artifacts > Files to archive > 
  ```
  TraditionalTestsV2/target/Traditional-V2-TestResults.txt
   ```
   
   Before running tests on Jenkins, change following code and push it to git:
   open 'src\test\resources\testSuites\AppliFashion.xml' and set  
   'operatingSystem' to: 'Windows' or 'MacOS'
   
   For 'ModernTestsV1/ModernTestsV2' set also 'browser' to 'Chrome' or 'Firefox'
   (for 'TraditionalTestsV1/TraditionalTestsV2' this is done in feature file)
 
   **Where to see the result of Cucumber tests:**
   
   after running the tests, following file is generated:
   open folder from which you run the tests (ModernTestsV1/ModernTestsV2/TraditionalTestsV1/TraditionalTestsV2)
   and then:
  ```
  target\cucumber.json
  ```
 
  And Jenkins 'cucumber reports' plugin is parsing it and is generating awesome Cucumber report available on
  Jenkins for each build
  In this file you can see also the result of After method - if whole test suite passed or failed
    
 
 That's it :)

 
