import React from "react"

export default function CheckStatus() {
  return (
    <div className="p-5">
      <h3>Track Your Application Status </h3>
      <form className="p-5">
        <div class="mb-3">
          <label for="trackingNumber" class="form-label">
            Tracking Number:
          </label>
          <input
            type="email"
            class="form-control"
            id="trackingNumber"
            aria-describedby="trackingHelp"
          />
        </div>
        <div class="mb-3">
          <label for="inputEmail" class="form-label">
            Email id:
          </label>
          <input
            type="email"
            class="form-control"
            id="inputEmail"
          />
        </div>
        <button type="submit" class="btn btn-primary">
          Check Status
        </button>
      </form>
    </div>
  )
}
