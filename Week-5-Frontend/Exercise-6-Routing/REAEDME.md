# Exercise 6 - React Router

## Objective

Develop a React application named **TrainersApp** using **React Router**.

Implement navigation between multiple pages and display trainer details using URL parameters.

---

## Technologies Used

- React
- JavaScript (ES6)
- React Router DOM v6
- JSX
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-6-Routing
│
└── TrainersApp
    │
    ├── public
    ├── src
    │   ├── trainer.js
    │   ├── TrainersMock.js
    │   ├── Home.js
    │   ├── TrainerList.js
    │   ├── TrainerDetails.js
    │   ├── App.js
    │   ├── App.css
    │   └── index.js
    │
    ├── package.json
    └── README.md
```

---

## Features Implemented

- React Router v6
- BrowserRouter
- Routes
- Route
- Link Navigation
- URL Parameters using useParams()
- Trainer Details Page
- Mock Data Rendering

---

## Routes

| Route | Description |
|--------|-------------|
| `/` | Redirects to Home |
| `/home` | Home Page |
| `/trainers` | Trainers List |
| `/trainer/:id` | Trainer Details |

---

## Trainer Information

Each trainer contains:

- Trainer ID
- Name
- Email
- Phone
- Technology
- Skills

---

## Steps Performed

1. Created the React application `TrainersApp`.
2. Installed `react-router-dom`.
3. Created the Trainer model.
4. Added mock trainer data.
5. Developed the Home component.
6. Developed the Trainers List component.
7. Implemented Trainer Details using `useParams()`.
8. Configured routing using BrowserRouter, Routes, and Route.
9. Added navigation using Link components.
10. Executed the application using `npm start`.

---

## Commands Used

```bash
npx create-react-app TrainersApp

cd TrainersApp

npm install react-router-dom@6

npm start
```

---

## Output

- Home Page
- Trainers List
- Trainer Details
- Navigation using React Router

---

## Learning Outcomes

- React Router v6
- BrowserRouter
- Routes and Route
- Link Navigation
- Dynamic URL Parameters
- useParams Hook
- Single Page Applications (SPA)

---

## Status

✅ Completed Successfully