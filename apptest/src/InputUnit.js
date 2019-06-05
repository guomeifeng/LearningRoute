
import React, { Component } from 'react';
export class InputUnit extends React.Component {

  
  render() {
    return (
        <div className="col-sm-3">
        <label className="col-sm-3 control-label" htmlFor="{this.props.name}">{this.props.desc}</label>
            <div className="col-sm-9">
                <input className="form-control" name="{this.props.name}" id="{this.props.name}" type="text" defaultValue={this.props.val} required={this.props.required} maxLength="20" readOnly={this.props.readonly} />
                <span id="msgFlag"></span>
            </div>
        </div>
    );
  }
};