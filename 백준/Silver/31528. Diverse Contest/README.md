# [Silver III] Diverse Contest - 31528

[문제 링크](https://www.acmicpc.net/problem/31528)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 67, 정답: 51, 맞힌 사람: 27, 정답 비율: 90.000%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Write what you know! The judges for a certain programming competition have $n$ problems and are trying to prepare a contest using $k$ of them.</p>

<p>The judges have tagged each problem with a list of topics needed to solve that problem. To not overly punish teams for not knowing a specific topic, for any given topic, at most half of the problems on the contest can have that topic.</p>

<p>Compute the number of distinct contests the judges can prepare. Two contests are different if there is a problem that appears in one contest but not the other. In particular, the order of the problems in the contest does not matter.</p>

### 입력

<p>The first line of input has two integers $n$ and $k$ where $n$ ($2 \leq n \leq 20$) is the number of proposed problems and $k$ ($2 \leq k \leq n$) is the number of problems that will be used in a contest. The next $n$ lines each begin with an integer $t$ ($1 \leq t \leq 20$), the number of topics for that problem. Then follow $t$ unique topics. Each topic is a string of lowercase letters, each of length at most $10$.</p>

### 출력

<p>Output the number of distinct contests the judges can prepare.</p>