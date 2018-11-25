import React, {Component} from 'react';
import {UserDisplay} from "./UserDisplay";
import {BossDisplay} from "./BossDisplay";
import {PartyList} from "./PartyList";
import {QuestionBox} from "./QuestionBox";
import {Timer} from "./Timer";

export class Game extends Component {
  state = {
    timer: 60
  };

  componentDidMount() {
      setInterval(() => {
          this.setState({timer: this.state.timer - 1});
      }, 1000)
  }

  render() {
      return (
          <div className="game-page">
              <UserDisplay />
              <BossDisplay />
              <PartyList />
              <Timer timeLeft={this.state.timer} />
              <QuestionBox />
          </div>
      );
  }
}