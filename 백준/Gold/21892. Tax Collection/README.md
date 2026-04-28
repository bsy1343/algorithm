# [Gold V] Tax Collection - 21892

[문제 링크](https://www.acmicpc.net/problem/21892)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>Byteland is a rectangle of $n\times m$, divided into $n\cdot m$ square provinces. Recently in Byteland tax reform was carried out, as a result of which the number $a[i, j]$ was fixed for each province. If $a[i, j] &gt; 0$, then the province in the square $(i, j)$ must pay $a[i, j]$ bytecoins every month to the budget. If $a[i, j] &lt; 0$, then the province $(i, j)$ is subsidized and receives $-a[i, j]$ bytecoins from the budget.</p>

<p>To collect taxes, the government has developed the following scheme. In one of the provinces a treasury will be built. Every month a tax collector will leave this building. He will go round all the provinces, collecting taxes and giving out subsidies, and then going back to the treasury. His path must satisfy the following properties:</p>

<ul>
	<li>the path must begin in the province in which the treasury is located,</li>
	<li>the path must end in a province that has a common side with the province in which the treasury is located,</li>
	<li>each province should be visited <strong>exactly</strong> once,</li>
	<li>neighboring provinces along the path should have a common side.</li>
</ul>

<p>The government wants to choose a province for the treasury and a path for the collector in such a way that for each subsidized province the collector can give them the right amount of money from the previously collected. Help them build such a path or say that it is impossible.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- the size of Byteland ($2 \le n, m \le 300$).</p>

<p>Each of next $n$ rows consists of $m$ integers $a[i, j]$. These lines describe the provinces: $a[i, j]$ is the value by which the number of bytecoins owned by the collector will change when visiting the province located at $(i, j)$ ($1 \le |a[i, j]| \le 10\,000$).</p>

### 출력

<p>If solution exists, output $n \cdot m$ pairs of numbers, the coordinates of the provinces that the collector should visit in the order in which he should visit them. If there is no solution, output $-1$ .</p>

### 힌트

<p>Path for the first example:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21892.%E2%80%85Tax%E2%80%85Collection/dced899f.png" data-original-src="https://upload.acmicpc.net/6bf6104e-3069-4be1-8564-f9cfad0dc2e0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 97px; height: 66px;" /></p>

<p>Sum of bytecoins that collector has after each province: 4, 6, 9, 4, 5, 2.&nbsp;</p>

<p>Path for the second example:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21892.%E2%80%85Tax%E2%80%85Collection/8df7e4a0.png" data-original-src="https://upload.acmicpc.net/81b7e791-a42f-4969-9a59-ab770b51ec09/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 126px; height: 127px;" /></p>

<p>Sum of bytecoins that collector has after each province: 2, 7, 2, 3, 4, 8, 0, 6, 7, 4, 2, 5, 6, 4, 5, 2.</p>