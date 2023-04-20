import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";

function AddSubject() {
  const [userData, setUserdata] = useState([]);
  useEffect(() => {
    const getUserdata = async () => {
      const reqData = await fetch(
        "http://localhost:8080/subject/getAllSubjects"
      );
      const resData = await reqData.json();
      setUserdata(resData);
      // console.log(resData);
    };
    getUserdata();
  }, []);

  function refreshPage() {
    window.location.reload(false);
  }

  function handleDelete(subjectCode) {
    fetch(`http://localhost:8080/subject/deleteSubject/${subjectCode}`, {
      method: "DELETE",
    }).then((result) => {
      result.json().then((resp) => {
        console.log(resp);
      });
    });
    refreshPage();
  }

  return (
    <div>
      <React.Fragment>
        <AdminDash />
        <Header>
          <div className="container">
            <div className="row">
              <div className="col-md-9">
                <div className="d-grid d-md-flex justify-content-md-end mb-3">
                  <Link id="route" to="/subject" className="button">
                    Add Subject
                  </Link>
                </div>
                <br />
                <br />
                <table className="table table-bordered table-striped">
                  <thead>
                    <tr>
                      <th>Subject Code</th>
                      <th>Subject Name</th>
                      <th>Branch</th>
                      <th>Year</th>
                      <th>Course</th>
                      <th>Semester</th>
                    </tr>
                  </thead>
                  <tbody>
                    {userData.map((userData, index) => (
                      <tr key={index}>
                        <td>{userData.subjectCode} </td>
                        <td>{userData.subjectName} </td>
                        <td>{userData.branch} </td>
                        <td>{userData.year} </td>
                        <td>{userData.course} </td>
                        <td>{userData.semester} </td>
                        <td>
                          <button
                            onClick={() => userData.subjectCode}
                            className="btn btn-success mx-2"
                          >
                            {" "}
                            Edit
                          </button>
                          &nbsp; &nbsp;
                          <button
                            onClick={() => handleDelete(userData.subjectCode)}
                            className="btn btn-danger"
                          >
                            {" "}
                            Delete
                          </button>
                        </td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
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

export default AddSubject;
