# ShowRoom
This project will be fully functional showroom application. 
This project consists of Spring Boot Rest API and Graphical Representation of data using those API.


## Functionalities
1. List all the car Model
2. List all the brands
3. Yearly Sale - last 10 year sale data
4. Yearly Sale by id - last 10 year sale data
5. Monthly sale - last 12 month sale data
6. Monthly sale by id - last 12 month sale data
7. Sale for particular year - 1 year sale data of paricular year
8. Sale for particular year by id - 1 year sale data of that year
9. Add Brand
10. Add vechile model
11. Get model details - Specification of car
12. Available Vehicles - List all the available vehicles
13. Order by price
14. Order by date
15. Order by name
16. Out of stock models - List all the models which is not available
17. Get vehicle in range of price
18. Total Variation of car model based on color 

## Table Schema

1. CarModel

| FieldName     | Description                        | 
| ------------- | -------------                      |
| ModelId       | Unique Id for all the car models   |
| ModeNumber    | Model Number - provided by Brands  |
| ModelName     | Mode Name - provided by Brands     |
| BrandId       | Foreign key to Brand table         |
| Engine        | Engine Details of Model            |
| Price         | Price of the Model                 |

2. Brands

| FieldName     | Description                                    |
| ------------- | -------------                                  |
| BrandId       | Unique Id for all available brands             |
| BrandName     | Name of the Brand                              |
| Date          | From when it was/will be available in showroom |

3. Sales

| FieldName     | Description                        |
| ------------- | -------------                      |
| SalesId       | Unique Id for all the Sold Cars    |
| ModelId       | Foreign Key of ModelId in CarModel |
| BrandId       | Foreign Key of BrandId in Brands   |
| SaleDate      | Sale date of the carMode           |

4. CarVariation 

| FieldName     | Description                                  |
| ------------- | -------------                                |
| ModelId       | Foreign Key of ModelId in CarModel           |
| color         | Color of the CarModel                        |
| Available     | Total available cars of this model and color |
