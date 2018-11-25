import React from 'react';
import {Link} from "react-router-dom";

export const Footer = () => {
    return (
        <div className="footer">
            <h5>© 2018 CodeWarsaw, Inc. All rights reserved.</h5>
            <h5>testroyale@codewarsaw.com</h5>
            <h5><Link to="/">Home page</Link></h5>
        </div>
    );
};