# [Gold II] Rabbit Game Playing - 22592

[문제 링크](https://www.acmicpc.net/problem/22592)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

이분 탐색, 조합론, 다이나믹 프로그래밍, 수학, 정렬

### 문제 설명

<p>Honestly, a rabbit does not matter.</p>

<p>There is a rabbit playing a stage system action game. In this game, every stage has a difficulty level. The rabbit, which always needs challenges, basically wants to play more difficult stages than he has ever played. However, he sometimes needs rest too. So, to compromise, he admitted to play T or less levels easier stages than the preceding one.</p>

<p>How many ways are there to play all the stages at once, while honoring the convention above? Maybe the answer will be a large number. So, let me know the answer modulo 1, 000, 000, 007.</p>

### 입력

<p>The first line of input contains two integers N and T (1 &le; N &le; 100, 000, 1 &le; T &le; 100, 000). N is the number of stages, and T is the compromise level.</p>

<p>The following N lines describe the difficulty levels of each stage. The i-th line contains one integer D<sub>i</sub> (1 &le; D<sub>i</sub> &le; 100, 000), which is the difficulty level of the i-th stage.</p>

### 출력

<p>Calculate how many ways to play all the stages at once there are. Print the answer modulo 1, 000, 000, 007 in a line.</p>