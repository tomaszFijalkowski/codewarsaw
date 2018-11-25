import React from 'react';

export const PartyMember = ({name, hp}) => {
    return (
        <li>
            <img src="https://via.placeholder.com/100" alt="" />
            <div>
                <h5>{name}</h5>
                <p>Health: {hp.current}/{hp.max}</p>
            </div>
        </li>
    );
};