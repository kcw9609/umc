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
//public class Mission extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Integer reward;
//
//    private LocalDate deadline;
//
//    @Column(nullable = false, length = 40)
//    private String missionSpec;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "store_id")
//    private Store store;
//
//
//}
