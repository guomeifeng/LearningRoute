/**
 * 
 */

var myModule = angular.module("HelloAjax",[]);
myModule.controller("HelloAjax",["$scope","$http",function HelloAjax($scope,$http){
  /*
  $scope.users=[{'username':"zhangsan","email":"zs@11.com"},
    {'username':"zhangsan2","email":"zs@22.com"},
    {'username':"zhangsan3","email":"zs@33.com"}];
  */
  $scope.get_more = function(){
    $http({
        method: "POST",
        url: "./login",
        data:{'username':$scope.username,
           'password':$scope.password
          }
      }).
      success(function(data, status) {
       //$scope.status = status;
        $scope.user = data;
      }).
      error(function(data, status) {
       //$scope.data = data || "Request failed";
       //$scope.status = status;
     });
   }
}]);