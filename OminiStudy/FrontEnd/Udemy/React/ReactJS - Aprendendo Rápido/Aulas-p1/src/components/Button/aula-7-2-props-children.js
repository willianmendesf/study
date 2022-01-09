import React, { Component } from 'react';

class Button extends Component {

  render () {

    return (

      <button> 

        { this.props.title }

        { this.props.children } 

        { this.props.description }

      </button>

    )

  }

}

export default Button;