# Thread

## Thread 개념
- Ligth Weight Process
    - Process와 같이 동작하지만 더 작다
- Process
    - 프로세스 간에는 각 프로세스의 데이터 접근 불가
        - IPC 사용
- Thread
    - 하나의 프로세스에 여러 개의 thread 생성 가능
    - thread들은 동시에 실행 가능
    - Process 안에 있으므로, Process의 Data를 모두 접근 가능하다.
        - IPC 불필요
- Thread의 동작
