import React, { Component } from 'react';
import { render } from 'react-dom';
import Button from "./components/Button";

class App extends Component {
  render() {
    return (
      <h1>
        React
        <Button> 
          Update 
        </Button>
      </h1>
    )
  }
}

render(<App />, document.getElementById('app'));