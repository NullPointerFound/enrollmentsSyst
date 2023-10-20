import React from "react";
import { Link } from "react-router-dom";

export default function Header() {
  return (
    <div>
      <nav className="navbar navbar-expand-lg bg-success-subtle shadow ">
        <div className="container">
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <Link className="nav-link active" aria-current="page" to="#">
                  About
                </Link>
              </li>
              <li className="nav-item dropdown">
                <Link
                  className="nav-link active "
                  to="#"
                  role="button"
                  aria-expanded="false"
                >
                  Courses
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link active" to="#">
                  Contact Us
                </Link>
              </li>
            </ul>
            <Link
              to="/apply"
              className="btn btn-outline-success ms-2 px-4 rounded-pill"
            >
              <i className="fa fa-user-plus me-2"></i>Apply
            </Link>

            <Link
              to="/checkstatus"
              className="btn btn-outline-primary ms-2 px-4 rounded-pill"
            >
              <i className="fa fa-sign-in me-2"></i>Apply
            </Link>
            
          </div>
        </div>
      </nav>
    </div>
  );
}
