# [Platinum V] Ferry Loading - 4403

[문제 링크](https://www.acmicpc.net/problem/4403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 13, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 비트마스킹, 해시를 사용한 집합과 맵

### 문제 설명

<p>Before bridges were common, ferries were used to transport cars across rivers. River ferries, unlike their larger cousins, run on a guide line and are powered by the river&#39;s current. Two lanes of cars drive onto the ferry from one end, the ferry crosses the river, and the cars exit from the other end of the ferry.</p>

<p>The cars waiting to board the ferry form a single queue, and the operator directs each car in turn to drive onto the port (left) or starboard (right) lane of the ferry so as to balance the load. Each car in the queue has a different length, which the operator estimates by inspecting the queue. Based on this inspection, the operator decides which side of the ferry each car should board, and boards as many cars as possible from the queue, subject to the length limit of the ferry. Your job is to write a program that will tell the operator which car to load on which side so as to maximize the number of cars loaded.</p>

### 입력

<p>The first line of input contains a single integer between 1 and 100: the length of the ferry (in metres). For each car in the queue there is an additional line of input specifying the length of the car (in cm, an integer between 100 and 3000 inclusive). A final line of input contains the integer 0. The cars must be loaded in order, subject to the constraint that the total length of cars on either side does not exceed the length of the ferry. Subject to this constraint as many cars should be loaded as possible, starting with the first car in the queue and loading cars in order until no more can be loaded.</p>

### 출력

<p>The first line of outuput should give the number of cars that can be loaded onto the ferry. For each car that can be loaded onto the ferry, in the order the cars appear in the input, output a line containing &quot;port&quot; if the car is to be directed to the port side and &quot;starboard&quot; if the car is to be directed to the starboard side. If several arrangements of the cars meet the criteria above, any one will do.</p>