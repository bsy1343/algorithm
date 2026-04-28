# [Bronze III] Chronogram - 26198

[문제 링크](https://www.acmicpc.net/problem/26198)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 416, 정답: 336, 맞힌 사람: 277, 정답 비율: 81.711%

### 분류

구현, 문자열

### 문제 설명

<p>A <em>chronogram</em> is an inscription (usually found on monuments) in which the year of the event commemorated by the monument is encoded. The year is obtained by adding up all the values of those letters that can appear in Roman numerals. Values of individual letters:</p>

<ul>
	<li><code>I</code> &hellip; 1</li>
	<li><code>V</code> &hellip; 5</li>
	<li><code>X</code> &hellip; 10</li>
	<li><code>L</code> &hellip; 50</li>
	<li><code>C</code> &hellip; 100</li>
	<li><code>D</code> &hellip; 500</li>
	<li><code>M</code> &hellip; 1000</li>
</ul>

<p>Chronograms are usually studied by theologians. As a part of a study of great importance in the Central Europe, they compiled a long list of chronograms. The monks would like to make sure they do not make any mistake in calculating the corresponding years and therefore decided to use a computer program. Since monks are not skilled programmers, they urgently need your help.</p>

<p>Write a program that will extract the year of the event from a chronogram.</p>

### 입력

<p>The first line of the input contains an integer $T$, i.e. the number of test cases. This is followed by $T$ lines; each line contains one chronogram that contains at most 1000 characters. The text contains only uppercase letters of the English alphabet and spaces.</p>

### 출력

<p>For each chronogram output one integer, i.e. the year encoded in the chronogram.</p>

### 제한

<li>$1 \leq T \leq 10000$</li>
<li>Every line contains at most 1000 characters.</li>
<li>A character may be an uppercase letter of the English alphabet or a space.</li>