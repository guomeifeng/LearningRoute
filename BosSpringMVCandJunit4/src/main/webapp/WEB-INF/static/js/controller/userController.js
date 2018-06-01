'use strict';

App.controller('UserController', ['$scope', 'UserService', function($scope, UserService) {
          var self = this;

//          self.user={id:null,username:'',address:'',email:''};
//          self.users=[];
          self.user.username = "";
          self.user.password = "";
//          
          self.login = function(username,password){
        	  return $http.get('http://localhost:8080/MyBosSpringMVCandAngular/login/');
        	  //UserService.login(this.user.username,this.user.password); 
//      			$http({
//      				method:"post",
//                      url:"/login/" + username +"/"+password,
//                      params:{
//                          "username":$scope.user.username,
//                          "password":$scope.user.password
//                      }
//      			}).success(function(data){
//                      if(data.success){
//                          //登录成功执行的代码
//                      	document.getElementById("showError").innerHTML="用户名或密码错误";
//                      	window.location="http://localhost:8080/MyBosSpringMVCandAngular/index/"
//                      		
//                      }else{
//                         document.getElementById("showError").innerHTML="用户名或密码错误";
//                      }
//                  }).error(function() {
//                      window.location="http://localhost:8080/static/template/500.html"
//                  });			
          }
        	   
        	  
          
          self.fetchAllUsers = function(){
              UserService.fetchAllUsers()
                  .then(
      					       function(d) {
      						        self.users = d;
      					       },
            					function(errResponse){
            						console.error('Error while fetching Currencies');
            					}
      			       );
          };
           
          self.createUser = function(user){
              UserService.createUser(user)
		              .then(
                      self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Error while creating User.');
				              }	
                  );
          };

         self.updateUser = function(user, id){
              UserService.updateUser(user, id)
		              .then(
				              self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Error while updating User.');
				              }	
                  );
          };

         self.deleteUser = function(id){
              UserService.deleteUser(id)
		              .then(
				              self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Error while deleting User.');
				              }	
                  );
          };

          self.fetchAllUsers();

          self.submit = function() {
              if(self.user.id===null){
                  console.log('Saving New User', self.user);    
                  self.createUser(self.user);
              }else{
                  self.updateUser(self.user, self.user.id);
                  console.log('User updated with id ', self.user.id);
              }
              self.reset();
          };
              
          self.edit = function(id){
              console.log('id to be edited', id);
              for(var i = 0; i < self.users.length; i++){
                  if(self.users[i].id === id) {
                     self.user = angular.copy(self.users[i]);
                     break;
                  }
              }
          };
              
          self.remove = function(id){
              console.log('id to be deleted', id);
              if(self.user.id === id) {//clean form if the user to be deleted is shown there.
                 self.reset();
              }
              self.deleteUser(id);
          };

          
          self.reset = function(){
              self.user={id:null,username:'',address:'',email:''};
              $scope.myForm.$setPristine(); //reset Form
          };

      }]);