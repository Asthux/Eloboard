package EloBoardForFriend.asthu.controller;

import EloBoardForFriend.asthu.dto.CreateUserDto;
import EloBoardForFriend.asthu.service.MemberService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MemberController {
    final MemberService memberService;

    @PostMapping("signup")
    public Long signup(@RequestBody CreateUserDto createUserDto) {
        return memberService.save(createUserDto);
    }
}
