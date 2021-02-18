package com.example.ProjectNorthwind.businesslogic.abstracts;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.ProjectNorthwind.entities.concretes.Product;
import com.example.ProjectNorthwind.entities.concretes.ShoppingCart;

public interface IShoppingCartService {
	


	List<ShoppingCart>listCartByCustomerId(List<ShoppingCart> shoppingCart) throws Exception;
	Optional<ShoppingCart>addToCart(Product product)throws Exception;
	Map<String , Boolean>deleteFromCart(Product product)throws Exception;
	
	
}
