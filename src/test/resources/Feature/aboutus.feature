#Unacademy:Siddhi Gawade

Feature: About Us Page

Background: About Us Page
Given User is on the About Us Page

#company footer

@aboutus
Scenario: Visit About Us Page
Then User should send enquiry on public media
And User should ask questions on contact us

@career
Scenario: Visit Career Page
Then User should view Careers Link

@blogs
Scenario: Visit Blogs Page
Then User should view Blogs Link

@privacypolicy
Scenario: Visit Privacy Policy Page
Then User should view Privacy Policy Link

@termsandcondition
Scenario: Visit Terms and Condition Page
Then User should view Terms and Condition Link

#other links footer

@userguidelines
Scenario: Visit User Guidelines Page
Then User should view User Guidelines Link
And Check Live ClassroomT&C

@sitemap
Scenario: Visit Site Map Page
Then User should view Site Map Link
And Check Unacademy SiteMap

@refundpolicy
Scenario: Visit Refund Policy Page
Then User should view Refund Policy Link

@legalnotices
Scenario: Visit Legal Notices Page
Then  User should view Legal Notices Link
And Check Combat T&C

@plussubscriptionsT&C
Scenario: Visit Plus SubscriptionsT&C Page
Then  User should view Plus SubscriptionsT&C Link
And Check Referral T&C