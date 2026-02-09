package ohjelmistoprojekti1.projekti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ohjelmistoprojekti1.projekti.domain.AppUser;
import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
