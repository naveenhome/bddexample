# encoding: utf-8
Feature: ATA SSC Website home page
	In order to view home page
	as a Math Idiot
	I should be able to open ATA SSC webiste in Firefox, Google Chrome and Internet Explorer browser
	
	Scenario: Firefox
	Given URL "http://ata123456789123456789.appspot.com in Firefox browser
	When I hit enter key
	Then home page of website should loaded in Firefox browser
	
	@lowp
	Scenario: Chrome
	Given URL "http://ata123456789123456789.appspot.com in Chrome browser
	When I hit enter key
	Then home page of website should loaded in Chrome browser
	
	@highp
	Scenario: Explorer
	Given URL "http://ata123456789123456789.appspot.com in Explorer browser
	When I hit enter key
	Then home page of website should loaded in Explorer browser
	
	Scenario: Speed
	Given URL "http://ata123456789123456789.appspot.com in browser
	When I hit enter key
	Then home page of website should open in 10 seconds
	
	Scenario: Speed
	Given URL "http://ata123456789123456789.appspot.com in browser
	When I hit enter key
	Then home page of website should open in 10 seconds
	