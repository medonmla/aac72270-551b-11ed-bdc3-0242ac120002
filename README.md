# aac72270-551b-11ed-bdc3-0242ac120002
Covid-19 statistics micro-service REST-ful application
In this activity we create a REST-ful application using Spring Boot and Hibernate whose purpose is to fetch Covid-19 statistics data from the URL  https://api.covid19api.com/summary (that is being updated regularly) and access it by country identified by the 2-letter country code

I completed the task by doing the following:

Step 1: In view of the fact that the data provided on the URL is in the JSON format, I used a JSON to SQL converter to generate the table generating script (please, refer to file: StatisticsProject/db/convertcsv.sql) - later I modified the name of the table and the names of the column to comply with the respective naming convention; A diagram of table "countries" - the only table that I created for this project, is also saved in directory "db". In order to access the database one needs to: 1. create a new database (preferably called countries); 2. open a console in their IDE and paste the scipt from file "convertcsv.sql", after that press CTRL + A and run to generate the table; 3. once the table is ready the column names can be modified to match the ones in /models/Country
