# Optional
## Concepts
- Interface
- 비어있을 수도 있고, 담고 있을 수도 있는 Container instance 타입
- return 타입에만 쓰는 것을 권장 

## 활용
- Optional 만들기
    - Optional.of();
        - 값이 null인 경우 null 리턴
    - Optional.ofNullable();
    - Optional.empty();
- Optional에 값이 있는지 없는지 확인하기
    - isPresent();
        - 값의 존재 여부를 true / false로 반환
    - isEmpty();
        - Java 11
- Optional에 있는 값 가져오기
    - get();
        - 값이 있는 경우 가져오지만, 값이 없는 경우 runtime Exception 발생(NoSuchElementException)
        - 가급적 get이 아닌 optional api 사용
            - ex) ifPresent()
- Optional에 값이 있는 경우, 그 값을 처리하는 법
    - ifPresent();
- Optional에 값이 있으면 가져오고, 없는 경우 특정 값을 리턴
    - orElse(T);
    - JPA로 시작하는 수없이 없다면 비어있는 수업을 리턴하라.
- Optional에 값이 있으면 가져오고, 없는 경우 처리
    - orElse(Supplier)
    - JPA로 시작한느 수업이 없다면 새로 만들어서 리턴하라.
- Optional에 값이 있으면 가저오고 없는 경우 에러
    - orElseThrow()
- Optional에 들어있는 값 걸러내기
    - Optional filter(Predicate)
- Optional에 들어있는 값 변환하기
    - Optional Map(Function)
    - Optioanl flatMap