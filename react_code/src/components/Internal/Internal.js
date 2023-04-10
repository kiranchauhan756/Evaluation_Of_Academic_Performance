import React from "react";
import Dashboard from "../Dashboard/Dashboard";
import styled from "styled-components";

function Internal() {
  return (
    <div>
      <Dashboard />
      <Header>
        <h2>This is Internal page.</h2>
      </Header>
    </div>
  );
}

const Header = styled.div`
  position: absolute;
  left: 24%;
  top: 32px;
  background: pink;
`;
export default Internal;
