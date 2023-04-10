import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";

import Dashboard from "./components/Dashboard/Dashboard";

import Home from "./components/Home/Home";
import Internal from "./components/Internal/Internal";
import Contact from "./components/Contact/Contact";

import "bootstrap/dist/css/bootstrap.min.css";
function App() {
  return (
    <div>
      <div className="./App">
        <BrowserRouter>
          <div className="content">
            <Routes>
              <Route exact="true" path="/" element={<Home />}></Route>
              <Route exact="true" path="/dashboard" element={<Dashboard />} />
              <Route exact="true" path="/internal" element={<Internal />} />
              <Route exact="true" path="/contact" element={<Contact />} />
            </Routes>
          </div>
        </BrowserRouter>
      </div>
    </div>
  );
}

export default App;
