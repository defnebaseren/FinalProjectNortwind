package com.example.ProjectNorthwind.businesslogic.concretes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ProjectNorthwind.businesslogic.abstracts.IShoppingCartService;
import com.example.ProjectNorthwind.dal.concretes.OrderDetailsRepository;
import com.example.ProjectNorthwind.dal.concretes.OrderRepository;
import com.example.ProjectNorthwind.dal.concretes.CustomerRepository;
import com.example.ProjectNorthwind.dal.concretes.ProductRepository;
import com.example.ProjectNorthwind.dal.concretes.ShoppingCartRepository;
import com.example.ProjectNorthwind.entities.concretes.Product;
import com.example.ProjectNorthwind.entities.concretes.ShoppingCart;

@Service
public class ShoppingCartManager implements IShoppingCartService {

	@Autowired 
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ShoppingCartRepository shoppingCartRepository;
	
	@Autowired 
	OrderRepository orderRepository;
	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;

	@Override
	@GetMapping("/shoppingcart/{customerId}/{cartId}")
	public List<ShoppingCart> listCartByCustomerId(List<ShoppingCart> shoppingCart)throws Exception {
		shoppingCart = shoppingCartRepository.findAllById(shoppingCart.cartId).orElseThrow(()->new Exception("No shopping cart belonging to this customer ID"));
		return (List<ShoppingCart>) shoppingCart;
	}

	@Override
	public Optional<ShoppingCart> addToCart(Product product) throws Exception {
		return null;
	}

	@Override
	@DeleteMapping("/shoppingcart")
	public Map<String, Boolean> deleteFromCart(Product product) throws Exception {
		Optional<Product> productToDelete = productRepository.findById(null);
		
		shoppingCartRepository.delete(productToDelete);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
