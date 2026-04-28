# [Platinum II] Apprentice Learning Trajectory - 19218

[문제 링크](https://www.acmicpc.net/problem/19218)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 44, 맞힌 사람: 33, 정답 비율: 33.000%

### 분류

구현, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Abigail is an apprentice studying to become a blacksmith. She wants to plan her learning trajectory and make as many swords as possible on her way to becoming a famous expert.</p>

<p>There are $n$ masters willing to host her as their apprentice. The $i$-th master will start working at the minute $a_i$ and end working at the minute $b_i$, working for a total of $b_i - a_i$ minutes. During this interval of time, Abigail can work at this master&#39;s forge. She can enter and leave the forge several times and produce one or several swords upon each arrival. However, in order to produce a sword under supervision of the $i$-th master she has to work there for $t_i$ minutes in a row. She can&#39;t leave the sword unfinished and continue working on it upon her next arrival to this forge.</p>

<p>Help Abigail make an optimal plan and calculate the maximum number of swords she can produce under the supervision of $n$ masters.</p>

### 입력

<p>The first line contains integer $n$ ($1 \le n \le 200\,000$) --- the number of masters.</p>

<p>Each of the next $n$ lines contains three integers $a_i, b_i, t_i$ ($1 \le a_i &lt; a_i + t_i \le b_i \le 10^{18}$) --- the start and the end time of master&#39;s work, and the time needed to make one sword in their forge.</p>

### 출력

<p>Output the maximum number of swords Abigail can produce using the optimal learning trajectory.</p>