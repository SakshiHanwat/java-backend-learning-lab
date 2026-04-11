# 🧠 Online Quiz System (Console-Based Java Project)

## 📌 Introduction

The **Online Quiz System** is a console-based Java application that allows users to attempt multiple-choice quiz questions and calculate their score automatically.

The system presents a set of questions with multiple options. The user selects the answer, and the program checks whether the answer is correct or not. After completing the quiz, the application displays the **final score**.

This project demonstrates the use of **interfaces, classes, object-oriented programming, and basic program structure in Java**.

---

# 🚀 Features

• Multiple-choice quiz questions
• Four options for each question
• User selects an option as an answer
• Program validates answers
• Automatic score calculation
• Final quiz result displayed at the end
• Handles invalid input safely

---

# 🧠 Concepts Used

This project helps strengthen understanding of important Java concepts:

• Object-Oriented Programming (OOP)
• Interfaces
• Classes and Objects
• Packages
• Arrays
• Exception Handling
• User input using Scanner

---

# 📂 Project Structure

The project is organized into different packages and classes to maintain clean code structure.

```
quiz
│
├── interfaces
│   └── Quiz.java
│
├── models
│   └── Question.java
│
├── services
│   └── QuizService.java
│
└── Main.java
```

---

# ⚙️ Components Explanation

## 1️⃣ Quiz Interface

The **Quiz interface** defines the basic functionality of the quiz system.

It includes methods such as:

• start() → Starts the quiz
• submitAnswer() → Records user's answer
• showResults() → Displays final score

---

## 2️⃣ Question Model Class

The **Question class** represents the quiz question structure.

Each question contains:

• Question text
• Multiple options
• Correct answer

This class helps store and retrieve question-related data.

---

## 3️⃣ QuizService Class

This class implements the **Quiz interface** and contains the main quiz logic.

Responsibilities of this class include:

• Displaying questions
• Accepting user answers
• Validating inputs
• Calculating the final score
• Showing quiz results

---

## 4️⃣ Main Class

The **Main class** acts as the entry point of the application.

It performs the following tasks:

• Creates quiz questions
• Initializes the QuizService
• Starts the quiz
• Displays final results

---

# 🖥️ How the Quiz Works

1️⃣ The program starts and displays a welcome message.

2️⃣ The system shows a question along with four options.

3️⃣ The user selects an option by entering a number.

4️⃣ The program records the selected answer.

5️⃣ After answering all questions, the program calculates the score.

6️⃣ Finally, the quiz result is displayed.

---

# 🧪 Example Questions

Example questions included in the quiz:

• What is the size of an int data type in Java?
• Which method is the entry point of a Java program?
• Which of these is NOT a valid access modifier in Java?

Each question has four possible options.

---

# 🛠️ How to Run the Project

### Step 1

Create a Java project in your IDE
(IntelliJ IDEA / Eclipse / VS Code)

### Step 2

Create the following package structure:

```
quiz.interfaces
quiz.models
quiz.services
quiz
```

### Step 3

Add the required classes in their respective packages.

### Step 4

Run the **Main.java** file to start the quiz.

---

# ⚠️ Input Handling

The system also handles invalid inputs.

Examples:

If the user enters:

• an invalid number
• text instead of a number

The program will record the answer as **blank** and continue the quiz without crashing.

---

# 📈 Possible Improvements

This project can be enhanced further by adding:

• Timer-based quiz system
• Randomized questions
• Difficulty levels
• Score leaderboard
• Database integration for questions
• Graphical User Interface (GUI)

---

# 💡 Learning Outcome

This project helps in understanding:

• How to design applications using **interfaces and classes**
• Structuring Java programs using **packages**
• Implementing quiz logic and scoring systems
• Handling user input and errors efficiently

---

✨ This project demonstrates how Java can be used to build simple interactive applications such as quiz systems.
