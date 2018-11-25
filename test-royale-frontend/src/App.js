import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route} from 'react-router-dom';
import {MainPage} from './components/MainPage';
import './sass/App.scss';
import {Game} from "./components/Game";
import {Header} from "./components/Header";
import {Footer} from "./components/Footer";
import QuestionApi from "./api/QuestionApi";

class App extends Component {
    state = { questions: [{question: "", incorrect_answers: []}] };

    componentDidMount() {
        QuestionApi.getQuestions(20).then(response => {
            console.log(response);
            this.setState({questions: response.data.results})
        }).catch(error => console.error(error));
    }

    render() {
        return (
            <Router>
                <Fragment>
                    <Header />
                    <Route exact path="/" component={MainPage} />
                    <Route path="/game/" render={() => <Game questions={this.state.questions} />} />
                    <Footer />
                </Fragment>
            </Router>
        );
    }
}

export default App;
