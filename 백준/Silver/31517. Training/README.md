# [Silver V] Training - 31517

[문제 링크](https://www.acmicpc.net/problem/31517)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 137, 정답: 84, 맞힌 사람: 78, 정답 비율: 64.463%

### 분류

그리디 알고리즘

### 문제 설명

<p>Ashley is training for a programming contest on Brandon&#39;s Online Judge. Brandon&#39;s Online Judge has a new feature which allows Ashley&#39;s coach, Tom, to load a list of problems for Ashley.</p>

<p>Tom has curated some problems for Ashley to work on. Each problem has two integers as a lower skill bound and an upper skill bound. Each programmer has an integer skill level. If someone with a skill level between the lower and upper bounds of a problem (inclusive), and they solve that problem, then his/her skill level goes up by $1$.</p>

<p>Ashley will train on Tom&#39;s curated list of problems as follows -- she will look at the first problem on the list and either solve it or skip it. She will repeat this for every problem on the list in the order Tom loaded the problems. Once she has skipped a problem, she can never go back to it.</p>

<p>Compute the maximum skill level Ashley can have if she chooses to solve or skip problems optimally.</p>

### 입력

<p>The first line contains two integers $n$ and $s$ $(1 \le n \le 10^5, 0 \le s \le 10^9)$, where $n$ is the number of problems Tom has curated for Ashley, and $s$ is Ashley&#39;s current skill level.</p>

<p>Each of the next $n$ lines contains two integers $l$ and $r$ $(0 \le l \le r \le 2 \cdot 10^9)$. These are the lower ($l$) and upper ($r$) skill bounds on each of Tom&#39;s problems, in the order that Tom loaded them.</p>

### 출력

<p>Output a single integer, which is the maximum skill level Ashley can attain.</p>