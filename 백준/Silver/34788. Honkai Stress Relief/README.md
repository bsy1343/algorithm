# [Silver V] Honkai Stress Relief - 34788

[문제 링크](https://www.acmicpc.net/problem/34788)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 55, 정답: 37, 맞힌 사람: 32, 정답 비율: 68.085%

### 분류

수학, 조합론, 확률론

### 문제 설명

<p>Audrey, having finally finished her last exam, decided to lie in bed and open her favorite video game - Honkai: Star Rail.</p>

<p>Over each of the next $n$ days, Audrey has decided to carve out a block of time where she will play Honkai: Star Rail. This block of time may vary from day to day. Formally, if Audrey has carved out the interval $(s, e)$ to play Honkai: Star Rail, she is considered to be playing at all times $t$ where $s &lt; t &lt; e$.</p>

<p>Audrey's smartwatch tracks her stress level by doing a single check each day. If Audrey is playing Honkai: Star Rail at the instant in time when her smartwatch decides to perform a check, her smartwatch will report that she is relaxed. Otherwise, it will report that she is stressed. Audrey  has configured her smartwatch to perform the check at some point within the time interval from $(a, b)$ each day. Formally, Audrey's smartwatch picks a value $t_0$ uniformly at random from all real values such that $a &lt; t_0 &lt; b$. If $s &lt; t_0 &lt; e$, then the watch will report that Audrey is relaxed, otherwise it will report that Audrey is stressed. The value of $t_0$ is independent across different days, but the values of $a$ and $b$ are the same over all days.</p>

<p>Audrey does not want her smartwatch to report that she is stressed. Compute the probability that there is at least one day where Audrey's smartwatch reports that she is stressed.</p>

### 입력

<p>The first line of input contains three integers, $n$, $a$, and $b$ ($1 \le n \le 20$, $1 \le a &lt; b \le 50$).</p>

<p>Each of the next $n$ lines contains two integers, $s$ and $e$ $(1 \le s &lt; e \le 50)$, indicating that Audrey will play Honkai: Star Rail from time $s$ to time $e$ exclusive on that day. </p>

### 출력

<p>Output a single number, the probability that there is at least one day where Audrey's smartwatch reports that she is stressed. Your answer will be accepted if the absolute or relative error is within $10^{-6}$ of the judge's answer.</p>