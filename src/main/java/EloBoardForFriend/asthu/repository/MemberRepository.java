package EloBoardForFriend.asthu.repository;

import EloBoardForFriend.asthu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<User, Long> {
}
