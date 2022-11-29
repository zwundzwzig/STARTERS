import PropTypes from "prop-types";
import React, { useState } from "react";

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
    const clickHandler = () => {
      alert("type of React's Class");
    };
    return (
      <div onClick={clickHandler}>
        <h1>df</h1>
      </div>
    );
  }
}

class GreetingClass extends React.Component {
  render() {
    let welcome = () => {
      alert("HI!");
    };
    return (
      <div>
        <input type="button" value="GREET" onClick={welcome} />
        <hr />
      </div>
    );
  }
}

function A() {
  return (
    <>
      <h1>A 함수 구조로 정의된 컴포넌트입니다.</h1>
    </>
  );
}

const B = () => {
  return (
    <div>
      <h1>B 화살표 함수 구조로 정의된 컴포넌트입니다.</h1>
    </div>
  );
};

class C extends React.Component {
  render() {
    return (
      <div>
        <h1>C 클래스 구조로 정의된 컴포넌트입니다.</h1>
        <hr />
      </div>
    );
  }
}

class ConstructorTest extends React.Component {
  constructor(props) {
    super(props);
    this.property = "PROPERTIES";
    this.title = () => {
      this.props.write.repeat(3);
    };
  }

  render() {
    return (
      <>
        <h1>{this.props.write}</h1>
        <h2>{this.property}</h2>
        <h2>{this.props.write}</h2>
        <hr />
      </>
    );
  }
}

class BookHeading extends React.Component {
  render() {
    return <h6>제목 = {this.props.title} </h6>;
  }
}

class BookBody extends React.Component {
  constructor(props) {
    super(props);
    this.body = "내용" + this.props.body;
    this.price = "가격" + this.props.price + "원";
  }

  render() {
    return (
      <div>
        <h2>{this.body}</h2>
        <h2>{this.price}</h2>
      </div>
    );
  }
}

class Book extends React.Component {
  constructor(props) {
    super(props);
    this.ment = "오늘 구입한 책 목록";
  }

  static defaultProps = {
    title: "기본 언어",
  };
  static propTypes = {
    title: PropTypes.string,
    price: PropTypes.number.isRequired,
  };

  render() {
    const { title, body, price } = this.props;
    return (
      <>
        {this.ment}
        <h6>
          제목은 <BookHeading title={title.repeat(3)} />
          이렇게 세 번 말할래요.
        </h6>
        내용은 "{body}"이고요.
        <br />
        가격은 {price}원 입니다.
        <br />
        <hr />
      </>
    );
  }
}

class Counter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      number: 0,
    };
  }

  static propTypes = {
    number: PropTypes.number.isRequired,
  };

  render() {
    const { number } = this.state;
    return (
      <>
        <h1>{number}</h1>
        <input
          type="button"
          onClick={() => this.setState({ number: number + 2 })}
          value="+2"
        />
        <hr />
      </>
    );
  }
}

class EventComponent extends React.Component {
  state = {
    value: 0,
    name: this.props.name,
  };

  render() {
    const { value, name } = this.state;
    const clickHandler = () => {
      // alert(++value);
      this.setState({
        value: value + 1,
        name: `${value + 1} 번 만큼 이름을 바꿔`,
      });
    };
    return (
      <div>
        <div>{name}</div>
        <button onClick={clickHandler}>EventComponent</button>
      </div>
    );
  }
}

function EventComponent2(p) {
  const [value, setValue] = useState(0);
  const [name, setName] = useState(p.name);
  const clickHandler = () => {
    setValue(value + 1);
    setName("event handling");
  };

  return (
    <div>
      <div>
        <h1>
          {value} - {name}
        </h1>
      </div>
      <button onClick={clickHandler}>ClickHandler</button>
      <div>
        <h1>{name}</h1>
      </div>
      <hr />
    </div>
  );
}

class LoginForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = { id: "Not Yet", pw: "No Setting Yet" };
  }

  changeHandler = (event) => {
    if (event.target.id === "id") this.setState({ id: event.target.value });
    if (event.target.pw === "pw") this.setState({ pw: event.target.value });
  };

  render() {
    const loginHandler = (event) => {
      alert(event.target.id);
    };
    return (
      <div>
        <h1>
          ID :{" "}
          <input
            type="text"
            id="ID"
            name="ID"
            placeholder="아이디를 입력해 주세요"
            onChange={this.changeHandler}
          />
        </h1>
        <br />
        <h1>
          PW :{" "}
          <input
            type="password"
            id="PW"
            name="PW"
            placeholder="아이디를 입력해 주세요"
            onChange={this.changeHandler}
          />
        </h1>
        <br />
        <button id="loginbtn" onClick={loginHandler}>
          SIGNIN
        </button>
        <h1>
          result = {this.state.id}, {this.state.pw}{" "}
        </h1>
      </div>
    );
  }
}

export {
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
  BookHeading,
  BookBody,
  Counter,
  EventComponent,
  EventComponent2,
  LoginForm,
};
