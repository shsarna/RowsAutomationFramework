# RowsAutomationFramework

This Repository consists of two test scenarios provided by Rows for assessment. Thw two test scenarios are related to the steps mentioned below: 
**Scenario 1**
Steps:
1. Login
2. Navigate to the Templates page
3. Select an Integration
4. Select the last template available
5. Create a spreadsheet using this template
6. Share the spreadsheet privately
7. Copy the shared link and open a new tab

**Scenario 2**
Steps:
1. Login
2. Navigate to the Templates page
3. Select an Integration
4. Select the last template available
5. Create a spreadsheet using this template
6. Share the spreadsheet privately
7. Copy the shared link 
8. Paste the copied link in a table cell

Getting started
---------------
**DEPENDENCIES**
1. Gradle is required to be installed. Refer to https://gradle.org/install/

**Executing**
1. Provide username and password in config.propertied file (PATH: src/test/resources/config.properties)
2. Open terminal and navigate to the downloaded repository folder
3. Paste the command "gradle clean test -Dtest.suite=testng.xml"
