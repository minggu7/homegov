package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
