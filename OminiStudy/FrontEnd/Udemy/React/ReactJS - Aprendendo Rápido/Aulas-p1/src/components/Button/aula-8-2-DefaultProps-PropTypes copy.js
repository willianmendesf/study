import React, { Component } from 'react';
import PropTypes from 'prop-types';

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

Button.defaultProps = {
  title: 'X ',
  description: ' sass'
}

Button.propTypes = {
  title: PropTypes.string.isRequired,
  description: PropTypes.string.isRequired
}

export default Button;