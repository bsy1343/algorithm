# [Platinum II] Circle - 21097

[문제 링크](https://www.acmicpc.net/problem/21097)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 12, 맞힌 사람: 9, 정답 비율: 27.273%

### 분류

많은 조건 분기, 기하학, 선분 교차 판정, 수학, 삼분 탐색

### 문제 설명

<p>There are two points $A$ and $B$ and an obstacle circle $O$ on a Cartesian plane.</p>

<p>Now, you need to choose a point $C$ on the boundary of $O$ and then move both points $A$ and $B$ to point $C$. While moving, the path of either point $A$ or $B$ can only go outside circle $O$ or touch its boundary.</p>

<p>Your goal is to minimize the total moving distance, that is, the sum of the moving distances of $A$ and $B$.</p>

### 입력

<p>The first line contains a single integer $t\ (1 \le t \le 10^5)$, the number of test cases.</p>

<p>Each test case is given on a single line and contains seven integers $x_1, y_1, x_2, y_2, x_3, y_3, r$, where $-10^3 \le x_1, y_1, x_2, y_2, x_3, y_3 \le 10^3$ and $1 \le r \le 10^3$. Here, $A = (x_1, y_1)$, $B = (x_2, y_2)$, and $O$ is a circle centered at $(x_3, y_3)$ with radius $r$. It is guaranteed that neither $A$ nor $B$ is strictly inside $O$.</p>

### 출력

<p>For each test case, output a single line with a single real number: the answer rounded to the third decimal place. It is guaranteed that the fourth decimal place is neither $4$ nor $5$.</p>