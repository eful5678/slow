# Lambda & Stream
## #1 Lambda
- Lambda Expression
    - Lambda?
        - Method를 하나의 **<u>식(Expression)</u>**으로 표현
            - 함수를 간략하고 명확한 식으로 표현
                ```java
                int[] arr = new int[5];
                
                int method(){
                    return (int)(Math.random()*5) + 1;
                }

                Arrays.setAll(arr, (i) -> (int)(Math.random()* 5) + 1)l

                ```
        - 매개변수로 전달 될 수 있다
        - 메서드의 결과로 반환될 수 있다.
    - Make Lambda
        - 메서드에서 이름과 반환타입 제거
            ```java
            반환타입 메서드이름(매개변수 선언){

                문장
            }

            (매개변수 선언) -> {
                문장
            }
            ```
        - Examples
            ```java
            int max(int a, int b){
                return a > b ? a : b;
            }

            (int a, int b) -> {
                return a > b ? a : b;
            }
            ```
