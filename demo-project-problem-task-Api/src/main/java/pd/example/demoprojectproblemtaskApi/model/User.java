package pd.example.demoprojectproblemtaskApi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int roomNo;
    private String date;
    private String problem;
    private String problemDescp;
    private String complainRaisedBy;
    private String phoneNumber;
    private String email;
    private String status;

}
