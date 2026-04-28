# [Gold III] League of Overwatch at Moloco (Hard) - 15511

[문제 링크](https://www.acmicpc.net/problem/15511)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 393, 정답: 209, 맞힌 사람: 163, 정답 비율: 55.068%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 이분 그래프

### 문제 설명

<p>Once in a while, Moloco employees partition themselves into two groups, and engage in a best-of-five series of the League of Overwatch. Since some pairs of employees are hardcore gamers and they have played together as a duo in the past, the company decided to split them for this friendly company-wide event to make the event less competitive but more enjoyable for newbies.</p>

<p>Formally, there are <em>n</em>&nbsp;employees at Moloco who are numbered as 1 through <em>n</em>.&nbsp;</p>

<p>There are <em>m</em> known pairs of employees (<em>f<sub>i</sub></em>, <em>s<sub>i</sub></em>) such that the employees <em>f<sub>i</sub></em> and <em>s<sub>i</sub></em> have played a duo game in the past -- they must belong to different groups for this event.</p>

<p>Given this information, determine whether it is possible to partition <em>n</em> employees to two non-empty groups such that each employee belongs to exactly one group and there is no pair (<em>f<sub>i</sub></em>, <em>s<sub>i</sub></em>) such that both <em>f<sub>i</sub></em> and and <em>s<sub>i</sub></em> belong to the same group.</p>

### 입력

<p>First line contains two integers, <em>n</em> and <em>m</em> where 1 &le; <em>n</em> &le; 1,000,000 and 1 &le;&nbsp;<em>m</em> &le; 1,000,000.</p>

<p>The following <em>m</em> lines contain two integers where <em>i</em>+1th line describes <em>f<sub>i</sub></em> and <em>s<sub>i</sub></em> where 1 &le; <em>f<sub>i</sub></em>, <em>s<sub>i</sub></em> &le; <em>n</em>. It is guaranteed that <em>f<sub>i</sub></em> &ne; <em>s<sub>i</sub></em>&nbsp;for all <em>i</em>.</p>

### 출력

<p>Your output should be a single line that contains a string &quot;POSSIBLE&quot; or &quot;IMPOSSIBLE&quot; (quotes for clarity only).&nbsp;</p>

### 힌트

<p>Example 2:&nbsp;({2} and {1,3} is a valid partition.)</p>