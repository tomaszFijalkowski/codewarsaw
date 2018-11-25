import React from 'react';

export const BossDisplay = ({hp}) => {
    return (
        <div className="boss-display">
            <h3>Dreaded Dragon</h3>
            <p>Boss health: {hp}</p>
            <img src="http://projectzomboid.fr/images/avatars/red_dragon_flying.gif"></img>
            <p>Element: Fire</p>
        </div>
    );
};