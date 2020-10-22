package onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;

import onlineShop.dao.CartItemDao;
import onlineShop.model.Cart;
import onlineShop.model.CartItem;

public class CartItemServiceImpl implements CartItemService {
	@Autowired
    private CartItemDao cartItemDao;

	@Override
	public void addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		 cartItemDao.addCartItem(cartItem);
	}

	@Override
	public void removeCartItem(int CartItemId) {
		// TODO Auto-generated method stub
		 cartItemDao.removeCartItem(CartItemId);
	}

	@Override
	public void removeAllCartItems(Cart cart) {
		// TODO Auto-generated method stub
		cartItemDao.removeAllCartItems(cart);
	}

}
