package summerpetstore.dao.repository.mapper;

import summerpetstore.model.ItemModel;

public interface SproductMapper {
	
	//�˻��� ���� ī�װ� â ������ ������ �޼ҵ带 ������ �ҵ�
	ItemModel showInfoSp(int itemId);
	void registerSP(ItemModel im);
	void deleteSP(int itemId);
	void updateSP(ItemModel im);


}
