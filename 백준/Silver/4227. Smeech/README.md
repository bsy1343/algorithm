# [Silver II] Smeech - 4227

[문제 링크](https://www.acmicpc.net/problem/4227)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 101, 정답: 41, 맞힌 사람: 30, 정답 비율: 40.000%

### 분류

수학, 자료 구조, 문자열, 파싱, 확률론, 스택

### 문제 설명

<p>Professor Octastichs has invented a new programming language, Smeech. An expression in Smeech may be a positive or negative integer, or may be of the form (p e1 e2) where p is a real number between 0 and 1 (inclusive) and e1 and e2 are Smeech expressions. The value represented by a Smeech expression is as follows:</p>

<ul>
	<li>An integer represents itself</li>
	<li>With probability p, (p e1 e2) represents x+y where x is the value of e1 and y is the value of e2; otherwise it represents x-y.</li>
</ul>

<p>Given a Smeech expression, what is its expected value?</p>

### 입력

<p>Input consists of several Smeech expressions, one per line, followed by a line containing ().&nbsp;</p>

### 출력

<p>For each expression, output its expected value to two decimal places.</p>