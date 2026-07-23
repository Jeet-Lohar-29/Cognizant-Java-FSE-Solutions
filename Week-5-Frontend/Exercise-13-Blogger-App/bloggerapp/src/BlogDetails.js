import React from "react";

const blogs = [

    {
        id: 1,
        title: "React Learning",
        author: "Stephen Biz",
        content: "Welcome to learning React"
    },

    {
        id: 2,
        title: "Installation",
        author: "Schwedenier",
        content: "You can install React from npm."
    }

];

function BlogDetails() {

    return (

        <ul>

            {

                blogs.map((blog) => (

                    <div key={blog.id}>

                        <h3>{blog.title}</h3>

                        <h5>{blog.author}</h5>

                        <p>{blog.content}</p>

                    </div>

                ))

            }

        </ul>

    );

}

export default BlogDetails;