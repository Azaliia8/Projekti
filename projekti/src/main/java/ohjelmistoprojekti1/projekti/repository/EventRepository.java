package ohjelmistoprojekti1.projekti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ohjelmistoprojekti1.projekti.domain.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}

