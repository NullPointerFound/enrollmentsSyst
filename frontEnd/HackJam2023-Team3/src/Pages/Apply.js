import { useState } from "react";

export default function Apply() {
  // State variables
  const [fullName, setFullName] = useState("");
  const [email, setEmail] = useState("");
  const [phoneNumber, setPhoneNumber] = useState("");
  const [dob, setDOB] = useState("");
  const [address, setAddress] = useState("");
  const [selectedCourse, setSelectedCourse] = useState("");

  // Event handlers to update state
  const handleFullNameChange = (e) => setFullName(e.target.value);
  const handleEmailChange = (e) => setEmail(e.target.value);
  const handlePhoneNumberChange = (e) => setPhoneNumber(e.target.value);
  const handleDOBChange = (e) => setDOB(e.target.value);
  const handleAddressChange = (e) => setAddress(e.target.value);
  const handleCourseChange = (e) => setSelectedCourse(e.target.value);

  // Form submission handler (you can add your logic here)
  const handleSubmit = (e) => {
    e.preventDefault();
    // Add your logic to handle form submission with the state values
  };

  return (
    <form className="p-5" onSubmit={handleSubmit}>
      <div className="mb-3">
        <h3>Apply now to change your life: </h3>

        <label htmlFor="exampleFullName" className="form-label">
          Full Name
        </label>
        <input
          type="text"
          className="form-control"
          id="exampleFullName"
          aria-describedby="NameHelp"
          value={fullName}
          onChange={(e) => setFullName(e.target.value)}
        />

        <label htmlFor="exampleInputEmail" className="form-label">
          Email Address
        </label>
        <input
          type="email"
          className="form-control"
          id="exampleInputEmail"
          aria-describedby="emailHelp"
          value={email}
          onChange={handleEmailChange}
        />

        <label htmlFor="exampleInputPhone" className="form-label">
          Phone Number
        </label>
        <input
          type="tel"
          className="form-control"
          id="exampleInputPhone"
          aria-describedby="phoneHelp"
          placeholder="*** *** ****"
          value={phoneNumber}
          onChange={handlePhoneNumberChange}
        />

        <label htmlFor="exampleInputDOB" className="form-label">
          Date Of Birth
        </label>
        <input
          type="text"
          className="form-control"
          id="exampleInputDOB"
          aria-describedby="DOBHelp"
          placeholder="mm/dd/yyyy"
          value={dob}
          onChange={handleDOBChange}
        />

        <label htmlFor="exampleInputAddress" className="form-label">
          Address
        </label>
        <input
          type="text"
          className="form-control"
          id="exampleInputAddress"
          aria-describedby="addressHelp"
          value={address}
          onChange={handleAddressChange}
        />

        <label htmlFor="exampleInputCourses" className="form-label">
          Courses
        </label>
        <select
          className="form-select"
          aria-label="Default select example"
          value={selectedCourse}
          onChange={handleCourseChange}
        >
          <option value>Select</option>
          <option value="1">AWS re/Start</option>
          <option value="2">Cybersecurity</option>
          <option value="3">IT Support</option>
          <option value="4">Software Engineer</option>
          <option value="5">Data Analytics Powered by CGI</option>
          <option value="6">Security Fundamentals</option>
        </select>
      </div>

      <div className="pl-5 pt-5">
        <button type="submit" className="btn btn-primary">
          Apply
        </button>
      </div>
    </form>
  );
}
