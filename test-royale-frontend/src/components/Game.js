import React, {Component} from 'react';
import {UserDisplay} from "./UserDisplay";
import {BossDisplay} from "./BossDisplay";
import {PartyList} from "./PartyList";
import {QuestionBox} from "./QuestionBox";
import {Timer} from "./Timer";

export class Game extends Component {
  state = {
      timer: 60,
      bossHealth: 16000,
      userHealth: 54
  };

  selectAnswer = (answer) => {
      if (answer.isCorrect) this.setState({bossHealth: this.state.bossHealth - 350});
      else this.setState({userHealth: this.state.userHealth - 4});
  };

  componentDidMount() {
      setInterval(() => {
          this.setState({timer: this.state.timer - 1});
      }, 1000)
  }

  render() {
      return (
          <div className="game-page">
              <UserDisplay hp={this.state.userHealth} />
              <BossDisplay hp={this.state.bossHealth} />
              <PartyList />
              <Timer timeLeft={this.state.timer} />
              <QuestionBox question={{questionText: "What is this?"}}
                           answers={[
                               {text: "Nothing", isCorrect: false},
                               {text: "Something", isCorrect: true},
                               {text: "Everything", isCorrect: false},
                               {text: "No idea", isCorrect: false}]}
                           onClick={this.selectAnswer} />
          </div>
      );
  }
}