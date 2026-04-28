# [Platinum II] 삼항 연산자 - 19534

[문제 링크](https://www.acmicpc.net/problem/19534)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 58, 맞힌 사람: 53, 정답 비율: 33.333%

### 분류

구현, 자료 구조, 그래프 이론, 문자열, 그래프 탐색, 분리 집합, 파싱

### 문제 설명

<p>$N$개의 참/거짓 변수를 가진 식이 주어진다. 변수의 값으로 가능한 $2^N$개의 경우에 대하여 식의 값이 $0$인 경우의 수를 구하는 프로그램을 작성하여라.</p>

<p>이 문제에서 식은 아래 BNF 표기법에서 $\text{expression}$을 뜻한다.</p>

<ul>
	<li>$\text{boolean} ::= \text{&lsquo;0&rsquo; | &lsquo;1&rsquo;}$</li>
	<li>$\text{variable} ::= \text{&lsquo;a&rsquo;&nbsp;| &lsquo;b&rsquo;&nbsp;| ... | $N$번째 알파벳 소문자}$</li>
	<li>$\text{value} ::= \text{boolean | variable}$</li>
	<li>$\text{condition} ::= \text{value &lsquo;==&rsquo;&nbsp;value}$</li>
	<li>$\text{expression} ::= \text{value | condition &lsquo;?&rsquo;&nbsp;expression &lsquo;:&rsquo;&nbsp;expression }$</li>
</ul>

<p>식의 값은 $eval(\text{expression})$을 의미하며 아래와 같이 재귀적으로 계산된다. 잘 생각해보면 올바른 식이 주어졌을 때 해당 식을 계산하는 방법이 유일하다는 것을 알 수 있다.</p>

<ul>
	<li>$eval(\text{value}) = \text{value}$</li>
	<li>$eval(\text{condition}) = eval(\text{value1 &lsquo;==&rsquo; value2}) = \begin{cases} 1 &amp; \text{if } eval(\text{value1}) = eval(\text{value2}) \\&nbsp;0 &amp; \text{otherwise}&nbsp;\end{cases}$</li>
	<li>$eval(\text{expression}) = eval(\text{value}) = \text{value}$</li>
	<li>$eval(\text{expression}) = eval(\text{condition &lsquo;?&rsquo;&nbsp;expression1 &lsquo;:&rsquo; expression2}) \\ = \begin{cases}&nbsp;eval(\text{expression1}) &amp; \text{if } eval(\text{condition}) = 1 \\&nbsp;eval(\text{expression2}) &amp; \text{otherwise}&nbsp;\end{cases}$</li>
</ul>

### 입력

<p>첫 번째 줄에는 변수의 수 $N$ ($1 \le N \le 26$)이 주어진다.</p>

<p>두 번째 줄에는 식에 해당하는 길이 $1$ 이상 $1\ 000$ 이하의 문자열이 주어진다. 식은 &lsquo;0&rsquo;, &lsquo;1&rsquo;, &lsquo;a&rsquo;-(N번째 알파벳 소문자), &lsquo;=&rsquo;, &lsquo;?&rsquo;, &lsquo;:&rsquo;로만 구성되며 올바른 식만 주어진다.</p>

### 출력

<p>식의 값이 $0$이 되도록 변수의 값을 할당하는 방법의 수를 출력한다.</p>