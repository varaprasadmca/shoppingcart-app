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
			{p_id: "1", p_name: "Samsung Galaxy S7 Edge", p_image: "images/1.jpg", p_price: 28990},
			{p_id: "2", p_name: "iPhone 8", p_image: "images/2.png", p_price: 60138},
			{p_id: "3", p_name: "Sony Xperia Z3+", p_image: "images/3.png", p_price: 1519000},
			{p_id: "4", p_name: "ALIENWARE 17", p_image: "images/4.png", p_price: 75187},
			{p_id: "5", p_name: "Luvaglio Laptop", p_image: "images/5.png", p_price: 50115000},
			{p_id: "6", p_name: "Motorola Moto G4 16GB", p_image: "images/6.png", p_price: 9013}
		];
		
		function add_cart(product) {
			if(product){
				vm.carts.push({p_id: product.p_id, p_name: product.p_name, p_price: product.p_price});
			}
		}
		
		vm.total = 0;
		
		function setTotals(cart){
			if(cart){
				vm.total += cart.p_price;
			}
		}
		
		function remove_cart(cart){
			if(cart){
				vm.carts.splice(vm.carts.indexOf(cart), 1);
				vm.total -= cart.p_price;
			}
		}
		
		function checkout_cart() {
			$rootScope.checkedItems = vm.carts;
			$location.path('/checkout');
		}    
    }
})();
