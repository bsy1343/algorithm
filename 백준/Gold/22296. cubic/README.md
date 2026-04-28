# [Gold I] cubic - 22296

[문제 링크](https://www.acmicpc.net/problem/22296)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 13, 맞힌 사람: 9, 정답 비율: 12.500%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 수학, 정수론

### 문제 설명

<p>Write a function <u><code>P7</code></u>:</p>

<ul>
	<li>input parameter: integers <code>a</code>, <code>b</code>, <code>c</code>, <code>d</code> satisfying $1\le\max(|$<code>a</code>$|,|$<code>b</code>$|,|$<code>c</code>$|,|$<code>d</code>$|)\le10^9$</li>
	<li>return value: a list of all rational roots of the equation <code>a</code>$x^3+$<code>b</code>$x^2+$<code>c</code>$x+$<code>d</code>$=0$, in any order (Each root should be included only once.)
	<ul>
		<li>Suppose that $[t_0,t_1,\cdots,t_{n-1}]$ is the exact answer and $[u_0,u_1,\cdots,u_{m-1}]$ is your output.</li>
		<li>Let $r(k)=\{i\in\mathbb Z:0\le i&lt;k\}=\{0,1,\cdots,k-1\}$ for every non-negative integer $k$.</li>
		<li>Your answer will be graded correct iff there exists a bijective function $\sigma\colon r(n)\to r(m)$ such that \[\frac{|u_{\sigma(i)}-t_i|}{\max(1,|t_i|)}\le10^{-6}\qquad\text{for all }i\in r(n)\]</li>
	</ul>
	</li>
	<li>Hint: The rational root theorem states the following:
	<ul>
		<li>Consider a polynomial function $f(x)=a_nx^n+a_{n-1}x^{n-1}+\cdots+a_0$ with integer coefficients where $a_n$ and $a_0$ are nonzero.</li>
		<li>If $\displaystyle f\left(\frac{p}{q}\right)=0$, where $|p|$ and $|q|$ are relatively prime positive integers, then $\displaystyle\frac{a_0}{p}$ and $\displaystyle\frac{a_n}{q}$ are integers.</li>
	</ul>
	</li>
</ul>

### 입력



### 출력

