@RegisterWithExcel
Feature: Register with Excel

@RegisterWithExcel1
Scenario Outline: Try Register with Data from Excel(only fill first name and last name)

Given user is on register
When user in first scenario fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on a button
Then the error message displayed

Examples:
|SheetName|RowNumber|
|Register1|0|

@RegisterWithExcel2
Scenario Outline: Try Register with Data from Excel(only fill first name, last name, and email that has the right format)

Given user is on register
When user in second scenario fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on a button
Then the error message displayed

Examples:
|SheetName|RowNumber|
|Register2|0|



