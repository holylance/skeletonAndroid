# mobile-exercise-template
Mobile exercise template for both iOS and Android applications.

**MOBILE HOMEWORK**

So you want to become a Chocorian!? Here at Choco, we’re working hard every day to make our app the best ordering app in the galaxy. So in order for you to have a taste of what we’re working on. You’re going to have the opportunity to show us how amazing your coding skills are by developing your very own simplified version of the Choco ordering app.

**PROCESS**

1. This repo is your own, you can use it to work and commit your solution here.
2. Solve the exercise within a timeframe of 1 week. It normally takes around 3-6 hours to complete.
3. We review your solution within 2 days, provide feedback for you and schedule a call to discuss as a next step.
4. Demo your solution to future colleagues (product managers and engineers) on the call.

The app should contain the following features:

**LOGIN** 

The user should be able to log in with email and password. After logging in the app should keep a login session until the user explicitly logs out. When logging out the app should clean all user data and redirect the user to the login screen.

For the login feature, the following API should be used:

**Credentials:**

**User:** user@choco.com
**Password:** chocorian

**Endpoint:**
[POST] *https://qo7vrra66k.execute-api.eu-west-1.amazonaws.com/choco/login*

**Request body:**

{
  email: “email@email.com” 
  password: “password”
}


**Response body:**

{
  token: “1234567890”
}


**LIST PRODUCTS AND CREATE ORDERS**

The user should be able to see a list of products where multiple products can be selected to create an order. After selecting the products the user should be able to click on a button to create the order.

For the fetching products, the following API should be used:

**Endpoint:**

[GET] *https://qo7vrra66k.execute-api.eu-west-1.amazonaws.com/choco/products?token={LOGIN_TOKEN}*

**Response body:**
[
  {

    Id: “5e8c3c48-af49-425b-a6d9-f37f3511e4fa” 
    name: “Product 1”,
    Description: “This is product 1”,
    price: 1000, 
    photo:”http://xyz.com/prod1.jpg”

  } 
]


The created orders should be persisted locally using the persistence strategy of your choice.


**LIST ORDERS**

The user should be able to see the list of orders created in a different tab or screen.
The orders should be fetched from the local storage.


**ORDER DETAIL**

After clicking on an order in the order list, the app should show a different screen with the order details containing the list of products and the total price of the order.


**RULES**

This task should be completed in **one week (7 days).**

The app should be developed using the following languages:
- **Kotlin** for Android
- **Swift** for iOS


In order to complete this test your app **must:**
- Compile with no errors
- Contain no crashes
- Contain all the features
   
 We expect that a badass Chocorian will follow these criteria:
- S.O.L.I.D and D.R.Y principles
- Architectural cleanliness / Patterns usage
- Good app performance / Smooth UI experience
- Unit tests
- UI tests
- Well documented README.md
- Good looking visual design
