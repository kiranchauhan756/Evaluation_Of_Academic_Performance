import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";
//import { useRef, useState } from "react";
import { React } from "react-router-dom";

const Assignment = () => {
  return (
    <div>
      <AdminDash />
      <Header></Header>
    </div>
  );
};

const Header = styled.div`
  position: absolute;
  left: 30%;
  top: 20%;
`;
export default Assignment;
