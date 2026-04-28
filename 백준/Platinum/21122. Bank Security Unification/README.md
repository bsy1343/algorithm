# [Platinum II] Bank Security Unification - 21122

[문제 링크](https://www.acmicpc.net/problem/21122)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 26, 맞힌 사람: 25, 정답 비율: 49.020%

### 분류

비트마스킹, 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>The Bytelandian government has issued the <em>Bank Security Unification</em> law (or, shortly, the BSU law). The recent law regulates the usage of Wi-Fi routers in banks and other financial institutions.</p>

<p>According to the BSU law, all the $n$ Wi-Fi routers in a bank must be located in a straight line. Suppose that the $i$-th router operates at the frequency $f_i$. Denote the <em>security</em> of a connection between two adjacent routers as $f_{i}\,\, \&amp;\,\, f_{i+1}$, where $\&amp;$ is the bitwise AND operation.</p>

<p>A set of at least two routers numbered $1 \le i_1 &lt; i_2 &lt; \dots &lt; i_k \le n$ must be chosen as <em>active</em>. &nbsp;All other routers will be kept inactive so that they can replace the active ones if any of them would break. Denote the <em>security of the network</em> as the sum of the securities of all connections between adjacent active routers. In other words, the security of the network is calculated as $\sum\limits_{j=1}^{k-1} f_{i_j}\,\,\&amp;\,\,f_{i_{j+1}}$.</p>

<p>You are an employee of a large Bytelandian bank. Surely, the bank is obliged to comply with the BSU law. The routers are already placed in a line, and their placement cannot be changed. Now you want to choose some of the routers as active to maximize the security of the network.</p>

### 입력

<p>The first line contains an integer $n$, denoting the number of Wi-Fi routers in the bank ($2 \le n \le 10^6$).</p>

<p>The second line contains $n$ integers $f_1, f_2, \ldots, f_n$, where $f_i$ is the frequency of the $i$-th router in the line ($0 \le f_i \le 10^{12}$).</p>

### 출력

<p>Print the maximum possible security of the network.</p>