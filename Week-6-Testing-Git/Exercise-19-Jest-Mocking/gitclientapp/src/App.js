import "./App.css";
import { useEffect, useState } from "react";
import GitClient from "./GitClient";

function App() {

    const [repositories, setRepositories] = useState([]);
    const [error, setError] = useState("");

    useEffect(() => {

        GitClient.getRepositories("techiesyed")
            .then((response) => {

                console.log(response.data);
                setRepositories(response.data);

            })
            .catch((error) => {

                console.error("Axios Error:", error);

            });

    }, []);

    return (

        <div className="App">

            <h1>Git Repositories of User - TechieSyed</h1>

            {error && <h3>{error}</h3>}

            {

                repositories.map((repo) => (

                    <p key={repo.id}>{repo.name}</p>

                ))

            }

        </div>

    );

}

export default App;