Feature: Form Filling
As a  user I should able to fill all the feilds and submit the form successfully
Scenario Outline: Fill the form
Given: Launch the site
When: I enter name as <x>
And email as <y>
And subject as <z>
And message as <a>
And country as <b>
And firstname as <c>
And lastname as <d>
And streetname as <e>
And postcode as <p>
And city as <f>
And click send message button
Then validate form is submitted or not
Examples: 
|x|kalaiarasi||y|kalaiarasishiva@gmail.com||z|subject||a|message||b|nederland||c|kalaiarasi||d|neelamegam||e|picassoweg||p||1328kj||f|almere|