package com.saveTheChildren.UserInformation.service;

import com.saveTheChildren.UserInformation.controller.UserController;
import com.saveTheChildren.UserInformation.model.User;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import java.util.Arrays;
import java.util.List;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class StandAloneControllerTests {

    @MockBean
    UserService userService;

    @Autowired
    MockMvc mockMvc;

//    @Test
//    public void testCreate() throws Exception{
//        User user = new User("Johnny","Cage");
//        List<User> users = Arrays.asList(user);
//
//        Mockito.when(userService.findAll()).thenReturn(users);
//
//        mockMvc.perform(get("/user"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", Matchers.hasSize(1)))
//                .andExpect(jsonPath("$[0].firstName",Matchers.is("Johnny")));
//    }
}
