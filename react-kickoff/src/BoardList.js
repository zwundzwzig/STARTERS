import React, { Component } from "react";

class BoardList extends Component {
  constructor(props) {
    super(props);
    this.state = {
      feedList: [
        { seq: 1, title: "title1", writer: "writer1", viewCount: 1111 },
        { seq: 2, title: "title2", writer: "writer2", viewCount: 2 },
        { seq: 3, title: "title3", writer: "writer3", viewCount: 3 },
        { seq: 4, title: "title4", writer: "writer4", viewCount: 4 },
        { seq: 5, title: "title5", writer: "writer5", viewCount: 5 },
      ],
    };
  }

  render() {
    const addBoard = (newBoard) => {
      this.state.feedList.push(newBoard);
      this.setState({ feedList: this.state.feedList });
    };

    const deleteBoard = (index) => {
      this.state.feedList.splice(index, 1);
      this.setState({ feedList: this.state.feedList });
    };

    const updateBoard = (updateBoard) => {
      this.setState({
        feedList: this.state.feedList.map((oneBoard) => {
          return updateBoard.seq === oneBoard.seq ? updateBoard : oneBoard;
        }),
      });
    };

    const addView = (num) => {
      this.state.feedList[num].viewCount = this.state.feedList[num].viewCount + 1
      this.setState({ feedList: this.state.feedList });
    };

    return (
      <>
        <table border="3">
          <BoardHeading headList={Object.keys(this.state.feedList[0])} />
          <Board
            feedList={this.state.feedList}
            addView={addView}
            deleteBoard={deleteBoard}
            updateBoard={updateBoard}
          />
          <BoardInsertForm
            size={this.state.feedList.length}
            addBoard={addBoard}
          />
        </table>
      </>
    );
  }
}

class Board extends Component {
    state = {seq : ""}

  render() {
    // const value1 = Object.values(this.props.feedList[0]).map((x, i) => {
    //   return <td key={i}>{x}</td>;
    // });
    // const value2 = Object.values(this.props.feedList[1]).map((x, i) => {
    //   return <td key={i}>{x}</td>;
    // });
    // const value3 = Object.values(this.props.feedList[2]).map((x, i) => {
    //   return <td key={i}>{x}</td>;
    // });
    // const value4 = Object.values(this.props.feedList[3]).map((x, i) => {
    //   return <td key={i}>{x}</td>;
    // });
    // const value5 = Object.values(this.props.feedList[4]).map((x, i) => {
    //   return <td key={i}>{x}</td>;
    // });

    // return (
    //   <tbody>
    //     <tr>{value1}
    //         <td>
    //             <input
    //             type="button"
    //             // onClick={this.props.addBoard}
    //             value="+"
    //             />
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="-"
    //             />
    //         </td>
    //     </tr>
    //     <tr>{value2}
    //         <td>
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="+"
    //             />
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="-"
    //             />
    //         </td>
    //     </tr>
    //     <tr>{value3}
    //         <td>
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="+"
    //             />
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="-"
    //             />
    //         </td>
    //     </tr>
    //     <tr>{value4}
    //         <td>
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="+"
    //             />
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="-"
    //             />
    //         </td>
    //     </tr>
    //     <tr>{value5}
    //         <td>
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="+"
    //             />
    //             <input
    //             type="button"
    //             //   onClick={() => this.setState({ number: number + 2 })}
    //             value="-"
    //             />
    //         </td>
    //     </tr>
    //   </tbody>
    // );

    const deleteHandler = (ev) => {
      this.props.deleteBoard(ev.target.id);
    };

    const updateHandler = (ev) => {
        const targetBoard = {seq : ev.target.id, title:"update title", writer: "update writer", viewCount: 0}
        this.props.updateBoard(targetBoard);
    };

    const addCount = (ev) => {
      this.props.addView(ev.nativeEvent.path[1].id);
    };

    const board_tr = this.props.feedList.map((onefeed, index) => {
      return (
        <tr>
          <td id={index} key={index}>
            {onefeed.seq}
          </td>
          <td id={index} key={index}>
            {onefeed.title}
          </td>
          <td id={index} key={index}>
            {onefeed.writer}
          </td>
          <td id={index} key={index}>
            {onefeed.viewCount}
            <input type="button" onClick={addCount} value="+" />
            <input type="button" onClick={addCount} value="-" />
          </td>
          <td key={index}>
            <button id={onefeed.seq} onClick={updateHandler}>
              수정
            </button>
            <button id={index} onClick={deleteHandler}>
              삭제
            </button>
          </td>
        </tr>
      );
    });
    return <tbody>{board_tr}</tbody>;
  }
}

class BoardHeading extends Component {
  render() {
    const head = this.props.headList.map((headlist, index) => {
      return <th key={index}>{headlist}</th>;
    });

    return (
      <thead>
        <tr>
          {head}
          <th>ViewControl</th>
        </tr>
      </thead>
    );
  }
}

class BoardInsertForm extends Component {
  state = {
    title: "",
    writer: "",
    seq: this.props.size + 1,
    viewCount: 0,
  };

  render() {
    const changeHandler = (ev) => {
      this.setState({ [ev.target.id]: ev.target.value });
    };

    const insertHandler = () => {
      this.props.addBoard({
        seq: this.props.size + 1,
        title: this.state.title,
        writer: this.state.writer,
        viewCount: 0,
      });
    };

    return (
      <tfoot>
        <tr>
          <td>{this.props.size + 1}</td>
          <td>
            제목 입력: <input type="text" id="title" onChange={changeHandler} />
          </td>
          <td>
            작성자 입력:{" "}
            <input type="text" id="writer" onChange={changeHandler} />
          </td>
          <td>{0}</td>
          <button onClick={insertHandler}> add text </button>
        </tr>
      </tfoot>
    );
  }
}

export { BoardList };
