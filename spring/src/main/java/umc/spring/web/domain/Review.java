package umc.spring.web.domain;
import lombok.*;
import umc.spring.web.domain.enums.Gender;
import umc.spring.web.domain.enums.MemberStatus;
import umc.spring.web.domain.enums.SocialType;
import umc.spring.web.domain.mapping.MemberMission;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    private LocalDate date;

    @Column(nullable = false, length = 50)
    private String title;

    private Float score;

    @Column(nullable = false, length = 50)
    private String body;

    @OneToMany(mappedBy = "Store", cascade = CascadeType.ALL) // 추가하기 편하기 위해? sql과 jpa의 차이??
    private List<Store> memberMissionList = new ArrayList<>();
}
