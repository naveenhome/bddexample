# encoding: utf-8
Feature: ATA Calculator Add function
	In order to find the sum of those two numbers
	As as Accountant
	I should be able to use function to add two numbers
	
	Scenario: GUIAddition
	Given the input value 7 and 8
	When I click "Add" as option
	Then the output should be 15 in result