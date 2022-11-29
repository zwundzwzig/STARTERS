// import from '';
import React, { useState } from "react";

function MyApp() {
  return (
    <div>
      <h1>testing return paragraph</h1>
      <p>returning more than two tags</p>
      <img
        alt="Mekong"
        src="https://cdn.pixabay.com/photo/2014/09/04/05/27/cookies-435296__340.png"
      />
    </div>
  );
}

function Var() {
  let str1 = "test return paragraph";
  let str2 = "test variable";
  let str3 =
    "https://cdn.pixabay.com/photo/2014/09/04/05/27/cookies-435296__340.png";
  return (
    <div>
      <h1>{str1}</h1>
      <h1>{str2}</h1>
      <img src={str3} alt="alternative" />
    </div>
  );
}

function Pay() {
  const item = "CARD";
  const title = "rice, drink";
  const price = 10000;
  const imgUrl =
    "https://cdn.pixabay.com/photo/2014/09/04/05/27/cookies-435296__340.png";
  const result = (
    <div>
      <h1>{title}</h1>
      <h2>
        paid {price / 10} won by {item} (10 month installments)
      </h2>
      <img src={imgUrl} alt="밥" />
    </div>
  );
  return result;
}

function Greeting() {
  const [value, setValue] = useState("오늘도 즐거운 하루 되세요!");
  const handleChangeGreeting = () => {
    if (value[0] === "오") setValue("날씨 어때요?");
    if (value[0] === "날") setValue("안녕하세요 리액트!");
    if (value[0] === "안") setValue("오늘도 즐거운 하루 되세요!");
  };
  // let index = 0;
  // let result = "";
  // let changeIndex = () => {
  //   if(index !== 2) index++;
  //   else index = 0;
  //   result = index === 0 ? (<h1>"오늘도 즐거운 하루 되세요!"</h1>) : index === 1 ? (<h1>"안녕하세요 리액트!"</h1>) : (<h1>"날씨 어때요?"</h1>);
  //   console.log(result.props.children, index);
  return (
    <div>
      <h1>{value}</h1>
      <button onClick={() => handleChangeGreeting()}></button>
    </div>
  );
}

function Calc() {
  let su1 = 10;
  let su2 = 20;
  let op_list = ["+", "-", "*", "/"];

  return (
    <div>
      <h1>
        {su1} {op_list[~~(Math.random() * 10) % 4]} {su2} ={" "}
        {eval(`${su1} ${op_list[~~(Math.random() * 10) % 4]} ${su2}`)}{" "}
      </h1>
    </div>
  );
}
class Employee extends React.Component {
  render() {
    const clickHandler = () => {alert("type of React's Class");};
    return (
      <div onClick={clickHandler}><h1>df</h1></div>
    );
  }
}

class GreetingClass extends React.Component {
  render() {
    let welcome = () => {alert("HI!");}
    return (<input type="button" value="GREET" onClick={welcome} />)
  }
}


export { MyApp, Var, Pay, Greeting, Calc, Employee, GreetingClass };
