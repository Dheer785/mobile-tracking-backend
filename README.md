# 📍 Mobile Tracking Backend

A Spring Boot backend application for storing and retrieving user location data.

---

## 🚀 Features
- Save user location (latitude, longitude)
- Retrieve all stored locations
- RESTful API design
- Layered architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Maven
- REST APIs

---

## 🔗 API Endpoints

### Save Location
**POST** `/api/locations`

#### Request Body
```json
{
  "latitude": 12.9716,
  "longitude": 77.5946
}
``
```

---

### Get All Locations
**GET** `/api/locations`

#### Response Example
```json
[
  {
    "id": 1,
    "latitude": 12.9716,
    "longitude": 77.5946
  }
]






