import { useState } from "react";

function Register() {

    const [user, setUser] = useState({
        name: "",
        email: "",
        password: ""
    });

    const handleChange = (event) => {

        const { name, value } = event.target;

        setUser({
            ...user,
            [name]: value
        });

    };

    const handleSubmit = (event) => {

        event.preventDefault();

        if (user.name.length < 5) {
            alert("Full Name must be 5 characters long");
            return;
        }

        if (!(user.email.includes("@") && user.email.includes("."))) {
            alert("Email is not valid");
            return;
        }

        if (user.password.length < 8) {
            alert("Password must be 8 characters long");
            return;
        }

        alert("Registration Successful");

        setUser({
            name: "",
            email: "",
            password: ""
        });

    };

    return (

        <div className="container">

            <h1>Register Here!!!</h1>

            <form onSubmit={handleSubmit}>

                <div className="form-group">

                    <label>Name:</label>

                    <input
                        type="text"
                        name="name"
                        value={user.name}
                        onChange={handleChange}
                    />

                </div>

                <div className="form-group">

                    <label>Email:</label>

                    <input
                        type="text"
                        name="email"
                        value={user.email}
                        onChange={handleChange}
                    />

                </div>

                <div className="form-group">

                    <label>Password:</label>

                    <input
                        type="password"
                        name="password"
                        value={user.password}
                        onChange={handleChange}
                    />

                </div>

                <button type="submit">
                    Submit
                </button>

            </form>

        </div>

    );

}

export default Register;