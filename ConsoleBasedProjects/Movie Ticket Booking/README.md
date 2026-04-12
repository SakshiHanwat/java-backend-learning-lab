# 🎬 Online Movie Ticket Booking System (Java Project)

## 📌 Introduction

The **Online Movie Ticket Booking System** is a Java-based project that allows users to manage movies, theaters, showtimes, and ticket bookings.

This project simulates the core working of a real-world movie booking platform where users can browse movies, search available showtimes, and book tickets for a selected movie.

It is a great project for understanding how object-oriented programming and collections can be used to build practical systems in Java.

---

# 🚀 Features

• Add and manage movies
• Add and manage theaters
• Assign showtimes to theaters
• Search movies by name
• Search showtimes by movie and theater
• Book tickets for available showtimes
• Store customer booking details
• Sort movies alphabetically

---

# 🧠 Concepts Used

• Object-Oriented Programming (OOP)
• Classes and Objects
• Collections Framework
• List, Set, and Map
• Comparable Interface
• equals() and hashCode()
• LocalDateTime
• Concurrent Collections

---

# 📂 Project Structure

```text
com.movieticketbooking
│
├── Movie.java
├── Theater.java
├── Showtime.java
├── Booking.java
└── MovieTicketBookingSystem.java
```

---

# ⚙️ Components Explanation

## 1️⃣ Movie Class

This class represents a movie.

It stores:
• Movie name
• Genre
• Duration

It also supports movie comparison for sorting by name.

---

## 2️⃣ Theater Class

This class represents a theater.

It stores:
• Theater name
• Location
• Showtimes available in that theater

---

## 3️⃣ Showtime Class

This class represents a movie showtime.

It stores:
• Show date and time
• Associated movie
• Availability status

If a ticket is booked, the showtime becomes unavailable.

---

## 4️⃣ Booking Class

This class stores ticket booking information.

It includes:
• Movie details
• Showtime details
• Customer name

---

## 5️⃣ MovieTicketBookingSystem Class

This is the main class that manages the complete system.

Its responsibilities include:
• Adding movies
• Adding theaters
• Adding showtimes
• Booking tickets
• Searching movies
• Sorting movies
• Searching showtimes

---

# 🔄 How the System Works

1. Movies are added to the system
2. Theaters are added
3. Showtimes are assigned to theaters
4. Users search for a movie or showtime
5. Users book tickets for available showtimes
6. Booking details are stored in the system

---

# 🖥️ Sample Functionality

The system supports operations such as:

• Viewing movie details
• Searching movies by name
• Finding showtimes in a theater
• Booking a ticket for a selected movie
• Viewing sorted movie list

---

# 🛠️ How to Run the Project

### Step 1

Open the project in your Java IDE
(IntelliJ IDEA / Eclipse / VS Code)

### Step 2

Create the required classes:

• Movie.java
• Theater.java
• Showtime.java
• Booking.java
• MovieTicketBookingSystem.java

### Step 3

Compile the project

```bash
javac com/movieticketbooking/*.java
```

### Step 4

Run the main class

```bash
java com.movieticketbooking.MovieTicketBookingSystem
```

---

# 📈 Possible Improvements

• Add seat selection feature
• Allow multiple bookings per showtime with seat count
• Add cancel booking feature
• Add user login system
• Store data in a database
• Build a GUI or web version
• Add payment integration

---

# 💡 Learning Outcome

This project helps in understanding:

• How to model real-world systems using Java
• How multiple classes work together in one application
• How to use collections for storing and managing data
• How booking logic can be implemented in a structured way

---

# 🌟 Conclusion

The Online Movie Ticket Booking System is a practical Java project that demonstrates how core programming concepts can be applied to solve real-world problems. It is a strong beginner-to-intermediate level project for improving Java, OOP, and system design understanding.
