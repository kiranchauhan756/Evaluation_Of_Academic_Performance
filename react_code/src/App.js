import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Dashboard from "./components/Dashboard/Dashboard";
import AdminDashboard from "./components/AdminDashboard/AdminDash";
import Home from "./components/Home/Home";

import Contact from "./components/Contact/Contact";
import AdminProfile from "./components/AdminDashboard/AdminProfile";
import AddStudent from "./components/AddStudent/AddStudent";
import Student from "./components/AddStudent/Student";
import AddSubject from "./components/AddSubject/AddSubject";
import EditSubject from "./components/AddSubject/EditSubject";
import ShowSubjects from "./components/AssignSubjects/ShowSubjects";
import ShowSub from "./components/AddStudent/ShowSub";
import AssignSubject from "./components/AssignSubjects/AssignSubject";
import Subjects from "./components/AddSubject/Subjects";
import Show from "./components/AssignSubjects/Show";
import MarkAssignment from "./components/MarkInternals/MarkAssignment";
import MarkExams from "./components/MarkInternals/MarkExams";
import Report from "./components/GenerateReport/Report";
import "bootstrap/dist/css/bootstrap.min.css";
import MarkInternals from "./components/MarkInternals/MarkInternals";
import EditExamMarks from "./components/MarkInternals/EditExamMarks";
import EditAssignmentMarks from "./components/MarkInternals/EditAssignmentMarks";

function App() {
  return (
    <div>
      <div className="./App">
        <BrowserRouter>
          <div className="content">
            <Routes>
              <Route exact="true" path="/" element={<Home />}></Route>
              <Route exact="true" path="/dashboard" element={<Dashboard />} />
              <Route
                exact="true"
                path="/AdminDashboard"
                element={<AdminDashboard />}
              />

              <Route exact="true" path="/student" element={<AddStudent />} />
              <Route exact="true" path="/AdminPro" element={<AdminProfile />} />
              <Route exact="true" path="/contact" element={<Contact />} />
              <Route exact="true" path="/addStudent" element={<Student />} />
              <Route exact="true" path="/addSubject" element={<AddSubject />} />
              <Route exact="true" path="/mark" element={<MarkInternals />} />
              <Route
                exact="true"
                path="/showSubject/:email"
                element={<ShowSubjects />}
              />
              <Route
                exact="true"
                path="/showSub/:email"
                element={<ShowSub />}
              />
              <Route exact="true" path="/subject" element={<Subjects />} />
              <Route exact="true" path="/show" element={<Show />} />
              <Route
                exact="true"
                path="/assignSubject/:email"
                element={<AssignSubject />}
              />
              <Route
                exact="true"
                path="/editSubject/:subjectCode/:email"
                element={<EditSubject />}
              />
              <Route
                exact="true"
                path="/markAssignment"
                element={<MarkAssignment />}
              />
              <Route
                exact="true"
                path="/markExams/:email"
                element={<MarkExams />}
              />
              <Route
                exact="true"
                path="/editExams/:subjectCode"
                element={<EditExamMarks />}
              />
              <Route
                exact="true"
                path="/editAssigments/:subjectCode"
                element={<EditAssignmentMarks />}
              />
              <Route exact="true" path="/report" element={<Report />} />
            </Routes>
          </div>
        </BrowserRouter>
      </div>
    </div>
  );
}

export default App;
