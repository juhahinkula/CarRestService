# CarRestService
Restful API for front end course

Running on 
http://carrestapi.herokuapp.com/cars
and
https://carstockrest.herokuapp.com/

Fetch all cars 
```
GET /cars
```
Fetch one car by id
```
GET /cars/{id}
```
Delete car by id
```
DELETE /cars/{id}
```
Add new car 
POST /cars
Header: 'Content-type': 'application/json'
Body: car json
```
Update car by id
```
PUT /cars/{id}
Header: 'Content-type': 'application/json'
Body: updated car json
```
Re-populate the database 
```
POST /reset
```



