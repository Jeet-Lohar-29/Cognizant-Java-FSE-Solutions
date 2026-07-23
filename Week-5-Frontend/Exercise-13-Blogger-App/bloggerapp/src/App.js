import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showComponents = true;

    return (

        <div className="container">

            {

                showComponents && (

                    <>

                        <div className="box">

                            <h1>Course Details</h1>

                            <CourseDetails />

                        </div>

                        <div className="box">

                            <h1>Book Details</h1>

                            <BookDetails />

                        </div>

                        <div className="box">

                            <h1>Blog Details</h1>

                            <BlogDetails />

                        </div>

                    </>

                )

            }

        </div>

    );

}

export default App;