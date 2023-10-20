import React from "react";

export default function Courses({ courses }) {
  return (
    <section id="service">
      <div className="container my-5 py-5">
        <div className="row">
          <div className="col-12">
            <h1 className="display-6 text-center mb-4">
              <b>Available Courses</b>
            </h1>
            <hr className="w-25 mx-auto" />
          </div>
        </div>
        <div className="row mt-5">
          {courses?.length ? (
            courses.map((course) => (
              <div key={course.id} className="col-md-4 shadow">
                <div className="card p-3">
                  <div className="card-body text-center">
                    <h5 className="card-title mb-3 fs-3 fw-bold">
                      {course.courseName}
                    </h5>
                    <p className="card-text lead">{course.description}</p>
                    <p className="card-text">
                      <strong>Starting Date:</strong> {course.startingDate}
                    </p>
                  </div>
                </div>
              </div>
            ))
          ) : (
            <div className="col-12 text-center">
              <p>No courses available</p>
            </div>
          )}
        </div>
      </div>
    </section>
  );
}
