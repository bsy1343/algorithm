# [Platinum III] Supervision - 35322

[문제 링크](https://www.acmicpc.net/problem/35322)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

느리게 갱신되는 세그먼트 트리, 다이나믹 프로그래밍, 세그먼트 트리, 수학, 자료 구조, 조합론

### 문제 설명

<p>There are $N$ ($1\le N \leq 10^6$) cows in cow camp, labeled $1\dots N$. Each cow is either a camper or a coach.</p>

<p>A nonempty subset of the cows will be selected to attend a field trip. If the $i$th cow is selected, the cow will move to position $p_i$ ($0\le p_i \leq 10^9$) on a number line, where the array $p$ is strictly increasing.</p>

<p>A nonempty subset of the cows is called "good" if for every selected camper, there is a selected coach within $D$ units to the left, inclusive ($0\le D\le 10^9$). How many good subsets are there, modulo $10^9+7$?</p>

### 입력

<p>The first line contains two integers $N$ and $D$.</p>

<p>The next $N$ lines each contain two integers $p_i$ and $o_i$. $p_i$ denotes the position the $i$th cow will move to. $o_i=1$ means the $i$th cow is a coach, whereas $o_i=0$ means the $i$th cow is a camper.</p>

<p>It is guaranteed that the $p_i$ are given in strictly increasing order.</p>

### 출력

<p>Output the number of good subsets modulo $10^9 + 7$.</p>