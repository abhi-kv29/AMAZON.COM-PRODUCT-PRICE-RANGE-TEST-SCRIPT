# PROJECT NAME : AMAZON.IN PRODUCT PRICE RANGING TEST SCRIPT

## STARTING MONTH : MARCH 2021
## ENDING MONTH : MARCH 2021 

## STATUS: COMPLETED

---

### DESCRIPTION 

The AMAZON.IN PRODUCT PRICE RANGING TEST SCRIPT is an end to end test script automated to search for a particular class of products under a particular price range. The script is made using Java and Selenium WebDriver for Google Chrome Web Browser. 

---

### ABOUT 

This script is all about getting prices of all the products related to a particular class. Firstly you will be redirected to the main amazon website for the indian region, after that the script will start working and whatever class of product is wanted will be entered into the search box and will be searched afterwards. For more specific results, integrated filters on amazon website for adding a price range are used. With this we will get all the products within that particular price range and these results with their price and product name will be traversed and logged in. Instead going through different pages to get the desired parameters we take them up from the search results only. 

---

### FUTURE SCOPE AND LIMITATIONS

- Price comparison can be added to the script for sorting out.
- Ratings can also be considered as a parameter
- Another option can be given for opening the product one by one is separate tab.

---

### PROBLEMS FACED 

- Implementation difficult with enhanced for loop traversing as compared to elements size loop.
- Efficiency reduction if using multi-tab setup for gathering price and product name.
- Iterator issue as price element not present at 1st tab of search results. 
