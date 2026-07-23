# Exercise 14 - React Context API

## Objective

Develop a React application named **employeesapp** to understand the concept of **React Context API**.

The application demonstrates how to avoid prop drilling by sharing the application theme across nested components using Context.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- React Context API
- React Hooks (useState, useContext)
- CSS Modules
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-14-Context-API
│
└── employeesapp
    │
    ├── public
    ├── src
    │   ├── App.js
    │   ├── Employee.js
    │   ├── EmployeesList.js
    │   ├── EmployeeCard.js
    │   ├── EmployeeCard.module.css
    │   ├── ThemeContext.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Features Implemented

- React Context API
- createContext()
- Context Provider
- useContext() Hook
- Theme Switching
- Employee Cards
- CSS Modules
- React Functional Components

---

## Application Flow

1. The application displays a list of employees.
2. The default theme is **Light**.
3. Clicking the **Change Theme** button switches between **Light** and **Dark** themes.
4. The theme is shared across components using **React Context API**.
5. No prop drilling is required.

---

## React Concepts Covered

- Context API
- createContext()
- useContext()
- Context Provider
- State Management using useState()
- CSS Modules
- Component Reusability

---

## Steps Performed

1. Extracted the provided employee application.
2. Installed project dependencies using `npm install`.
3. Created `ThemeContext.js`.
4. Wrapped the application inside `ThemeContext.Provider`.
5. Removed theme prop drilling.
6. Consumed the context using `useContext()`.
7. Applied theme-specific styles to employee cards.
8. Executed the application using `npm start`.

---

## Commands Used

```bash
npm install

npm start
```

---

## Learning Outcomes

- React Context API
- createContext()
- useContext()
- Context Provider
- State Management
- CSS Modules
- Component Communication without Prop Drilling

---

## Status

✅ Completed Successfully