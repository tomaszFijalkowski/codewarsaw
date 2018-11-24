import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route} from 'react-router-dom';
import {MainPage} from './components/MainPage';
import './sass/App.scss';
import {Game} from "./components/Game";
import {Header} from "./components/Header";
import {Footer} from "./components/Footer";

class App extends Component {
  render() {
    return (
        <Router>
            <Fragment>
                <Header />
                <Route exact path="/" component={MainPage} />
                <Route path="/game/" component={Game} />
                <Footer />
            </Fragment>
        </Router>
    );
  }
}

export default App;
