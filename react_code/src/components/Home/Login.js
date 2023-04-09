import styled from "styled-components";
import Bg from "../../assets/images/Bg.png";
import "../../App.css";
import Ellipse from "../../assets/images/Ellipse.png";
import MessageIcon from "../../assets/images/message1.png";
import LockIcon from "../../assets/images/lock.png";

function Login() {
  const LoginPAge = styled.div``;
  const Container = styled.div`
    display: flex;
    justify-content: space-evenly;
    align-items: center;
  `;
  const LoginLeft = styled.div`
    background: url(${Bg});
    background-size: cover;
    width: 70%;
    padding: 4%;
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
    padding: 4%;
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
  const LoginForm = styled.form`
    margin-top: 30px;
    display: flex;
    flex-direction: column;
    width: 70%;
  `;
  const Input = styled.input`
    border: 1px solid #d7d5d5;
    padding: 16px 45px;
    margin-bottom: 20px;
    border-radius: 8px;
    background: url(${MessageIcon});
    background-repeat: no-repeat;
    background-position: left 10px center;
    filter: grayscale;
  `;
  const InputPassword = styled.input`
    border: 1px solid #d7d5d5;
    padding: 16px 45px;
    margin-bottom: 20px;
    border-radius: 8px;
    background: url(${LockIcon});
    background-repeat: no-repeat;
    background-position: left 10px center;
  `;
  const InputButton = styled(Link)`
    padding: 16px 24px;
    border-radius: 8px;
    border: 1px solid #d7d5d5;
    background: #0575e6;
    color: #fff;
    cursor: pointer;
  `;
  const Image = styled.img`
  position: absolute;
  bottom: -151px;
  left: -6px;
  width: 31%;
}
`;
  const ImageTwo = styled.img`
    position: absolute;
    bottom: -152px;
    left: -74px;
    width: 33%;
  `;

  return (
    <>
      <div
        className="error"
        style={{
          display: error ? "" : "none",
          textAlign: "center",
          color: "red",
          fontSize: "18px",
          fontStyle: "italic",
          fontWeight: "bold",
        }}
      >
        <p>
          Invalid Email Or Password...<br></br>
        </p>
      </div>

      <LoginPAge>
        <Container>
          <LoginLeft>
            <LoginLeftContents>
              <Title>Academic Evaluation System</Title>
              <Subtitle>A helping tool for both student and faculties</Subtitle>
              <LeftButton>ReadMore</LeftButton>
              <Image src={Ellipse} />
              <ImageTwo src={Ellipse} />
            </LoginLeftContents>
          </LoginLeft>
          <LoginRight>
            <LoginContents>
              <RIghtTitle>🧑🏻‍🏫</RIghtTitle>
              <BoldText>Hello👋👋 Welcome back!</BoldText>
              <RightSubtitle>Login to get started</RightSubtitle>
              <LoginForm>
                <Input
                  type="email"
                  id="email"
                  name="email"
                  required={true}
                  ref={emailRef}
                  placeholder="Email Address"
                />
                <InputPassword
                  type="password"
                  id="password"
                  name="password"
                  required={true}
                  ref={passwordRef}
                  placeholder="Password"
                />
                <InputButton to={submitHandler} type="submit">
                  Login
                </InputButton>
              </LoginForm>
            </LoginContents>
          </LoginRight>
        </Container>
      </LoginPAge>
    </>
  );
}
export default Login;
