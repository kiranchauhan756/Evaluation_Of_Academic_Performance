import React from "react";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";
import { useRef, useState } from "react";
import { Link } from "react-router-dom";
const Marks = () => {
  const courseRef = useRef("");
  const semesterRef = useRef("");
  const branchRef = useRef("");
  const yearRef = useRef("");

  const [userData, setUserData] = useState([]);

  async function submitHandler(event) {
    event.preventDefault();

    const expense_details = {
      course: courseRef.current.value,
      year: yearRef.current.value,
      branch: branchRef.current.value,
      semester: semesterRef.current.value,
    };
    const request = {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(expense_details),
    };
    fetch(
      "http://localhost:8080/student//getAllStudentsByCourseAndSemester",
      request
    )
      .then((response) => response.json())
      .then((detail) => {
        setUserData(detail);
      });
  }

  return (
    <div>
      <React.Fragment>
        <AdminDash />
        <Header>
          <div className="container">
            <div className="col-md-9">
              <form onSubmit={submitHandler}>
                <div className="row">
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Course</label>
                      <input
                        type="text"
                        name="username"
                        className="form-control"
                        ref={courseRef}
                      />
                    </div>
                  </div>

                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Year</label>
                      <input
                        type="number"
                        name="username"
                        className="form-control"
                        ref={yearRef}
                      />
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Branch</label>
                      <input
                        type="text"
                        name="username"
                        className="form-control"
                        ref={branchRef}
                      />
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="mb-3">
                      <label className="form-lable">Semester</label>
                      <input
                        type="text"
                        name="username"
                        className="form-control"
                        ref={semesterRef}
                      />
                    </div>
                  </div>

                  <button className="button">Submit</button>
                </div>
              </form>
              <table className="table table-bordered table-striped">
                <thead>
                  <tr>
                    <th>Email</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Course</th>
                  </tr>
                </thead>
                <tbody>
                  {userData.map((userData, index) => (
                    <tr key={index}>
                      <td>{userData.email} </td>
                      <td>{userData.firstName} </td>
                      <td>{userData.lastName} </td>
                      <td>{userData.course} </td>
                      <td>
                        <Link
                          to={"/assignSubject/" + userData.email}
                          className="btn btn-warning"
                        >
                          Assign Subjects
                        </Link>
                        &nbsp; &nbsp;
                        <button
                          onClick={() => alert(userData.email)}
                          className="btn btn-warning"
                        >
                          Exam Marks
                        </button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          </div>
        </Header>
      </React.Fragment>
    </div>
  );
};
const Header = styled.div`
  position: absolute;
  left: 30%;
  top: 10%;
`;

export default Marks;
