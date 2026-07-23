# Exercise 18 – React Testing

## Objective

To learn and implement unit testing in React using Jest and Enzyme.

---

## Concepts Covered

- React Unit Testing
- Jest Test Framework
- Enzyme
- Shallow Rendering
- Mount Rendering
- Snapshot Testing
- Matchers
- React Component Testing

---

## Project Structure

```
Exercise-18-React-Testing/
│
├── cohortstracker/
│   ├── src/
│   │   ├── App.js
│   │   ├── Cohort.js
│   │   ├── CohortDetails.js
│   │   ├── App.test.js
│   │   ├── setupTests.js
│   │   ├── index.js
│   │   └── index.css
│   ├── package.json
│   └── README.md
│
└── README.md
```

---

## Tools Used

- React 16.14
- Node.js
- Jest
- Enzyme
- Enzyme Adapter React 16
- React Test Renderer
- Visual Studio Code

---

## Features Implemented

- Display Cohort Details
- Unit Testing using Jest
- Component Rendering Test
- Props Initialization Test
- HTML Content Validation
- Snapshot Testing

---

## Test Cases Executed

- Component Creation Test
- Props Initialization Test
- Cohort Code Display Test
- Snapshot Test

---

## Test Result

```
PASS src/App.test.js

✓ should create the component

✓ should initialize the props

✓ should display cohort code in h3

✓ should always render same html

Snapshots: 1 passed
Tests: 4 passed
```

---

## Commands Used

Install dependencies

```
npm install
```

Install Enzyme

```
npm install --save-dev enzyme enzyme-adapter-react-16 react-test-renderer@16.14.0
```

Start application

```
npm start
```

Run Unit Tests

```
npm test
```

---

## Learning Outcome

Successfully implemented React Unit Testing using Jest and Enzyme by creating component tests, verifying props, validating rendered HTML, and generating snapshot tests.