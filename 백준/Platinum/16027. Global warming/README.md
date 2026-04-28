# [Platinum I] Global warming - 16027

[문제 링크](https://www.acmicpc.net/problem/16027)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 285, 정답: 120, 맞힌 사람: 105, 정답 비율: 44.872%

### 분류

자료 구조, 세그먼트 트리, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Global warming is an important issue and Johnny knows about it. He decided to make an analysis of historical temperatures and find a subsequence of days (not necessarily consecutive) where the temperature was strictly increasing. It will convince the non-believers!</p>

<p>Johnny has found historical data from n consecutive days. The temperature on the i-th day was t<sub>i</sub>.</p>

<p>Formally, we are interested in finding the length of the longest increasing subsequence (LIS) of (t<sub>1</sub>, t<sub>2</sub>, . . . , t<sub>n</sub>), that is, the largest possible k for which it is possible to choose an increasing sequence of indices 1 &le; a<sub>1</sub> &lt; a<sub>2</sub> &lt;. . . &lt; a<sub>k</sub> &le; n such that t<sub>a<sub>1</sub></sub> &lt; t<sub>a<sub>2</sub></sub> &lt; . . . &lt; t<sub>a<sub>k</sub></sub>.</p>

<p>Johnny wants to find a really long subsequence and that is why he decided to cheat a bit. He will first choose a non-empty interval of days and an integer d (&minus;x &le; d &le; x) and he will increase the temperature in each of those days by d. A small change like that probably will not be noticed by the community, while at the same time it should make the LIS longer. It is allowed to choose d = 0.</p>

<p>What is the largest possible length of the LIS after a change?</p>

### 입력

<p>The first line of the standard input contains two space-separated integers n and x (1 &le; n &le; 200 000, 0 &le; x &le; 10<sup>9</sup>), the number of days and the limit for the absolute value of d.</p>

<p>The second line contains n integers t<sub>1</sub>, t<sub>2</sub>, . . . , t<sub>n</sub> (1 &le; t<sub>i</sub> &le; 10<sup>9</sup>) separated by spaces, the sequence of historical temperatures.</p>

### 출력

<p>Print one integer, the largest possible length of the LIS after a single change.</p>