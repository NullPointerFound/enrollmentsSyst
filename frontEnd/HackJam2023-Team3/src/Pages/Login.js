import React from "react"

export default function Login() {
  return (
    <div className="p-5">
      <h3>Administrator Login Portal</h3>
      <form className="p-5">
        <div class="mb-3">
          <label for="exampleInputEmail" class="form-label">
            Email address
          </label>
          <input
            type="email"
            class="form-control"
            id="exampleInputEmail"
            aria-describedby="emailHelp"
          />
        </div>

        <div class="mb-3">
          <label for="exampleInputPassword" class="form-label">
            Password
          </label>
          <input
            type="password"
            class="form-control"
            id="exampleInputPassword"
          />
        </div>
        
        <button type="submit" class="btn btn-primary">
          Login
        </button>
      </form>
    </div>
  )
}
