import EmployeeCard from "./EmployeeCard";
import EmployeesData from "./Employee";

function EmployeesList() {

    return (

        <div>

            {

                EmployeesData.map((emp) => (

                    <EmployeeCard
                        key={emp.id}
                        employee={emp}
                    />

                ))

            }

        </div>

    );

}

export default EmployeesList;