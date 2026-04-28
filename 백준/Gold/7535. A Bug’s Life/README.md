# [Gold III] A Bug’s Life - 7535

[문제 링크](https://www.acmicpc.net/problem/7535)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 572, 정답: 281, 맞힌 사람: 239, 정답 비율: 49.482%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 이분 그래프

### 문제 설명

<p>Professor Hopper is researching the sexual behavior of a rare species of bugs. He assumes that they feature two different genders and that they only interact with bugs of the opposite gender. In his experiment, individual bugs and their interactions were easy to identify, because numbers were printed on their backs.</p>

<p>Given a list of bug interactions, decide whether the experiment supports his assumption of two genders with no homosexual bugs or if it contains some bug interactions that falsify it.</p>

### 입력

<p>The first line of the input contains the number of scenarios. Each scenario starts with one line giving the number of bugs (at least one, and up to 2000) and the number of interactions (up to 1000000) separated by a single space. In the following lines, each interaction is given in the form of two distinct bug numbers separated by a single space. Bugs are numbered consecutively starting from one.</p>

### 출력

<p>The output for every scenario is a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1, followed by one line saying either &ldquo;No suspicious bugs found!&rdquo; if the experiment is consistent with his assumption about the bugs&rsquo; sexual behavior, or &rdquo;Suspicious bugs found!&rdquo; if Professor Hopper&rsquo;s assumption is definitely wrong.</p>