Feature: AUT Mercury


Scenario: Login Positive
Given Launch Browser
And maximise browser
And load url
When enter usename
And enter password
And click login
Then login successfull



