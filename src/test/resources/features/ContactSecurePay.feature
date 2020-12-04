Feature: contact secure pay

  Scenario: Contact secure pay with random valid data
    Given User opens secure pay by google search
    And navigates to Contact us page
    When user enter random details for following fields
      | First Name    |
      | Last Name     |
      | Email Address |
      | Phone No      |
      | Company name  |
      | Website Url   |
      | Revenue       |
      | Message       |

#    And information is submitted
#    Then success message is displayed