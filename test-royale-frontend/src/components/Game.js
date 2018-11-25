import React, {Component} from 'react';
import {UserDisplay} from "./UserDisplay";
import {BossDisplay} from "./BossDisplay";
import {PartyList} from "./PartyList";
import {QuestionBox} from "./QuestionBox";
import {Timer} from "./Timer";

export class Game extends Component {
  state = {
      timer: 60,
      bossHealth: { max: 16000, current: 16000 },
      userHealth: { max: 54, current: 50 },
      currentQuestion: 0,
      lastAnswer: ""
  };

  calculateNextHealth = (health) => {
      let damage = health * (Math.random() * 0.3);
      return ~~(health - damage);
  };

  selectAnswer = (answer) => {
      let {userHealth, bossHealth, currentQuestion} = this.state;
      if (answer) {
          this.setState(
              {bossHealth: Object.assign({}, bossHealth, {current: this.calculateNextHealth(bossHealth.current)}),
               lastAnswer: "correct"}
          );
      } else {
          this.setState(
              {userHealth: Object.assign({}, userHealth, {current: this.calculateNextHealth(userHealth.current)}),
               lastAnswer: "incorrect"}
          );
      }
      this.setState({currentQuestion: Math.min(currentQuestion + 1, 19)});
  };

  componentDidMount() {
      setInterval(() => {
          this.setState({timer: Math.max(this.state.timer - 1, 0)});
      }, 1000)
  }

  render() {
      return (
          <div className="game-page">
              <UserDisplay hp={this.state.userHealth} />
              <BossDisplay hp={this.state.bossHealth} lastAnswer={this.state.lastAnswer} />
              <PartyList />
              <Timer timeLeft={this.state.timer} />
              <QuestionBox question={this.props.questions[this.state.currentQuestion]}
                           onClick={this.selectAnswer} />
          </div>
      );
  }
}
