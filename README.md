# **Hotel Management System 🏨**

## **Overview**  
This is a simple **Hotel Management System** built in **Java** using **Object-Oriented Programming (OOP)** principles. It allows hotel staff to manage room check-ins, check-outs, and view available rooms. The project follows a structured package format and compiles output files into a separate `out/` directory which is excluded from version control.

---

## **Features**  
- ✅ **Check-in** a guest into a room  
- ✅ **Check-out** a guest from a room  
- ✅ **Display available rooms**  
- ✅ **Object-Oriented Programming (OOP)** principles  
- ✅ Organized using **Java Packages** for modularity  

---

## **Project Structure**  
hotel_management_system/ │ ├── hotelmanagement/ # Source code folder │ ├── Hotel.java # Hotel class │ ├── Room.java # Room class │ ├── HotelManagementSystem.java # Main class to run the application │ ├── out/ # Compiled .class files (excluded from git) │ ├── README.md # Project description ├── .gitignore # Ignore compiled files in 'out/'

---

## **How to Compile and Run**  

### **1️⃣ Clone the Repository**  
```sh
git clone https://github.com/h3x4ur0r/hotel_management_system.git
cd hotel_management_system
```

### **2️⃣ Create the Output Directory** 
```sh
mkdir out
```

### **3️⃣ Compile the Project**
```sh
javac -d out hotelmanagement/*.java
```

### **4️⃣ Run the Application**
```sh
java -cp out hotelmanagement.HotelManagementSystem
```

## **Example Usage**  
```sh
--- Hotel Management System ---

1. Check-in  
2. Check-out  
3. View available rooms  
4. Exit  
Enter your choice: 1  
Enter room number: 101  
Enter guest name: John  
Guest John checked into room 101.
```

---

## **Technologies Used**  
- **Java** (Core Java, OOP, Scanner for input handling)  
- **Command Line Interface (CLI)**