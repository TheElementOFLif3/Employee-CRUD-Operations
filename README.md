# Employee-CRUD-Operations -MySql



This is a Java program that provides a simple command-line interface for interacting with an Employee Database using the DAO (Data Access Object) design pattern.

The program starts by creating an instance of the EmployeeDaoImpl class, which implements the EmployeeDaoInterf interface. This interface defines the operations that can be performed on the Employee Database, such as creating a new employee, retrieving all employees, updating an employee's details, and deleting an employee.

The program then displays a menu of options to the user, which includes creating a new employee, displaying all employees, displaying an employee by name, updating an employee's details, and deleting an employee. The program uses a switch statement to execute the appropriate operation based on the user's input.

For example, if the user selects "Create Employee," the program prompts the user to enter the employee's ID, name, address, age, and salary. It then creates a new Employee object with these details and calls the dao.createEmployee() method to add the employee to the database.

Similarly, if the user selects "Show All Employee," the program calls the dao.showAllEmployee() method to retrieve all employees from the database and display them to the user.

The program uses a Scanner object to read input from the user, and handles InputMismatchException to ensure that the user enters valid input.

Finally, the program runs in an infinite loop, displaying the menu of options to the user until the user chooses to exit the program. When the user chooses to exit, the program calls System.exit() to terminate the program.
