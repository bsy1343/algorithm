# [Bronze II] Sum Game - 14686

[문제 링크](https://www.acmicpc.net/problem/14686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 515, 정답: 385, 맞힌 사람: 326, 정답 비율: 74.260%

### 분류

수학, 구현, 누적 합, 사칙연산

### 문제 설명

<p>Annie has two favourite baseball teams: the Swifts and the Semaphores. She has followed them throughout the season, which is now over. The season lasted for N days. Both teams played exactly one game on each day.</p>

<p>For each day, Annie recorded the number of runs scored by the Swifts on that day. She also recorded this information for the Semaphores.</p>

<p>She would like you to determine the largest integer K such that K &le; N and the Swifts and the Semaphores had scored the same total number of runs K days after the start of the season. The total number of runs scored by a team after K days is the sum of the number of runs scored by the team in all games before or on the K-th day.</p>

<p>For example, if the Swifts and the Semaphores have the same total number of runs at the end of the season, then you should output N. If the Swifts and the Semaphores never had the same number of runs after K games, for any value of K &le; N, then output 0.</p>

### 입력

<p>The first line of input will contain an integer N (1 &le; N &le; 100 000). The second line will contain N space-separated non-negative integers representing the number of runs scored by the Swifts on each day, in order. The third line will contain N space-separated non-negative integers representing the number of runs scored by the Semaphores on each day, in order. You may assume that each team scored at most 20 runs in any single game.</p>

<p>For 7 of the 15 points available, N &le; 1000.</p>

### 출력

<p>Output the largest integer K such that K &le; N and the Swifts and the Semaphores have the same total number of runs after K days.</p>

### 힌트

<p>Explanation for Output for Sample Input 1</p>

<p>After 2 days, each team had scored a total of 4 runs.</p>

<p>Explanation for Output for Sample Input 2</p>

<p>The only time when the Swifts and the Semaphores had scored the same number of runs was the beginning of the season.</p>

<p>Explanation for Output for Sample Input 3</p>

<p>The Swifts and Semaphores have the same number of total runs after the first game, and after the third game, and after the fourth game. We take the largest of these values (1, 3 and 4) and output 4.</p>