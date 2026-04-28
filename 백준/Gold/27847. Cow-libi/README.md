# [Gold V] Cow-libi - 27847

[문제 링크](https://www.acmicpc.net/problem/27847)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 502, 정답: 129, 맞힌 사람: 120, 정답 비율: 29.484%

### 분류

기하학, 이분 탐색

### 문제 설명

<p>Somebody has been grazing in Farmer John&#39;s $(1 \le G \le 10^5)$ private gardens! Using his expert forensic knowledge, FJ has been able to determine the precise time each garden was grazed. He has also determined that there was a single cow that was responsible for every grazing incident.</p>

<p>In response to these crimes each of FJ&#39;s $N$ $(1 \le N \le 10^5)$ cows have provided an alibi that proves the cow was in a specific location at a specific time. Help FJ test whether each of these alibis demonstrates the cow&#39;s innocence.</p>

<p>A cow can be determined to be innocent if it is impossible for her to have travelled between all of the grazings and her alibi. Cows travel at a rate of 1 unit distance per unit time.</p>

### 입력

<p>The first line of input will contain $G$ and $N$ separated by a space.</p>

<p>The next $G$ lines contain the integers $x$, $y$, and $t$ $(-10^9 \le x, y \le 10^9; 0 \le t \le 10^9)$ separated by a space describing the location and time of the grazing. It will always be possible for a single cow to travel between all grazings.</p>

<p>The next $N$ lines contain $x$, $y$, and $t$ $(-10^9 \le x, y \le 10^9; 0 \le t \le 10^9)$ separated by a space describing the location and time of each cow&#39;s alibi.</p>

### 출력

<p>Output a single integer: the number of cows with alibis that prove their innocence.</p>