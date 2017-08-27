(function () {
    'use strict';

    angular
        .module('app')
        .controller('ShoppingController', ShoppingController);

    ShoppingController.$inject = ['UserService', '$location', '$rootScope', 'FlashService'];
    function ShoppingController(UserService, $location, $rootScope, FlashService) {
        var vm = this;
		vm.add_cart = add_cart;
		vm.setTotals = setTotals;
		vm.remove_cart = remove_cart;
		vm.checkout_cart = checkout_cart;
		vm.carts=[];
		
		vm.products = [
			{productCode: "1", description: "Samsung Galaxy S7 Edge", p_image: "images/1.jpg", unitPrice: 28990},
			{productCode: "2", description: "iPhone 8", p_image: "images/2.png", unitPrice: 60138},
			{productCode: "3", description: "Sony Xperia Z3+", p_image: "images/3.png", unitPrice: 1519000},
			{productCode: "4", description: "ALIENWARE 17", p_image: "images/4.png", unitPrice: 75187},
			{productCode: "5", description: "Luvaglio Laptop", p_image: "images/5.png", unitPrice: 50115000},
			{productCode: "6", description: "Motorola Moto G4 16GB", p_image: "images/6.png", unitPrice: 9013}
		];
		
		function add_cart(product) {
			if(product){
				vm.carts.push({productCode: product.productCode, description: product.description, unitPrice: product.unitPrice});
			}
		}
		
		vm.total = 0;
		
		function setTotals(cart){
			if(cart){
				vm.total += cart.unitPrice;
			}
		}
		
		function remove_cart(cart){
			if(cart){
				vm.carts.splice(vm.carts.indexOf(cart), 1);
				vm.total -= cart.unitPrice;
			}
		}
		
		function checkout_cart() {
			$rootScope.checkedItems = vm.carts;
			$location.path('/checkout');
		}    
    }
})();
