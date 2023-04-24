import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";
import { useState } from "react";
import React, { useEffect, useParams, Link } from "react";

const Assignment = () => {
  const { email } = useParams();
  const [userData, setUserdata] = useState([]);

  useEffect(() => {
    const request = {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(),
    };
    fetch("http://localhost:8080/student/getAllSubjects/" + email, request)
      .then((response) => response.json())
      .then((detail) => {
        setUserdata(detail);
      });
  }, []);
  return (
    <div>
      <AdminDash />
      <Header>
        {" "}
        <div className="container">
          <div className="row">
            <div className="col-md-9">
              <div className="d-grid d-md-flex justify-content-md-end mb-3">
                <Link id="route" to={"/student"} className="button">
                  Back
                </Link>
                <br />
                <br />
                <h5>subjects of student {email} are: </h5>
                <br />
                <table className="table table-bordered table-striped">
                  <thead>
                    <tr>
                      <th>Subject Code</th>
                      <th>Subject Name</th>
                      <th>Marks</th>
                    </tr>
                  </thead>
                  <tbody>
                    {userData.map((userData, index) => (
                      <tr key={index}>
                        <td>{userData.subjectCode} </td>
                        <td>{userData.subjectName} </td>
                        <td></td>

                        <td>
                          &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                          <button type="button">Update</button>
                        </td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
      </Header>
    </div>
  );
};

const Header = styled.div`
  position: absolute;
  left: 30%;
  top: 20%;
`;
export default Assignment;
