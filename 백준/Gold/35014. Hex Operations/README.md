# [Gold I] Hex Operations - 35014

[문제 링크](https://www.acmicpc.net/problem/35014)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

구현, 수학

### 문제 설명

<p>In this problem, a <em>hex</em> is a six-sided board consisting of <em>cells</em>: small regular hexagons. A hex of size $n$ has $n$ cells on each side. Each cell contains an integer.</p>

<p>Consider the following operations with a hex:</p>

<ul>
<li>"<code>T</code>": reflect the hex over its vertical symmetry axis,</li>
<li>"<code>R</code>": rotate the hex 60 degrees clockwise,</li>
<li>"<code>L</code>": rotate the hex 60 degrees counter-clockwise.</li>
</ul>

<p>Here is an example of a hex of size $n = 3$ and operations with it:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35014.%E2%80%85Hex%E2%80%85Operations/cd9449d0.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35014-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 611px; height: 113px;"></p>

<p>You are given a hex and a sequence of operations. Perform all the given operations in order and print the resulting hex.</p>

### 입력

<p>The first line contains an integer $n$, the size of the hex ($2 \le n \le 500$). The next $2 n - 1$ lines contain integers from $1$ to $99$ initially contained in the cells of the hex. Each line contains space-separated integers: exactly as many as the number of cells in the corresponding row of the hex. Additionally, for ease of reading, these lines may contain additional spaces before all numbers, between consecutive numbers, and after all numbers.</p>

<p>The last line is the sequence of operations. It has a length from $1$ to $250\,000$ characters and consists of letters "<code>T</code>", "<code>R</code>" and "<code>L</code>".</p>

<p>The total size of the input, including spaces and line breaks, does not exceed $2^{23}$ bytes.</p>

### 출력

<p>Print the hex after performing all operations: $2 n - 1$ lines containing integers. Each line should contain several space-separated integers: exactly as many as the number of cells in the corresponding row of the hex. Additionally, for ease of reading, these lines may contain additional spaces before all numbers, between consecutive numbers, and after all numbers.</p>

<p>The total size of the output, including spaces and line breaks, should not exceed $2^{23}$ bytes.</p>