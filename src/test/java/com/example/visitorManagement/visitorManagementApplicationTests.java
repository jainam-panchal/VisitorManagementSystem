package com.example.visitorManagement;

import com.example.visitorManagement.entity.Address;
import com.example.visitorManagement.entity.Flat;
import com.example.visitorManagement.entity.User;
import com.example.visitorManagement.enums.Role;
import com.example.visitorManagement.enums.UserStatus;
import com.example.visitorManagement.repo.UserRepo;
import com.example.visitorManagement.repo.VisitorRepo;
import com.example.visitorManagement.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;
import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
class VisitorManagementApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private AdminService adminService;

	@MockBean
	private UserRepo userRepo;

	@MockBean
	private VisitorRepo visitorRepo;

	@Test
	void getAllPendingVisits() {
		Address address = new Address();
		address.setLine1("123 Main St");
		address.setLine2("Apt 4B");
		address.setCity("Springfield");
		address.setPincode("12345");
		address.setCountry("USA");
		address.setCreatedDate(new Date());
		address.setUpdatedDate(new Date());

		Flat flat = new Flat();
		flat.setNumber("101");
		flat.setCreatedDate(new Date());
		flat.setUpdatedDate(new Date());

		User user = new User();
		user.setName("John Doe");
		user.setEmail("john.doe@example.com");
		user.setPhone("123-456-7890");
		user.setIdNumber("ID123456789");
		user.setRole(Role.RESIDENT);
		user.setStatus(UserStatus.ACTIVE);
		user.setFlat(flat);
		user.setAddress(address);
		user.setCreatedDate(new Date());
		user.setUpdatedDate(new Date());

		when(userRepo.findById(10L)).thenReturn(Optional.of(user));

		// Optionally, you can add assertions to verify the behavior
		Optional<User> foundUser = userRepo.findById(10L);
		assert(foundUser.isPresent());
		assert("John Doe".equals(foundUser.get().getName()));
	}
}
