import React, { Component } from 'react';
import './App.css';
import Home from './Home';
import Select from 'react-select';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import GroupList from './GroupList';
import carshow from './carshow';
import TransferList from './TransferList.js';
import Transfer from './Transfer.js';

class App extends Component {
  render() {
    return (
      <Router>
        <Switch>
          <Route path='/' exact={true} component={Home}/>
          <Route path='/groups' exact={true} component={GroupList}/>
          <Route path='/carshow' exact={true} component={carshow}/>
          <Route path='/transferList' exact={true} component={TransferList}/>
          <Route path='/transfer' exact={true} component={Transfer}/>
        </Switch>
      </Router>
    )
  }
}

export default App;