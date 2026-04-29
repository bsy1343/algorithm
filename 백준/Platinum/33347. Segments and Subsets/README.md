# [Platinum III] Segments and Subsets - 33347

[문제 링크](https://www.acmicpc.net/problem/33347)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학, 스위핑, 스택, 자료 구조, 조합론, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider a collection of segments on a coordinate axis. The coordinates of endpoints are integers from $0$ to $x$.  There is no intersecting pair of segments: for any two segments, either one of them contains another, or they have at most one common point.</p>

<p>Your goal is to transform your collection of segments into just a single segment $[0, x]$. No other segments may remain. To achieve this, you can make moves. Each move has one of the following types:</p>

<ul>
	<li>Select two segments that have a single common point: the right endpoint of the left segment coincides with the left endpoint of the right segment. Merge them into one segment: from leftmost to rightmost point. This move does not cost anything.</li>
	<li>Select one segment. Expand it to the left or to the right by $1$ unit. This move costs $1$ coin.</li>
</ul>

<p>If, at some moment of time, there are two or more equal segments, only one of them remains, while the other disappear instantly.</p>

<p>For an initial collection of segments $S$, let $F(S)$ be the minimum number of coins needed to transform it into just a single segment $[0, x]$.</p>

<p>You are given a collection of $n$ segments. Consider all its $2^n - 1$ non-empty sub-collections, calculate $F$ for each of them, and find the sum of these values modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \le t \le 10^5$), the number of test cases. The test cases follow.</p>

<p>Each test case starts with a line containing two integers: the number of segments $n$ ($1 \le n \le 10^5$) and the coordinate $x$ ($1 \le x \le 10^9$). The next $n$ lines describe the segments. The $i$-th of these lines contains two integers $\ell_i$ and $r_i$: the endpoints of the $i$-th segment ($0 \le \ell_i &lt; r_i \le x$).</p>

<p>The sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print a line with a single integer: the required sum modulo $998\,244\,353$.</p>