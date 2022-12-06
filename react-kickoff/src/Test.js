import React, { Component } from "react";

class InputTest extends Component {
  state = {
    title: "",
    writer: "",
    contents: "",
  };

  render() {
    const changeHandler = (ev) => {
      this.setState({ [ev.target.id]: ev.target.value });
    };

    const insertHandler = () => {
      this.props.addTest({
        title: this.state.title,
        contents: this.state.contents,
        writer: this.state.writer,
      });
    };

    return (
      <>
        <tfoot>
          <tr>
            <td>
              제목 입력:{" "}
              <input
                type="text"
                id="title"
                placeholder="title"
                onChange={changeHandler}
              />
            </td>
            <td>
              내용 입력:{" "}
              <input
                type="text"
                id="contents"
                placeholder="contents"
                onChange={changeHandler}
              />
            </td>
            <td>
              이름 입력:{" "}
              <input
                type="text"
                id="writer"
                placeholder="writer"
                onChange={changeHandler}
              />
            </td>
            <input
              type="button"
              value="글저장"
              placeholder="contents"
              onClick={insertHandler}
            />
          </tr>
        </tfoot>
      </>
    );
  }
}

class SearchTest extends Component {
  state = {
    title: "",
    writer: "",
    contents: "",
  };

  render() {
    const changeHandler = (ev) => {
      this.setState({ [ev.target.id]: ev.target.value });
    };

    const searchHandler = () => {
      this.props.searchTest({
        title: this.state.title,
        contents: this.state.contents,
        writer: this.state.writer,
      });
    };

    return (
      <>
        <tfoot>
          <tr>
            <td>
              제목 입력:{" "}
              <input
                type="text"
                id="title"
                placeholder="title"
                onChange={changeHandler}
              />
            </td>
            <td>
              내용 입력:{" "}
              <input
                type="text"
                id="contents"
                placeholder="contents"
                onChange={changeHandler}
              />
            </td>
            <td>
              이름 입력:{" "}
              <input
                type="text"
                id="writer"
                placeholder="writer"
                onChange={changeHandler}
              />
            </td>
            <input
              type="button"
              value="글검색"
              placeholder="contents"
              onClick={searchHandler}
            />
          </tr>
        </tfoot>
      </>
    );
  }
}

class HeadTest extends Component {
  render() {
    const head = this.props.headList.map((headlist, index) => {
      return <th key={index}>{headlist}</th>;
    });

    return (
      <thead>
        <tr>{head}</tr>
      </thead>
    );
  }
}

class ListTest extends Component {
  render() {
    const testTr = this.props.testList.map((onefeed, index) => {
      return (
        <tr>
          <td id={index} key={index}>
            {onefeed.title}
          </td>
          <td id={index} key={index}>
            {onefeed.contents}
          </td>
          <td id={index} key={index}>
            {onefeed.writer}
          </td>
        </tr>
      );
    });
    return <tbody>{testTr}</tbody>;
  }
}

class Test extends Component {
  constructor(props) {
    super(props);
    this.state = {
      testList: [
        { title: "title1", contents: "contents1", writer: "writer1" },
        { title: "title2", contents: "contents2", writer: "writer2" },
        { title: "title3", contents: "contents3", writer: "writer3" },
        { title: "title4", contents: "contents4", writer: "writer4" },
        { title: "title5", contents: "contents5", writer: "writer5" },
      ],
    };
  }

  render() {
    const addTest = (newBoard) => {
      this.state.testList.push(newBoard);
      this.setState({ testList: this.state.testList });
    };
    const searchTest = this.state.testList.filter(x => {
        this.state.testList.map(y => {
            x = y;
        })
    })
    console.log(searchTest)
    return (
      <>
        <table border="3">
          <HeadTest headList={Object.keys(this.state.testList[0])} />
          <ListTest testList={this.state.testList} />
          <SearchTest searchTest={searchTest} />
          <InputTest addTest={addTest} />
        </table>
      </>
    );
  }
}

export { Test };
