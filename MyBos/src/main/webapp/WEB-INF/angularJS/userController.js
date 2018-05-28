'use strict';  
   
angular.module('myApp').controller('UserController', ['$scope', 'UserService', function($scope, UserService) {  
    var self = this;  
    self.user={id:null,username:'',address:'',email:''};  
    self.users=[]; 
    
    self.login = login;
    self.submit = submit;  
    self.edit = edit;  
    self.remove = remove;  
    self.reset = reset;  
    function login(username, password){  
        UserService.login(username, password)  
            .then(  
           // fetchAllUsers,  
            function(errResponse){  
                console.error('Error while login');  
            }  
        );  
    }  
 }]); 