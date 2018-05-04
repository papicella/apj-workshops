package pivotal.io.apj.pa.workshops;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(exclude = "id")
public class Workshop
{
    @Id
    private String id;

    private String name;
    private String persona;

    private String timeRequired;
    private String runType;
    private String workshopUrl;

    @Basic
    @Temporal(TemporalType.DATE)
    private java.util.Date lastUpdated;

}
