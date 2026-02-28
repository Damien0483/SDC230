Damien’s Flooring Calculator
Project Description
Damien’s Flooring Calculator is a multi‑file, object‑oriented Java application designed to help users calculate flooring material requirements and costs across multiple rooms. The program supports user‑defined room names, multiple rectangular sections per room, measurement in feet or inches, waste percentage adjustments, and material selection with cost calculations. It also stores rooms during the session, allows clearing or deleting rooms, and provides detailed summaries with unit conversions.
The application demonstrates inheritance, abstraction, encapsulation, and modular design through a clean class hierarchy and a menu‑driven console interface.
Project Features
Multi‑room management
Create, store, list, and delete rooms during a session.
Room naming
Each room is user‑defined and stored by name.
Measurement flexibility
Enter dimensions in either feet or inches.
Automatic conversion ensures consistent internal calculations.
Multiple room sections
Add any number of rectangular sections per room.
Material selection
Choose from laminate, hardwood, tile, or carpet.
Carpet automatically uses square yards.
Waste percentage adjustment
Apply 0–30% waste to total area.
Detailed summaries
Total area in square feet and square inches.
Adjusted area with waste.
Material quantity in sq ft or sq yards.
Total cost calculation.
Object‑oriented architecture
Abstract base class (Room)
Subclasses (FeetRoom, InchesRoom)
Supporting classes (RoomSection, Material, RoomManager)
Clean separation of responsibilities across multiple files.
Project Tasks
Task 1: Set up the development environment
Install Java Development Kit (JDK)
Configure project folder and multi‑file structure
Task 2: Design the application
Define class hierarchy using inheritance and abstraction
Plan menu flow and user interactions
Task 3: Implement core classes
Create Room, FeetRoom, InchesRoom, RoomSection, and Material
Implement conversion logic and area calculations
Task 4: Implement room management
Build RoomManager for storing, retrieving, and deleting rooms
Task 5: Develop the main program
Create menu system
Handle user input and validation
Integrate all classes into a cohesive workflow
Task 6: Add calculation and summary logic
Apply waste percentage
Convert units
Compute material quantities and cost
Task 7: Test the application
Validate calculations
Test room creation, deletion, and summaries
Debug input handling
Task 8: Document the project
Add header documentation to each class
Create this README file
Skills Demonstrated
Object‑oriented programming (OOP)
Inheritance, abstraction, encapsulation, polymorphism
Multi‑file Java project organization
User‑driven console application design
Input validation and menu‑based navigation
Unit conversion and mathematical computation
Data management using custom classes
Software documentation and code commenting
Languages and Technologies Used
Java (JDK 17+)
Core language for all classes and logic
Object‑Oriented Design
Abstract classes, subclasses, and modular architecture
Console I/O
User interaction via Scanner
UML‑style class structure
Logical separation of responsibilities
Development Process
The project follows a structured, incremental development process:
Requirements analysis  
Identify features such as multi‑room storage, unit conversion, and inheritance.
Class design  
Create UML‑style breakdown of base and derived classes.
Modular implementation  
Build each class in its own file for clarity and maintainability.
Integration  
Connect classes through the main menu system.
Testing and refinement  
Validate calculations, fix input issues, and refine summaries.
Documentation  
Add header comments and produce a complete README.
How to Run the Program
Install JDK (version 17 or later recommended).
Place all .java files in the same directory.
Compile the project:
bash
javac *.java
Run the program:
bash
java Main
Future Enhancements
Save rooms to a file for persistence between sessions
Add support for irregular shapes (triangles, circles)
Add graphical user interface (GUI)
Export summaries to text or PDF
Add trim/molding calculations
