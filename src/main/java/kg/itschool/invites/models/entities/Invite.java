package kg.itschool.invites.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sender_subs_id")
    private Subscribers subscribersA;
    @ManyToOne
    @JoinColumn(name = "reseiver_subs_id")
    private Subscribers subscribersB;
    private LocalDateTime localDateTime = LocalDateTime.now();

}
