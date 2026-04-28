# [Gold II] One-sequence - 8071

[문제 링크](https://www.acmicpc.net/problem/8071)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 65, 맞힌 사람: 43, 정답 비율: 58.904%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>We say that a sequence of integers is a one-sequence if the difference between any two consecutive numbers in this sequence is 1&nbsp;or -1&nbsp;and its first element is 0. More precisely: [a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>]&nbsp;is a one-sequence if:</p>

<ul>
	<li>for any k, such that 1 &le; k &lt; n:&nbsp;|a<sub>k</sub> - a<sub>k+1</sub>| = 1&nbsp;and</li>
	<li>a<sub>1</sub> = 0.</li>
</ul>

<p>Write a program that:</p>

<ul>
	<li>reads two integers describing the length of the sequence and the sum of its elements, from the standard input;</li>
	<li>finds a one-sequence of the given length whose elements sum up to the given value or states that such a sequence does not exist;</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is a number n, such that 1 &le; n &le; 10,000, which is the number of elements in the sequence. In the second line there is a number S, which is the sum of the elements of the sequence, such that |S| &le; 50,000,000.</p>

### 출력

<p>In the first n&nbsp;lines of the standard output there should be written n&nbsp;integers (one in each line) that are the elements of the sequence (k-th element in the k-th line) whose sum is S&nbsp;or the word&nbsp;<code>NIE</code>&nbsp;(which means &ldquo;no&rdquo; in Polish) if such a sequence does not exist.</p>