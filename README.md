# 🏢 Internship Job Portal

## 🚀 Project Overview
The **Internship Job Portal** is a web application that allows users to explore and apply for internships. Admins can manage internship listings, and users can apply easily through a secure and user-friendly platform.

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot  
- **Frontend:** HTML, CSS, JavaScript  
- **Database:** MySQL  
- **APIs:** RESTful services  
- **Authentication:** Role-based login (Admin & User)  

---

## ✨ Features
- Secure login for Admin and Users  
- Admin can add, edit, or delete internships  
- Users can view and apply for internships  
- Database integration with MySQL  
- REST API support for all operations  

---


## 📂 Project Structure
internship-job-portal/
│
├── src/main/java/com/internshipportal
│ ├── controller/ # REST API controllers
│ ├── model/ # Entity classes
│ ├── repository/ # Database repositories
│ └── service/ # Business logic services
│
├── src/main/resources/
│ └── application.properties # Spring Boot configuration
│
├── pom.xml # Maven dependencies
└── README.md # Project documentation


---

## ⚡ How to Run

### Prerequisites
- Java 11 or higher  
- Maven  
- MySQL  

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/internship-job-portal.git
   cd internship-job-portal
2.Create a MySQL database named internship_portal and update application.properties with your credentials.

3.Build the project: mvn clean install
4.Run the application:mvn spring-boot:run
5.Open your browser at http://localhost:8080
