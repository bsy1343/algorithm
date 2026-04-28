# [Platinum I] Decoration - 21214

[문제 링크](https://www.acmicpc.net/problem/21214)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 41, 맞힌 사람: 40, 정답 비율: 46.512%

### 분류

수학, 그래프 이론, 자료 구조, 정수론, 희소 배열, 함수형 그래프

### 문제 설명

<p>After all these months of lockdown, you are tired of the interior decoration of your home and decide to redesign it. Hence, you read many blog posts and magazines about Feng Shui decorating and other recent trends on home design. After some time of thinking, you decide to reproduce the idea of the famous designer Sweta Marc for replacing your bookcase with a new one you will build.</p>

<p>According to S. Marc, a harmonious bookcase always has several shelves spaced in an heterogeneous manner, and always following some very precise rules. More precisely, such a bookcase has a <em>serenity value</em> $N$ and is composed of $K+1$ shelves spaced by $s_1, \ldots, s_K$ millimeters between each other, from the bottom to the top. According to S. Marc ideals, these spaces should verify the following properties:</p>

<ol>
	<li>They should be <em>heterogeneous</em>, i.e., no two spaces have the same height.</li>
	<li>They should be <em>not too high</em>, i.e., for all $i \in [1, K]$, we should have $0 \leq s_i &lt; N$. Note that one of these spaces might actually have size $0$: this is one of the oddities which make Sweta&#39;s tastes so visually attractive (arguably, this is a loss of space, but you are ready for that in the name of elegance, well-being... and trendiness).</li>
	<li>They should be <em>serene</em>, i.e., for all $i \in [1, K-1]$, Sweta prefers if $s_{i+1}$ is congruent modulo $N$ to $s_i$ plus the number of divisors of $s_i$. (Yes, Ms. Marc is sophisticated and loves arithmetic.)</li>
</ol>

<p>You tried to design a bookcase according to the advice of Sweta Marc, but you find it hard to satisfy all the requirements. The only few solutions you found result in a bookcase which is too tall for your place.</p>

<p>Therefore, you decide to write a program which, given the number of shelves $K$ and the serenity value $N$, computes the values of the spaces $s_1, \ldots, s_K$ of one of the minimum height bookcases, i.e. a bookcase where the sum of spaces $s_1 + \cdots + s_K$ is the smallest.</p>

### 입력

<p>The only line of input contains two integers $N$ and $K$ separated by a space.</p>

### 출력

<p>The output should contain a single line containing either:</p>

<ul>
	<li>$-1$ if it is not possible to satisfy Sweta Marc&#39;s prescriptions for the given values of $K$ and $N$,</li>
	<li>otherwise, $K$ integers $s_1, \ldots, s_K$, corresponding to the spaces between the shelves of one of the minimum height bookcases satisfying the constraints. If several solutions are possible, the output should contain any of them.</li>
</ul>

### 제한

<ul>
	<li>$1 \leq N \leq 1\,000\,000 $</li>
	<li>$1 \leq K \leq 1\,000\,000 $</li>
</ul>

### 힌트

<p>We recall the following mathematical definitions ($a$ and $b$ are arbitrary integers):</p>

<ul>
	<li>$a$ <em>divides</em> $b$ if there exists an integer $q$ such that $b = aq$;</li>
	<li>$a$ is a <em>divisor</em> of $b$ if $b \neq 0$ and $a$ divides $b$;</li>
	<li>$a$ is <em>congruent</em> to $b$ if $N$ divides $b-a$.</li>
</ul>