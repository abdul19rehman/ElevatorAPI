# Elevator Control System API

This is a simple ATM backend application built using *Spring Boot*.  
It provides basic REST APIs for ATM operations like deposit, withdrawal, and balance check.

---

## 🚀 Getting Started

### 1. Generate Project with Spring Initializr
1. Go to [Spring Initializr](https://start.spring.io/).
2. Fill in the details:
   - *Project*: Maven
   - *Language*: Java
   - *Spring Boot Version*: (latest stable, e.g., 3.x.x)
   - *Group*: elevatorsystem
   - *Artifact*: 
   - *Name*: elevatorsystem
   - *Packaging*: Jar
   - *Java*: 17 (or your installed version)
3. Add dependencies:
   - *Spring Web*
   - - *Lombok*
4. Click *Generate*, and extract the downloaded project.

---

### 2. Open in IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Import the project by selecting the extracted folder.
3. Wait until Maven builds the project and dependencies are downloaded.

---

### 3. Run the Application
1. Locate the main class:  
   src/main/java/elevaorsystem.java
2. Right-click and select *Run 'ElevarorststemApplication'*.
3. The application will start on *http://localhost:8080* by default.

---

### 4. Testing the APIs
You can use *Postman* or *curl* to test the APIs.  
For example:
- External Request:  
  POST http://localhost:8080/elevators/request?floor=5&direction=UP
- Internal Request (Cabin Call):
  POST http://localhost:8080/elevators/1/select?floor=10
- Shutdown system:  
  POST http://localhost:8080/elevators/shutdown

---

## 🛠️ Tech Stack
- *Java 17+*
- *Spring Boot*
- *Maven*
- *REST API*

---
# Elevator System API Endpoints  

This project simulates an **Elevator Control System** where users can:  
- Request an elevator from a floor (external request)  
- Select a destination floor inside the elevator (internal request)  
- Shut down the system  

---

## API Endpoints  

### 1. External Request (Hall Call)  
**POST** `http://localhost:8080/elevators/request?floor=5&direction=UP`  
<img width="1366" height="768" alt="Screenshot (343)" src="https://github.com/user-attachments/assets/dc7e80a2-327d-4f87-a783-ccad7e0cdda2" />

- Simulates a person at a floor requesting an elevator.  
- Requires:  
  - **floor** → the floor where the request is made.  
  - **direction** → UP or DOWN.  

---

### 2. Internal Request (Cabin Call)  
**POST** `http://localhost:8080/elevators/1/select?floor=10`  
<img width="1366" height="768" alt="Screenshot (342)" src="https://github.com/user-attachments/assets/3c45dfdd-17d1-45ce-a1e6-82ad2a04fc3d" />

- Simulates a passenger inside the elevator selecting a destination floor.  
- Requires:  
  - **elevatorId** → ID of the elevator being used.  
  - **floor** → destination floor chosen inside the cabin.  

---

### 3. Shutdown System  
**POST** `http://localhost:8080/elevators/shutdown`  
<img width="1366" height="768" alt="Screenshot (341)" src="https://github.com/user-attachments/assets/4b59ebf6-315e-4f4e-be94-eeda72fda429" />

- Gracefully shuts down the elevator system.  
- Stops all elevators and ends active operations.  

---
