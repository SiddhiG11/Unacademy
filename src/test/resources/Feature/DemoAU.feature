#Siddhi Gawade

@UnacademyAboutUs
Feature: Test About Us Functionality

 @Aboutus
  Scenario: Check user can see about us
    Given user is on about us page
    When user clicks about us link
    Then about us page is opened

@Careers
  Scenario: Check user can view careers
    Given user is on about us page on the website
    When user should click carrers link
    Then careers page is viewed

@Blogs
 Scenario: Check user should navigate blogs
   Given user views the blogs link
   When user clicks on blogs
   Then blogs gets open
