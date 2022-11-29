import React, { Component, useState } from "react";
import PropTypes from "prop-types";

//   const TotalUserInform = () => {
//     const [user, setUser] = useState({id : "", pw : "", name : "", age : ""});

//     // render() {
//     const changeHandler = (event) => {
//       if (event.target.id === "id") this.setState({ id: event.target.value });
//       if (event.target.id === "pw") this.setState({ pw: event.target.value });
//       if (event.target.id === "name") this.setState({ name: event.target.value });
//       if (event.target.id === "age") this.setState({ age: event.target.value });
//     };

//     const loginHandler = () => {
//       this.state = {
//         user: {
//           id : user.id,
//           pw : user.pw,
//           name: user.name,
//           age : user.age,
//         }
//       };
//       console.log(this.state);
//       // Loop.userList.push(this.state);
//     };

//       return (
//       <div>
//         <UserInform onChange={changeHandler} />
//         <Loop onClick={loginHandler} />
//       </div>
//       );
//     }
//   // }

class Loop extends React.Component {
  render() {
    const loop = this.props.userList.map((oneUser, index) => {
      return (
        <li key={index}>
          {oneUser.id} : {oneUser.name} : {oneUser.age}
        </li>
      );
    });

    return <ul>{loop}</ul>;
  }
}

class UserInform extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      id: "",
      pw: "",
      name: "",
      age: "",
    };
  }

  changeHandler = (event) => {
    if (event.target.id === "id") this.setState({ id: event.target.value });
    if (event.target.id === "pw") this.setState({ pw: event.target.value });
    if (event.target.id === "name") this.setState({ name: event.target.value });
    if (event.target.id === "age") this.setState({ age: event.target.value });
  };

  addUserHandler = () => {
    this.props.addUser({
        id: this.state.id,
        pw: this.state.pw,
        name: this.state.name,
        age: this.state.age,
    });
  }

  render() {
    // const addUserHandler = () => {
    //   this.state = {
    //     user: {
    //       id: this.state.id,
    //       pw: this.state.pw,
    //       name: this.state.name,
    //       age: this.state.age,
    //     },
    //   };
    //   this.props.addUser(this.state.user);
    // };

    return (
      <div>
        <h1>
          ID :
          <input
            type="text"
            id="id"
            name="id"
            placeholder="아이디를 입력해 주세요"
            onChange={this.changeHandler}
          />
        </h1>
        <br />
        <h1>
          PW :
          <input
            type="text"
            id="pw"
            name="pw"
            placeholder="비밀번호를 입력해 주세요"
            onChange={this.changeHandler}
          />
        </h1>
        <br />
        <h1>
          NAME :
          <input
            type="text"
            id="name"
            name="name"
            placeholder="이름을 입력해 주세요"
            onChange={this.changeHandler}
          />
        </h1>
        <br />
        <h1>
          AGE :
          <input
            type="text"
            id="age"
            name="age"
            placeholder="나이를 입력해 주세요"
            onChange={this.changeHandler}
          />
        </h1>
        <br />
        <button id="userinsertbtn" onClick={this.addUserHandler}>
          SIGNIN
        </button>
        <h1>
          result = <br /> {this.state.id}
          <br />
          {this.state.pw}
          <br />
          {this.state.name}
          <br />
          {this.state.age}
        </h1>
      </div>
    );
  }
}

class TotalUserInform extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      userList: [
        { id: "sba1", pw: "sba1", name: "hong", age: 20 },
        { id: "sba2", pw: "sba2", name: "choi", age: 30 },
        { id: "sba3", pw: "sba3", name: "park", age: 35 },
        { id: "sba4", pw: "sba4", name: "kim", age: 25 },
        { id: "sba5", pw: "sba5", name: "lee", age: 22 },
      ],
    };
  }

  render() {
    const addUser = (oneUser) => {
        this.state.userList.push(oneUser);
        this.setState({userList : this.state.userList});
    }

    return (
      <div>
        <UserInform addUser={addUser} />
        <Loop userList={this.state.userList} />
      </div>
    );
  }
}

export {
  // SignInForm,
  TotalUserInform,
};
