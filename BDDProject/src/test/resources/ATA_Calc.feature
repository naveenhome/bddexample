# encoding: utf-8
Feature: iZenBridge Calculator Add function
	In order to find the sum of those two numbers
	As as Accountant
	I should be able to use function to add two numbers
	
	Scenario: Addition
	Given the input number 7 and 8
	When I select "Add" as option
	Then the output should be 15
	
	Scenario: Addition
	Given the input number 10.5 and -5
	When I select "Add" as option
	Then the output should be 5.5
	
	@LowP @Negative	
	Scenario: Addition
	Given then number a and b
	When I select "Add: as option
	Then the output should be 0
	
	@HighP
	Scenario Outline: Calculator
	Given then input numbers <number1> and <number2>
	When I select <operator> option
	Then the output should be <result>
	Examples:
	|number1	|number2	|operator	|result	|
	|"5.5"		|"11.5"		|"Add"		|"17.0"	|
	|"5"		|"-4"		|"Add"		|"1"	|
	|"15.5"		|"11.5"		|"Subtract"	|"4"	|
	|"5"		|"4"		|"Multiply"	|"20"	|
	|"5"		|"2"		|"Add"	|"7"	|
	|"5"		|"4"		|"Add"	|"9"	|
	|"2"		|"3"		|"Add"|"5"	|
	
	
	@LowP
	Scenario: Range_Add
	Given the input number 0 and 1000
	When I select "Add" as option
	Then the output should be 1000
	 
	Scenario: Range_Multiply
	Given the input number 0 and 1000
	When I select "Multiply" as option
	Then the output should be 0
	
	Scenario Outline: Compare
	Given the input numbers <number1> and <number2>
	When I compare
	Then the result both numbers should be between 0 and 1000
	Examples:
	|number1	|number2	|
	|"400"		|"500"		|
	|"1023"		|"400"		|
	
	Scenario Outline: Compare
	Given the input numbers <number1> and <number2>
	When I compare
	Then the result should be higher number
	Examples:
	|number1	|number2	|result|
	|"400"		|"500"		|"500" |
	|"1023"		|"400"		|"1023"|
	
