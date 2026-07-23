import "./index.css";

import CohortData from "./Cohort";
import CohortDetails from "./CohortDetails";

function App() {

    return (

        <div>

            <h1>Cohorts Details</h1>

            {

                CohortData.map((cohort, index) => (

                    <CohortDetails
                        key={index}
                        cohort={cohort}
                    />

                ))

            }

        </div>

    );

}

export default App;