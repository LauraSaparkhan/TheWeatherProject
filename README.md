# TheWeatherProject
The Weather Data Adapter project demonstrates the use of the Adapter pattern to work with different weather APIs providing data in JSON and XML formats and convert them into a standardized format.
Project Structure

The project consists of several Java classes:
JSONtoStandardAdapter.java: This class implements the MobileApplication interface and adapts the JSON weather API to provide data in a standardized format. It converts JSON data to StandardWeatherData.

JSONWeatherAPI.java: This class is responsible for making HTTP requests to the JSON-based weather API and retrieving JSON weather data.

XMLtoStandardAdapter.java: Similar to the JSON adapter, this class implements the MobileApplication interface and adapts the XML weather API to a standardized format. It converts XML data to StandardWeatherData.

XMLWeatherAPI.java: This class is responsible for making HTTP requests to the XML-based weather API and retrieving XML weather data.

StandardWeatherData.java: This class represents weather data in a standardized format and provides methods to access different weather attributes (location, temperature, humidity, and condition).

MobileApplication.java: An interface that defines a common method for getting weather data in a standardized format.

Test.java: A test class that demonstrates the usage of the adapters with both JSON and XML weather APIs.

Adapter Pattern

The Adapter pattern is used in this project to make two incompatible interfaces (JSON and XML weather APIs) work together through a common interface (MobileApplication). The adapter classes (JSONtoStandardAdapter and XMLtoStandardAdapter) allow these APIs to provide data in a standardized way.
Usage

To use the Weather Data Adapter, you can follow these steps:

  Create an instance of the adapter for the desired API:
        For JSON data, use JSONtoStandardAdapter.
        For XML data, use XMLtoStandardAdapter.

  Set the location for the adapter using the setLocation method.

  Call the getWeatherData method to retrieve weather data in a standardized format.

  Display or process the weather data as needed.

![image](https://github.com/LauraSaparkhan/TheWeatherProject/assets/120064402/97ac87d9-64da-4e62-a6a7-2080647d7dba)
