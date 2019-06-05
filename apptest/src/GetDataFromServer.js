import {Car} from './Car.js';
export function GetDataFromServer() {
    var cars = new Array();
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
                return cars;
            });
}