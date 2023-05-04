import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";
import React from "react";

function ViewAssignment() {
  // form submit
  const handleImageChange = (e) => {
    let reader = new FileReader();
    const files = e.target.files;

    if (files.length) {
      const file = files[0];
      console.log(file);
      console.log(reader);
    }
  };

  return (
    <div>
      <React.Fragment>
        <AdminDash />
        <Header>
          <input
            type="file"
            onChange={handleImageChange}
            // accept="image/png, image/jpeg"
          />
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
