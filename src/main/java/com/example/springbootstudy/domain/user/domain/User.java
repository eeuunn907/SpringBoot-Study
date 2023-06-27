package com.example.springbootstudy.domain.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 무분별한 객체 생성에 대해 한 번 더 체크 해주는 수단
@Entity(name = "tbl_user")
@Table(name = "posts")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String accountId;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(length = 5, nullable = false)
    private String name;

    @Builder // 복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴 , 가독성/불변성
    public User(String accountId, String password, String name) {
        this.accountId = accountId;
        this.password = password;
        this.name = name;
    }
    public void changePassword(String newPassword){
        this.password = newPassword;
    }
}



