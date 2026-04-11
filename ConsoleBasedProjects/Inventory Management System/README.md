
# 📦 Inventory Management System (Console-Based Java Project)

## 📌 Introduction

The **Inventory Management System** is a console-based Java application that helps manage stock items efficiently.
It allows users to add, remove, and view items in the inventory.

This project demonstrates how real-world systems like inventory tracking can be built using **Java and Object-Oriented Programming concepts**.

---

# 🚀 Features

• Add new items to inventory
• Remove items from inventory
• View all available items
• Dynamic storage using ArrayList
• Menu-driven console interface
• Handles invalid operations safely

---

# 🧠 Concepts Used

• Object-Oriented Programming (OOP)
• Classes and Objects
• Generics (`<T>`)
• ArrayList
• Exception Handling
• Scanner for user input
• Menu-driven programming

---

# 📂 Project Structure

```
com.inventory
│
├── Item.java              # Represents a single item
├── Inventory.java         # Handles inventory operations
└── InventorySystem.java   # Main class (entry point)
```

---

# ⚙️ Components Explanation

## 1️⃣ Item Class

Represents a single item in the inventory.

Attributes:
• Name
• Quantity
• Price

This class acts as a model for inventory items.

---

## 2️⃣ Inventory Class

Manages all inventory operations.

Functions:
• addItem() → Adds item to inventory
• removeItem() → Removes item
• viewItems() → Displays all items

Uses:
• ArrayList for dynamic storage
• Generics for flexibility

---

## 3️⃣ InventorySystem Class

Main class of the application.

Responsibilities:
• Displays menu
• Takes user input
• Calls appropriate methods
• Controls program flow

---

# 🖥️ Menu Options

1 → Add Item
2 → Remove Item
3 → View Items
4 → Exit

---

# 🔄 How the System Works

1. User selects an option from the menu
2. System performs the selected operation
3. Inventory updates dynamically
4. Results are displayed on the console

---

# 🛠️ How to Run the Project

### Step 1

Open project in Java IDE
(IntelliJ IDEA / Eclipse / VS Code)

### Step 2

Compile the program

javac InventorySystem.java

### Step 3

Run the program

java InventorySystem

---

# 📈 Possible Improvements

• Add database integration (MySQL / PostgreSQL)
• Add update item feature
• Add search functionality
• Create GUI using JavaFX or Swing
• Add authentication system

---

# 💡 Learning Outcome

This project helps in understanding:

• How to manage data using classes
• How to build real-world systems using Java
• How to use generics and collections
• How to handle user input and errors

---

✨ This project is a strong foundation for building real-world backend systems like e-commerce inventory or stock management tools.
