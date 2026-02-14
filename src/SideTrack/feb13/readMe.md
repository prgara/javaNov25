## recap

API - 
Rest API
Http methods 
post vs put ? 
put vs patch 

https://api.openweathermap.org/data -> base url
/2.5/weather   -> api endpoint
?lat={lat}&lon={lon}&appid={API key} -> query param



api.openweathermap.org/data -> base url
/2.5/forecast
?lat={lat}&lon={lon}&appid={API key}


HTTP status
1xx - > Informational
2xx -> Success      200 -> OK (GET)    201 -> Created (POST) 204 -> No content (DELETE)
3xx -> Redirection  301 -> permanent redirection    302 -> temporary redirect
4xx -> client error 400 -> Bad request   401 -> Unauthorized  403 -> Forbidden  404 -> Not Found
5xx -> server error 500 -> Internal server error   502 -> Bad gateway    503 -> service unavailable

https://github.com/vdespa/introduction-to-postman-course/blob/main/simple-books-api.md


JSON -> JavaScript Object notation - used to send data between client and server.
{
"key": value,
"key": value
}
XML -> Extensible markup language 


## Swagger - > it is used for API documentation 



https://petstore.swagger.io/#/user/createUser

