import React from 'react';

export const QuestionBox = ({question, answers}) => {
    return (
        <div className="question-box">
            <h3>{question.questionText}</h3>
            {answers.map(answer => <p>{answer}</p>)}
        </div>
    );
};