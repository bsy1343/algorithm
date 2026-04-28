# [Platinum III] Fraction Reduction - 23498

[문제 링크](https://www.acmicpc.net/problem/23498)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 66, 정답: 13, 맞힌 사람: 10, 정답 비율: 22.727%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>Chiaki has a fraction $\frac{a}{b}$ (not necessary an irreducible fraction) and can perform the following $2$ operations:</p>

<ul>
	<li>If the current fraction is $x$, Chiaki can change it to $-\frac{1}{x}$.</li>
	<li>If the current fraction is $x$, Chiaki can change it to $x+1$.</li>
</ul>

<p>Now, Chiaki would like to know the number of minimum operations needed to make $\frac{a}{b}$ become $0$. Since this number may be very large, you are only asked to calculate it modulo $10^9+7$.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ ($1 \le T \le 10^5$), indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $a$ and $b$ ($-10^{18} \le a \le 10^{18}, 1 \le b \le 10^{18}$), denoting the fraction.</p>

### 출력

<p>For each test case, output an integer denoting the the number of minimum operations modulo $10^9+7$, or $-1$ if there&#39;s no such operations to make $\frac{a}{b}$ become $0$.</p>

### 힌트

<p>For the $1$-st sample, you don&#39;t need any operations.</p>

<p>For the $2$-nd sample, one possible sequence is: $\frac{1}{1} \to -\frac{1}{1} \to 0$.</p>

<p>For the $3$-rd sample, one possible sequence is: $-\frac{1}{2} \to \frac{1}{2} \to -\frac{2}{1} \to -\frac{1}{1} \to 0$.</p>

<p>For the $4$-th sample, one possible sequence is: $-\frac{2}{4} \to \frac{2}{4} \to -\frac{4}{2} \to -\frac{2}{2} \to 0$.</p>

<p>For the $5$-th sample, one possible sequence is: $\frac{8}{5} \to -\frac{5}{8} \to \frac{3}{8} \to -\frac{8}{3} \to -\frac{5}{3} \to -\frac{2}{3} \to \frac{1}{3} \to -\frac{3}{1} \to -\frac{2}{1} \to -\frac{1}{1} \to 0$.</p>