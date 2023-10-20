package playload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics {

    private Long totalOfApplication;
    private long totalAccepted;
    private long totalRefused;
    private long totalPending;
}
