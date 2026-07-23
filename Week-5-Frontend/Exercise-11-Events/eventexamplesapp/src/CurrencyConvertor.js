import React, { Component } from "react";

class CurrencyConvertor extends Component {

    constructor() {
        super();

        this.state = {
            amount: "",
            currency: "",
            result: ""
        };
    }

    handleAmount = (event) => {

        this.setState({
            amount: event.target.value
        });

    };

    handleCurrency = (event) => {

        this.setState({
            currency: event.target.value
        });

    };

    handleSubmit = () => {

        const euro = (this.state.amount / 90).toFixed(2);

        alert(
            "Converting to Euro Amount is " + euro
        );

        this.setState({
            result: euro
        });

    };

    render() {

        return (

            <div style={{ marginTop: "40px" }}>

                <h1 style={{ color: "green" }}>
                    Currency Convertor!!!
                </h1>

                <label>Amount</label>

                <input
                    type="number"
                    value={this.state.amount}
                    onChange={this.handleAmount}
                />

                <br /><br />

                <label>Currency</label>

                <input
                    type="text"
                    value={this.state.currency}
                    onChange={this.handleCurrency}
                />

                <br /><br />

                <button onClick={this.handleSubmit}>
                    Submit
                </button>

            </div>

        );

    }

}

export default CurrencyConvertor;