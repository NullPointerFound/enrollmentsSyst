import React from "react"

export default function About() {
  return (
    <div>
      <section id="about" className="pb-5">
        <div className="container my-5 py-5">
          <div className="row ">
            <div className="col-md-6 shadow">
              <img src="./images/img1.png" alt="About" className="w-75 mt-5" />
              <img
                src="./images/about1.jpg"
                alt="About"
                className="w-75 mt-1"
              />
            </div>
            <div className="col-md-6">
              
              <h1 className="display-6 mb-2">
                <b >Who We Are</b>
              </h1>
              <hr className="w-90" />
              <p className="lead mb-4">
                At Per Scholas, we believe in the power of education to
                transform lives. We are a nonprofit organization dedicated to
                opening doors to technology careers for individuals who have been 
                 been under represented in the tech industry.
              </p>
              <h1 className="display-6 mb-2">
                <b>Our Mission</b>
              </h1>
              <hr className="w-90" />
              <p className="lead mb-4">
              Our mission is simple yet powerful: to create more diverse and inclusive technology workforces by providing free tech education to people with the most potential.
              </p>
            </div>
          </div>
        </div>
      </section>
    </div>
  )
}
