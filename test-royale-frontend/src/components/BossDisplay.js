import React from 'react';

export const BossDisplay = ({hp}) => {
    return (
        <div className="boss-display">
            <h3>Dreaded Dragon</h3>
            <p>Boss health: {hp}</p>
        </div>
    );
};