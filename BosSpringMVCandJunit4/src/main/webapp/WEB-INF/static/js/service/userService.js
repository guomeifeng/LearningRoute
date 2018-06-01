'use strict';

App.factory('UserService', ['$http', '$q', function($http, $q){
	return {		
		login:function(username,password){
			$http({
				method:"post",
                url:"/login/" + username +"/"+password,
                params:{
                    "username":$scope.user.username,
                    "password":$scope.user.password
                }
			}).success(function(data){
                if(data.success){
                    //登录成功执行的代码
                	document.getElementById("showError").innerHTML="用户名或密码错误";
                	window.location="http://localhost:8080/MyBosSpringMVCandAngular/index/"
                		
                }else{
                   document.getElementById("showError").innerHTML="用户名或密码错误";
                }
            }).error(function() {
                window.location="http://localhost:8080/static/template/500.html"
            });			
		},
		
		fetchAllUsers: function() {		
			return $http.get('http://localhost:8080/MyBosSpringMVCandAngular/user/')
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching users');
										return $q.reject(errResponse);
									}
							);
			},
		    
		    createUser: function(user){
					return $http.post('http://localhost:8080/MyBosSpringMVCandAngular/user/', user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while creating user');
										return $q.reject(errResponse);
									}
							);
		    },
		    
		    updateUser: function(user, id){
					return $http.put('http://localhost:8080/MyBosSpringMVCandAngular/user/'+id, user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while updating user');
										return $q.reject(errResponse);
									}
							);
			},
		    
			deleteUser: function(id){
					return $http.delete('http://localhost:8080/MyBosSpringMVCandAngular/user/'+id)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while deleting user');
										return $q.reject(errResponse);
									}
							);
			}
		
	};

}]);