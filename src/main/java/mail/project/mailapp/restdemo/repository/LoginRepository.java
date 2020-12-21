package mail.project.mailapp.restdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mail.project.mailapp.restdemo.model.Login;


public interface LoginRepository extends JpaRepository<Login,Integer> {

	Optional<Login> findByLogin(String login);

    //List<Login> findByLoginIsNotNullString(String login);

    boolean existsByLogin(String login);

   // @Query("SELECT log FROM Login log WHERE .fullName LIKE :fullName AND p.description LIKE :desc")
    //List<Person> findByFullNameLikeDescription(@Param("fullName") String fullName, @Param("desc") String desc);
}
	

