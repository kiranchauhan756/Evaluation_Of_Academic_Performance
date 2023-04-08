import React, { useRef, useState } from "react";
import { useNavigate } from "react-router-dom";
import { NavLink } from "react-router-dom";
import "./Login.css";

const Login = () => {
  const emailRef = useRef("");
  const passwordRef = useRef("");
  const [error, setError] = useState(false);
  const navigate = useNavigate();

  async function submitHandler(event) {
    event.preventDefault();
    const user = {
      emailId: emailRef.current.value,
      password: passwordRef.current.value,
    };

    const response = await fetch("http://localhost:8080/user/login", {
      method: "POST",
      body: JSON.stringify(user),
      headers: {
        "Content-Type": "application/json",
      },
    });

    if (response.ok) {
      navigate("/transactions");
    } else {
      setError(true);
    }
  }

  return (
    <div className="bg-img">
      <nav className="topnav1">
        <NavLink to="/">Home</NavLink>
        <NavLink to="/aboutUs">AboutUs</NavLink>
        <NavLink to="/contactUs">ContactUs</NavLink>
      </nav>
      <div className="card bg-light  ">
        <div className="card-body p-10 ">
          <div
            className="error"
            style={{
              display: error ? "" : "none",
              textAlign: "center",
              color: "red",
              fontSize: "18px",
              fontStyle: "italic",
              fontWeight: "bold",
            }}
          >
            <p>
              Invalid Email Or Password...<br></br>
            </p>
          </div>
          <form onSubmit={submitHandler}>
            <label htmlFor="email">
              <h4>E-Mail / UserName</h4>
            </label>
            <br></br>
            <input
              type="text"
              id="email"
              name="username"
              className="form-control"
              placeholder="E-mail"
              required={true}
              ref={emailRef}
            />
            <br></br>
            <label htmlFor="password">
              <h4>Password:</h4>
            </label>
            <br></br>
            <input
              type="password"
              id="password"
              name="password"
              className="form-control"
              placeholder="Password"
              required={true}
              ref={passwordRef}
            />
            <br></br>
            <br></br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
            <a href="link">Forgot Password</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="submit" className="btn btn-primary">
              Login
            </button>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Login;