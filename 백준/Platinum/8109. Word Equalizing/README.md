# [Platinum II] Word Equalizing - 8109

[문제 링크](https://www.acmicpc.net/problem/8109)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 18, 맞힌 사람: 17, 정답 비율: 80.952%

### 분류

그래프 이론, 자료 구조, 문자열, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 최단 경로, 해싱

### 문제 설명

<p>There are given two words x, y&nbsp;and finite series of words (w<sub>1</sub>, w<sub>2</sub>, ..., w<sub>k</sub>). An operation w &oplus;w<sub>i</sub>&nbsp;means a connection (concatenation) of word w&nbsp;with another word w<sub>i</sub> (1 &le; i &le; k), i.e. is writing a word w<sub>i</sub>&nbsp;just after the word&nbsp;w.</p>

<p>We want to verify if the words x&nbsp;and y&nbsp;can be equalized with words from the given series. The question is whether it is possible to extend the words x&nbsp;and y&nbsp;with words from the series in order to produce two identical words.</p>

<p>The words&nbsp;<code>abba</code>&nbsp;and&nbsp;<code>ab</code>&nbsp;can be equalized with the words from the series:&nbsp;<code>baaabad aa badccaa cc</code>. In this purpose to the word&nbsp;<code>abba</code>&nbsp;we should add:&nbsp;<code>aa</code>&nbsp;and&nbsp;<code>badccaa</code>, and to the word&nbsp;<code>ab</code>&nbsp;&mdash; firstly&nbsp;<code>baaabad</code>, then&nbsp;<code>cc</code>, and finally&nbsp;<code>aa</code>. In both cases we result in the same word:&nbsp;<code>abbaaabadccaa</code>.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input a length k&nbsp;of a given series of words, then descriptions of two words x&nbsp;and y&nbsp;as well as descriptions of the words from the series:&nbsp;(w<sub>1</sub>, w<sub>2</sub>, ..., w<sub>k</sub>),</li>
	<li>verifies whether the words x&nbsp;and y&nbsp;can be equalized with the words from the given series; if it is possible it finds the minimal number of operations&nbsp;&oplus;, which are necessary,</li>
	<li>write this number to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is written a positive integer k, k &le; 40. This is the length of the series&nbsp;(w<sub>1</sub>, w<sub>2</sub>, ..., w<sub>k</sub>). In the second and the third line there are descriptions of the words x&nbsp;and y. In the following k&nbsp;lines there are descriptions of the succeeding words in the series&nbsp;(w<sub>1</sub>, w<sub>2</sub>, ..., w<sub>k</sub>)) &mdash; each description in a separate line. A description of the word consists of a natural number, which is the length of the word, and a word itself written as a series of characters. The number and the word are separated by a single space. Each word consists only of small English letters from&nbsp;<code>a</code>&nbsp;to&nbsp;<code>z</code>&nbsp;and its length is not greater than&nbsp;2,000. The sum of lengths of all given words is not greater than 5,000.</p>

### 출력

<p>To the standard output there should be written:</p>

<ul>
	<li>one nonnegative integer, the minimal number of operations&nbsp;&oplus;, which are necessary to equalize given words x&nbsp;and y,</li>
	<li>or the word&nbsp;<code>NIE</code>&nbsp;(which means &ldquo;no&rdquo; in Polish), if it is not possible to equalize the words.</li>
</ul>