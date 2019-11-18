## API Demo Challange

#### Project Setup
1. Clone this project.
2. Setup the project in your IDE.
3. From command line run mvn clean install -U -DskipTests
5. Make sure you can run the DemoTest

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity


#### Excercise
1. Review the spec in the root directory, PizzaAPIReferenceDoc.  API endpoints for this excercise can be found here
   https://my-json-server.typicode.com/sa2225/demo/
2. Write up your test cases in the Read me file. 
3. Code up a few examples of 
  - order get call including response validation
  - order post call
4. When complete please check your code into a public git repo

#### Test Cases

 1.  Order Get 
   i. Scenario to get list of orders and validate response and statuscode.
   ii. Scenario to get single order using correct order id and validate response and statuscode.
   iii. Scenario to get single order using incorrect order id and validate response and statuscode.
 
 2.  Order Post
   i. Scenario with correct request body which should return Success and validate response and statuscode.
   ii. Scenario with incorrect number of toppings in request body and validate response and statuscode.
   iii. scenario with invalid pizza in request body and validate response and statuscode.
   iv. scenario with pizza not specified in request body and validate response and statuscode.
   v. scenario with toppings not specified in request body and validate response and statuscode.
