import React from 'react';

export const PartyMember = ({name, hp, img}) => {
    return (
        <li>
            <img src={img} alt="" />
            <div>
                <h5>{name}</h5>
                <p>{hp.current} / {hp.max} HP</p>
                <div className="stats-container">
                    <p>45 / 120 XP</p>
                </div>
            </div>
        </li>
    );
};