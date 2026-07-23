import React from "react";

const courses = [

    {
        id: 1,
        cname: "Angular",
        date: "4/5/2021"
    },

    {
        id: 2,
        cname: "React",
        date: "6/3/2021"
    }

];

function CourseDetails() {

    return (

        <ul>

            {

                courses.map((course) => (

                    <div key={course.id}>

                        <h3>{course.cname}</h3>

                        <h5>{course.date}</h5>

                    </div>

                ))

            }

        </ul>

    );

}

export default CourseDetails;