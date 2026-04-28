# [Platinum V] GPA - 21101

[문제 링크](https://www.acmicpc.net/problem/21101)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 115, 정답: 45, 맞힌 사람: 44, 정답 비율: 38.596%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In this semester, Alice took $n$ courses. Now, she has finished all the final exams. And she will get her grades in the following $n$ days.</p>

<p>On the $i$-th day, Alice will know her grade $A_i$ of the $i$-th course. If $A_i$ is strictly less than the average grade of the first $i - 1$ courses, Alice will be sad on that day.</p>

<p>Now Bob is hacking into the university&#39;s database. Bob can choose a set $S$ of courses ($S$ can be empty). And then for each course $i$ in $S$, he can change Alice&#39;s grade from $A_i$ to $B_i$.</p>

<p>Bob wants to minimize the number of days when Alice will be sad. Now you need to help him to decide which courses&#39; grades he should modify.</p>

<p>Note that Alice will always be happy on the first day.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 4000$).</p>

<p>Then $n$ lines follow. The $i$-th of these lines contains two integers, $A_i$ and $B_i$ ($0 \le A_i, B_i \le 400$).</p>

### 출력

<p>Output the minimum number of days when Alice will be sad.</p>