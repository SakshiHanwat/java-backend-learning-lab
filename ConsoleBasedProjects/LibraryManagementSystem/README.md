# 📚 Library Management System (Console-Based Java Project)

## 📌 Introduction

The **Library Management System** is a console-based Java application designed to manage books and student records in a library.
This project demonstrates the use of **Object-Oriented Programming concepts**, **menu-driven programming**, and **basic data management** using classes and arrays.

The system allows users to perform operations such as **adding books, searching books, registering students, issuing books, and returning books** through an interactive console interface.

---

# 🚀 Features

• Add new books to the library
• Search books by **Serial Number**
• Search books by **Author Name**
• Display all books available in the library
• Update the quantity of books
• Register new students
• Display all registered students
• Issue books to students
• Return borrowed books

---

# 🧠 Concepts Used

This project helps in understanding important Java concepts such as:

• Object-Oriented Programming (OOP)
• Classes and Objects
• Constructors
• Arrays
• Switch Statements
• Menu Driven Programs
• User Input using Scanner

---

# 📂 Project Structure

The project is divided into multiple classes where each class handles a specific responsibility.

Library.java
Main class that contains the program execution and menu system.

book.java
Represents individual book details such as serial number, book name, author name, and quantity.

books.java
Handles all operations related to books such as adding books, searching books, displaying books, and updating quantities.

student.java
Represents a student in the system including student name and registration number.

students.java
Handles student-related operations such as registering students, issuing books, and returning books.

---

# ⚙️ How the System Works

### Library.java

This is the main class of the application.
It displays a **menu-driven interface** where users select operations.

### book.java

Stores information about each book such as:

* Serial Number
* Book Name
* Author Name
* Total Quantity
* Available Quantity

### books.java

Handles operations like:

* Adding books
* Searching books
* Displaying books
* Checking book availability
* Updating book quantity

### student.java

Represents students registered in the library system.

Each student contains:

* Student Name
* Registration Number
* Borrowed Books

### students.java

Manages student records and handles book borrowing and returning.

---

# 🖥️ Menu Options

When the program runs, the following options are displayed:

1 → Add New Book
2 → Upgrade Book Quantity
3 → Search Book
4 → Show All Books
5 → Register Student
6 → Show All Registered Students
7 → Check Out Book
8 → Check In Book
0 → Exit Application

---

# 🔄 Example Workflow

1. Add books to the library
2. Register students
3. Students borrow books
4. Books are returned after use
5. Library records update automatically

---

# 🛠️ How to Run the Project

Step 1: Clone the repository

git clone https://github.com/yourusername/library-management-system.git

Step 2: Open the project in any Java IDE
(IntelliJ IDEA / Eclipse / VS Code)

Step 3: Compile the program

javac Library.java

Step 4: Run the program

java Library

---

# 📈 Future Improvements

Some features that can be added in the future:

• Database integration
• Graphical User Interface (GUI) using JavaFX or Swing
• Book categories and filtering
• Fine calculation for late return
• Admin login system

---

# 💡 Learning Outcome

This project helps in understanding how real-world systems can be modeled using Java.
It improves problem-solving skills and strengthens knowledge of **Object-Oriented Programming and application design**.

---

✨ This project is a simple step towards building real-world Java applications.
