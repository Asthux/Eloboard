package EloBoardForFriend.asthu.service;

import EloBoardForFriend.asthu.entity.User;
import EloBoardForFriend.asthu.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * 회원 가입
     */
    @Transactional
    public Long join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);
        return user.getUserId();
    }

    private void validateDuplicateUser(User user) {
        List<User> findUsers = userRepository.findByUserName(user.getUsername());
        if (!findUsers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다");
        }
    }

    /**
     * 회원 전체 조회
     */
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    /**
     * 회원 조회
     */
    public User findOne(Long userId) {
        return userRepository.findOne(userId);
    }
}