package api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.bo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserNameAndPassword(String user,String password);
	
	User findByUserNameAndAccessToken(String user, String accessToken);
	
}
