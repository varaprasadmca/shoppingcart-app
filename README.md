Please find the following steps to run Shopping Cart Application



Pre request –server side please install below software’s 
Java 
MongoDB

Step1:  mongoDB server should be up.  Please run following commend 
C:\Program Files\MongoDB\Server\3.4\bin\monogod.exe.
Strep 2. Create basic collection in mongoDB  please run the following commend 
C:\Program Files\MongoDB\Server\3.4\bin\monogo.exe.
> db.createCollection("product", { size: 2147483648 } )

db.createCollection("user", { size: 2147483648 } )

db.createCollection("OrderDetails", { size: 2147483648 } )

Step 3: Run the java standalone Application file
Path : Shopping-Cart-App\server\spring-boot-data-mongodb\src\main\java\com\egit\spring\shoppingcart\ ShoppingCartApplication.Java.
This commend will start spring embedded server will make up with port 8080.

Step 4:  Postman you can test the services 
Example URI : http://localhost:8080/users.



Web project Steps 
Please install the below software’s
Ref :http://jasonwatmore.com/post/2016/06/22/nodejs-setup-simple-http-server-local-web-server
Ref :https://www.npmjs.com/package/http-server

Step 1 :
Node.JS  

After install node.js please type “npm” in commend prompt to verify Nod.Js is installed or not.

Step 2
Install htttp Server:
Installation via npm:
 npm install http-server –g.
Please note: run this commend at you are project folder> 
example: \Shopping-Cart-App\web> npm install http-server –g

Server will start with 8081 port.

Step3: Any Browser Lunch the application 
 http://localhost:8081.












