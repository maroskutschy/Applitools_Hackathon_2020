# Video Instructions

See my youtube video with the setup of the project, 
description of my solution and demo running the tests here:

 [youtube video](https://pip.pypa.io/en/stable/) 

## Prerequisites

* Install and setup JDK java 8, 
* Install and setup Apache Maven
* Install Git
* Install IDEA IntelliJ
* In IDEA IntelliJ 'Cucumber for java' plugin

### Installation

1.) Create a folder on your disk and clone GIT repository:
```
git clone https://github.com/maroskutschy/Applitools_Hackathon_2020.git
```

2.) In IDEA IntelliJ click on File > Open and choose the root folder of the 
project = folder where are all other sub-folders

3.) Go each of four sub-folders, right click on the pom.xml file and choose 'Add as maven project'

## Usage

There are 4 ways how to run the tests:

1.) Run the tests as feature file via IDEA IntelliJ Cucumber for Java plugin
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
 
 2.) Run the tests as TestNG suite:
  In IDEA IntelliJ find TestNG xml file:
 ``` 
  src\test\resources\testSuites\AppliFashion.xml
 ``` 
 right click on it and choose option 'Run ...'
 
 3.) Run the tests as maven build (this is also the way how it is running from Jenkins):
  In IDEA IntelliJ on the right side in Maven Tab, choose the folder from which you want to run
  the tests, right click on Lifecycle - test > choose option 'Create'
  and write following in command line editbox: 
  
  for 'TraditionalTestsV1':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./TraditionalTestsV1
  ``` 

  for 'TraditionalTestsV2':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./TraditionalTestsV2
  ``` 

  for 'ModernTestsV1':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./ModernTestsV1
  ``` 

  for 'ModernTestsV2':
  ```
  clean test -PTestNG -DTestSuite=AppliFashion.xml -f ./ModernTestsV2
  ``` 
  
  4.) Jenkins
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
   
 Thats it :)

 
