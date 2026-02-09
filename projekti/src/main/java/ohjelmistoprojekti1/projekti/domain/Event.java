package ohjelmistoprojekti1.projekti.domain;

import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
public class Event {


    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String venue;
    private String city;
    private LocalDateTime startTime;


    

}
