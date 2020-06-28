package dongduk.cs.ssd.summerpetstore.dao.repository.mapper;

import java.util.List;

import dongduk.cs.ssd.summerpetstore.model.CartModel;
import dongduk.cs.ssd.summerpetstore.model.ItemModel;

public interface CartMapper {
	
	void deleteCart(String userId, int itemId);
	void deleteCartByUser(String userId);
	void addCart(int itemId, String name, int price, int inStock, int qunatity, String userid);
	ItemModel findItembyitemId(int itemId);
	void order(CartModel cm);
	int countItemId(String userId, int itemId);
	void incrementQuantity(String userId, int itemId); //��ٱ��Ͽ� ���������� ����� ��� ���
	void updateQuantity(String userId, int itemId, int quantity); //��ٱ��Ͽ��� ������ �ø���� (���Ĺ�ǰ�� ���)
	List<CartModel> showCartList(String userId);
}
