import React from 'react';
import {PartyMember} from "./PartyMember";

const PARTY_MEMBERS = [
    {
        name: "Gary Zcywczek",
        hp: {
            current: 36,
            max: 47
        }
    },
    {
        name: "Andrea Monroe",
        hp: {
            current: 42,
            max: 48
        }
    },
    {
        name: "Bob Thorn",
        hp: {
            current: 12,
            max: 36
        }
    },
];

export const PartyList = () => {
    return (
        <div className="party-list">
            <h4>Your Party</h4>
            <ul>
                {PARTY_MEMBERS.map((partyMember, i) => <PartyMember key={i} {...partyMember} />)}
            </ul>
        </div>
    );
};