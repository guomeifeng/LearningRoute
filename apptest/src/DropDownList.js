import React , { Component }  from 'react';
import Select from 'react-select';
import 'bootstrap/dist/css/bootstrap.min.css';

    export class DropDownList extends React.Component {
//const techCompanies = [
//  { label: "Apple", value: 1 },
//  { label: "Facebook", value: 2 },
//  { label: "Netflix", value: 3 },
//  { label: "Tesla", value: 4 },
//  { label: "Amazon", value: 5 },
//  { label: "Alphabet", value: 6 },
//];

render () {
    console.log(this.props.options);
    return (
    <div className="container">
    <div className="row">
      <div className="col-md-4"></div>
      <div className="col-md-4">
        <Select options={ this.props.options } />
      </div>
      <div className="col-md-4"></div>
    </div>
  </div>
                
                
                );
  

}
};
