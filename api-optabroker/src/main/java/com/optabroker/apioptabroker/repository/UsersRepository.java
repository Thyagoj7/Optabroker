package com.optabroker.apioptabroker.repository;

import com.optabroker.apioptabroker.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

   //Este é o metodo que sera usado para retornar o login ele deve ser do tipo userDetails pois o security vai usalo
   UserDetails findByLogin(String Login);
   boolean existsByphone(String phone);

   boolean existsByemail(String email);


}
