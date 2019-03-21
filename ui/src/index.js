import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// bir ana component olsun. altinda liste halinde baska komponentler


class Game extends React.Component {
    constructor(props) {
        super(props);
        this.state = {};
    }


    render() {
        const dummy_data = [];
        let dummy = {name: 'X Candle', action: 'buy', startDate: '10/12/2019 12:23:33', endDate: '10/12/2019 12:33:33'};
        dummy_data.push(dummy);
        dummy_data.push(Object.assign({}, dummy, {action: 'sell'}));

        const foundPatterns = dummy_data.map((step, move) => {

            return (
                <li key={move}>
                    <p>Pattern :{step.name}</p>
                    <p>Action  :{step.action}</p>
                    <p>Start   :{step.startDate}</p>
                    <p>End     :{step.endDate}</p>
                </li>
            );
        });


        return (
            <div className="game">
                <div className="game-info">
                        Matched Patterns
                    <ol>{foundPatterns}</ol>
                </div>
            </div>
        );
    }
}

// ========================================

ReactDOM.render(<Game/>, document.getElementById("root"));
