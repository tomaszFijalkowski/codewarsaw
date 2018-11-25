import React from 'react';

export const Timer = ({timeLeft}) => {
    return (
        <div className="timer">
            <span>{timeLeft}</span>
        </div>
    );
};