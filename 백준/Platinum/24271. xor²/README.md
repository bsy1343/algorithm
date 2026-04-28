# [Platinum II] xor² - 24271

[문제 링크](https://www.acmicpc.net/problem/24271)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 278, 정답: 159, 맞힌 사람: 120, 정답 비율: 67.797%

### 분류

자료 구조, 세그먼트 트리, 비트마스킹

### 문제 설명

<p>음이 아닌 정수만으로 이루어진 길이가 $N$인 수열&nbsp;$A_0$, $A_1$, $\cdots$, $A_{N-1}$이 주어진다.&nbsp;이 때, 다음 쿼리를 수행하는 프로그램을 작성하시오.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>1 l r x</code></span>: $l \le \left( i \oplus x \right) \le r$과 $0 \le i &lt; N$을 모두 만족하는 모든 정수 $i$에 대해, $A_i$의 값들을 전부 bitwise XOR하여 출력한다. 단, 해당하는 $i$가 없을 경우 $0$을 출력한다.</li>
	<li><span style="color:#e74c3c;"><code>2 i x</code></span>: $A_i$를 $A_i \oplus x$로 설정한다.</li>
</ul>

<p>$\oplus$는 bitwise XOR 연산자이다. 인덱스가&nbsp;$0$부터 시작함에 유의하라.</p>

### 입력

<p>첫 번째 줄에 수열의 길이 $N$이 주어진다.</p>

<p>두 번째 줄에 $N$ 개의 정수&nbsp;$A_0$, $A_1$, $\cdots$, $A_{N-1}$이 공백으로 구분되어 주어진다.</p>

<p>세 번째 줄에 쿼리의 수&nbsp;$Q$가 주어진다.</p>

<p>다음 $Q$ 개의 줄의 각 줄에 쿼리가 주어진다. 각 쿼리는 <span style="color:#e74c3c;"><code>1 l r x</code></span>&nbsp;또는&nbsp;<span style="color:#e74c3c;"><code>2 i x</code></span>&nbsp;중 한 가지 형식이다.</p>

### 출력

<p>$1$번 쿼리가 주어질 때마다 각 줄에 답을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N, Q \le 200\,000$</li>
	<li>$0 \le A_i &lt; 2^{31}$&nbsp;($0 \le i &lt; N$)</li>
	<li>$1$번 쿼리에서, $0 \le l \le r &lt;&nbsp;N$이고&nbsp;$0 \le x &lt; N$</li>
	<li>$2$번 쿼리에서, $0 \le i&nbsp;&lt;&nbsp;N$이고&nbsp;$0 \le x &lt; 2^{31}$</li>
	<li>$1$번 쿼리는&nbsp;$1$개 이상&nbsp;주어진다.</li>
	<li>입력으로 주어지는 모든 수는 정수이다.</li>
</ul>

### 힌트

<ul>
	<li>$a$와 $b$의 bitwise XOR인 $a \oplus b$는, 2진법으로 표현했을 때 $a$와 $b$의 $i$ 번째 자리가 같으면 $a \oplus b$의 $i$ 번째 자리가 $0$이고, 서로 다르면 $1$이 되도록 계산한다.</li>
</ul>