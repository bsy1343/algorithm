# [Gold III] 연산자 파티 2 - 28142

[문제 링크](https://www.acmicpc.net/problem/28142)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 512 MB

### 통계

제출: 375, 정답: 89, 맞힌 사람: 52, 정답 비율: 18.909%

### 분류

수학, 애드 혹, 비트마스킹, 분할 정복을 이용한 거듭제곱, 런타임 전의 전처리

### 문제 설명

<p>초기값이 $0$인 정수형 변수 $X$가 있다.</p>

<p>$i$가 $1$부터 $N$까지 $1$씩 증가함에 따라 아래 조건에 맞게 연산을 진행한다. 연산을 모두 수행한 후의 $X$값을 출력하시오.</p>

<ul>
	<li>$i$가 $1$의 배수라면 $X$ = $X$ - $i$를 한다. (-는 빼기 연산자이다.)
	<ul>
		<li>연산한 결과가 음수라면 $X$ = $|X|$를 한다.</li>
	</ul>
	</li>
	<li>$i$가 $3$의 배수라면 $X$ = $X$ &times; $i$를 한다. (&times;는 곱하기 연산자이다.)
	<ul>
		<li>연산한 결과가 $P$보다 크거나 같으면 $X$ = $X$ % $P$를 한다.</li>
	</ul>
	</li>
	<li>$i$가 $15$의 배수라면 $X$ = $X$ &amp; $i$를 한다. (&amp;는 Bitwise AND 연산자이다.)</li>
	<li>$i$가 $63$의 배수라면 $X$ = $X$ &oplus; $i$를 한다. (&oplus;는 Bitwise XOR 연산자이다.)</li>
	<li>$i$가 $255$의 배수라면 $X$ = $X$ | $i$를 한다. (|는 Bitwise OR 연산자이다.)</li>
	<li>$i$가 $1023$의 배수라면 $X$ = $X$ &lt;&lt; $i$를 한다. (&lt;&lt;는 Bitwise Left Shift 연산자이다.)
	<ul>
		<li>연산한 결과가 $P$보다 크거나 같으면 $X$ = $X$ % $P$를 한다.</li>
	</ul>
	</li>
	<li>한 번에 여러 연산을 시행해야 한다면 -, &times;, &amp;, &oplus;, |, &lt;&lt; 우선순위로 연산을 진행한다.</li>
</ul>

### 입력

<p>첫 번째 줄에 $N$이 주어진다.</p>

### 출력

<p>연산을 모두 수행한 후의 $X$값을 출력한다.</p>

### 제한

<ul>
	<li>$P = 10^9 + 7$</li>
	<li>$1 \le N \le 10^{11}$</li>
	<li>$N$은 양의 정수이다.</li>
</ul>

### 힌트

<p>Bitwise 연산자들은 비트 단위로 연산을 시행한다.</p>

<ul>
	<li><strong>Bitwise AND</strong>

	<ul>
		<li>두 수의 각 비트마다 아래와 같은 연산을 진행한다.
		<ul>
			<li>두 비트가 모두 $1$이면 결과가 $1$이고, 그렇지 않으면 $0$이다.</li>
		</ul>
		</li>
		<li>예시
		<ul>
			<li>$\begin{aligned} 0110_{2} &amp;= 6 \\ \text{&amp;} \ \ 1100_{2} &amp;= 12 \\ \text{────} \\ 0100_{2} &amp;= 4 \end{aligned}$</li>
		</ul>
		</li>
	</ul>
	</li>
	<li><strong>Bitwise XOR</strong>
	<ul>
		<li>두 수의 각 비트마다 아래와 같은 연산을 진행한다.
		<ul>
			<li>두 비트가 서로 다르면 결과가 $1$이고, 그렇지 않으면 $0$이다.</li>
		</ul>
		</li>
		<li>예시
		<ul>
			<li>$\begin{aligned} 0110_{2} &amp;= 6 \\ \text{&oplus;} \ \ 1100_{2} &amp;= 12 \\ \text{────} \\ 1010_{2} &amp;= 10 \end{aligned}$</li>
		</ul>
		</li>
	</ul>
	</li>
	<li><strong>Bitwise OR</strong>
	<ul>
		<li>두 수의 각 비트마다 아래와 같은 연산을 진행한다.
		<ul>
			<li>두 비트 중 하나라도 $1$이면 결과가 $1$이고, 그렇지 않으면 $0$이다.</li>
		</ul>
		</li>
		<li>예시
		<ul>
			<li>$\begin{aligned} 0110_{2} &amp;= 6 \\ \text{|} \ \ 1100_{2} &amp;= 12 \\ \text{────} \\ 1110_{2} &amp;= 14 \end{aligned}$</li>
		</ul>
		</li>
	</ul>
	</li>
	<li><strong>Bitwise Left Shift</strong>
	<ul>
		<li>$a$ &lt;&lt; $b$일 때, $a$의 비트를 $b$번 왼쪽 이동한다.
		<ul>
			<li>왼쪽으로 이동된 수만큼 비게 되는 오른쪽 비트는 $0$으로 채워진다.</li>
		</ul>
		</li>
		<li>예시
		<ul>
			<li>$\begin{aligned} &amp; 0110_{2} \ \text{&lt;&lt;} \ 2 \\ &amp; \downarrow \\ &amp; 011000_{2} \end{aligned}$</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>