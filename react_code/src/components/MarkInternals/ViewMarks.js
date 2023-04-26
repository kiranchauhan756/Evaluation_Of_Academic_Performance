import React from "react";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";
import { Link } from "react-router-dom";

export default function ViewMarks() {
  return (
    <div>
      <React.Fragment>
        <AdminDash />
        <Header>
          {" "}
          <div className="container">
            <div className="row">
              <div className="col-md-9">
                <div className="d-grid d-md-flex justify-content-md-end mb-3">
                  <Link id="route" to={"/mark"} className="button">
                    Add More
                  </Link>
                  <Link id="route" to={"/mark"} className="button">
                    Back
                  </Link>
                  <br />
                  <br />
                  <h5> Exam Marks </h5>
                  <br />
                  <table className="table table-bordered table-striped">
                    <thead>
                      <tr>
                        <th>Subject Code</th>
                        <th>Subject Name</th>
                        <th>Exam Type</th>
                        <th>Optained Marks</th>
                        <th>Max Marks</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>KCA141</td>
                        <td>Mobile computing</td>
                        <td>CT1</td>
                        <td>30</td>
                        <td>50</td>
                        <td>
                          {" "}
                          <Link
                            id="route"
                            to={"/mark"}
                            className="btn btn-warning"
                          >
                            Update
                          </Link>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
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
  top: 10%;
`;
