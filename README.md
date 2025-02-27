# Full-Stack Chat App

## Company: CODTECH IT SOLUTIONS
**Intern Name:** DHANANJAY D. RATHOD  
**Intern ID:** CT08SBP  
**Domain:** Full Stack Web Development  
**Duration:** 4 Weeks  
**Mentor:** Neela Santosh  

## 📌 Project Overview
The Full-Stack Chat App is a real-time messaging application that enables users to send and receive messages instantly. The app provides one-on-one messaging, real-time updates, and a seamless UI. It is built using React.js for the frontend and Spring Boot with WebSockets for the backend.

This project demonstrates WebSocket integration, REST API handling, state management using Context API, and a responsive UI with Tailwind CSS. The app follows clean code architecture and ensures smooth user interactions.

## 🚀 Features
✅ Real-time messaging with WebSockets  
✅ Responsive UI designed with Tailwind CSS  
✅ Spring Boot backend for handling user requests efficiently  
✅ Modern tech stack with React.js and Java/Spring Boot  
✅ Clean and modular project architecture  

## 🛠️ Tech Stack
### 🌍 Frontend:
- React.js - UI development
- Context API - State management
- Tailwind CSS - Styling
- WebSockets - Real-time messaging
- React Hooks - Managing state and effects
- Axios - API calls

### 🔥 Backend:
- Spring Boot - REST API & WebSocket handling
- Java - Backend logic
- Spring WebSockets - Real-time data transmission
- MySQL - Database for user and message storage
- Maven - Dependency management

## 📂 Project Structure

### Backend:
```
├── src/main/java/com/substring/chat/
│   ├── config/                   # Configuration files (WebSocket, etc.)
│   │   ├── WebSocketConfig.java   # WebSocket configuration
│   │
│   ├── controllers/               # Handles HTTP requests
│   │   ├── ChatController.java    # Manages chat messages
│   │   ├── RoomController.java    # Handles room creation & joining
│   │
│   ├── entities/                  # Data model/entities
│   │   ├── Message.java           # Message entity
│   │   ├── Room.java              # Chat room entity
│   │
│   ├── payload/                   # DTOs and request bodies
│   │   ├── MessageRequest.java    # Request format for sending messages
│   │
│   ├── repositories/              # Database access layer
│   │   ├── RoomRepository.java    # JPA Repository for rooms
│   │
│   ├── services/                  # Business logic
│   │   ├── ChatService.java       # Handles chat message operations
│   │   ├── RoomService.java       # Manages chat rooms
│   │
│   ├── ChatAppBackendApplication.java  # Main Spring Boot application
│
├── pom.xml                         # Project dependencies (Spring Boot, WebSocket, etc.)
```

### Frontend:
```
├── src/
│   ├── assets/                  # Static assets (images, icons, etc.)
│   │   ├── chat.png
│   │   ├── react.svg
│   │
│   ├── components/              # UI components
│   │   ├── ChatPage.jsx         # Main chat screen
│   │   ├── JoinCreateChat.jsx   # UI for creating & joining rooms
│   │   ├── HomePage.jsx         # Home screen
│   │
│   ├── config/                  # Configuration files
│   │   ├── AxiosHelper.js       # API calls setup
│   │   ├── helper.js            # Helper functions
│   │   ├── Routes.jsx           # Routing configuration
│   │
│   ├── context/                 # React Context API for global state
│   │   ├── ChatContext.jsx
│   │
│   ├── services/                # API calls
│   │   ├── RoomService.js       # Handles room-related API calls
│   │
│   ├── App.css                  # Main styles
│   ├── App.jsx                  # Root component
│   ├── index.css                # Global styles
│   ├── main.jsx                  # React entry point
│
├── package.json                  # Project dependencies
├── vite.config.js                 # Vite configuration (if using Vite)
```

## 📜 How to Run the Project
### Prerequisites
- Node.js & npm installed (for frontend)
- Java & Maven installed (for backend)
- MySQL database setup

### 🚀 Running the Frontend
```bash
cd frontend
npm install  # Install dependencies
npm start    # Run the React development server
```

### 🚀 Running the Backend
```bash
cd backend
mvn clean install  # Build the project
mvn spring-boot:run  # Start the Spring Boot server
```
The frontend runs on `http://localhost:3000/` and the backend runs on `http://localhost:8080/`.

## 🎨 UI Preview
### 🏠 Home Page
Displays an introduction screen where users can enter a chat room or create a new one.

![Image](https://github.com/user-attachments/assets/2d313c1e-10ee-40d1-97bd-048117c64591)

### 💬 Chat Page
Shows real-time messaging between users with smooth UI interactions.

![Image](https://github.com/user-attachments/assets/2206ceb0-66b6-4b51-8a49-7bcc9808ff97)

### 📱 Responsive Design
Fully responsive for desktop, tablet, and mobile devices.

## 🤝 Contribution Guidelines
Want to contribute? Follow these steps:

1. Fork the repository
2. Create a new branch: `git checkout -b feature-branch`
3. Commit your changes: `git commit -m "Added new feature"`
4. Push the changes: `git push origin feature-branch`
5. Open a Pull Request

## 📜 License
This project is open-source and available under the MIT License.

