import React from "react";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";

const Report = () => {
  return (
    <div>
      <AdminDash />
      <Header>
        <h1>Hello!</h1>
      </Header>
    </div>
  );
};
const Header = styled.div`
  position: absolute;
  left: 20%;
  top: 20%;
`;

export default Report();
