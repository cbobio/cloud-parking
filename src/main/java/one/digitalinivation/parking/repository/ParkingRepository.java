package one.digitalinivation.parking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import one.digitalinivation.parking.model.Parking;



@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
