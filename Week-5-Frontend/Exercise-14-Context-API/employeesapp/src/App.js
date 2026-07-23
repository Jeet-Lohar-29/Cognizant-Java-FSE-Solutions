import { useState } from "react";
import "./App.css";
import EmployeesList from "./EmployeesList";
import ThemeContext from "./ThemeContext";

function App() {

    const [theme, setTheme] = useState("light");

    const toggleTheme = () => {

        setTheme(theme === "light" ? "dark" : "light");

    };

    return (

        <ThemeContext.Provider value={theme}>

            <div className="App">

                <h1>Employee Management Application</h1>

                <button onClick={toggleTheme}>
                    Change Theme
                </button>

                <EmployeesList />

            </div>

        </ThemeContext.Provider>

    );

}

export default App;