package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.employee.EmployeeService;
import ProdReady.Aniket.Service.jwt.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.test.context.support.WithMockUser;

import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

// These two MUST be "static" imports
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

  @Autowired private MockMvc mockMvc;

  @MockitoBean private JwtService jwtService; // You still need to mock this so the context loads

  @MockitoBean UserDetailsService userDetailsService;

  @MockitoBean EmployeeService employeeService;

  @Test
  @WithMockUser // 2. Tells Spring Security "Pretend a valid user is logged in"
  public void getHello() throws Exception {
    mockMvc.perform(get("/employee/hello")).andExpect(status().isOk());
  }

  @Test
  @WithMockUser
  public void findByName() throws Exception {
    mockMvc.perform(get("/employee/get/Aniket")).andExpect(status().isOk());
  }
}
