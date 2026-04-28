# [Platinum IV] Miner - 21104

[문제 링크](https://www.acmicpc.net/problem/21104)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 69, 정답: 30, 맞힌 사람: 29, 정답 비율: 48.333%

### 분류

조합론, 자료 구조, 수학, 스위핑, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>There are $n$ different minerals in a mine cave. The mine cave can be regarded as a coordinate axis, and the $i$-th mineral can be mined from any position in range $[l_i, r_i]$.</p>

<p>You are a miner in this mine cave. On each day, the foreman gives you a task of mining minerals. A task is a non-empty set of different minerals (there are $2^n - 1$ different tasks), and your goal is to collect all minerals in this set.</p>

<p>There are $m$ safe positions $a_i$ in the mine cave. A task is <em>easy</em> if and only if you can select a safe position $a_p$ and find all required minerals there.</p>

<p>Now, you want to count the number of easy tasks.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \le n, m \le 10^5$).</p>

<p>Then $n$ lines follow. Each of them contains two integers $l_i$ and $r_i$ ($1 \le l_i \le r_i \le 10^9$).</p>

<p>Then $m$ lines follow. Each of them contains a single integer $a_i$ ($1 \le a_i \le 10^9$).</p>

### 출력

<p>Output a single line with a single integer: the number of easy tasks modulo $998\,244\,353$.</p>