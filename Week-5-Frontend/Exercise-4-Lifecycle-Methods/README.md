# Exercise 4 - React Lifecycle Methods

## Objective

Develop a React application named **blogapp** to understand React Class Component Lifecycle methods.

Implement:

- componentDidMount()
- componentDidCatch()

Fetch blog posts from an external REST API and display them.

---

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- Fetch API
- Node.js
- npm
- Visual Studio Code

---

## Project Structure

```
Exercise-4-Lifecycle-Methods
│
└── blogapp
    │
    ├── src
    │   ├── App.js
    │   ├── Post.js
    │   ├── Posts.js
    │   ├── App.css
    │   └── index.js
    │
    ├── public
    ├── package.json
    └── README.md
```

---

## Features

- React Class Components
- Constructor
- State Management
- Fetch API
- componentDidMount()
- componentDidCatch()
- Dynamic Rendering

---

## API Used

```
https://jsonplaceholder.typicode.com/posts
```

---

## Steps Performed

1. Created the React application `blogapp`.
2. Created the `Post` model class.
3. Created the `Posts` class component.
4. Initialized the component state.
5. Implemented the `loadPosts()` method.
6. Retrieved blog posts using the Fetch API.
7. Called `loadPosts()` inside `componentDidMount()`.
8. Implemented `componentDidCatch()` for error handling.
9. Rendered all blog posts dynamically.

---

## Commands Used

```bash
npx create-react-app blogapp

cd blogapp

npm start
```

---

## Output

- Displays a **Blog Posts** heading.
- Retrieves blog posts from the REST API.
- Displays each post title and body inside a styled container.

---

## Learning Outcomes

- React Lifecycle Methods
- Constructor and State
- Fetch API Integration
- Dynamic Rendering using map()
- Error Handling using componentDidCatch()

---

## Status

✅ Completed Successfully