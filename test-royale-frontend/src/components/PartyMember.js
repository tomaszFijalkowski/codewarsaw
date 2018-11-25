import React from 'react';

export const PartyMember = ({name, hp, img}) => {
    return (
        <li>
            <img src={img} alt="" />
            <div>
                <h5>{name}</h5>
                <p>Health: {hp.current}/{hp.max}</p>
            </div>
        </li>
    );
};