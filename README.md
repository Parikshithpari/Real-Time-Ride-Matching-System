# Real-Time-Ride-Matching-System
A real-time ride-matching backend built with Spring Boot and Apache Kafka. Supports producer-consumer architecture for scalable, event-driven ride dispatching and status tracking.
<br>

This project is a Spring Boot backend service designed to enable real-time ride dispatching and tracking using Apache Kafka. It simulates ride booking logic where riders generate requests, drivers are matched based on location, and updates are communicated asynchronously between services.

## ✨ Core Features

- Kafka producers for sending ride requests and status updates
- Kafka consumer for matching drivers based on pickup location
- Modular design with service segregation for scalability
- MySQL database integration for persisting driver availability
- REST and event-driven hybrid architecture

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **Apache Kafka**
- **Spring Data JPA**
- **MySQL**
- **Lombok**

## ⚙️ Kafka Topics

| Topic Name       | Description                                 |
|------------------|---------------------------------------------|
| `ride-request`   | Carries ride request payloads from riders   |
| `driver-matching`| Emits matched ride info to booking system   |
| `ride-updates`   | Notifies ride status changes (e.g., started, completed) |

## 🔁 Service Overview

### RideRequestProducer
Sends ride requests to the `ride-request` Kafka topic.

### RideStatusProducer
Publishes ride status events to the `ride-updates` topic for downstream listeners.

### DriverMatchingConsumer
Consumes messages from `ride-request`, fetches nearby drivers, updates availability, and produces a `driver-matching` event if successful.

## 🗃️ Folder Structure
src/
├── main/
│   ├── java/
│   │   └── com.example.ridebooking/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── service/
│   │       ├── config/
│   │       └── kafka/
│   └── resources/
│       ├── application.properties
│       └── static/



## 🧪 Sample Payloads

**Ride Request:**
```json
{
  "userId": "U101",
  "pickupLocation": "Majestic",
  "dropLocation": "Electronic city"
}
```

## 📌 Future Enhancements

### 🚗 Driver Intelligence & Optimization
- Implement a smart driver-matching algorithm that ranks drivers based on real-time distance, availability, historical acceptance rate, and user ratings
- Integrate Redis for ultra-fast caching of driver availability and location data to reduce DB load and accelerate response time

### 📣 Communication & User Experience
- Enable asynchronous Email and SMS notifications using Kafka consumers to notify users and drivers about booking updates, cancellations, and ride status changes
- Introduce WebSocket-based real-time communication to push live ride updates (e.g., driver ETA, status transitions) directly to connected frontend clients for an Uber-like experience


