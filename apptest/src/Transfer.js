import React, { Component } from 'react';
import { Collapse, Nav, Navbar, NavbarBrand, NavbarToggler, NavItem, NavLink } from 'reactstrap';
import { Link } from 'react-router-dom';
import { InputUnit } from './InputUnit.js';
import {DropDownList} from './DropDownList.js';

class Transfer extends Component {
  constructor(props){
        super(props); 
        this.state = {NMI:"" ,participantId:"",crcodes:[] };   
        this.handleNMIChange = this.handleNMIChange.bind();
    }
    
//  componentDidMount() {
//    this.setState({isLoading: true});
//
//    fetch('api/transfers')
//      .then(response => response.json())
//      .then(data => this.setState({transfers: data, isLoading: false}));
//  }  
    componentDidMount() {

    fetch('api/add')
      .then(response => response.json())
      .then(data => {this.setState ({NMI : data.serviceId, participantId : data.participantId, crcodes : data.crcodes});console.log(this.state.crcodes);});
    }
    
    
    handleNMIChange(){
//        alert("bb");
    }
    handleCheckSumChange(){
//        alert("cc");
    }
    render(){
        const {nmi, participantId, crcodes} = this.state;
    console.log(this.state.crcodes);
        
        return(
    <form id="frmNewNMI" action="/transfer/add" method="POST" className="form-horizontal" >
    <input type="text" id="custno" name="custno" defaultValue="<%=custNo%>" hidden />
    <input type="text" id="group_no" name="group_no" defaultValue="<%=groupNo%>" hidden />
    <div className="box">
        <div className="box-header">
            <h2><i className="icon-info-sign"></i>New Change request (Create NMI)</h2>
        </div>
        <div className="box-content">
            <div className="col-lg-12">
                <div className="form-group">
                    <InputUnit desc="NMI" name="serviceId" required={true} val={this.state.NMI} />
                    <InputUnit desc="NMI CHECKSUM" name="NMICHECKSUM" required={false} onChange={this.handleCheckSumChange()} />
                    <InputUnit desc="Participant ID" name="participantID" required={true} val={this.state.participantId} readonly={true} />
                </div>
                <div className="form-group">
                    <DropDownList options={this.state.crcodes}  />
                </div>
                <div className="form-group">

                    <div className="col-sm-10"></div>
                    <div className="col-sm-1" >
                        <button type="button" className="btn btn-primary btn-block" id="resetBttn" onClick={this.handleReset}  >Reset</button>
                    </div>
                    <div className="col-sm-1" >
                        <button type="submit" className="btn btn-primary btn-block" id="submitBttn"  >Submit</button>
                    </div>                       
                </div>                
            </div>
        </div>    
    </div>
    </form>        
        );
    }
};

export default Transfer;