# StudentPerformanceAnalysis #

## What is this project?
This project is a homework assignment given to students at MEF University.

The purpose of the project is to analyze a set of given data and use this data to calculate a number of statistics about the course.

## Definitions
Here are some important definitions for the project. Corresponding pre-written classes are available in the source code for these definitions.
### Program Objective
TBA
### Course Objective
TBA
### Evaluation
TBA
### Question
TBA
### Student
TBA

## Intended results
TBA

## Technologies
This project uses the following technologies:
* Java 8
* Maven dependency manager
* Apache POI XSSF library to read Excel files

## Steps ##
### 1. Get a GitHub account and login.
### 2. Fork the project on GitHub
**Click the FORK button on the top right on this repo's page:**


![Fork](https://github-images.s3.amazonaws.com/help/bootcamp/Bootcamp-Fork.png)


When the repository is successfully forked, you will be redirected to your Fork's page.

#### What is a fork
Creating a “fork” is producing a personal copy of someone else’s project. Forks act as a sort of bridge between the original repository and your personal copy.
### 3. Clone your fork on your desktop:
You’ve successfully forked the repository, but so far, it only exists on GitHub. To be able to work on the project, you will need to clone it to your computer.

Using GitHub for Desktop application, this process is a breeze. On your fork, navigate over to the bottom of the right hand side bar and click Clone in Desktop. Once we click this, it’ll ask us if we want to launch our desktop application to clone the repository, and where we want to save it. Pick a location on your computer that you feel comfortable with creating files and folders.

![Clone](https://guides.github.com/activities/forking/clone-in-desktop.png)
### 4. Get NetBeans IDE on your desktop
NetBeans is an Integrated Development Environment for developing Java applications. It has native support for Maven, which is what we use to compile this project.

Download NetBeans [here](https://netbeans.org/downloads/). (Choose the Java SE one) and install it.

Also make sure that you have the latest version of Java installed, that is Java 8. You can get Java 8 [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
### 5. Open the cloned folder in NetBeans (File -> Open Project -> Choose the folder)
Since NetBeans has native support for Maven, all we need to do to get started is open the project folder.

To do that, go to the **Open** menu, choose **Open Project**, and navigate to the folder containing the GitHub repository. You will see the Maven logo next to the folder. Open it.

**You will have to wait for Maven to automatically import the dependencies of the project.** These are necessary to be able to read from Excel files.
### 6. Write code. Use the Run button to test your code.
Some starting code is ready for you at the main class. Maven automatically imports for you the dependency, Apache POI. To find out more about how to use it to read from Excel files, take a look at the [guide](https://poi.apache.org/spreadsheet/quick-guide.html). Because the spreadsheet is a .xlsx file, you will have to use the **XSSF** option as seen in the guide, and not the HSSF one.

The skeleton classes have been written for you - these classes should not require any modification. **Your main task is to write the processExcelSheet method in the CourseOutcome, ProgramOutcome, Student and Evaluation classes.** When written properly, the calls to these classes in the main method will produce the desired output.

**In each of these classes, there is a static HashMap that is meant to contain all of the objects of that type. As a result, your processExcelSheet method should add all produced instances of the class into this HashMap.**
* For a CourseOutcome, the key is the code (e.g. CO3);
* For a ProgramOutcome, the key is also the code (e.g. PO5);
* For a student, it's the student's number (e.g. 1);
* For an evaluation, it's the name of the evaluation (e.g. Quiz1).

**For an explanation of what the code needs to achieve, read the project objectives above.**
### 7. Test your code
In the grades.xlsx file in your project, you have an Excel workbook that contains a sample set of data. This is what you need to be able to parse, so feel free to test using this file.

Do realize, however, that the spreadsheets do not have to be that size, and you must be able to read data from a bigger or smaller table in each of the sheets of the workbook. **You must take into account the size of the table.**
### 8. When done, add, commit and push changes to your GitHub fork.
When you are done and your project is ready, go to the GitHub Desktop application, write a commit summary, select your files and press Commit. Then, click on the Sync button. This will push your code to GitHub for your professor to review.

![Commit&Sync](https://github-images.s3.amazonaws.com/mac/changes/changes.jpg)

**You should do this step on the day of submission! It makes your code publicly available to the entire world (Open Source) and thus can be used by others to copy your work. So try to submit right before the submission deadline.**

**If you want to produce an executable binary of your application, use the Build option in the NetBeans IDE.** This option will generate the **SPA.jar** file under the **target** folder in your project. This executable can be run standalone on any computer that runs Java 8 (Linux / Mac / Windows / your washing machine / etc.).
