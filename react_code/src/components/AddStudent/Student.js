import React from "react";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";

const Student = () => {
  return (
    <div>
      <AdminDash />
      <Header>
        <div className="button" type="button">
          Add Student
        </div>
      </Header>
    </div>
  );
};
const Header = styled.div`
  position: absolute;
  left: 24%;
  top: 32px;
`;
export default Student;
