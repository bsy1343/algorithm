# [Platinum V] Palindromic Poster - 28314

[문제 링크](https://www.acmicpc.net/problem/28314)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 18, 맞힌 사람: 15, 정답 비율: 38.462%

### 분류

애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Ryo and Kita are designing a new poster for Kessoku Band. After some furious brainstorming, they came to the conclusion that the poster should come in the form of a 2-D grid of lowercase English letters (i.e. <code>a</code> to <code>z</code>), with $N$ rows and $M$ columns.</p>

<p>Furthermore, it is known that Ryo and Kita both have peculiar tastes in palindromes. Ryo will only be satisfied with the poster if exactly $R$ of its rows are palindromes, and Kita will only be satisfied with the poster if exactly $C$ of its columns are palindromes. Can you design a poster that will satisfy both Ryo and Kita, or determine that it is impossible to do so?</p>

<p>Note: A string is considered a palindrome if it is the same when read forwards and backwards. For example, <code>kayak</code> and <code>bb</code> are palindromes, whereas <code>guitar</code> and <code>live</code> are not.</p>

### 입력

<p>The first and only line of input consists of $4$ space-separated integers $N$, $M$, $R$, and $C$.</p>

### 출력

<p>If it is impossible to design a poster that will satisfy both Ryo and Kita, output <code>IMPOSSIBLE</code> on a single line.</p>

<p>Otherwise, your output should contain $N$ lines, each consisting of $M$ lowercase English letters, representing your poster design. If there are multiple possible designs, output any of them.</p>

### 제한

<ul>
	<li>$2 \le N \le 2\,000$</li>
	<li>$2 \le M \le 2\,000$</li>
	<li>$0 \le R \le N$</li>
	<li>$0 \le C \le M$</li>
</ul>