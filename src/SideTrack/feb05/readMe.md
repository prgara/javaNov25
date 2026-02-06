## API
- Application programming interface
- middleman
- It is an interface b/w two sets of machine/system that allows you to communicate with another system/machine


API is like a waiter in a restaurant.

you (client) -> give order (request)
Waiter(API) > takes order to the kitchen
Kitchen(server) -> prepares the food
waiter -> brings back the food (response)


Google Map API, weather api, payment api (stripe,razorpay)

## categories
- Public API -> Available to everyone. weather api, google map
- Private Api -> used internally within org. bank apis
- Partner API -> shared with selected partner. payment gateway
- Composite api -> multiple apis combined in one call


## Types
- SOAP -> Simple Object access protocol, heavy, XML based req & res, slowe
- REST -> Representational state transfer, uses HTTP, lightweight, JSON/XML, faster
- GraphQL -> client decides what data it wants, Facebook
- gRPC


HTTP -> communication protocol, Hyper text transfer protocol
method -> GET,POST,PUT,DEL

expedia,kayak
url -> https://www.kayak.co.in/flights/YYZ-JFK/2026-03-01/2026-03-03?fs=fdDir%3Dfalse&ucs=gvb5zj&sort=bestflight_a#dialog

Request -> url, header, method, body(from,to,dates,passengers)

url -> https://www.priceline.com/m/fly/search/YYZ-NYC-20260206/NYC-YYZ-20260207/?cabin-class=ECO&no-date-search=false&search-type=0110&num-adults=1
- base url -> https://www.priceline.com
- endpoint -> m/fly/search/YYZ-NYC-20260206/NYC-YYZ-20260207
- query param -> ?cabin-class=ECO & no-date-search=false & search-type=0110 & num-adults=1
- path param -> / pass
- body

testing the apis -> postman, bruno, swagger (documentation of the apis)

download install and make an account on postman
make an account on https://openweathermap.org
https://fakestoreapi.com/docs
https://app.reqres.in/playground

Response -> status code, body, header

200 -> successfully
201 -> created