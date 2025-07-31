# AI-Based Recommendation System

An intelligent recommendation engine built using Apache Mahout and Java, designed to suggest items based on user preferences via collaborative filtering techniques.

## Features
-  User-based and item-based collaborative filtering
-  Scalable machine learning via Apache Mahout
-  Sample data for testing recommendation accuracy
-  Modular design with secure API handling

## Technologies
- Java 11+
- Apache Mahout
- Maven
- CSV/JSON data parsing

## Setup

1. Clone the repo  
   `git clone https://github.com/tejesh1610/AI-based-recommendation-system.git`
2. Navigate to project directory  
   `cd AI-based-recommendation-system`
3. Build the project  
   `mvn clean install`
4. Run the application  
   `java -jar target/RecommendationSystem.jar`

## Data Format

Make sure your dataset follows this format:

```csv
UserID,ItemID,Rating
101,2001,4.5
102,2003,3.0
...

Future Enhancements
-  Add support for real-time recommendations via REST API
-  Integrate with a front-end dashboard
-  Track user behavior for improved predictions


Created by Tejesh — passionate about pattern logic, prime numbers, and machine learning.
