# Exercise 7 - React Props

## Objective

Develop a React application named **shoppingapp** to understand the concept of **Props** in React.

Create a parent component that passes shopping item data to a child component using props and display the data in a table.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- Props
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-7-Props
│
└── shoppingapp
    │
    ├── public
    ├── src
    │   ├── Cart.js
    │   ├── OnlineShopping.js
    │   ├── App.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Features

- Parent Component
- Child Component
- Props
- Array Rendering
- Table Display

---

## Shopping Items

| Item | Price |
|------|------:|
| Laptop | 80000 |
| TV | 120000 |
| Washing Machine | 50000 |
| Mobile | 30000 |
| Fridge | 70000 |

---

## Steps Performed

1. Created the React application `shoppingapp`.
2. Created the `Cart` class component.
3. Created the `OnlineShopping` class component.
4. Initialized an array of shopping items.
5. Passed the array to the child component using props.
6. Displayed the shopping items in a table.
7. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app shoppingapp

cd shoppingapp

npm start
```

---

## Output

Displays a table of ordered items with:

- Item Name
- Item Price

---

## Learning Outcomes

- React Props
- Parent-Child Communication
- Class Components
- JSX
- Array Mapping

---

## Status

✅ Completed Successfully