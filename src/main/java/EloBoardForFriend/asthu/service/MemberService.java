package EloBoardForFriend.asthu.service;

import EloBoardForFriend.asthu.dto.CreateUserDto;
import EloBoardForFriend.asthu.entity.User;
import EloBoardForFriend.asthu.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService {

    final MemberRepository memberRepository;

    public Long save(CreateUserDto createUserDto) {
        User user = createUserDto.getEntity();
        User savedUser = memberRepository.save(user);
        return savedUser.getUserId();
    }
}
