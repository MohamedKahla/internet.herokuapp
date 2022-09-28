Feature: Home Page 
Test of the 'https://the-internet.herokuapp.com/' home page

Background: Open home page 
Given i have navigated on the 'the-internet' "home" page


Scenario: test Verify home page contents are correct
Then the page tittle is "Welcome to the-internet" 
And the Subtittle page is "Available Examples"
And the list of the subpages below is displayed

| A/B Testing                   |
| Add/Remove Elements           |
| Basic Auth                    |
| Broken Images                 |
| Challenging DOM               |
| Checkboxes                    |
| Context Menu                  |
| Digest Authentication         |
| Disappearing Elements         |
| Drag and Drop                 |
| Dropdown                      |
| Dynamic Content               |
| Dynamic Controls              |
| Dynamic Loading               |
| Entry Ad                      |
| Exit Intent                   |
| File Download                 |
| File Upload                   |
| Floating Menu                 |
| Forgot Password               |
| Form Authentication           |
| Frames                        |
| Geolocation                   |
| Horizontal Slider             |
| Hovers                        |
| Infinite Scroll               |
| Inputs                        |
| JQuery UI Menus               |
| JavaScript Alerts             |
| JavaScript onload event error |
| Key Presses                   |
| Large & Deep DOM              |
| Multiple Windows              |
| Nested Frames                 |
| Notification Messages         |
| Redirect Link                 |
| Secure File Download          |
| Shadow DOM                    |
| Shifting Content              |
| Slow Resources                |
| Sortable Data Tables          |
| Status Codes                  |
| Typos                         |
| WYSIWYG Editor                |


Scenario Outline: Open <page> page
When I click on the "<page>" link 
Then  the "<page>" opens
Examples:
| page                          |
| A/B Testing                   |
| Add/Remove Elements           |
| Basic Auth                    |
| Broken Images                 |