# [Gold III] Palindrome - 26487

[문제 링크](https://www.acmicpc.net/problem/26487)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 문자열

### 문제 설명

<p><em>Little Square</em> found an array $a$ consisting of $N$ positive numbers formed of nonzero digits. He can replace any number from $a$ with another number consisting of as many digits, all nonzero.</p>

<p>After making all the changes he wants, <em>Little Square</em> will form a new number $M$ by writing the elements of the array $a$ in order, without spaces. What is the minimum numbers of elements of the array $a$ which need to be replaced by <em>Little Square</em> for the number $M$ obtained to be a palindrome.</p>

### 입력

<p>The first line of standard input will contain an integer $N$, the size of the array $a$. The second line will contain $N$ integers consisting only of nonzero digits representing the array $a$.</p>

<p><strong>Attention!</strong> The numbers read from the input file may be too big for the <code>int</code> data type. It is recommended to use the <code>long long</code> data type.</p>

### 출력

<p>The standard output will contain only one integer, representing the minimum number of elements of the array a that need to be replaced.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 500\,000$</li>
	<li>$1 &le; a_i &lt; 10^{18}$, for every $1 &le; i &le; N$</li>
	<li>A number is a palindrome if its first digit is equal to its last one, its second digit is equal is equal to the next to last digit and so on. Thus, numbers $4$, $121$, $14541$ are palindromes, while numbers $21$, $433$, $1234312$ are not palindromes.</li>
</ul>

### 힌트

<p>In the first example, <em>Little Square</em> can replace the first number with $13879$ and the third number with $448$. The number $M$ will become $1387998448997831$ which is a palindrome. There is no solution with less than two replacements.</p>

<p>In the second example, <em>Little Square</em> can replace the third number with $1347743112554$.</p>