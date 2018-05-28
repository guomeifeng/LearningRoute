'use strict';  
   
angular.module('myApp').factory('UserService', ['$http', '$q', function($http, $q){  
   
    var REST_SERVICE_URI = './user/';  
   
    var factory = {  
        login: login
    };  
   
    return factory;  
   
    function login(username,password) {  
        var deferred = $q.defer();  
        $http.get(REST_SERVICE_URI+username,password)  
            .then(  
            function (response) {  
                deferred.resolve(response.data);  
            },  
            function(errResponse){  
                console.error('Error while login');  
                deferred.reject(errResponse);  
            }  
        );  
        return deferred.promise;  
    }  
}]);  