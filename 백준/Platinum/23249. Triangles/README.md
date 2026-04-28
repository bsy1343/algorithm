# [Platinum I] Triangles - 23249

[문제 링크](https://www.acmicpc.net/problem/23249)

### 성능 요약

시간 제한: 1.2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 370, 정답: 126, 맞힌 사람: 83, 정답 비율: 31.321%

### 분류

정렬, 기하학, 스위핑, 각도 정렬

### 문제 설명

<p>A triangle is a simple polygon having exactly three distinct corners that are not collinear. For any set $S$ of points in the plane, any triangle is said to have a conflict to $S$ if there is at least one point contained both in $S$ and in the interior of the triangle, excluding its boundary, simultaneously.</p>

<p>Now, the set $S$ is given to be a set of $n$ points in the plane, no three of which are collinear, and let $T$ be the set of all triangles whose corners are chosen from the set $S$. How many of those in $T$ do have a conflict to $S$?</p>

<p>Write a program that outputs the number of triangles in $T$&nbsp;that have a conflict to $S$.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing an integer $n$ ($3 \le n \le 500$), where $n$ is the number of points in the set $S$. Each of the following $n$ lines consists of two integers, each between $-10^6$ and $10^6$, representing the coordinates of each point in the set $S$. It is guaranteed that no three points in the set $S$ are collinear.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain an integer that represents the number of triangles whose corners are chosen from the set $S$ and that have a conflict to the set $S$.</p>