# [Gold II] Lazy to Win - 27187

[문제 링크](https://www.acmicpc.net/problem/27187)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

자료 구조, 트리를 사용한 집합과 맵, 두 포인터, 슬라이딩 윈도우

### 문제 설명

<p>Alexey is probably the smartest and at the same time the laziest person in the world. Today he is participating in the Olympiad. </p>

<p>At the Olympiad, participants are given $n$ problems. The participant will receive $a_i$ points for the correct solution of the $i$-th problem. No points are given for an incorrect solution. The winner&#39;s diplomas will be awarded to those participants who receive at least half of the total number of points. For example, if there are given three problems at the Olympiad, the cost of which in points are $1$, $3$ and $4$, it is enough to receive four points to be awarded the winner&#39;s diploma.</p>

<p>Alexey came to the Olympiad to get a winner&#39;s diploma. Alexey is very smart and can correctly solve any problem at the Olympiad. But Alexey is also very lazy and wants to solve as few problems as possible.</p>

<p>Alexey is so lazy that he even lazily chooses tasks that he will solve. He wants to choose some problem with the number $k$, and then solve problems with the numbers $k, k+1, k+2 \ldots$ until he has enough points to get a winner&#39;s diploma. The maximum that Alexey is ready for is to skip one problem and not solve it, in order to solve even fewer problems in the end.</p>

<p>Determine the minimum number of problems that Alexey needs to solve using his strategy to get the winner&#39;s diploma.</p>

### 입력

<p>On the first line there is one integer $n$ --- the number of problems that were given at the Olympiad ($1 \le n \le 10^5$).</p>

<p>On the second line there are $n$ integers $a_1, a_2, \dots a_n$ --- the cost of each problem in points ($1 \le a_i \le 10^9$).</p>

### 출력

<p>On the first line output single integer --- the minimum number of problems that Alexey needs to solve using his strategy to get the winner&#39;s diploma.</p>

### 힌트

<p>In the first example, participants need receive at least four points to get the winner&#39;s diploma. Alexey can start solving the third problem, then skip the fourth problem and get four points by solving two tasks.</p>

<p>In the second example, it is enough to solve only the second problem and receive three points.</p>