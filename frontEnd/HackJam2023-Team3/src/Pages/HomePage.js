import React, { useEffect, useState } from "react";

import Header from "../Component/Header";
import About from "../Component/About";
import Courses from "../Component/Courses";
import Contact from "../Component/Contact";
import Footer from "../Component/Footer";

export default function HomePage() {
  const [courses, setCourses] = useState(null);

  useEffect(() => {
    const apiUrl = process.env.REACT_APP_API_URL;

    const options = {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    };

    // Making the API call using fetch
    fetch(`${apiUrl}api/v1/course`, options)
      .then((response) => {
        if (!response.ok) {
          throw new Error(`API request failed with status ${response.status}`);
        }
        return response.json();
      })
      .then((data) => {
        // Handle the data from the API
        setCourses(data);
      })
      .catch((error) => {
        // Handle errors
        console.error("API request failed:", error.message);
      });
  }, []);

  return (
    <div className="homepage">
      <div>
        <Header />
        <About />
        <Courses courses={courses} />
        <Contact />
        <Footer />
      </div>
    </div>
  );
}
