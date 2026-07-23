# Exercise 10 - React JSX

## Objective

Develop a React application named **officespacerentalapp** to understand the concepts of **React JSX**.

The application displays office space information using JSX, JavaScript expressions, inline CSS, and list rendering.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- Inline CSS
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-10-JSX
│
└── officespacerentalapp
    │
    ├── public
    ├── src
    │   ├── App.js
    │   ├── App.css
    │   ├── office.jpg
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Features Implemented

- JSX Syntax
- JavaScript Expressions in JSX
- Rendering Lists using map()
- Image Rendering
- Object Array Rendering
- Inline CSS
- Conditional Styling

---

## Office Details

Each office contains:

- Office Name
- Rent
- Address
- Office Image

---

## Conditional Styling

| Rent | Color |
|------|-------|
| ≤ ₹60,000 | Red |
| > ₹60,000 | Green |

---

## Steps Performed

1. Created the React application `officespacerentalapp`.
2. Added an office image.
3. Created an array of office objects.
4. Displayed office details using JSX.
5. Rendered multiple office records using `map()`.
6. Applied inline conditional styling for rent.
7. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app officespacerentalapp

cd officespacerentalapp

npm start
```

---

## Output

The application displays:

- Office Space heading
- Office Image
- Office Name
- Rent (Red or Green based on amount)
- Office Address
- Multiple office listings

---

## Learning Outcomes

- React JSX
- JavaScript Expressions
- Inline CSS
- Conditional Rendering
- Array Rendering using map()
- Object Rendering

---

## Status

✅ Completed Successfully