import { useState } from "react";

function ComplaintRegister() {

    const [formData, setFormData] = useState({
        employeeName: "",
        complaint: ""
    });

    const handleChange = (event) => {

        const { name, value } = event.target;

        setFormData({
            ...formData,
            [name]: value
        });

    };

    const handleSubmit = (event) => {

        event.preventDefault();

        const referenceNumber = Math.floor(
            100000 + Math.random() * 900000
        );

        alert(
            "Thanks " +
            formData.employeeName +
            "\n\nYour Complaint was submitted.\nReference Number: " +
            referenceNumber
        );

        setFormData({
            employeeName: "",
            complaint: ""
        });

    };

    return (

        <div className="container">

            <h2>Register your complaints here!!!</h2>

            <form onSubmit={handleSubmit}>

                <div className="form-group">

                    <label>Name</label>

                    <input
                        type="text"
                        name="employeeName"
                        value={formData.employeeName}
                        onChange={handleChange}
                        required
                    />

                </div>

                <div className="form-group">

                    <label>Complaint</label>

                    <textarea
                        name="complaint"
                        value={formData.complaint}
                        onChange={handleChange}
                        rows="4"
                        required
                    ></textarea>

                </div>

                <button type="submit">
                    Submit
                </button>

            </form>

        </div>

    );

}

export default ComplaintRegister;