# BO Keyword

## Modern Java(Java 1.8 전 후)
- Functional Interface
- Lambda
- Method Reference
- Generic Type Interface 개선
- Time api 추가
- Collection API 확장
- Stream API
- Optional
## Generic
- Data type을 일반화한다
- Class나 method에서 사용할 내부 data type을 컴파일 시에 미리 지정하는 방법
- T
    - Type Variable
    - 임의의 참조형 data type
- 데이터 형식에 의존하지 않고 하나의 값이 여러 다른 data type을 가질 수 있도록 하는 방법
- 데이터 타입을 외부에서 지정
```java
public class ClassName<T>{
    ...
}

public class Main{
    public static void main(String[] args){
        ClassName<Student> a = new ClassName<Student>();
    }
}

```
- Why?

- 우리 코드

## Enum
- 열거형 -> 서로 연관된 상수들의 집합
- 허용 가능한 값들을 제한할 수 있다
- 리팩토링 시, Enum에 관련된 코드만 수정하면 된다
- 상태와 행위를 한 곳에서 관리
- Why?
    - 의도치 않은 실수를 줄일 수 있다.
    - 미리 정해진 값들만 호출
## Functional Interface
- 1개의 추상 메서드를 갖는 interface
- default method or static method는 여러 개 존재해도 상관 x
- @FunctionalInterface를 추가하면 추상메소드가 여러개 되는 등 함수형 인터페이스가 아니게 되었을 때 오류 뜸
- abstract는 interface에서 생략 가능
- 고차 함수
    - 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수 있다


## JPA & 영속성
- SQL 중심 -> 객체 중심 개발
- 객체와 관계형 DB 매핑
- EntityManagerFactory 생성 -> EntityManager 생성
- 영속성
    - Entity를 영원히 저장하는 환경
    - EntityManager를 통해 영속성에 접근
    - 생명주기
        - 비영속 : 영속성 컨텍스트와 관계가 없는 새로운 상태
        - 영속 : 영속성 컨텍스트에 관리되는 상태
        - 준영속 : 영속성 컨텍스트에 저장되었다가 분리된 상태
        - 삭제: 삭제된 상태
- Entity
    - DB 테이블과 매핑

## String
- 연속된 문자(character)들의 집합

## Lambda
- 익명함수를 지칭하는 용어
- 함수형 인터페이스(추상 메서드가 1개)인 경우 사용
- 코드를 줄일 수 있다(간결성)


## Method Reference
- 람다 표현식이 단 하나의 메소드만을 호출할 때, 불필요한 매개변수를 제거하고 사용

## Class vs Interface
- 확장과 구현