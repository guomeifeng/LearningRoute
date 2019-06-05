import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';
import Transfer from './Transfer.js';
class TransferList extends Component {

  constructor(props) {
    super(props);
    this.state = {transfers: [], isLoading: true};
//    this.add = this.add.bind();
  }

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('api/transfers')
      .then(response => response.json())
      .then(data => this.setState({transfers: data, isLoading: false}));
  }

//  async add() {
//    await fetch('/api/transfers/add', {
//      method: 'POST',
//      headers: {
//        'Accept': 'application/json',
//        'Content-Type': 'application/json'
//      }
//    }).then(() => {
//        this.componentDidMount();    
////      let updatedTransfers = this.componentDidMount();
////      this.setState({transfers: updatedTransfers});
//    });
//  }

  render() {
    const {transfers, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    const transferList = transfers.map(transfer => {

      return <tr key={transfer.tranId}>
        <td style={{whiteSpace: 'nowrap'}}>{transfer.tranId}</td>
        <td>{transfer.transGroup}</td>

        <td>
          <ButtonGroup>
            <Button size="sm" color="primary" tag={Link} to={"/transfers/" + transfer.transactionRowId}>Edit</Button>
            <Button size="sm" color="danger" onClick={() => this.remove(transfer.transactionRowId)}>Delete</Button>
          </ButtonGroup>
        </td>
      </tr>
    });

    return (
      <div>
        <AppNavbar/>
        <Container fluid>
          <div className="float-right">
            <Button color="success" tag={Link} to="/transfer">Add Transfer</Button>
          </div>
          <h3>My JUG Tour</h3>
          <Table className="mt-4">
            <thead>
            <tr>
              <th width="20%">TranId</th>
              <th width="20%">TransGroup</th>
              <th>Events</th>
              <th width="10%">Actions</th>
            </tr>
            </thead>
            <tbody>
            {transferList}
            </tbody>
          </Table>
          
        </Container>
      </div>
      
    );
  }
}

export default TransferList;