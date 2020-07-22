import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Button extends Component {

  render () {

    return (

      <div>

        <button 
          onClick={this.props.click}>

          Update

        </button>

      </div>

    )

  }

}

export default Button;