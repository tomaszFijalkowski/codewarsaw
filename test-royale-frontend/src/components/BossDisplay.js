import React from 'react';

export const BossDisplay = ({hp, lastAnswer}) => {
    return (
        <div className="boss-display">
            <h3>Dreaded Dragon</h3>
            <p className="health">{hp.current} / {hp.max} HP</p>
            <img src="http://projectzomboid.fr/images/avatars/red_dragon_flying.gif" alt=""/>
            <p>Element: Fire (History / Literature)</p>
            {lastAnswer === "correct" ? <p className="correct">Good job! The dragon takes damage!</p> :
                lastAnswer === "incorrect" ? <p className="incorrect">You missed! The dragon takes a bite out of you. Ouch!</p> : ""}
        </div>
    );
};