# [Platinum III] Binary Strings - 13894

[문제 링크](https://www.acmicpc.net/problem/13894)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 132, 정답: 60, 맞힌 사람: 47, 정답 비율: 43.519%

### 분류

분할 정복을 이용한 거듭제곱, 선형대수학, 수학, 누적 합

### 문제 설명

<p>A young boy got really curious about binary strings. This string contains only 1s and 0s hence the name binary. His particular interest was about those strings for which no two ones are side by side. Specifically he wanted to know the number of strings of a certain length that consisted of only ones and zeroes and there are no two consecutive ones.</p>

<p>After solving this problem, the young boy got even more curious. Now he wants to know the number of binary strings which satisfies the following properties:</p>

<ul>
	<li>The length of the string is between L and R, inclusive (1 &le; L &le; R &le; 10<sup>18</sup>)</li>
	<li>The length of string is divisible by an integer K. (3 &le; K &le; 10<sup>9</sup>)</li>
	<li>It is a binary string with no two consecutive ones.</li>
</ul>

<p>Now can you help him to find out the number of strings that satisfies the above conditions? Since the number can be huge, you need to print it modulo 1 000 000 007.</p>

### 입력

<p>The first line is an integer T (1 &le; T &le; 10 000), the number of tests. In the next T lines there are three integers L, R and K.</p>

### 출력

<p>Print T lines, in each line print the case id and the result modulo 1 000 000 007. See the samples for more details.</p>

### 힌트

<p>For the first case some example strings are &ldquo;101&rdquo;, &ldquo;000&rdquo;, &ldquo;010&rdquo; &ldquo;101001&rdquo;, &ldquo;000010000&rdquo; etc.</p>