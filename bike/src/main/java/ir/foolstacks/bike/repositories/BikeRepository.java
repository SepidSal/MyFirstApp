package ir.foolstacks.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ir.foolstacks.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
