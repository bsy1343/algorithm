# [Gold V] base2i - 22293

[문제 링크](https://www.acmicpc.net/problem/22293)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 44, 맞힌 사람: 22, 정답 비율: 34.921%

### 분류

수학, 정수론

### 문제 설명

<p>Write a function <u><code>P4</code></u>:</p>

<ul>
	<li>Mr. Park ($(1+6i)$ years old) has two eyes, so he loves $2i$. He wants to advertise the base $2i$ system.</li>
	<li>In the base $2i$ system, each complex number has the following representation: \[\cdots d_2d_1d_0.d_{-1}d_{-2}\cdots\] which means \[\cdots+d_2\cdot b^2+d_1\cdot b^1+d_0\cdot b^0+d_{-1}\cdot b^{-1}+d_{-2}\cdot b^{-2}+\cdots\] where $b=2i$, and $d_k\in\{0,1,2,3\}$ for each $k$.</li>
	<li>input parameter: two integers <code>x</code>, <code>y</code> satisfying $\max(|$<code>x</code>$|$,$|$<code>y</code>$|)\le10^6$</li>
	<li>return value: the string representing the complex number <code>x</code>$+i$<code>y</code>&nbsp;in the base $2i$ system, satisfying the followings:
	<ul>
		<li>Each character in the string is one of&nbsp;&#39;<code>0</code>&#39;, &#39;<code>1</code>&#39;, &#39;<code>2</code>&#39;, &#39;<code>3</code>&#39;, &#39;<code>.</code>&#39;.</li>
		<li>The string contains exactly one &#39;<code>.</code>&#39;.</li>
		<li>There is exactly one character after &#39;<code>.</code>&#39;.</li>
		<li>The string does not start with &#39;<code>.</code>&#39;.</li>
		<li>The string does not start with &#39;<code>0</code>&#39; if there are more than one character before &#39;<code>.</code>&#39;.</li>
	</ul>
	</li>
	<li>For example, <code>31.0</code>&nbsp;is the base $2i$ representation of $1+6i$ since $1+6i=3\cdot(2i)^1+1\cdot(2i)^0+0\cdot(2i)^{-1}$</li>
</ul>

### 입력



### 출력

