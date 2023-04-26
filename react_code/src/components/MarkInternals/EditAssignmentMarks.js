import React, { useRef } from "react";
import { useParams, useNavigate } from "react-router-dom";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";

const EditAssignmentMark = () => {
  const { subjectCode } = useParams();
  const assignmentMarksRef = useRef("");
  const maxAssignmentMarksRef = useRef("");
  const navigate = useNavigate();

  async function submitVal() {
    const item = {
      assignmentMarks: assignmentMarksRef.current.value,
      maxAssignmentMarks: maxAssignmentMarksRef.current.value,
    };
    await fetch(
      "http://localhost:8080/subject/updateAssignment/" + subjectCode,
      {
        method: "PUT",
        body: JSON.stringify(item),
        headers: {
          "Content-Type": "application/json",
          Accept: "application/json",
        },
      }
    );
  }
  function handleBack() {
    navigate("/markExams/123@gmail.com");
  }
  return (
    <div>
      <AdminDash />
      <Header>
        <div className="container">
          <div className="col-md-9">
            <form onSubmit={submitVal}>
              <div className="row">
                <div className="col-md-6">
                  <div className="mb-3">
                    <label className="form-lable">Obtained Marks</label>
                    <input
                      type="text"
                      className="form-control"
                      ref={assignmentMarksRef}
                    />
                  </div>
                </div>
                <div className="col-md-6">
                  <div className="mb-3">
                    <label className="form-lable">Maximum Marks</label>
                    <input
                      type="text"
                      className="form-control"
                      ref={maxAssignmentMarksRef}
                    />
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

                <div className="col-md-12">
                  <div className="mb-3">
                    <label className="form-lable"></label>
                    <button
                      type="submit"
                      className="btn btn-success btn-lg"
                      style={{ marginRight: "500%", marginTop: "3%" }}
                      onClick={handleBack}
                    >
                      Back
                    </button>
                  </div>
                </div>
              </div>
            </form>
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

export default EditAssignmentMark;
