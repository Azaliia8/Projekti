package ohjelmistoprojekti1.projekti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ohjelmistoprojekti1.projekti.domain.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {}

