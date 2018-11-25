import React from 'react';
import {Link} from "react-router-dom";

export const MainPage = () => {
  return (
      <div className="login-box">
          <form>
              <label>Username</label>
              <input></input>
              <label>Password</label>
              <input type="password"></input>
          </form>
          <Link to="/game"><button className="home-button">Log In</button></Link>
          <button className="home-button">Register</button>
      </div>
  );
};