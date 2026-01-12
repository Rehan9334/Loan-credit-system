#  Loan Credit System – Java Spring Boot Microservices

The **Loan Credit System** is a backend microservices project built using **Java Spring Boot** that simulates how banks process loan applications, evaluate credit scores, approve or reject loans, and manage repayments.

This project is designed to demonstrate **real-world microservices architecture** commonly used in fintech and banking systems.

---

##  Features

- User loan application submission
- Credit score evaluation
- Loan approval / rejection logic
- Loan repayment tracking
- Secure REST APIs
- Scalable microservices architecture

---

##  Microservices Architecture

| Service Name | Responsibility |
|--------------|----------------|
| User Service | Manage customer details |
| Loan Service | Loan application & status |
| Credit Service | Credit score evaluation |
| Payment Service | EMI & repayment handling |
| API Gateway | Central entry point |
| Config Server | Centralized configuration |

---

##  Tech Stack

- Java 17
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Spring Data JPA
- MySQL
- REST APIs
- Maven
- Docker (optional)

---

##  Project Structure

loan-credit-system
│
├── user-service
├── loan-service
├── credit-service
├── payment-service
├── api-gateway
├── config-server
└── README.md


---

## 🔄 Loan Workflow

1. User applies for a loan  
2. Credit Service checks credit score  
3. Loan Service approves or rejects  
4. Approved loans generate EMI schedule  
5. Payment Service tracks repayments  

---

## 🛠️ How to Run the Project

### Prerequisites
- Java 17+
- Maven
- MySQL
- IDE (IntelliJ / Eclipse)

### Steps
1. Clone the repository  
   ```bash
   git clone https://github.com/your-username/loan-credit-system.git

Configure database in application.yml


Start services in this order:


Config Server


Eureka Server


All Microservices


API Gateway





📌 Sample API Endpoints


POST /users → Create user


POST /loans/apply → Apply for loan


GET /loans/{id} → Loan status


POST /payments/pay → Pay EMI



🎯 Purpose of This Project


Practice Spring Boot Microservices


Understand real banking workflows


Build resume & interview-ready project


Demonstrate scalable backend design



📈 Future Enhancements


JWT authentication


Kafka event-driven communication


Redis caching


Docker & Kubernetes deployment


Admin dashboard



👨‍💻 Author
Developed by Java Backend Developer
Focused on Spring Boot, Microservices, and Fintech systems

⭐ If you like this project, please give it a star!

---

If you want next:
- ✅ **Architecture diagram**
- ✅ **ER diagram**
- ✅ **Each microservice README**
- ✅ **Complete working code**
- ✅ **Resume bullet points for this project**

Just tell me 👍


