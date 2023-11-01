package umc.spring.web.domain;
import lombok.*;
import umc.spring.web.domain.enums.Gender;
import umc.spring.web.domain.enums.MemberStatus;
import umc.spring.web.domain.enums.SocialType;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String name;
}
