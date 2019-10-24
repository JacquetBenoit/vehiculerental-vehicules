package com.vehiculerental.vehicules;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class VehiculeController {

    @Autowired
    private VehiculeDao VehiculeDao;

    // Get all vehicules
    @RequestMapping(value ="/vehicules", method = RequestMethod.GET)
    public Iterable<VehiculeEntity> getVehicules() {
        return VehiculeDao.findAll();
    }

    // Get vehicule by id
    @RequestMapping(value = "/vehicules/{id}", method = RequestMethod.GET)
    public VehiculeEntity getVehiculeById(@PathVariable int id) {
        return VehiculeDao.findById(id);
    }

    // Add vehicule
    @PostMapping(value = "/vehicules")
    public void addVehicule(@RequestBody VehiculeEntity vehicule) {
        VehiculeDao.save(vehicule);
    }

    // Update vehicule
    @PutMapping(value = "/vehicules")
    public ResponseEntity<Void> updateVehicule(@RequestBody VehiculeEntity vehicule) {
        VehiculeDao.save(vehicule);
        return ResponseEntity.ok().build();
    }

    // Delete vehicule
    @DeleteMapping(value = "/vehicules/{id}")
    public void deleteCar(@PathVariable int id) {
        VehiculeEntity vehicule = VehiculeDao.findById(id);
        VehiculeDao.delete(vehicule);
    }

}
