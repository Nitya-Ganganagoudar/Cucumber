Feature: open Saucedemo feature with datatable with example

Scenario Outline: open  website and login with datatables
Given user launches
When user enters the credential values
|standard_user | secret_sauce |
|standard_user2 | secret_sauce2 |
When the user clicks And gets admitted into website
Then close the browser window and quit 