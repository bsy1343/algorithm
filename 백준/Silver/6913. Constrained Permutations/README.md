# [Silver II] Constrained Permutations - 6913

[문제 링크](https://www.acmicpc.net/problem/6913)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 43, 맞힌 사람: 33, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>A <em>permutation</em> on the numbers $1, 2, \dots, n$ is a linear ordering of the numbers. For example, there are $6$ permutations of the numbers $1, 2, 3$. They are $123$, $132$, $213$, $231$, $312$ and $321$. Another way to think of it is removing $n$ disks numbered $1$ to $n$ from a bag (without replacement) and recording the order in which they were drawn out.</p>

<p>Mathematicians (and other smart people) write down that there are $n! = n \times (n-1) \dots 3 \times 2 \times 1$ permutations of the numbers $1, \dots, n$. We call this &quot;$n$ factorial.&quot;</p>

<p>For this problem, you will be given an integer $n$ $(1 \le n \le 9)$ and a series of $k$ $(k \ge 0)$ constraints on the ordering of the numbers. That is, you will be given $k$ pairs $(x,y)$ indicating that $x$ must come before $y$ in the permutation.</p>

<p>You are to output the number of permutations which satisfy all constraints.</p>

### 입력

<p>Your input will be $k + 2$ lines. The first line will contain the number $n$. The second line will contain the integer $k$, indicating the number of constraints. The remaining $k$ lines will be pairs of distinct integers which are in the range $1, \dots, n$.</p>

### 출력

<p>Your output will be one integer, indicating the number of permutations of $1, \dots, n$ which satisfy the $k$ constraints.</p>