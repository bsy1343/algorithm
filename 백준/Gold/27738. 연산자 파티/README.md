# [Gold V] 연산자 파티 - 27738

[문제 링크](https://www.acmicpc.net/problem/27738)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 633, 정답: 242, 맞힌 사람: 206, 정답 비율: 43.096%

### 분류

애드 혹

### 문제 설명

<p>정수를 담는 변수 $X$는 초기값이 $0$이다.</p>

<p>$i$가 $1$부터 $N$까지 $1$씩 증가할 때마다 아래 조건에 맞게 연산을 진행한다. $N$까지 연산을 모두 마쳤을 때, 최종 $X$값을 출력하시오.</p>

<ul>
	<li>$i$가 $A$의 배수라면 $X$ = $X$ + $i$를 한다. (+는 더하기 연산자이다.)</li>
	<li>$i$가 $B$의 배수라면 $X$ = $X$ % $i$를 한다. (%는 나머지 연산자이다.)</li>
	<li>$i$가 $C$의 배수라면 $X$ = $X$ &amp; $i$를 한다. (&amp;는 Bitwise AND 연산자이다.)</li>
	<li>$i$가 $D$의 배수라면 $X$ = $X$ &oplus; $i$를 한다. (&oplus;는 Bitwise XOR 연산자이다.)</li>
	<li>$i$가 $E$의 배수라면 $X$ = $X$ | $i$를 한다. (|는 Bitwise OR 연산자이다.)</li>
	<li>$i$가 $F$의 배수라면 $X$ = $X$ &gt;&gt; $i$를 한다. (&gt;&gt;는 Bitwise Right Shift 연산자이다.)</li>
	<li>한 번에 여러 연산을 시행해야 한다면 +, %, &amp;, &oplus;, |, &gt;&gt; 우선순위로 연산을 진행한다.</li>
</ul>

### 입력

<p>첫 번째 줄에 $N$이 주어진다.</p>

<p>두 번째 줄에 $A$, $B$, $C$, $D$, $E$, $F$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>최종 $X$값을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 10^{12}$</li>
	<li>$1 \le A \le B \le C \le D \le E \le F \le 1\,000\,000$</li>
	<li>$N$, $A$, $B$, $C$, $D$, $E$, $F$는 양의 정수다.</li>
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
	<li><strong>Bitwise Right Shift</strong>
	<ul>
		<li>$a$ &gt;&gt; $b$일 때, $a$의 비트를 $b$번 오른쪽 이동한다.
		<ul>
			<li>오른쪽으로 이동된 수만큼 비게 되는 왼쪽 비트는 $0$으로 채워진다.</li>
		</ul>
		</li>
		<li>예시
		<ul>
			<li>$\begin{aligned} &amp; 0110_{2} \ \text{&gt;&gt;} \ 2 \\ &amp; \downarrow \\ &amp; 0001_{2} \end{aligned}$</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>