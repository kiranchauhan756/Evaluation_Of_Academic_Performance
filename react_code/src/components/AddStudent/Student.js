import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";

function Student() {
  const [formValue, setFormValue] = useState({
    username: "",
    email: "",
    phone: "",
    address: "",
    status: "",
  });
  const [message, setMessage] = useState();
  const navigate = useNavigate();
  const handleInput = (e) => {
    const { name, value } = e.target;
    setFormValue({ ...formValue, [name]: value });
  };
  const handleSubmit = async (e) => {
    e.preventDefault();
    const allInputvalue = {
      username: formValue.username,
      email: formValue.email,
      phone: formValue.phone,
      address: formValue.address,
      status: formValue.status,
    };

    let res = await fetch("http://localhost:8080/student/addStudent", {
      method: "POST",
      headers: { "content-type": "application/json" },
      body: JSON.stringify(allInputvalue),
    });
    let resjson = await res.json();
    if (res.status === 200) {
      setMessage(resjson.success);
      setTimeout(() => {
        navigate("/student");
      }, 2000);
    } else {
      setMessage("Some Error Occured");
    }

    //console.log(allInputvalue);
  };
  return (
    <div>
      <React.Fragment>
        <AdminDash />
        <Header>
          <div className="container">
            <div className="col-md-9">
              <p className="text-success"> {message} </p>
              <form onSubmit={handleSubmit}>
                <div className="row">
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Username</label>
                      <input
                        type="text"
                        name="username"
                        className="form-control"
                        value={formValue.username}
                        onChange={handleInput}
                      />
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Email</label>
                      <input
                        type="text"
                        name="email"
                        className="form-control"
                        value={formValue.email}
                        onChange={handleInput}
                      />
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Phone No</label>
                      <input
                        type="text"
                        name="phone"
                        className="form-control"
                        value={formValue.phone}
                        onChange={handleInput}
                      />
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Address</label>
                      <input
                        type="text"
                        name="address"
                        className="form-control"
                        value={formValue.address}
                        onChange={handleInput}
                      />
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Status</label>
                      <select
                        className="form-control"
                        name="status"
                        value={formValue.status}
                        onChange={handleInput}
                      >
                        <option value="">--Please Select--</option>
                        <option value="1">Active</option>
                        <option value="0">Inactive</option>
                      </select>
                    </div>
                  </div>

                  <div className="col-md-12">
                    <div className="mb-3">
                      <label className="form-lable"></label>
                      <button type="submit" className="btn btn-success btn-lg">
                        Submit
                      </button>
                    </div>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </Header>
      </React.Fragment>
    </div>
  );
}
const Header = styled.div`
  position: absolute;
  left: 30%;
  top: 20%;
`;

export default Student;
