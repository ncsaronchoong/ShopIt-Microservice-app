package com.shopit.usersmicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//import net.javaguides.springbootcrudrestfulwebservices.User.Entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<tester, Long>{



	/* public Optional<User> findUserByUsername(String username); */

    @Query(nativeQuery = true,value= " SELECT COUNT(*) FROM TB_USER A, TB_ACCOUNT B WHERE A.USER_ID=B.USER_ID AND (A.USERNAME=:user  OR A.EMAIL=:email) AND B.password=:password")
    int checkLoginInfo(@Param("user") String name,@Param("email") String name1,@Param("password") String pass);

    @Query(nativeQuery = true,value= " SELECT USERNAME FROM TB_USER")
    List<String> getListOfUser();
}
