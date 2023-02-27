package org.idb.emf.EMFCourier.repository;

import org.idb.emf.EMFCourier.entity.ParcelDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelDetailsRepository extends JpaRepository<ParcelDetails,Integer> {


}
