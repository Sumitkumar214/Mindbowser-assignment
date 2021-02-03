package com.mb.assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/api/v1")
public class ManagerController {
	
	private ManagerRepository managerrepository;
	
	public ManagerController(ManagerRepository managerrepository) {
		this.managerrepository = managerrepository;
	}
	
	@GetMapping("/managers")
    public List<Manager> getManagers() {
        return (List<Manager>) managerrepository.findAll();
    }
	
	@GetMapping("/managers/{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable(value = "id") Long managerId)
        throws ResourceNotFoundException {
        Manager manager = managerrepository.findById(managerId)
          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + managerId));
        return ResponseEntity.ok().body(manager);
    }


    @PostMapping("/managers")
    void addManager(@RequestBody Manager manager) {
    	managerrepository.save(manager);
    }
    
    @PutMapping("/managers/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable(value = "id") Long managerId,
          @RequestBody Manager managerDetails) throws ResourceNotFoundException {
        Manager manager = managerrepository.findById(managerId)
        .orElseThrow(() -> new ResourceNotFoundException("Manager not found for this id :: " + managerId));

        manager.setEmail(managerDetails.getEmail());
        manager.setAddress(managerDetails.getAddress());
        manager.setFirstname(managerDetails.getFirstname());
        manager.setLastname(managerDetails.getLastname());
        manager.setCompany(managerDetails.getCompany());
        manager.setDob(managerDetails.getDob());
        final Manager updatedManager = managerrepository.save(manager);
        return ResponseEntity.ok(updatedManager);
    }
    
    @DeleteMapping("/managers/{id}")
    public Map<String, Boolean> deleteManager(@PathVariable(value = "id") Long managerId)
         throws ResourceNotFoundException {
        Manager manager = managerrepository.findById(managerId)
       .orElseThrow(() -> new ResourceNotFoundException("Manager not found for this id :: " + managerId));

        managerrepository.delete(manager);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    

}
