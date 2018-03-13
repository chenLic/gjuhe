package repository;

import domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
    List<User> findAll();
    int save(User user);

}
