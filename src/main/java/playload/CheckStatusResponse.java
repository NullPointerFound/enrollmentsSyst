package playload;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Status;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
public class CheckStatusResponse {

    private String fullName;
    private String email;
    @CreationTimestamp
    private LocalDateTime date;
    private Status status;

    @OneToOne
    private Course course;

    private Integer Tracking;
}
