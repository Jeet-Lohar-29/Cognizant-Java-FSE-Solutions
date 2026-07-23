# Exercise 12 - Conditional Rendering in React

## Objective

Develop a React application named **ticketbookingapp** to understand the concept of **Conditional Rendering**.

The application allows:

- Guest users to browse flight details.
- Logged-in users to book tickets.
- Switching between Guest and User pages using Login and Logout buttons.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- React Hooks (useState)
- Conditional Rendering
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-12-Conditional-Rendering
│
└── ticketbookingapp
    │
    ├── public
    ├── src
    │   ├── App.js
    │   ├── Greeting.js
    │   ├── GuestPage.js
    │   ├── UserPage.js
    │   ├── LoginButton.js
    │   ├── LogoutButton.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Features Implemented

- Conditional Rendering
- Login Button
- Logout Button
- Guest View
- User View
- Flight Details Display
- Ticket Booking Button
- React Hooks (`useState`)

---

## Application Flow

### Guest User

- Displays:
  - "Please sign up"
  - Flight Details
  - Login Button

### Logged-in User

- Displays:
  - "Welcome back"
  - Flight Details
  - Book Ticket Button
  - Logout Button

---

## Steps Performed

1. Created the React application `ticketbookingapp`.
2. Created Guest and User components.
3. Created Login and Logout button components.
4. Implemented the Greeting component.
5. Used `useState()` to maintain login status.
6. Applied conditional rendering.
7. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app ticketbookingapp

cd ticketbookingapp

npm start
```

---

## Learning Outcomes

- React Conditional Rendering
- React Hooks (`useState`)
- Component Reusability
- State Management
- Event Handling
- Conditional UI Rendering

---

## Status

✅ Completed Successfully