# [Platinum IV] Edge Weight Assignment - 30177

[문제 링크](https://www.acmicpc.net/problem/30177)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 39, 맞힌 사람: 34, 정답 비율: 77.273%

### 분류

수학, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 홀짝성

### 문제 설명

<p>You have unweighted tree of $n$ vertices. You have to assign a <strong>positive</strong> weight to each edge so that the following condition would hold:</p>

<ul>
	<li>For every two different leaves $v_{1}$ and $v_{2}$ of this tree, <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">bitwise XOR</a> of weights of all edges on the simple path between $v_{1}$ and $v_{2}$ has to be equal to $0$.</li>
</ul>

<p>Note that you can put <strong>very large</strong> positive integers (like $10^{(10^{10})}$).</p>

<p>It&#39;s guaranteed that such assignment always exists under given constraints. Now let&#39;s define $f$ as <strong>the number of distinct weights</strong> in assignment.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/cb6e6d43.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/cb6e6d43.png" data-original-src="https://upload.acmicpc.net/1699a631-897f-4838-8492-5ccdf4eccdf8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 330px; height: 119px;" /></p>

<p>In this example, assignment is valid, because bitwise XOR of all edge weights between every pair of leaves is $0$. $f$ value is $2$ here, because there are $2$ distinct edge weights($4$ and $5$).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/c6e02dda.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/c6e02dda.png" data-original-src="https://upload.acmicpc.net/98f40f86-d17c-4430-9a10-926e553ec1d3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 350px; height: 128px;" /></p>

<p>In this example, assignment is invalid, because bitwise XOR of all edge weights between vertex $1$ and vertex $6$ ($3, 4, 5, 4$) is not $0$.</p>

<p>What are the minimum and the maximum possible values of $f$ for the given tree? Find and print both.</p>

### 입력

<p>The first line contains integer $n$ ($3 \le n \le 10^{5}$) --- the number of vertices in given tree.</p>

<p>The $i$-th of the next $n-1$ lines contains two integers $a_{i}$ and $b_{i}$ ($1 \le a_{i} \lt b_{i} \le n$) --- it means there is an edge between $a_{i}$ and $b_{i}$. It is guaranteed that given graph forms tree of $n$ vertices.</p>

### 출력

<p>Print two integers --- the minimum and maximum possible value of $f$ can be made from valid assignment of given tree. Note that it&#39;s always possible to make an assignment under given constraints.</p>

### 힌트

<p>In the first example, possible assignments for each minimum and maximum are described in picture below. Of course, there are multiple possible assignments for each minimum and maximum.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/d69decbf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/d69decbf.png" data-original-src="https://upload.acmicpc.net/67e9e84c-c1a2-4227-b20a-d56b9238d6ca/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 327px; height: 260px;" /></p>

<p>In the second example, possible assignments for each minimum and maximum are described in picture below. The $f$ value of valid assignment of this tree is always $3$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/db14d3f2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/db14d3f2.png" data-original-src="https://upload.acmicpc.net/a66691d6-cf1b-439f-8cb3-b99570fbc17f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 264px; height: 123px;" /></p>

<p>In the third example, possible assignments for each minimum and maximum are described in picture below. Of course, there are multiple possible assignments for each minimum and maximum.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/17367f9b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30177.%E2%80%85Edge%E2%80%85Weight%E2%80%85Assignment/17367f9b.png" data-original-src="https://upload.acmicpc.net/1e4b4137-d4e4-4283-9622-b0815ed77430/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 679px; height: 260px;" /></p>