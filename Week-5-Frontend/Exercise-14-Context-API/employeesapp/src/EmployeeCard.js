import { useContext } from "react";
import ThemeContext from "./ThemeContext";
import styles from "./EmployeeCard.module.css";

function EmployeeCard({ employee }) {

    const theme = useContext(ThemeContext);

    return (

        <div className={styles.card}>

            <h3>{employee.name}</h3>

            <p>ID : {employee.id}</p>

            <p>Email : {employee.email}</p>

            <p>Phone : {employee.phone}</p>

            <button className={styles[theme]}>
                View Profile
            </button>

        </div>

    );

}

export default EmployeeCard;