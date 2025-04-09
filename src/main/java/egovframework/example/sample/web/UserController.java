package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.sample.service.UserService;
import egovframework.example.sample.service.UserVO;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/userList.do")
    public String userList(Model model) throws Exception {
        List<UserVO> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "user/userList";
    }

    // 회원가입 폼 보여주기
    @RequestMapping("/userRegister.do")
    public String showRegisterForm() {
        return "user/userRegister";
    }

    // 회원가입 처리
    @RequestMapping(value = "/registerUser.do", method = RequestMethod.POST)
    public String registerUser(UserVO userVO) throws Exception {
        userService.insertUser(userVO);
        return "redirect:/userList.do";
    }
}

