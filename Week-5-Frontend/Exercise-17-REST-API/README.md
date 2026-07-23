# Exercise 17 - Consuming REST APIs in React

## Objective

Develop a React application named **fetchuserapp** that consumes a REST API and displays random user information.

The application fetches user details from the Random User API and displays the user's title, first name, and profile image.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- React Class Components
- Fetch API
- REST API
- Component Lifecycle (componentDidMount)
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-17-REST-API
│
└── fetchuserapp
    │
    ├── public
    ├── src
    │   ├── App.js
    │   ├── Getuser.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## REST API Used

https://randomuser.me/api/

---

## Features Implemented

- REST API Integration
- Fetch API
- React Class Component
- componentDidMount()
- State Management
- Dynamic User Data
- User Image Display

---

## Application Flow

1. Application loads.
2. `componentDidMount()` is executed.
3. Random User API is called.
4. Response is converted into JSON.
5. User information is stored in state.
6. User title, first name and profile picture are displayed.

---

## React Concepts Covered

- React Class Components
- Lifecycle Methods
- componentDidMount()
- Fetch API
- REST API Consumption
- State Management

---

## Steps Performed

1. Created the React application `fetchuserapp`.
2. Created the `Getuser` component.
3. Implemented API call using `fetch()`.
4. Retrieved JSON response.
5. Updated component state.
6. Displayed user information.
7. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app fetchuserapp

cd fetchuserapp

npm start
```

---

## Learning Outcomes

- REST API Integration
- Fetch API
- React Lifecycle Methods
- Class Components
- JSON Parsing
- State Management

---

## Status

✅ Completed Successfully