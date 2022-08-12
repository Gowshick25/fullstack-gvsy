//package com.training;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import com.training.ifaces.StaffRepository;
//import com.training.model.Staff;
//import com.training.service.StaffService;
//
//
//@ExtendWith(MockitoExtension.class)
//
//public class StaffServiceTest {
//	
//	
//		@Mock
//		StaffRepository repo1;
//
//		@InjectMocks
//		StaffService service1;
//
//		@Test
//		@DisplayName(value = "Test Find All method with mockito stub")
//
//		void testFindById() {
//			Staff list =new Staff(101, "maniii");
//
//			when(repo1.getById(101)).thenReturn(Optional.of(list));
//			
//			assertEquals(service1.getById(101),list);
//		}
//}
