# [Platinum II] Drilling - 8325

[문제 링크](https://www.acmicpc.net/problem/8325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 8, 맞힌 사람: 4, 정답 비율: 15.385%

### 분류

자료 구조, 다이나믹 프로그래밍, 세그먼트 트리

### 문제 설명

<p>Byteman is the person in charge of a team that is looking for crude oil reservoirs. He has made two boreholes: he found crude oil in point <em>A</em>&nbsp;and found out that there is no crude oil in point <em>B</em>. It is known that the oil reservoir occupies a connected fragment of segment <em><span style="text-decoration: overline;">AB</span></em>&nbsp;with one end at point <em>A</em>. Now Byteman has to check, how far, along the segment connecting points <em>A</em>&nbsp;and <em>B</em>, does the oil reservoir reach. It is not that simple, however, because in some locations one can drill faster than in other locations. Moreover, Byteman&#39;s team is rather small, so they can drill in at most one location at a time. Byteman&#39;s boss would like him to predetermine when he will be able to identify the boundary of the oil reservoir.</p>

<p>Byteman has asked you for help. He has divided the segment connecting points <em>A</em>&nbsp;and <em>B</em>&nbsp;into <em>n</em> + 1&nbsp;segments of equal length. If we assume that point <em>A</em>&nbsp;has coordinate 0, and point <em>B</em>&nbsp;coordinate <em>n</em> + 1, then there are <em>n</em>&nbsp;points with coordinates 1, 2, ..., <em>n</em>&nbsp;between them. It is enough to find the farthest from <em>A</em>&nbsp;of these points in which some crude oil occurs. Byteman has informed you about the amounts of time necessary for making boreholes in these points - they are equal to <em>t</em><sub>1</sub>, <em>t</em><sub>2</sub>, ..., <em>t<sub>n</sub></em>&nbsp;respectively. You should create such a plan of drilling, that the time necessary to identify the oil reservoir&#39;s boundary is shortest possible, assuming the worst-case scenario.</p>

### 입력

<p>The first line of the standard input contains a single positive integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 2000). The second line contains <em>n</em>&nbsp;positive integers <em>t</em><sub>1</sub>, <em>t</em><sub>2</sub>, ..., <em>t<sub>n</sub></em>&nbsp;separated by single spaces (1 &le; <em>t<sub>i</sub></em> &le; 10<sup>6</sup>).</p>

### 출력

<p>Your program should write a single integer to the standard output - the smallest amount of time that Byteman has to spend (assuming the worst-case scenario) drilling in search of oil, to be sure that he will identify the reservoir&#39;s boundary.</p>

### 힌트

<p>Assume that Byteman makes the first borehole at point 1, what takes him time&nbsp;8. It can then turn out that he finds crude oil there and he will have to check, how far to the right does the reservoir reach. He will need two more boreholes, making which requires 36&nbsp;units of time in the worst case. Therefore, in this case Byteman will spend in total 44&nbsp;units of time drilling.</p>

<p>It turns out that it is better to start at point 2. If there is no crude oil there, it is sufficient to check point 1. However, in the worst case Byteman will have to make two more boreholes in points 3&nbsp;and 4&nbsp;and end his work in total time equal to 42.</p>