import React from 'react';

export const QuestionBox = ({question, answers, onClick}) => {
    return (
        <div className="question-box">
            <h3>{question.questionText}</h3>
            {answers.map(answer => <p onClick={() => onClick(answer)}>{answer.text}</p>)}
        </div>
    );
};