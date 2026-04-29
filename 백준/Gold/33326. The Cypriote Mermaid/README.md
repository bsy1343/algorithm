# [Gold III] The Cypriote Mermaid - 33326

[문제 링크](https://www.acmicpc.net/problem/33326)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

모듈로 곱셈 역원, 수학, 정수론, 조합론

### 문제 설명

<p>Every summer Stelinuța goes to Cyprus for an 11-day programming camp, and while being there, she loves to go swimming and snorkeling in the sea.</p>

<p>One day, when she was snorkeling, she found a very interesting pearl necklace: a straight (non-cyclic) thread with pearls on it. Originally, all the pearls had to be either black or white. However, some pearls were so damaged that she couldn't even distinguish their original color.</p>

<p>From that, Stelinuța came up with an idea: imagine that you can remove any two adjacent pearls that have the same color from the necklace. She is curious to know in how many different ways the original necklace could have looked so that, after applying that operation any number of times, she could end up with an empty necklace. As the answer may be very large, it is sufficient to find it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains a string containing "<code>1</code>", "<code>0</code>" and "<code>?</code>" describing the necklace Stelinuța found. Each pearl is represented as follows:</p>

<ul>
	<li>"<code>1</code>": the pearl is black,</li>
	<li>"<code>0</code>": the pearl is white,</li>
	<li>"<code>?</code>": the original color is unknown.</li>
</ul>

<p>The length of the string will be at least $1$ and at most $2 \cdot 10^{5}$.</p>

### 출력

<p>Output a single integer: the number of different ways the necklace could have looked like modulo $998\,244\,353$.</p>

### 힌트

<p>In the given example, the only way the necklace could have looked like is "<code>011110</code>". We can remove "<code>11</code>" twice, and then remove the remaining "<code>00</code>" to get an empty necklace.</p>

<p>For all the remaining assignments, there is no way to remove all the pearls by repeatedly removing two adjacent pearls of the same color.</p>