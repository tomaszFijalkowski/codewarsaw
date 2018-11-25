import React from 'react';

export const UserDisplay = ({hp}) => {
    return (
        <div className="user-display">
            <img src="https://images.cdn2.stockunlimited.net/clipart/pixel-art-cow-boy_2009616.jpg"
                 alt="" />
            <h3>Timmy Cartwright</h3>
            <p>Level 3 Mage</p>
            <p>{hp.current} / {hp.max} HP</p>
            <p>67 / 90 XP</p>
            <div className="remained-container">
                <p>Strength: History</p>
                <p>Coins: 32</p>
            </div>
        </div>
    );
};