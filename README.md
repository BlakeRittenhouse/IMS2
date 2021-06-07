Coverage: 34%
# Project Title
IMS SERVER.

This project is a simple data base controller that allows you to put together some tables and dependencies for tracking data. It allows you to have two single dependencies 
using Primary keys and one that uses foreign keys. Your data can stay located off site using the db.properties to link your SQLLocal User and schemas. You can also change 
and update the data and names in the code and it will run smoothly.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them.

The Couple of tools you will need to run this project will consist of- Eclipse IDE "https://www.eclipse.org/downloads/", Windows PowerShell "built in windows", 
Git command/bash "https://git-scm.com/downloads" and lastly SQL build "https://www.mysql.com/". All of the installs should be self explanatory. the one that is
going to be confusing might be the SQL build. With the build your gonna want 3 things. First one being MySQL Server 8.0, second one MySQL Shell 8.0, and lastly 
MYSQL Workbench 8.0(this one being very important). thats all the software your going to need to access these files and work the program.


### Installing

Once you get all the Prerequisites done downloading, the first thing your gonna want to do is make a local database with MYSQL. The makers of the program 
included a step by step process on how to install the MYSQL "https://dev.mysql.com/doc/mysql-installer/en/server-accounts-roles.html". Once you have the 
local user server running and can access via CMD you can now open MYSQL workbench. MYSQL workbench is a really good place to make and store strings of code
and data bases. It is also a lot easier to read and understand, as it tells you issues with your code that you have. 

Once you have your server and programs down loaded, you can start taking apart this code program and using it as you please, everything is build so you can 
link your account and start inputing data or you can change the name and type of data input as you wish. Once your done with all of that and it works, you 
can push your info up to your data base and store it forever.

## Running the tests

How to run the test is simple. All you need to do is find the right test that you need and run it using the green play button called "launch button". You can
click the drop down button and chose witch test you wish to run. If you chose to add more, they will appear in that list you have. Currently we have 3 test for 
you to look at. CustomerControllerTest, CustomerDAOtest, CustomerTest. Each test does something different in testing the code and can be changed very easily. 

### Unit Tests 

Starting off with CustomerControllerTest. this test allows you to test the units and build of the code, it also allows you to change the input and output,
seeing what it is capable of doing. This test puts more emphasize behind the code of how the Customer, Item or order is made. it also allows you to explore
what code can and can not be changed.

### Integration Tests 

CustomerDAO falls under this category as it mainly deals with user input side. allowing you to use the CRUD fundamentals. CRUD stands for "Create", "Read",
"Update" and "Delete". When the user runs the program, weather in test mode or real mode, they will have those options to do as they wish to data bases 
you have available.

### And coding style tests

Explain what these tests test and why

CustomerTest is just a simple test to run through the setup on the customer class. All it does it test to make sure the getters and setters function properly 
and allow you to pull them to different classes or child classes depending on what you do.

## Deployment

when ever you link your SQL workbench using the JDBC connection. You might get the error that you have no database selected. If you wish to solve that, make sure 
to get rid of the user=root at the end of your hyper link, and replace it with the name of your database you wish to access. 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Blake Rittenhouse** - *BR* - [BlakeRittenhouse](https://github.com/BlakeRittenhouse)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
