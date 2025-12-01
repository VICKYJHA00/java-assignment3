# Assignment 3 – Java Programming

Repository: **Assignment_3_2401010182**  
Name: **Mrinal Prakash**  
Roll No: **2401010182**  
Course: **B.Tech CSE (Semester III)**  
Subject: **Java Programming**

---

## Problem Statement

Design and implement a **Student Result Management System** that collects student details and their marks, validates the input using exception handling, calculates the result, and displays it.  
The system must demonstrate:
- Use of built‑in and custom exceptions  
- `try–catch`, `throw`, `throws`, and `finally`  
- Clean, modular, object‑oriented design

---

## Features

- Add multiple students with:
  - Roll number
  - Name
  - Marks for 3 subjects
- Validate marks range (0–100) using a custom exception
- Calculate average marks and Pass/Fail status
- Search and display details for a student using roll number
- Robust exception handling for:
  - Invalid marks
  - Input mismatch
  - Missing/incorrect data

---


- `Student` – Holds student data, validates marks, calculates average, and prints result.  
- `InvalidMarksException` – Custom checked exception for invalid marks.  
- `ResultManager` – Contains `main`, menu, array of students, and all input/exception handling.

---

## How to Run

1. Clone the repository:  
   `git clone https://github.com/MRINALPRAKASHFSD/javaassignment3.git`
2. Open the project in VS Code or any Java IDE.  
3. Make sure `src` is set as the source folder.  
4. Run the `ResultManager` class (it contains the `main` method).  
5. Use the menu:
   - `1` – Add Student  
   - `2` – Show Student Details  
   - `3` – Exit  

---

## Concepts Used

- Classes and objects  
- Arrays  
- Exception handling (`try–catch`, `throw`, `throws`, `finally`)  
- Custom exceptions  
- Packages (`model`, `ui`)  
- Scanner‑based console I/O  

---


