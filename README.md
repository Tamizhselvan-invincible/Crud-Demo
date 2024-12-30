# CRUD Demo Application

This project is a simple Spring Boot-based CRUD (Create, Read, Update, Delete) application that stores employee data in-memory without using a database. It exposes RESTful endpoints to manage employees and starts with a default set of employee records.

---

## Features
- Add a new employee.
- Retrieve all employees.
- Retrieve a single employee by ID.
- Update an existing employee.
- Delete an employee.
- Preloaded default employees for testing.

---

## Default Employees

The application starts with the following default employees:

| ID  | Name             | Email                                | Role              |
|-----|------------------|--------------------------------------|-------------------|
| 1   | Iyanaar          | Iyanaar.invincible@gmail.com         | Founder           |
| 2   | VijaySarathi     | vijaysarathi.invincible@gmail.com    | Co-Founder        |
| 3   | Tamizhselvan G   | Tamizhselvan.invincible@gmail.com    | iOS Developer     |
| 4   | ThangaPrakash    | ThangaPrakash@gmail.com              | Android Intern    |
| 5   | Diksha Hikare    | Diksha.invinsible@gmail.com          | Flutter Developer |

---

## Endpoints

### 1. Add Employee
**POST** `/employees`

**Request Body:**
```json
{
  "id": "6",
  "name": "New Employee",
  "email": "new.employee@example.com",
  "role": "Tester"
}
```
### 2. Get All Employees
**GET /employees**

**Response: Returns a list of all employees.**

### 3. Get Employee by ID
**GET /employees/{id}**

Response: Returns the employee object with the given ID or a 404 error if not found.

### 4. Update Employee
**PUT /employees/{id}**

Request Body:

```
{
  "name": "Updated Name",
  "email": "updated.email@example.com",
  "role": "Updated Role"
}
```
Response: Returns the updated employee object or a 404 error if not found.

###5. Delete Employee
**DELETE /employees/{id}**

Response: Returns a 204 No Content status if successful or a 404 error if not found.


<img width="492" alt="Screenshot 2024-12-30 at 3 19 50 PM" src="https://github.com/user-attachments/assets/000e038c-9c87-49f1-9f1b-3720db915b72" />


<img width="1081" alt="Screenshot 2024-12-30 at 3 22 31 PM" src="https://github.com/user-attachments/assets/e22f6010-3ee5-4c5f-bf90-9f2bf4c14a0e" />
