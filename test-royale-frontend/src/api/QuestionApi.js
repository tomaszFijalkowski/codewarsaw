import axios from 'axios';

const apiRoot = "https://opentdb.com/api.php";

const QuestionApi = {
    getQuestions: amount => {
        return axios.get(`${apiRoot}?amount=${amount}`);
    },
};

export default QuestionApi;