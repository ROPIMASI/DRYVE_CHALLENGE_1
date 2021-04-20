# ROADMAP TO "DRYVE CHALLENGE 1"
List of future versions with its desired featues (goals) and its brief feature descriptions.  
  
*Started 202103112130-UTC/GMT/Z-time*  
*Last change 202104201940-UTC/GMT/Z-time*  
  
&nbsp;  
&nbsp;  
&nbsp;
  
<a name="0.3.0-beta"></a>
### Future Version 0.3.0-beta
All features from last version, plus...  
+ Integration with KBB public API, geting the price for `price_KBB` object's atribute;
  > *Internal* `dev.ronaldomarques.dryve.challenge1.domain.service.ModelsYearsRegistryService`, new method `.findKBBId();`;  
  > *Internal* `dev.ronaldomarques.dryve.challenge1.api.service.KbbApiService`, new method `.findPrice();`.  
+ Brands exclusion
  > *End-point* `/brands`, http-method `DELETE`, header-parameter `brand.id`'s value type;  
+ Models exclusion
  > *End-point* `/models`, http-method `DELETE`, header-parameter `model.id`'s value type;  
+ Model-year relation exclusion
  > *End-point* `/modelsyears`, http-method `DELETE`, header-parameter `modelYear.id`'s value type;  
+ Motor vehicles exclusion
  > *End-point* `/motorvehicles`, http-method `DELETE`, header-parameter `motoVehicle.id`'s value type; 
&nbsp;  
  
<a name="0.4.0-beta"></a>
### Future Version 0.4.0-beta
+ Brands update
  > *End-point* `/brands`, http-method `UPDATE`, header-parameter `brand.id`'s value type, body-payload `objeto em JSON`;  
+ Models update
  > *End-point* `/models`, http-method `UPDATE`, header-parameter `model.id`'s value type, body-payload `objeto em JSON`;  
+ Model-year relation update
  > *End-point* `/modelsyears`, http-method `UPDATE`, header-parameter `modelYear.id`'s value type, body-payload `objeto em JSON`;  
+ Motor vehicles update
  > *End-point* `/motorvehicles`, http-method `UPDATE`, header-parameter `motoVehicle.id`'s value type, body-payload `objeto em JSON`; 
&nbsp;  
  
<a name="0.5.0-beta"></a>
### Future Version 0.5.0-beta
+ Description... Under analyzing...   
  
&nbsp;  
  
### Final objective version 1.0.0-released
+ Self-presentation: returns a smal text with application's version name, and an initial introduction.
  > *End-point* `/hello`, http-method `GET`.  
+ Summary fo the features: returns a list of each avalable end-point in the project and a breif description of its fuction.
  > *End-point* `/help`, http-method `GET`.  
+ Listing of each URI
  - List of all objects registered in their respective URI. Returns a `ResponseEntity` with an empty or populated `List` in `body` of the `Response`.
  > *End-point* `/brands`, http-method `GET`;  
  > *End-point* `/models`, http-method `GET`;  
  > *End-point* `/modelsyears`, http-method `GET`;  
  > *End-point* `/motovehicles`, http-method `GET`;  
  - Filtering for a particular 'plate' (or part of it) informed by the user. Returns a `ResponseEntity` with an empty or populated `List` in `body` of the `Response`.
  > *End-point* `/motorvehicles/{some_value}`, http-method `GET`.  
+ Registry of brands
  - Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/brands`, http-method `POST`, body-payload `JSON`;  
  > *End-point* `/brands`, http-method `PUT`, body-payload `JSON`;  
  > *End-point* `/brands`, http-method `PATCH`, body-payload `JSON`;  
  > *End-point* `/brands`, http-method `DELETE`, body-payload `JSON`.  
+ Consultation of **a** specific brand
  - By **an** `id`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/brands/id/{some_value}`, http-method `GET`.  
  - By **a** brand's `name`. Returns a `ResponseEntity` with an instance of the consulted object, or null in `body` of the `Response`.
  > *End-point* `/brands/name/{some_value}`, http-method `GET`.  
+ Registry of models
  - Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/models`, http-method `POST`, body-payload `JSON`;  
  > *End-point* `/models`, http-method `PUT`, body-payload `JSON`;  
  > *End-point* `/models`, http-method `PATCH`, body-payload `JSON`;  
  > *End-point* `/models`, http-method `DELETE`, body-payload `JSON`.  
+ Consultation of a specific model
  - By **an** `id`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/models/id/{some_value}`, http-method `GET`.  
  - By **a** model's `name`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/models/name/{some_value}`, http-method `GET`.  
+ Registry of model-year relation
  - Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/modelsyears`, http-method `POST`, body-payload `JSON`;  
  > *End-point* `/modelsyears`, http-method `PUT`, body-payload `JSON`;  
  > *End-point* `/modelsyears`, http-method `PATCH`, body-payload `JSON`;  
  > *End-point* `/modelsyears`, http-method `DELETE`, body-payload `JSON`.  
+ Consultation of **one or more** model-year relation
  - By **an** `id`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/modelsyears/id/{some_value}`, http-method `GET`.  
  - By **a** model's `name`. Returns a `ResponseEntity` with an `list` populated or empty of instance of the consulted object, in `body` of the `Response`.
  > *End-point* `/modelsyears/name/{some_value}`, http-method `GET`.  
+ Registry of advertised-vehicle (motor vehicles)
  - Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/motorvehicles`, http-method `POST`;  
  > *End-point* `/motorvehicles`, http-method `PUT`;  
  > *End-point* `/motorvehicles`, http-method `PATCH`;  
  >> Integred to the external KBB-API for `kbb_id`'s value storage.  
  >  
  > *End-point* `/motorvehicles`, http-method `DELETE`.  
  >    
+ Consultation of a specific advertised vehicle (motor vehicle)
  - By **a** `plate`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/motorvehicles/plate/{some_value}`, http-method `GET`. 
  
&nbsp;  
&nbsp;  
&nbsp;  
  
<a name="author"></a>
## AUTHOR
### Ronaldo Marques.
###### | https://ronaldomarques.dev | [linkedin @ronaldo marques](https://linkedin.com/in/ropimasi/) | [twitter @ropimasi](https://twitter.com/ropimasi/) | [insta @ropimasi](https://instagram.com/ropimasi/) | ronaldomarques@email.com |
### Thank you _/\\_ .  
&nbsp;  
  
  