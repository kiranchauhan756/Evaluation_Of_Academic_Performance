import React, { useRef } from "react";
import styled from "styled-components";
import Bg from "../../assets/images/Bg.png";
import swal from "sweetalert";

import { useNavigate } from "react-router-dom";

const LoginPAge = styled.div`
background-color:#D2F7FF;
`;
const Container = styled.div`
  display: flex;
  justify-content: space-evenly;
  align-items: center;
`;
const LoginLeft = styled.div`
  background: url(${Bg});
  background-size: cover;
  width: 75%;
  margin-right:30px;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
`;
const LoginLeftContents = styled.div``;
const Title = styled.h3`
  color: #fff;
  font-weight: 700;
  font-size: 45px;
  margin-bottom: 10px;
`;
const Subtitle = styled.h4`
  color: #fff;
`;
const LeftButton = styled.a`
  background-color: #0575e6;
  padding: 8px 24px;
  color: #fff;
  border-radius: 12px;
`;
const LoginRight = styled.div`
  width: 30%;
  padding: 1%;
`;
const LoginContents = styled.div``;
const RIghtTitle = styled.h1`
  font-size: 45px;
  color: #0575e6;
  margin-bottom: 60px;
  margin-left: 80px;
`;
const BoldText = styled.b`
  font-size: 22px;
  color: #585858;
`;
const RightSubtitle = styled.div``;

const Home = () => {
  const emailRef = useRef("");
  const passwordRef = useRef("");
  const navigate = useNavigate();

  async function submitHandler(event) {
    event.preventDefault();
    const user = {
      email: emailRef.current.value,
      password: passwordRef.current.value,
    };

    const response = await fetch("http://localhost:8080/user/login", {
      method: "POST",
      body: JSON.stringify(user),
      headers: {
        "Content-Type": "application/json",
      },
    });

    if (!response.ok) {
      swal({
        title: "Invalid Email or Password",
        icon: "warning",
        buttons: true,
        dangerMode: true,
      });
    }
    if (emailRef.current.value === "admin@gmail.com") {
      navigate("/AdminDashboard");
    } else {
      navigate("/dashboard");
    }
  }

  return (
    <>
      <LoginPAge>
        <Container>
          <LoginLeft>
            <LoginLeftContents>
              <Title>Academic Evaluation System</Title>
              <Subtitle>
                A helping tool for both student and faculties📝📝
              </Subtitle>
              <LeftButton>ReadMore</LeftButton>
            </LoginLeftContents>
          </LoginLeft>
                <LoginRight>
            <LoginContents>
              <MainContainer>
              <WelcomeText>Welcome</WelcomeText>
                <InputContainer>
                <StyledInput
                  type="email"
                  id="email"
                  name="email"
                  required={true}
                  ref={emailRef}
                  placeholder="Email Address"
                />
                <StyledInput
                  type="password"
                  id="password"
                  name="password"
                  required={true}
                  ref={passwordRef}
                  placeholder="Password"
                />
                </InputContainer>
                <br />
                <ButtonContainer>
                <StyledButton
                  type="button"
                  className="button"
                  onClick={submitHandler}
                >
                  Login
                </StyledButton>
                </ButtonContainer>
              </MainContainer>
            </LoginContents>
          </LoginRight>
        </Container>
      </LoginPAge>
    </>
  );
};



const MainContainer = styled.div`
  display: flex;
  margin-top:auto;
  flex-direction: column;
  height: 65vh;
  width: 15vw;
  background: rgba(255, 255, 255, 0.15);
  box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
  backdrop-filter: blur(8.5px);
  -webkit-backdrop-filter: blur(8.5px);
  border-radius: 10px;
  color: #ffffff;
  text-transform: uppercase;
  letter-spacing: 0.4rem;
  @media only screen and (max-width: 320px) {
    width: 75vw;
    height:65vh;
    hr {
      margin-bottom: 0.3rem;
    }
    h4 {
      font-size: small;
    }
  }
  @media only screen and (min-width: 360px) {
    width: 75vw;
    height: 65vh;
    h4 {
      font-size: small;
    }
  }
  @media only screen and (min-width: 411px) {
    width: 75vw;
    height:65vh;
  }

  @media only screen and (min-width: 768px) {
    width: 75vw;
    height: 65vh;
  }
  @media only screen and (min-width: 1024px) {
    width: 65vw;
    height: 65vh;
  }
  @media only screen and (min-width: 1280px) {
    width: 25vw;
    height: 65vh;
  }
`;

const WelcomeText = styled.h2`
  color:black;
  top:10%;
  text-align:center;
`;

const InputContainer = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  align-items: center;
  height:50%;
  width:100%;
`;

const ButtonContainer = styled.div`
  margin: 1rem 0 2rem 0;
  width: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
`;
const StyledButton = styled.button`
  background: linear-gradient(to right, #14163c 0%, #03217b 79%);
  text-transform: uppercase;
  letter-spacing: 0.2rem;
  width: 40%;
  height:3rem;
  border: none;
  color: white;
  border-radius: 2rem;
  cursor: pointer;
`;

const StyledInput = styled.input`
  background: rgba(255, 255, 255, 0.15);
  box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
  border-radius: 2rem;
  width: 80%;
  height:25%;
  padding: 1rem;
  border: none;
  outline: none;
  color: #3c354e;
  font-size:1.5rem;
  font-weight: bold;
  &:focus {
    display: inline-block;
    box-shadow: 0 0 0 0.2rem #b9abe0;
    backdrop-filter: blur(12rem);
    border-radius: 2rem;
  }
  &::placeholder {
    color: #b9abe099;
    font-weight: 100;
    font-size: 1rem;
  }
`;
export default Home;