# [Platinum III] Patrick's Triangle - 25269

[문제 링크](https://www.acmicpc.net/problem/25269)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

수학, 정수론, 모듈로 곱셈 역원

### 문제 설명

<p>Patrick is an unknown mathematician that wanted to become famous. Patrick had heard that the mathematician Blaise Pascal had became famous because of his triangle, Pascal&#39;s triangle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/09725154.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/09725154.png" data-original-src="https://upload.acmicpc.net/8b7ddf74-133f-4d64-8830-11e81819dbd2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 208px; height: 135px;" /></p>

<p>Patrick thought that if he could come up with his own triangle, Patrick&#39;s triangle, then he maybe too would become famous. After thinking about it for a long while, he came up with the following construction:</p>

<ol>
	<li>Along both the left side and right side of the triangle put the triangle numbers $1,3,6,10,15,21,\ldots$</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/498d74f3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/498d74f3.png" data-original-src="https://upload.acmicpc.net/819f7a02-0f37-40f9-8c4c-9e2bd0e38362/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 239px; height: 137px;" /></p>

<ol start="2">
	<li>Fill in the inside of the triangle by adding the number above and to the left with the number above and to the right, in the same way as Pascal&#39;s triangle is constructed.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/cc2c6442.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/cc2c6442.png" data-original-src="https://upload.acmicpc.net/94d6e2d6-f958-4c84-8f3d-9336f37cfcfb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 278px; height: 137px;" /></p>

<p>Patrick knew that in order for his triangle to make him famous, he needed to make sure no one else had invented it before him. So he searched through the On-Line Encyclopedia of Integer Sequences (OEIS.org), and luckily his triangle was missing from OEIS. </p>

<p>Now there was just one thing left to do, to upload his triangle to OEIS and become famous. To do this, Patrick calculated the first $10^6$ rows of the triangle by hand. But before he uploaded his triangle to OEIS, he wanted to make sure there were no errors in his calculations. Can you help him check his calculations?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/7b286459.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25269.%E2%80%85Patrick's%E2%80%85Triangle/7b286459.png" data-original-src="https://upload.acmicpc.net/581e0adb-d852-4d1e-a476-23f312f19d61/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 303px; height: 250px;" /></p>

<p style="text-align: center;">The first 6 triangle numbers. Wikimedia Commons, CC BY-SA 3.0.</p>

### 입력

<p>The first line consists of one integer $Q$ ($1 \leq Q \leq 2 \cdot 10^5$), the number of queries. The next $Q$ lines consist of three space separated integers $N,K,X$ ($1 \leq K \leq N \leq 10^6$, $0 \leq X &lt; 10^9+7$), where $X$ is the value Patrick got when he calculated the $K$-th number on the $N$-th row in Patrick&#39;s triangle mod $10^9 + 7$. Patrick wants to know if $X$ is correct or not.</p>

### 출력

<p>For each of the $Q$ queries, output a single line with the string <code>Correct</code> if the $K$-th number on the $N$-th row in Patrick&#39;s triangle is equal to $X$ mod $10^9 + 7$, otherwise output the string <code>Incorrect</code>.</p>