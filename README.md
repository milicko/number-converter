Tasks:
1. Find how to create and start application from embedded tomcat
2. Create application that will convert entered number to monetary form
3. Create UI tests using Selenium
4. Add javadoc and send report


INSTRUCTIONS:
    
How to start app and automated tests:

0.  Build project to get dependencies
1.  You need to download chromedriver for your OS and for your chrome version you can do that here http://chromedriver.chromium.org/downloads, after you find chromedriver for your OS and for your chrome download it and extract it on your machine
2.  Go to module number-converter-tests/src/main/java/base/BaseTest.java and change hardcoded path to chromedriver with path of your chromedriver
3.  Go to module number-converter-app/src/main/java/launch/Main.java and run main method to start tomcat (if you have some tomcat started on port 8080 you will need to kill that app), now the app is started
4.  Open browser and type localhost:8080 in order to go to the app
5.  To start automated tests tomcat with app needs to be started so you need to go to module money-converter-tests/src/tests and find tests in functionality and verification package to run them



Hope that you will not have any problem. If you have any problem please LMK.