# CarRestService
Restful API for front end course

Running on 
http://carrestapi.herokuapp.com/cars
and
https://carstockrest.herokuapp.com/

You can fetch all cars by calling ‘/cars’ endpoint using the GET method.

You can fetch one car by calling ‘/cars/{id} endpoint with car’s Id

You can delete car by calling ‘/cars/{id} endpoint with DELETE method

You can add new car by calling ‘/cars’ endpoint with POST method and giving a new car inside the request body as a JSON string
Header: 'Content-type': 'application/json'

You can update car by calling ‘/cars/{id}’ endpoint with PUT method and giving a updated car inside the request body as a JSON object
Header: 'Content-type': 'application/json'

Note! You can re-populate the database by sending POST requst to '/reset' endpoint.




