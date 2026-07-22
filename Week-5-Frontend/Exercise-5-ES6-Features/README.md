# Exercise 5 - Styling React Components

## Objective

Modify the existing **cohorttracker** React application by applying CSS Modules and inline styles.

The application displays details of different Cognizant training cohorts and styles them based on their current status.

---

## Technologies Used

- React
- JavaScript (ES6)
- CSS Modules
- Inline CSS
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-5-ES6-Features
│
└── cohorttracker
    │
    ├── public
    ├── src
    │   ├── App.js
    │   ├── App.css
    │   ├── Cohort.js
    │   ├── CohortDetails.js
    │   ├── CohortDetails.module.css
    │   ├── index.js
    │   └── ...
    │
    ├── package.json
    └── README.md
```

---

## Features Implemented

- CSS Modules
- Inline Styling
- Conditional Rendering of Colors
- Responsive Card Layout
- React Functional Components

---

## Styling Applied

### CSS Module

- Card Width: **300px**
- Display: **inline-block**
- Margin: **10px**
- Padding: **10px 20px**
- Border: **1px solid black**
- Border Radius: **10px**

### Inline Styling

- **Green** heading for **Ongoing** cohorts
- **Blue** heading for all other cohorts

---

## Steps Performed

1. Extracted the provided `cohorttracker` project.
2. Restored dependencies using `npm install`.
3. Created `CohortDetails.module.css`.
4. Imported the CSS Module into `CohortDetails.js`.
5. Applied the `.box` class to each cohort card.
6. Added conditional inline styling to the `<h3>` heading.
7. Removed the unused `logo` import from `App.js`.
8. Executed the application using `npm start`.

---

## Commands Used

```bash
npm install
npm start
```

---

## Output

- Cohort details displayed as bordered cards.
- Ongoing cohorts shown with **green** headings.
- Scheduled cohorts shown with **blue** headings.

---

## Learning Outcomes

- CSS Modules
- Component Styling
- Inline Styling
- Conditional Rendering
- React Functional Components
- Component Reusability

---

## Status

✅ Completed Successfully