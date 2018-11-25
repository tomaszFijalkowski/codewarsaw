import React from 'react';

export const UserDisplay = ({hp}) => {
    return (
        <div className="user-display">
            <img src="https://via.placeholder.com/200" alt="" />
            <h3>Timmy Cartwright</h3>
            <p>Level 3 Mage</p>
            <p>Health: {hp}</p>
        </div>
    );
};