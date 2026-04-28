# [Platinum III] Cramming for Finals - 31509

[문제 링크](https://www.acmicpc.net/problem/31509)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 58, 정답: 20, 맞힌 사람: 20, 정답 비율: 41.667%

### 분류

정렬, 기하학, 스위핑, 두 포인터

### 문제 설명

<p>It&#39;s final exam season and Ashley is heading to her favorite library to cram for finals.</p>

<p>The library has a dedicated floor for studying where there are $r$ rows of $c$ tables evenly spaced. Each table only has room for one student, and some students have already arrived and claimed their favorite tables.</p>

<p>Because the floor is usually very quiet, it is possible to hear sounds from other students who are nearby -- for example, frustrated typing on a laptop keyboard or nervous leg shaking. Specifically, if one student is studying at the table in row $i_1$ and column $j_1$, and another student is studying at the table in row $i_2$ and column $j_2$, it is possible for the two students to hear sounds from each other if and only if $\sqrt{(i_1 - i_2)^2 + (j_1 - j_2)^2} \le d$.</p>

<p>With this, Ashley wants to find an empty table where she can hear as few other students as possible. Compute the minimum number of students that Ashley can hear if she selects her table optimally.</p>

### 입력

<p>The first line of input has four integers $r$, $c$ ($2 \leq r, c \leq 10^9$), $d$ ($1 \leq d \leq 2\, 500$), and $n$ ($1 \leq n \leq 10^3$ and $n \leq r \cdot c - 1$).</p>

<p>Each of the next $n$ lines contains two integers $i$ ($1 \le i \le r$) and $j$ ($1 \le j \le c$), indicating that a student is studying at the table at row $i$ and column $j$. It is guaranteed that no two students are sitting at the same table.</p>

### 출력

<p>Output a single integer, which is the minimum number of students that Ashley can hear if she selects her table optimally.</p>