import React from 'react';

export const UserDisplay = ({hp}) => {
    return (
        <div className="user-display">
            <img src="https://images.cdn2.stockunlimited.net/clipart/pixel-art-cow-boy_2009616.jpg" alt="" />
            <h3>Timmy Cartwright</h3>
            <p>Level 3 Mage</p>
            <p>Health: {hp}</p>
        </div>
    );
};