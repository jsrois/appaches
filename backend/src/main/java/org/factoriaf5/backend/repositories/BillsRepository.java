package org.factoriaf5.backend.repositories;

import org.factoriaf5.backend.model.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Long> {
    List<Bills> findAllByFriendsId(Long id);
    List<Bills> findAllByEventId(Long id);
}
