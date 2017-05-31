Feature: Hear Shout

  Shouts have a range of approximately 1000m


    
	Scenario Outline: only hear in-range shouts
		Given Lucy is at 0, 0
		And Sean is at <Seans-location>
    When Sean shouts
    Then Lucy should hear <what-Lucy-hears>
    
    Examples: some simple examples
    	| Seans-location   | what-Lucy-hears |
		  | 0, 900            | Sean            |
		  | 0, 1100           | nothing         |

  Scenario: Multiple shouts from one person
  	Given Lucy is at 0, 0
  	And Sean is at 0, 500
  	When Sean shouts
  	And Sean shouts
  	Then Lucy should hear 2 shouts from Sean  
    
  Scenario: Shouters should not hear their own shouts
    Given Lucy is at 0, 0
    And Sean is at 0, 1100
    When Sean shouts
    Then Sean should hear nothing 
