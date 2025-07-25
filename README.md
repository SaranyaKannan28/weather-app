\# 🌦️ Weather App



A Spring Boot-based Weather Application that fetches real-time weather data from the OpenWeatherMap API and displays it using a stylish, responsive frontend with Thymeleaf.



---



\## 🚀 Features



\- 🔍 Search weather by city name  

\- 🌡️ Displays temperature (°C)  

\- 💧 Shows humidity (%)  

\- 🌥️ Weather condition (e.g., clear sky, rain)  

\- ⚠️ Error handling for invalid city or API failures  

\- 🎨 User-friendly and professional UI  



---



\## 🛠️ Technologies Used



\- Java 17+  

\- Spring Boot  

\- Thymeleaf (Template Engine)  

\- OpenWeatherMap API  

\- HTML \& CSS  



---



\## 📁 Project Structure



weatherapp/

├── src/

│ └── main/

│ ├── java/

│ │ └── com/example/demo/

│ │ ├── WeatherController.java

│ │ ├── WeatherService.java

│ │ ├── WeatherResponse.java

│ │ └── WeatherServiceException.java

│ └── resources/

│ ├── templates/

│ │ └── weather.html

│ └── application.properties ← (excluded from Git)

├── .gitignore

├── pom.xml

└── README.md



yaml

Copy

Edit



---



\## 🔧 Setup Instructions



1\. \*\*Clone the repository\*\*  

&nbsp;  ```bash

&nbsp;  git clone https://github.com/SaranyaKannan28/weather-app.git

&nbsp;  cd weather-app

Add your OpenWeatherMap API key

Create application.properties inside src/main/resources/ and add:



properties

Copy

Edit

weather.api.key=your\_actual\_api\_key\_here

✅ Note: This file is excluded from Git to protect your API key.



Run the application



bash

Copy

Edit

mvn spring-boot:run

Open your browser and visit:



arduino

Copy

Edit

http://localhost:8080

⚠️ Error Handling

Gracefully handles:



Invalid city names



Network/API errors



Missing or incorrect API key



✅ Displays user-friendly error messages on the UI.



📸 Screenshot

!\[App Screenshot](images/screenshot.png)





📞 Contact

Created by Saranya Kannan

📧 Email: saranyakannan1111@gmail.com

🔗 GitHub: SaranyaKannan28





