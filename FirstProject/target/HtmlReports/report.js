$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/registerwithexcel.feature");
formatter.feature({
  "name": "Register with Excel",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RegisterWithExcel"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Try Register with Data from Excel(only fill first name, last name, and email that has the right format)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegisterWithExcel2"
    }
  ]
});
formatter.step({
  "name": "user is on register",
  "keyword": "Given "
});
formatter.step({
  "name": "user in second scenario fills the form from given sheetname \"\u003cSheetName\u003e\" and rownumber \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on a button",
  "keyword": "And "
});
formatter.step({
  "name": "the error message displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "Register2",
        "0"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Try Register with Data from Excel(only fill first name, last name, and email that has the right format)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegisterWithExcel"
    },
    {
      "name": "@RegisterWithExcel2"
    }
  ]
});
formatter.step({
  "name": "user is on register",
  "keyword": "Given "
});
formatter.match({
  "location": "pages.registerPagewithExcel.user_is_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in second scenario fills the form from given sheetname \"Register2\" and rownumber 0",
  "keyword": "When "
});
formatter.match({
  "location": "pages.registerPagewithExcel.user_in_second_scenario_fills_the_form_from_given_sheetname_and_rownumber(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on a button",
  "keyword": "And "
});
formatter.match({
  "location": "pages.registerPagewithExcel.user_clicks_on_a_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "pages.registerPagewithExcel.the_error_message_displayed()"
});
formatter.result({
  "status": "passed"
});
});