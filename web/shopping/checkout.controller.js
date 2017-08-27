(function () {
    'use strict';

    angular
        .module('app')
        .controller('CheckoutController', CheckoutController);

    CheckoutController.$inject = ['UserService', '$location', '$rootScope', '$http', 'FlashService'];
    function CheckoutController(UserService, $location, $rootScope, $http, FlashService) {
        var vm = this;
		console.log('param 2:'+JSON.stringify($rootScope.checkedItems));
		vm.setTotals = setTotals;
		vm.processPayment = processPayment;
		vm.resetPaymentDtls = resetPaymentDtls;
		vm.total = 0;
		vm.productLst = [];
		
		function setTotals() {
			if($rootScope.checkedItems) {
				angular.forEach($rootScope.checkedItems, function(value, key) {
					vm.total += value.unitPrice;					
				});
			}
		}
		
		function processPayment() {
			vm.dataLoading = true;
			console.log('Call payment service and process the transaction');
			angular.forEach($rootScope.checkedItems, function(value, key) {
					vm.productLst.push(value.productCode);					
			});
			console.log('productLst :'+vm.productLst.toString());
			var pymntData = {
				fullName : vm.fullName,
				addrs1 : vm.addrs1,
				addrs2 : vm.addrs2,
				city : vm.city,
				region : vm.region,
				pinCode : vm.pinCode,
				country : vm.country,
				cardNmbr : vm.cardNmbr,
				monYr : vm.monYr,
				scrtyPin : vm.scrtyPin,
				productLst : vm.productLst.toString()
			};
			console.log('pymntData :'+JSON.stringify(pymntData));
			var promise = $http.post('http://localhost:8080/shopping/processPayment', pymntData);
			promise.then(function(data) {
                vm.dataLoading = false;
				console.log('Payment has been processed successfully :'+JSON.stringify(data));
				alert("Payment has been processed successfully");
            }, function(error) {
				vm.dataLoading = false;
				console.log('Payment has been failed :'+JSON.stringify(error));
				alert("Payment has been failed, please check the details and try again");
            });
		}
		
		function resetPaymentDtls() {
			vm.fullName = null;
			vm.addrs1 = null;
			vm.addrs2 = null;
			vm.city = null;
			vm.region = null;
			vm.pinCode = null;
			vm.country = null;			
			vm.cardNmbr = null;
			vm.monYr = null;
			vm.scrtyPin = null;
		}		
    }
	
})();
