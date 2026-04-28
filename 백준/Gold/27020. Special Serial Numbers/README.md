# [Gold IV] Special Serial Numbers - 27020

[문제 링크](https://www.acmicpc.net/problem/27020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 11, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

그리디 알고리즘

### 문제 설명

<p>Each newborn calf on Farmer John&#39;s farm receives a brand new N-digit (1 &le; N &le; 100) serial number, a positive integer larger than any other cow&#39;s serial number on the farm.  Obviously, the larger the serial number, the younger the cow.</p>

<p>Each cow becomes very fond of her number and often boasts about it. The cows are especially proud of serial numbers in which more than half (not just half!) of the digits are the same.  For example, in the number 23522, the digit 2 appears in 3 out of the 5 digit places; the number 12342, though, has no digit that appears as a strict majority. Cows with serial numbers that contain a single majority digit are called &#39;special&#39;; the rest of the cows are &#39;ordinary&#39;.</p>

<p>Naturally, ordinary cows are quite envious of special cows.  Sometimes in the past, they have even resorted to bullying special cows.  Of course, given the growth rate of cows, a cow can only bully cows that are younger than it. In fact, an ordinary cow will bully the oldest special cow younger than she is.  Unfortunately, cows have a tough time figuring out which cow that would be. Given a cow&#39;s serial number, determine which special cow she should bully. If the cow is already special, then output her own serial number.</p>

### 입력

<ul>
	<li>Line 1: The serial number of the cow that might be a bully</li>
</ul>

### 출력

<ul>
	<li>Line 1: An integer that is the serial number of the cow that the cow might bully.</li>
</ul>