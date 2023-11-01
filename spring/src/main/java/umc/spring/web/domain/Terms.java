package umc.spring.web.domain;
import lombok.*;
import umc.spring.web.domain.enums.Gender;
import umc.spring.web.domain.enums.MemberStatus;
import umc.spring.web.domain.enums.SocialType;
import umc.spring.web.domain.mapping.MemberAgree;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Terms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String title;

    @Column(nullable = false, length = 40)
    private String body;

    private Boolean optional;

    @OneToMany(mappedBy = "terms", cascade = CascadeType.ALL)
    private List<MemberAgree> memberAgreeList = new ArrayList<>();
}
