# 💰 Expense Tracker

A simple full-stack web application to track daily expenses, built with **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**.

This project was built as a hands-on learning exercise to practice Java backend development, database integration, and server-side rendered web pages using the Spring ecosystem.

---

## 🚀 Features

- Add new expenses with a description and amount
- View all expenses in a table, along with a running total
- Edit existing expenses
- Delete expenses with a confirmation prompt
- Clean, responsive UI styled with Bootstrap and custom CSS

---

## 🛠️ Tech Stack

**Backend**
- Java 21+
- Spring Boot 3.3.2
- Spring Data JPA (Hibernate)
- Maven

**Frontend**
- Thymeleaf (server-side templating)
- Bootstrap 4.5.2
- Font Awesome icons
- jQuery (for page transition effects)

**Database**
- MySQL

---

## 📂 Project Structure

```
ExpenseTracker/
├── src/
│   ├── main/
│   │   ├── java/com/shruti/ExpenseTracker/
│   │   │   ├── controller/
│   │   │   │   └── ExpenseController.java
│   │   │   ├── model/
│   │   │   │   └── Expense.java
│   │   │   ├── repository/
│   │   │   │   └── ExpenseRepo.java
│   │   │   ├── server/
│   │   │   │   └── ExpenseService.java
│   │   │   └── ExpenseTrackerApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/style.css
│   │       │   └── images/background.png
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   ├── addExpense.html
│   │       │   └── updateExpense.html
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 21 or later installed
- Maven (or use the included `mvnw` wrapper)
- MySQL Server installed and running

### 1. Clone the repository

```bash
git clone https://github.com/your-username/expense-tracker.git
cd expense-tracker
```

### 2. Create the MySQL database

Open MySQL Workbench or the MySQL CLI and run:

```sql
CREATE DATABASE expense_tracker;
```

### 3. Configure database credentials

Update `src/main/resources/application.properties` with your own MySQL username and password:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4. Run the application

Using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or run `ExpenseTrackerApplication.java` directly from your IDE.

The app will be available at:

```
http://localhost:8080
```

Spring Data JPA will automatically create the required `expense` table on first run (`spring.jpa.hibernate.ddl-auto=update`), so no manual schema setup is needed.

---

## 📸 Screenshots

*(Add screenshots of the home page, add-expense form, and update-expense form here once available.)*

---

## 🔮 Future Improvements

- [ ] Add expense categories and filtering
- [ ] Add date tracking for each expense
- [ ] Add monthly/yearly expense summaries and charts
- [ ] Add user authentication (multi-user support)
- [ ] Export expenses to CSV/PDF

---

## 👩‍💻 Author

**Shruti**
Built as a portfolio project to practice Spring Boot, JPA, and full-stack Java web development.
