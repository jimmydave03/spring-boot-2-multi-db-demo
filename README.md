# spring-boot-2-multi-db-demo

This app is demo to configure multiple database / Schema with spring boot 2 and spring data. 

Here, I have created two database. 1) EmployeeDB and 2) CustomerDB. We are gonna connect to both database via Spring boot 2 and do manipulation on  both db via rest apis.

To run the application:

1) Import both the database you will find in DB folder in repo.
2) Clone the project.
3) Run application with commnad: clean spring-boot:run
4) Find to endpoint in company controller: /saveEmp, /saveCust

At this procedure you will find record is storing to both the DB separately.

Thanks
