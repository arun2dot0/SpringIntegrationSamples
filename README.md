Spring Boot with Integration sample 
=========================================

To Use 
=========================================

To use this project , do these 3 steps

1. Make sure the POJO structure aligns with your REST API . Example shown is using REST API with following structure

{  
   "status":"OK",
   "payload":[  
      {  
         "addressLineOne":"address1",
         "city":"SanJose",
         "countryCode":"US",
         "postalCode":"95086",
         "firstName":"TEST",
         "middleInitial":"K",
         "suffix":"Sr.",
         "lastName":"TEST",
         "businessName":"ABC",
         "phoneNumber":"123456",
         "phoneNumberType":"HOME",
         "additionalPhoneNumber":"1234455",
         "additionalPhoneNumberType":"Other",
         "isDefault":"true",
         "addressId":"123455",
         "shippingAddressType":"Residential",
         "state":"CA"
      }
   ]
}

2. Update URL in the integration.xml to the right REST API

3. Build the Project using the following command


    $ mvn clean install
    

Execute
=========================================    
run App or as String boot project


