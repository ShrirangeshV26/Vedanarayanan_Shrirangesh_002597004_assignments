
# Library Management System (INFO 5100 - Assignment 3)

A NetBeans-friendly Maven Java Swing project that implements a multi-branch Library Management System with RBAC and static IDs.

## Quick Start (NetBeans)

1. **Open NetBeans** → File → Open Project… → select the folder `LibraryManagementSystem`.
2. Right-click the project → **Run** (or run class `edu.neu.lms.ui.Main`).
3. **Login** using any of these (pre-populated by ConfigureTheBusiness):
   - System Admin: `admin` / `admin`
   - Managers: `manager1` / `pass1`, `manager2` / `pass2`
   - Customers: `cust1` / `cust1` … `cust5` / `cust5`

## Roles & Workspaces (GUI)

- **System Admin**
  - Create/Delete branches
  - Assign ONE Branch Manager to each Branch
  - Create Customers and Branch Managers (user accounts)

- **Branch Manager**
  - Add/View Books (Author, Pages, Language, Date, Serial auto/static)
  - Add Authors
  - View Rental Records for their library

- **Customer**
  - Browse all branches’ books
  - **Rent** available books directly (button enabled when Available=true)
  - **Return** books they’ve rented
  - View **Rental History** (read-only)

## Data Model (Static IDs)

- `Branch`, `Library`, `BranchManager (employeeId)`, `Customer (customerId)`, `Book (serialNumber)`, `RentalRecord (id)` all use **static counters** for ID uniqueness.
- A **Library** belongs to a **Branch** and has ONE **Branch Manager**.
- A **Book** has ONE **Author**.
- `RentalRecord` captures lifecycle: book, customer, library, `rentedAt`, `returnedAt`, `status`.

## Where Things Live

- Model: `src/main/java/edu/neu/lms/model`
- Configure (seed data): `src/main/java/edu/neu/lms/config/ConfigureTheBusiness.java`
- UI: `src/main/java/edu/neu/lms/ui` (+ `ui/components` for table button cells)
- Entry point: `edu.neu.lms.ui.Main`

## Notes

- This project intentionally focuses on **Create & Read** operations (with Delete only for Branch), per assignment.
- No validations/null checks per brief.
- Designed to be minimal and easy to extend in NetBeans (drag-and-drop GUI Builder not required—UI created in code).
