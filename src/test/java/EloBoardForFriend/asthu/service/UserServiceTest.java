package EloBoardForFriend.asthu.service;

import EloBoardForFriend.asthu.entity.User;
import EloBoardForFriend.asthu.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserServiceTest {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    EntityManager em;

    @Test
    public void 회원가입() throws Exception {
        //given
        User user = new User();
        user.setName("testName");
        //when
        Long savedId = userService.join(user);
        //then
        assertEquals(user, userRepository.findOne(savedId));
    }

    @Test(expected = IllegalStateException.class)
    public void 중복_회원_예외() throws Exception {
        //given
        User user1 = new User();
        user1.setUsername("testName");

        User user2 = new User();
        user2.setUsername("testName");

        //when
        userService.join(user1);
        userService.join(user2);

        //then
        fail("예외가 발생해야 한다.");
    }

}