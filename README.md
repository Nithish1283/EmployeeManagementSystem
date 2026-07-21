# 👨‍💼 Employee Management System

A **Java-based Employee Management System** developed using **Java, JDBC, and MySQL**. The application allows users to manage employee records through a menu-driven console interface by performing CRUD operations efficiently.

## 🚀 Features

- ➕ Add Employee
- ✏️ Update Employee Details
- ❌ Delete Employee
- 🔍 Search Employee
- 📋 View All Employees
- 🗄️ MySQL Database Integration
- 🛡️ Exception Handling
- 💻 Menu-Driven Console Application

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE

## 📂 Project Structure

```
EmployeeManagementSystem/
│
├── src/
│   ├── dao/
│   ├── model/
│   ├── util/
│   └── main/
│
├── database/
│   └── employee_db.sql
│
└── README.md
```

## 🗃️ Database

**Database Name:** `employee_db`

Example Table:
- employee_details

## ⚙️ Installation

1. Clone the repository

```bash
git clone https://github.com/Nithish1283/EmployeeManagementSystem.git
```

2. Import into Eclipse.

3. Create the database.

```sql
CREATE DATABASE employee_db;
```

4. Create the employee table or import `employee_db.sql`.

5. Configure database credentials.

```java
private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

6. Add MySQL Connector JAR.

7. Run `Main.java`.

## 📸 Output

- Main Menu
- Add Employee
- View Employees
- Search Employee
- Update Employee
- Delete Employee

*(Add console output screenshots after completing the project.)*

## 🎯 Learning Outcomes

- Core Java
- JDBC Connectivity
- CRUD Operations
- Object-Oriented Programming (OOP)
- Exception Handling
- SQL & MySQL
- Git & GitHub

## 👨‍💻 Author

**Gadde Nithish**

- GitHub: https://github.com/Nithish1283
- LinkedIn: https://linkedin.com/in/gadde-nithish-8094783a3

## ⭐ If you found this project useful, don't forget to Star the repository!
