import React from "react";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";
import { Link } from "react-router-dom";

function ViewAssignment() {
  return (
    <div>
      <React.Fragment>
        <AdminDash />
        <Header>
          <div className="container">
            <div className="row">
              <div className="col-md-9">
                <div className="d-grid d-md-flex justify-content-md-end mb-3">
                  <Link id="route" to={`/assignSubject/`} className="button">
                    Add More
                  </Link>
                  <Link id="route" to={`/show`} className="button">
                    Back
                  </Link>
                </div>
                <br />
                <br />
                <h5>subjects of student are: </h5>
                <table className="table table-bordered table-striped">
                  <thead>
                    <tr>
                      <th>Subject Code</th>
                      <th>Assignment Type</th>
                      <th>Assignment Marks</th>
                      <th>Max Assignment Marks</th>
                    </tr>
                  </thead>
                  <tbody></tbody>
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
  top: 10%;
`;

export default ViewAssignment;
