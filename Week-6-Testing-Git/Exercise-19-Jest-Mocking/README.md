# Exercise 19 - Jest Mocking

## Objective
Learn how to mock API calls using Jest and Axios without making actual HTTP requests.

## Technologies Used
- React
- JavaScript (ES6)
- Axios
- Jest
- React Scripts

## Features
- Fetch GitHub repositories using Axios
- Display repository names
- Unit testing using Jest
- Mock Axios API calls
- No real HTTP request during testing

## Project Structure

```
gitclientapp
│
├── src
│   ├── App.js
│   ├── App.css
│   ├── GitClient.js
│   ├── GitClient.test.js
│   ├── index.js
│   └── index.css
│
├── package.json
└── README.md
```

## Installation

```bash
npm install
```

## Run Application

```bash
npm start
```

## Run Test Cases

```bash
npm test
```

## Expected Output

- Displays GitHub repositories of the user **TechieSyed**
- Jest test executes successfully
- Axios requests are mocked during testing

## Concepts Covered

- Axios API Calls
- Jest Mocking
- Unit Testing
- Promise Handling
- Mock Functions