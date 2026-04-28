# [Gold IV] Alien Generator - 23008

[문제 링크](https://www.acmicpc.net/problem/23008)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 73, 정답: 45, 맞힌 사람: 37, 정답 비율: 60.656%

### 분류

수학, 정수론

### 문제 설명

<p>Astronauts have landed on a new planet, Kickstartos. They have discovered a machine on the planet: a generator that creates gold bars. The generator works as follows. On the first day, an astronaut inputs a positive integer K into the generator. The generator will produce K gold bars that day. The next day, it will produce K+1, the following day, K+2, and so on. Formally, on day i, the generator will produce K+i&minus;1 gold bars.</p>

<p>However, the astronauts also know that there is a limitation to the generator:</p>

<p>if on any day, the generator would end up producing more than G gold bars in total across all the days, then it will break down on that day and will produce 0 gold bars on that day and thereafter. The astronauts would like to avoid this, so they want to produce exactly G gold bars.</p>

<p>Consider K=2 and G=8. On day 1, the generator would produce 2 gold bars. On day 2, the generator would produce 3 more gold bars making the total gold bars is equal to 5. On day 3, the generator would produce 4 more gold bars which would lead to a total of 9 gold bars. Thus, the generator would break on day 3 before producing 4 gold bars. Hence, the total number of gold bars generated is 5 in this case.</p>

<p>Formally, for a given G, astronauts would like to know how many possible values of K on day 1 would eventually produce exactly G gold bars.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T lines follow.</p>

<p>Each line contains a single integer G, representing the maximum number of gold bars the generator can generate.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from&nbsp;1) and&nbsp;y&nbsp;is the number of possible values of&nbsp;K&nbsp;on day&nbsp;1&nbsp;that would eventually produce exactly&nbsp;G&nbsp;gold bars.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100</li>
</ul>

### 힌트

<p>For Sample Case #1, there are 2 possible values of K (1, 10) that would eventually produce exactly 10 gold bars. For K=1, we will have 1+2+3+4=10 gold bars after 4 days, and for K=10, we will have 10 gold bars after just 1 day.</p>

<p>For Sample Case #2, there are 4 possible values of K (8, 23, 62, 125) that would eventually produce exactly 125 gold bars.</p>