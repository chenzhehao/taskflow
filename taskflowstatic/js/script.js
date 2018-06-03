// create the module and name it taskflowApp
var taskflowApp = angular.module('taskflowApp', ['ngRoute'] );

// configure our routes
taskflowApp.config(function($controllerProvider, $compileProvider, $filterProvider, $provide, $routeProvider) {
    //添加注册机制--按需加载用
    taskflowApp.register = {
        controller: $controllerProvider.register,
        directive: $compileProvider.directive,
        filter: $filterProvider.register,
        factory: $provide.factory,
        service: $provide.service
    };
    //resolve事件函数- 路由用
    taskflowApp.asyncjs = function (js) {
        return ["$q", "$route", "$rootScope", function ($q, $route, $rootScope) {
            var deferred = $q.defer();
            var dependencies = js;
            $script(dependencies, function () {
                $rootScope.$apply(function () {
                deferred.resolve();
            });
        });
            return deferred.promise;
        }];
    };
    //route
    $routeProvider
        .when('/', {
            templateUrl : 'page/home.html',
            controller: 'mainController'
        })
        .when('/home', {
            templateUrl : 'page/home.html',
            // resolve: {load:taskflowApp.asyncjs(['js/home/home.js'])},
            controller: 'mainController'
        })
        .when('/about', {
            templateUrl : 'page/about.html',
            controller: 'aboutController'
        })
        .when('/echarts', {
            templateUrl : 'page/echarts/table.html',
            controller: 'tableController'
        })
        .otherwise({redirectTo:'/'});
});

// create the controller and inject Angular's $scope
taskflowApp.controller('mainController', function($scope, $http) {
    // create a message to display in our view
    $scope.message = 'home message!';
}).controller('aboutController', function($scope, $http) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';
}).controller('tableController', function($scope, $http) {
    var postCfg = {
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        transformRequest: function (data) {
            return $.param(data);
        }
    };
    $http.post(serviceDo+'user/register', {id:"1",passwd:"123456"}, postCfg).
    success(function(data) {
        console.log(data);
    }).
    error(function(err) {
        console.log(err);;
    });


    // commonRequest("/user/register",{},function (data) {
    //     console.log(data);
    // });

    var dom = document.getElementById("container");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    var option = {
        dataset: {
            source: [
                ['score', 'amount', 'product'],
                [89.3, 58212, 'Matcha Latte'],
                [57.1, 78254, 'Milk Tea'],
                [74.4, 41032, 'Cheese Cocoa'],
                [50.1, 12755, 'Cheese Brownie'],
                [89.7, 20145, 'Matcha Cocoa'],
                [68.1, 79146, 'Tea'],
                [19.6, 91852, 'Orange Juice'],
                [10.6, 101852, 'Lemon Juice'],
                [32.7, 20112, 'Walnut Brownie']
            ]
        },
        grid: {containLabel: true},
        xAxis: {name: 'amount'},
        yAxis: {type: 'category'},
        visualMap: {
            orient: 'horizontal',
            left: 'center',
            min: 10,
            max: 100,
            text: ['High Score', 'Low Score'],
            // Map the score column to color
            dimension: 0,
            inRange: {
                color: ['#D7DA8B', '#E15457']
            }
        },
        series: [
            {
                type: 'bar',
                encode: {
                    // Map the "amount" column to X axis.
                    x: 'amount',
                    // Map the "product" column to Y axis
                    y: 'product'
                }
            }
        ]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
});