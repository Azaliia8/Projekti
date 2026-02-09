package ohjelmistoprojekti1.projekti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ohjelmistoprojekti1.projekti.domain.TicketType;
import java.util.List;

public interface TicketTypeRepository extends JpaRepository<TicketType, Long> {
    List<TicketType> findByEventId(Long eventId);
}
