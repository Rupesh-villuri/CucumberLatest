# to check DataTables with As Lists


Feature: User Regisrtation

Scenario: user registration with different data
	Given User is on registration page
	When User enters following user details
		| Rupesh | automation | Roop@gmail.com | 99999 | Bangalore |
		| Harish | Ratnavelu | tom@gmail.com | 99999 | London | 
		| ratan | tata | lisa@gmail.com | 8887777 | SFO | 
	Then user registration should be successful
	
	
Scenario: user registration with different data with columns
	Given User is on registration page
	When User enters following user details with columns
		| firstname | lastname | email | phone | city |
		| naveen | automation | nav@gmail.com | 99999 | Bangalore |
		| tom | peter | tom@gmail.com | 99999 | London | 
		| lisa | dsouza | lisa@gmail.com | 8887777 | SFO | 
	Then user registration should be successful	
