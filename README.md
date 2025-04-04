# Simple Spring Boot API with HTML Frontend

This is a simple Spring Boot application that provides both RESTful API endpoints and a basic HTML frontend.

- `GET /` Get homepage
- `GET /api/messages` - Get all messages

# Run Docker
docker build -t springboot-demo .
docker run -p 8080:8080 springboot-demo