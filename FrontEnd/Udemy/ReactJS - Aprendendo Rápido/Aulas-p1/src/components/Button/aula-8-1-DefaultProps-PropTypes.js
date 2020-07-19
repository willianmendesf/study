import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Button extends Component {

  static defaultProps = {
    title: 'Close'
  }

  static propTypes = {
    title: PropTypes.isRequired
  }

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