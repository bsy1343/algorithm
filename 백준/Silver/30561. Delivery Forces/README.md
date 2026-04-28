# [Silver III] Delivery Forces - 30561

[문제 링크](https://www.acmicpc.net/problem/30561)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 53, 맞힌 사람: 46, 정답 비율: 75.410%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Gry finally becomes the Executive Courier Officer in &quot;Universe Express&quot;. He has $n$ subordinate couriers with some delivery strength $f_i$. The delivery strength of a team of three people is the median of their strength, i.e., the middle element after the sorting. Please help Gry to split the couriers into $k$ teams of three people in order to maximize the total delivery strength of &quot;Universe Express&quot;. The total strength is the sum of the strength of these $k$ teams.</p>

### 입력

<ul>
	<li>One line containing the number of couriers in the company, $n$ ($1 \leq n \leq 10^6$), where $n$ is a multiple of $3$.</li>
	<li>One line containing the strengths of the $n$ couriers $f_1$ $\ldots$ $f_n$ ($1 \le f \le 10^6$).</li>
</ul>

### 출력

<p>The sole line of the output should contain the maximal strength of &quot;Universe Express&quot;.</p>