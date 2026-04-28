# [Platinum I] The Number of Symmetrical Choices - 8084

[문제 링크](https://www.acmicpc.net/problem/8084)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 그래프 이론, 중간에서 만나기, 문자열, 트리, 트라이

### 문제 설명

<p>We are given two sequences of words: (x<sub>1</sub>, ..., x<sub>n</sub>)&nbsp;and (y<sub>1</sub>, ..., y<sub>n</sub>), with 1 &le; n &le; 30. For every i, 1 &le; i &le; n, we chose one of the two words: x<sub>i</sub>&nbsp;or y<sub>i</sub>. The chosen words are merged in order of increasing indices. The choice consists of n&nbsp;steps. In each step we decide to take the i-th word from the first or from the second sequence of words. More formally: the choice is a sequence of length n&nbsp;whose elements are numbers 1&nbsp;and 2. It is possible that different choices lead to the same word. We say that a choice is symmetrical if its result is a palindrome, i.e. a word that is identical when we read it from left to right and from right to left.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input: the number n&nbsp;and two sequences of words (x<sub>1</sub>, ..., x<sub>n</sub>)&nbsp;and (y<sub>1</sub>, ..., y<sub>n</sub>),</li>
	<li>computes the number of symmetrical choices for the given sequences,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one positive integer n &le; 30. In the following n&nbsp;lines there are written consecutive words of the sequence (x<sub>i</sub>)&nbsp;&mdash; one word in one line. In the following&nbsp;n&nbsp;lines there are written (in the similar way) consecutive words of the sequence (y<sub>i</sub>). Each word consists solely of small letters of the English alphabet (from&nbsp;<code>a</code>&nbsp;to&nbsp;<code>z</code>). The total length of all words is from the range [1..400].</p>

### 출력

<p>In the standard output there should be written one non-negative integer &mdash; the number of symmetrical choices.</p>