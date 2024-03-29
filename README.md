# Covid-19 statistics micro-service REST-ful application

In this activity we create a REST-ful application using Spring Boot and Hibernate whose purpose is to fetch Covid-19 statistics data from the URL  https://api.covid19api.com/summary (that is being updated regularly) and access it by country identified by the 2-letter country code

I completed the task by doing the following:

Step 1: In view of the fact that the data provided on the URL is in JSON format, I used a JSON to SQL converter to generate the table generating script (please, refer to file: StatisticsProject/db/convertcsv_new.sql) - I modified the default name of the table and the names of the columns to comply with the respective naming convention; A diagram of table "countries" - the only table that I created for this project, is also saved in directory "db". In order to access the database one needs to: 1. create a new database (preferably called countries); 2. open a console in their IDE and paste the scipt from file "convertcsv_new.sql", after that press CTRL + A and run to generate the table; 3. once the table is ready, please, make sure the column names match the ones in /models/Country annotations

Step 2: Having cloned the project directory on your computer, please check the credentials in the resources/application.properties file to make sure the database url, username and password match the ones of your localhost so as to be able to link the project to the dababase

Step 3: Try Building and running the project

Step 4: In case everything goes smoothly, you can test the application in Postman: choose a GET request and then write "localhost:8080/api/country/DE" if you would like to access the info of Germany, for example, you can test with other countries too

HOPE YOU ENJOYED MY APP!


CovidStatsH2JPA

1. First we will have to build the project using Maven build tool

2. In order to run the project and generate the database we need the two files in resources: 1. schema.sql and 2.data.sql - we can check in the web console 
http://localhost:8080/h2/login.do?jsessionid=ed8f6609fdb3b73d62ba0faf839ff1b0 if the table is created and filled with data

3. The project is implemented using CRUD Generic Repository

4. We can test in Postman as usual

Thank you very much!
