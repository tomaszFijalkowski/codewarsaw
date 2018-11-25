import React, {Component} from 'react';
import {shuffle} from 'lodash';
import he from 'he';

export class QuestionBox extends Component {

    shouldComponentUpdate(nextProps) {
        return !(nextProps.question.question === this.props.question.question);
    }

    render() {
        let questionText = this.props.question.question;
        let answers = shuffle([...this.props.question.incorrect_answers, this.props.question.correct_answer]);
        return (
            <div className="question-box">
                <h3>{he.decode(questionText || "")}</h3>
                {answers.map((answer, i) => {
                    return (
                        <p key={i} onClick={() => this.props.onClick(answer === this.props.question.correct_answer)}>
                            {he.decode(answer || "")}
                        </p>
                    );
                })}
            </div>
        );
    }
}