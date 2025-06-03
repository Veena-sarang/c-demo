# User Data Capture Java Console Application

| Section         | Description |
|-----------------|-------------|
| **Overview**    | This is a simple Java console application that captures user data from the console and displays it back to the user. The application demonstrates basic Java programming concepts such as class creation, user input handling, and object instantiation. |
| **Features**    | - Prompts the user to enter:<br>  - User ID (integer)<br>  - User Name (string)<br>  - Date of Birth (in YYYY-MM-DD format)<br>- Stores the entered data in a `User` object<br>- Displays the captured user data in a readable format |
| **How It Works**| 1. The application starts and prompts the user for their User ID, User Name, and Date of Birth.<br>2. The input is read using a `Scanner` object.<br>3. The data is used to create a new `User` object.<br>4. The details of the user are printed to the console. |
| **Files**       | - `Main.java`: Contains the main method, handles user input, and displays the user data.<br>- `User.java`: Defines the `User` class with fields for user ID, user name, and date of birth, and a suitable `toString()` method for display. |
| **Usage**       | 1. Compile the project:<br>   <code>javac -source 1.8 -target 1.8 User.java Main.java</code><br>2. Run the application:<br>   <code>java Main</code><br>3. Follow the prompts to enter user data. The captured data will be displayed in the console. |
| **Requirements**| - Java 8 or later (compiled for Java 8 compatibility)<br>- No external dependencies |
| **Example Output** | <pre>Enter User ID: 123
Enter User Name: Veena
Enter Date of Birth (YYYY-MM-DD): 2000-02-01

Captured User Data:
User ID: 123, Name: Veena, Date of Birth: 2000-02-01</pre> |
