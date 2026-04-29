 Mobile Tracking Backend

A Spring Boot backend application for storing and retrieving user location data.

 Features
Save user location (latitude, longitude)
Retrieve all stored locations
RESTful API design
Layered architecture (Controller → Service → Repository)
 Tech Stack
Java
Spring Boot
Spring Data JPA
Maven
REST APIs
Project Structure
controller → Handles API requests
service → Business logic
repository → Database operations
model → Entity classes
🔗 API Endpoints
 Save Location

POST /api/locations

Request Body
{
  "latitude": 12.9716,
  "longitude": 77.5946
}
Get All Locations

GET /api/locations

 How to Run
Clone the repository
Open in your IDE
Run MobileTrackingApplication.java
Test APIs using Postman
 Future Improvements
Add authentication (Spring Security)
Add real-time tracking
Integrate MySQL/PostgreSQL database
