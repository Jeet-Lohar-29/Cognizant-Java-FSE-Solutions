# Exercise 16 - React Form Validation

## Objective

Develop a React application named **mailregisterapp** to understand React Form Validation using Controlled Components.

The application validates user input before allowing successful registration.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- React Forms
- Form Validation
- Controlled Components
- React Hooks (useState)
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-16-Form-Validation
│
└── mailregisterapp
    │
    ├── public
    ├── src
    │   ├── App.js
    │   ├── register.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Validation Rules

- Name must contain at least **5 characters**
- Email must contain **@** and **.**
- Password must contain at least **8 characters**

---

## Features Implemented

- Controlled Components
- React Form Validation
- Name Validation
- Email Validation
- Password Validation
- Form Submission
- Alert Messages

---

## Application Flow

1. Enter Name.
2. Enter Email.
3. Enter Password.
4. Click **Submit**.
5. Invalid inputs display appropriate alert messages.
6. Valid inputs display **Registration Successful**.

---

## React Concepts Covered

- useState()
- Controlled Components
- Form Validation
- Event Handling
- handleChange()
- handleSubmit()
- Conditional Validation

---

## Steps Performed

1. Created the React application `mailregisterapp`.
2. Created the `register` component.
3. Managed form fields using React state.
4. Implemented `handleChange()` for controlled inputs.
5. Added validation logic for Name, Email and Password.
6. Implemented `handleSubmit()` with validation.
7. Displayed alert messages for validation errors.
8. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app mailregisterapp

cd mailregisterapp

npm start
```

---

## Learning Outcomes

- React Forms
- Controlled Components
- Form Validation
- Event Handling
- useState()
- Input Validation
- Form Submission

---

## Status

✅ Completed Successfully