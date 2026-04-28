# [Gold I] Fibonacci Words - 8104

[문제 링크](https://www.acmicpc.net/problem/8104)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 30, 맞힌 사람: 24, 정답 비율: 35.294%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍

### 문제 설명

<p>Fibonacci words are defined similarly to Fibonacci numbers:</p>

<p>FIB<sub>1</sub> = b, FIB<sub>2</sub> = a, FIB<sub>k+2</sub> = FIB<sub>k+1</sub>&nbsp;&oplus; FIB<sub>k</sub> for k &ge; 1,</p>

<p>where&nbsp;&oplus;&nbsp;denotes operation of connecting words (concatenation).</p>

<p>Hence we have: FIB<sub>3</sub> = ab, FIB<sub>4</sub> = aba, FIB<sub>5</sub> = abaab, FIB<sub>6</sub> = abaababa.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input a word comprising at least one and at most 30&nbsp;characters a&nbsp;or b, and one positive integer n&nbsp;(n &le; 200),</li>
	<li>computes how many times the word appears in the n-th Fibonacci word FIB<sub>n</sub>&nbsp;(how many fragments of&nbsp;FIB<sub>n</sub>&nbsp;are the same as the given word; the fragments may partially overlap),</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is written one word. The word is composed of at least one and at most 30&nbsp;characters a&nbsp;or b. In the second line there is written one positive integer n &le; 200.</p>

### 출력

<p>In the standard output there should be written one nonnegative integer. It should be equal to the number of times the given word appears in the Fibonacci word FIB<sub>n</sub>.</p>