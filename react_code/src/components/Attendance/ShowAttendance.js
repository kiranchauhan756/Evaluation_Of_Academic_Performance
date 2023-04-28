import React, { useState } from "react";
import Calendar from "react-calendar";
import "react-calendar/dist/Calendar.css";
import moment from "moment";
import AdminDash from "../AdminDashboard/AdminDash";
import styled from "styled-components";

export default function ShowAttendance() {
  const [dateState, setDateState] = useState(new Date());
  const changeDate = (e) => {
    setDateState(e);
  };
  return (
    <>
      <AdminDash />
      <Header>
        <Calendar value={dateState} onChange={changeDate} />
        <p>
          Current selected date is{" "}
          <b>{moment(dateState).format("MMMM Do YYYY")}</b>
        </p>
      </Header>
    </>
  );
}
const Header = styled.div`
  position: absolute;
  left: 30%;
  top: 10%;
`;
