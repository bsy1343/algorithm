# [Gold III] 수열의 비밀 (Hard) - 32286

[문제 링크](https://www.acmicpc.net/problem/32286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 196, 정답: 89, 맞힌 사람: 77, 정답 비율: 50.658%

### 분류

수학, 정수론

### 문제 설명

<p>다음 조건을 만족하는 길이가 $n$인 수열 $a_1, a_2, a_3, \ldots, a_n$가 있다.</p>

<ul>
	<li>$a_{2i} = p \cdot a_i + q$ $(2 \leq 2i \leq n)$ </li>
	<li>$a_{2i+1} = r \cdot a_{i} + s$ $(3 \leq 2i+1 \leq n)$</li>
</ul>

<p>$S_n=a_1+a_2+\ldots +a_{n}$으로 정의할 때 $S_n$을 ${10^9+7}$로 나눈 나머지를 출력하라.</p>

### 입력

<p>첫 번째 줄에 양의 정수 $k$가 주어진다. $(n=2^k-1)$</p>

<p>두 번째 줄에 양의 정수 $p,q,r,s$가 공백으로 구분되어 주어진다.</p>

<p>세 번째 줄에 양의 정수 $a_1$이 주어진다.</p>

### 출력

<p>첫 번째 줄에 $S_n$을 ${10^9 + 7}$로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1\leq k\leq 50$</li>
	<li>$1\leq p,q,r,s\leq 100$</li>
	<li>$1\leq a_1\leq 10$</li>
</ul>

### 힌트

<p>연산 과정 중 C/C++의 <span style="color:#e74c3c;"><code>int</code></span> 범위를 넘어갈 수 있으므로 <span style="color:#e74c3c;"><code>long long</code></span> 자료형을 사용하는 것을 추천한다.</p>