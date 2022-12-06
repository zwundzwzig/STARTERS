import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import {
  Pay,
  Greeting,
  Calc,
  Employee,
  GreetingClass,
  A,
  B,
  C,
  ConstructorTest,
  Book,
  BookBody,
  BookHeading,
  Counter,
  EventComponent,
  EventComponent2,
  LoginForm,
} from "./MyApp";
import { SigninForm, TotalUserInform, } from "./SigninForm";
import { BoardList, } from "./BoardList";
import { Test, } from "./Test";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    {/* <App />
    <Pay />
    <Greeting />
    <Calc />
    <Employee />
    <GreetingClass />
    <A />
    <B />
    <C />
    <ConstructorTest write="작성자" />
    <Book title="React" body="리액트를 다루는 기술." price={30000} />
    <BookHeading title="NodeJS" body="자바스크립트 짱." price={25000} />
    <BookBody title="Java" body="MVC는 물론 부트까지 다룹니다." price={30000} />
    <Counter /> 
    <EventComponent name="React EventHandling" />
    <EventComponent2 />
    <LoginForm />*/}
    {/* <TotalUserInform /> */}
    {/* <SigninForm /> */}
    {/* <BoardList /> */}
    <Test />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
