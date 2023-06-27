package com.example.springbootstudy.global.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //JPA 엔티티 클래스들이 Basetime엔티티를 상속할 경우 필드들(createdate, midifiedDate)칼럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class) //클래스에 auditing 기능 추가, auditing = 자동으로 값을 넣어주는 기능
public abstract class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createdDate; //entity의 값이 생성돼서 저장될때 시간 자동저장

    @LastModifiedDate
    private LocalDateTime modifiedDate;//값 변경할떄 시간 자동저장
}