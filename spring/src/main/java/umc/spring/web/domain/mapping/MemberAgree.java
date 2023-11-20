//package umc.spring.web.domain.mapping;
//
//import lombok.*;
//import umc.spring.web.domain.Member;
//import umc.spring.web.domain.Terms;
//import umc.spring.web.domain.common.BaseEntity;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class MemberAgree extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "terms_id")
//    private Terms terms;
//
//}