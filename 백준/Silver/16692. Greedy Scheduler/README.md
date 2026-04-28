# [Silver IV] Greedy Scheduler - 16692

[문제 링크](https://www.acmicpc.net/problem/16692)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB (추가 메모리 없음)

### 통계

제출: 318, 정답: 232, 맞힌 사람: 196, 정답 비율: 74.242%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>A store has n cashiers numbered sequentially from 1 to n, with c customers in a queue. A customer at the front of the queue is constantly assigned to the first unoccupied cashier, i.e., cashier with the smallest number. The ith customer&rsquo;s shopping cart takes t<sub>i</sub> seconds to process.</p>

<p>Find which cashier will process each customer&rsquo;s shopping cart.</p>

### 입력

<p>The first line of input contains two space-separated integers n and c (1 &le; n &le; c &le; 1000). The second line of input contains c space-separated integers t<sub>1</sub>, . . . , t<sub>c</sub> (1 &le; t<sub>i</sub> &le; 1,000), representing the length of time required to handle that customer.</p>

### 출력

<p>Output a single line containing c space-separated integers, each with the cashier number that handles that customer.</p>