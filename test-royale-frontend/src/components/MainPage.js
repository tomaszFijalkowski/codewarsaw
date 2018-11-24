import React from 'react';
import {Link} from "react-router-dom";

export const MainPage = () => {
  return (
      <div>
          <Link to="/game"><button>Start Game</button></Link>
          <button>Exit Game</button>
      </div>
  );
};