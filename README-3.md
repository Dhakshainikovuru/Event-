# Local Event Decoration & Floral Aggregator

A complete hackathon-ready full-stack application based on the supplied problem statement.

## Tech Stack

- Java 17+
- Spring Boot 3.5.x
- Spring Web / REST API
- Spring Data JPA / Hibernate
- MySQL
- React + Vite
- Axios
- Git + GitHub

## Main Flow

React form
→ Spring Boot REST API
→ JPA Repository
→ MySQL
→ JSON response
→ React decorator cards
→ Booking request

## Features

- Event type, location, date, budget and service search
- Decorator/florist matching
- Responsive cards
- Price, rating, portfolio, availability and contact information
- Search/filter by service, city and budget
- Booking form with validation
- Booking status
- Seed/sample decorator data
- REST endpoints
- MySQL persistence
- CORS configuration
- Loading, success and error states
- Simple professional UI
- Docker Compose for MySQL
- GitHub-ready project structure

## Project Structure

```text
LocalEventDecorationFloralAggregator/
├── backend/
│   ├── pom.xml
│   └── src/main/java/com/hackathon/decor/
│       ├── DecorAggregatorApplication.java
│       ├── config/
│       ├── controller/
│       ├── dto/
│       ├── model/
│       ├── repository/
│       └── service/
├── frontend/
│   ├── package.json
│   ├── vite.config.js
│   ├── index.html
│   └── src/
│       ├── App.jsx
│       ├── main.jsx
│       ├── api.js
│       ├── styles.css
│       └── components/
├── database/
│   └── README.md
├── docker-compose.yml
└── .gitignore
```

## 1. Start MySQL

### Option A - Docker

Install Docker Desktop and run:

```bash
docker compose up -d
```

Database:
- Host: localhost
- Port: 3306
- Database: decor_aggregator
- Username: root
- Password: root

### Option B - Local MySQL

Create a database:

```sql
CREATE DATABASE decor_aggregator;
```

Then update `backend/src/main/resources/application.properties` if your username/password is different.

## 2. Start Backend

Open a terminal in `backend`:

```bash
mvn spring-boot:run
```

Backend:
`http://localhost:8080`

## 3. Start Frontend

Open another terminal in `frontend`:

```bash
npm install
npm run dev
```

Frontend:
`http://localhost:5173`

## REST APIs

### Search decorators

```http
GET /api/decorators/search?eventType=Wedding&location=Hyderabad&service=Floral&budget=50000
```

All parameters are optional.

### Get all decorators

```http
GET /api/decorators
```

### Get decorator

```http
GET /api/decorators/{id}
```

### Create booking

```http
POST /api/bookings
Content-Type: application/json
```

Example:

```json
{
  "decoratorId": 1,
  "customerName": "Suma",
  "phone": "9876543210",
  "email": "suma@example.com",
  "eventType": "Wedding",
  "eventDate": "2026-12-20",
  "location": "Tirupati",
  "budget": 45000,
  "message": "Need floral stage decoration"
}
```

### Get bookings

```http
GET /api/bookings
```

## Important Hackathon Explanation

### Frontend
React collects customer requirements and displays matching decorator cards.

### Backend
Spring Boot receives REST requests, validates input, applies business logic and talks to the database through JPA.

### Database
MySQL stores decorators and booking information.

### Matching Logic
The search service filters decorators by:
- service
- city/location
- maximum budget
- event type

### Future Enhancements

- JWT login and role-based access
- Admin dashboard
- Google Maps
- WhatsApp/SMS notifications
- Online payment
- Cloud image upload
- Real-time availability
- Reviews and ratings
- AI-based decorator recommendation
