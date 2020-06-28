package dongduk.cs.ssd.summerpetstore.dao.repository.mapper;

import java.util.List;

import dongduk.cs.ssd.summerpetstore.model.UserModel;

public interface UserMapper {
	
	UserModel getUserByUsername(String username);

	UserModel getUserByUsernameAndPassword(String username, String password);
	
	UserModel getUserById(String userId);
	
	List<String> getUsernameList();
	  
	void insertUser(UserModel account);
	  
	void insertProfile(UserModel account);
	  
	void insertSignon(UserModel account);

	void updateUser(UserModel account);

	void updateProfile(UserModel account);

	void updateSignon(UserModel account);

}
