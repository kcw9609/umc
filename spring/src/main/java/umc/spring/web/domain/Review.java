//package umc.spring.web.domain;
//import lombok.*;
//import umc.spring.web.domain.common.BaseEntity;
//import umc.spring.web.domain.enums.Gender;
//import umc.spring.web.domain.enums.MemberStatus;
//import umc.spring.web.domain.enums.SocialType;
//import umc.spring.web.domain.mapping.MemberMission;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class Review extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    private LocalDate date;
//
//    @Column(nullable = false, length = 50)
//    private String title;
//
//    private Float score;
//
//    @ManyToOne
//    @JoinColumn(name = "storeId", nullable = false) // 수정된 부분
//    private Store store;
//
//    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
//    private List<MemberMission> memberMissionList = new ArrayList<>();
//}
