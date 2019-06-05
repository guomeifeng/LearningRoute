import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';
import {Car} from './Car.js';
import {global} from './global.js';

class carshow extends Component {

constructor(props) {
    super(props);
        this.state = {
            cars: [],
            loading: false
        };
    }
//async componentDidMount() {
//
//    const response =await fetch('/api/carshow');
//    const body = await response.json();            
//                this.setState({cars: body, loading: false })
//                console.log(body);
//           
//            }
            
 componentDidMount() {
    fetch('/api/carshow')
      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            cars: result
          });
        },
        // error handler
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      )
  }            
            
            
GetDataFromServer() {
    const cars = [];
    const response = fetch('/api/carshow')
            .then(function (response) {
                const body = response.json();
                return body;
            })
            .then(function (body) {
                console.log(body.cars);

                for (var car in body.cars) {

                    for (var show in body.cars[car].shows) {
                        cars.push(new Car(body.cars[car].make, body.cars[car].model, body.cars[car].shows[show]));
                    }

                }
                alert("before return" + cars);
                this.cars = cars;
            });
}
    
  

   render() {
            return (
                <div>
                {this.state.cars.map(car =>
                <div key={car}>{car}</div>        
                
                )}
                    
                </div>
            );
        }
}

export default carshow;