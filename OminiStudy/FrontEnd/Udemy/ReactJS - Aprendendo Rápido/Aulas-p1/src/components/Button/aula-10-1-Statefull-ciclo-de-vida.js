import React, { Component } from 'react';

class Button extends Component {
  state = { }

  componentWillMount () {
    console.log('componentWillMount')
  }

  componentDidMount () {
    console.log('componentDidMount')
  }

  render() {
    console.log('render')
    return (
      <div>
        <button
          onClick={this.props.click}>
          Component Stateful
        </button>
      </div>
    )
  }
}

export default Button;