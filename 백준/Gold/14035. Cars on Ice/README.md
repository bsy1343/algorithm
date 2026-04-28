# [Gold II] Cars on Ice - 14035

[문제 링크](https://www.acmicpc.net/problem/14035)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 17, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 스택

### 문제 설명

<p>Guarding a bank during Christmas night can get very boring. That&rsquo;s why Barry decided to go skating around the parking lot for a bit. However the parking lot isn&rsquo;t empty as the other security guards have their cars parked there. So Barry decides to push their cars out of the parking lot. He notices that their cars are parked facing either North, South, East or West. Since the parking lot is frozen, pushing a car will make it slide until it has left the parking lot or hit another car. Cars can only be pushed in the direction which they are facing. Not wanting to crash the cars, Barry enlists your help to find out what order he has to push the cars so as to clear the parking lot.</p>

### 입력

<p>The first line contains two integers N and M (1 &le; N, M &le; 2000) representing the number of rows and columns of the parking lot. The next N lines each contain M characters representing the parking lot itself, where &lsquo;.&rsquo; represents an empty spot, while &lsquo;N&rsquo;, &lsquo;S&rsquo;, &lsquo;E&rsquo; and &lsquo;W&rsquo; each represent a car (facing North, South, East or West, respectively).</p>

### 출력

<p>Output the order in which the cars have to be pushed so as to clear the parking lot without crashes. Output each car in the form (r, c), where r and c are the car&rsquo;s coordinates on the parking lot (where (0, 0) is the top leftmost spot and (N &minus; 1, M &minus; 1) is the bottom rightmost spot).</p>

<p>You can assume there will always be at least one valid solution.</p>