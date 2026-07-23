# Exercise 8 - React State

## Objective

Develop a React application named **counterapp** to understand the concept of **React State**.

Create a class component that maintains the number of people entering and exiting a mall using the React State object.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- React State
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-8-State
│
└── counterapp
    │
    ├── public
    ├── src
    │   ├── CountPeople.js
    │   ├── App.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Features

- React Class Component
- Constructor
- State Object
- setState()
- Event Handling
- Button Click Events

---

## State Variables

| Variable | Purpose |
|----------|---------|
| entrycount | Stores the number of people entered |
| exitcount | Stores the number of people exited |

---

## Steps Performed

1. Created the React application `counterapp`.
2. Created the `CountPeople` class component.
3. Initialized `entrycount` and `exitcount` using the constructor.
4. Implemented the `updateEntry()` method.
5. Implemented the `updateExit()` method.
6. Updated the state using `setState()`.
7. Displayed the updated values on button clicks.
8. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app counterapp

cd counterapp

npm start
```

---

## Output

Initial Output

```
Login  0 People Entered!!

Exit   0 People Left!!
```

After Clicking Buttons

```
Login  3 People Entered!!

Exit   2 People Left!!
```

---

## Learning Outcomes

- React State
- Constructor
- setState()
- Event Handling
- React Class Components
- State Management

---

## Status

✅ Completed Successfully