import React from "react"

export default function Management() {
  return (
    <div className="fs-6 p-5">
      
      <h3> Learner Management System (LMS) </h3>
      <table className="table ">
        <thead>
          <tr>
            <th scope="col">SN</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">Status</th>
            <th scope="col">Note</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody >
          <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>
              <select
                className="form-select"
                aria-label="Default select example"
              >
                <option value>Select</option>
                <option value="1">Accepted</option>
                <option value="2">Rejected</option>
                <option value="3">Pending </option>
              </select>
            </td>
            <td>
              <textarea
                className="form-control"
                id="exampleFormControlTextarea1"
                rows="3"
              ></textarea>
            </td>
            <td>
              <div className="d-grid gap-2 d-md-block">
                <div className="d-grid gap-2 d-md-flex justify-content-md-end ">
                  <button className="btn btn-warning me-md-2 btn-sm" type="button">
                    Edit
                  </button>
                  <button className="btn btn-danger btn-sm" type="button">
                    Delete
                  </button>
                </div>
              </div>
            </td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>
              <select className="form-select" aria-label="Default select example">
                <option value>Select</option>
                <option value="1">Accepted</option>
                <option value="2">Rejected</option>
                <option value="3">Pending </option>
              </select>
            </td>
            <td>
              <textarea
                className="form-control"
                id="exampleFormControlTextarea1"
                rows="3"
              ></textarea>
            </td>
            <td>
              <div className="d-grid gap-2 d-md-block">
                <div className="d-grid gap-2 d-md-flex justify-content-md-end ">
                  <button className="btn btn-warning me-md-2 btn-sm" type="button">
                    Edit
                  </button>
                  <button className="btn btn-danger btn-sm" type="button">
                    Delete
                  </button>
                </div>
              </div>
            </td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td colSpan="2">Larry the Bird</td>
            <td>
              <select className="form-select" aria-label="Default select example">
                <option value>Select</option>
                <option value="1">Accepted</option>
                <option value="2">Rejected</option>
                <option value="3">Pending </option>
              </select>
            </td>
            <td>
              <textarea
                className="form-control"
                id="exampleFormControlTextarea1"
                rows="3"
              ></textarea>
            </td>
            <td>
              <div className="d-grid gap-2 d-md-block">
                <div className="d-grid gap-2 d-md-flex justify-content-md-end ">
                  <button className="btn btn-warning me-md-2 btn-sm" type="button">
                    Edit
                  </button>
                  <button className="btn btn-danger btn-sm" type="button">
                    Delete
                  </button>
                </div>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}
