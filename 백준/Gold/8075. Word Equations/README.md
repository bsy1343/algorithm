# [Gold I] Word Equations - 8075

[문제 링크](https://www.acmicpc.net/problem/8075)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 76, 정답: 16, 맞힌 사람: 12, 정답 비율: 21.429%

### 분류

그래프 이론, 자료 구조, 문자열, 그래프 탐색, 분리 집합, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Every non-empty sequence of elements&nbsp;0&nbsp;and 1&nbsp;is called a binary word. A word equation is an equation of the form x<sub>1</sub>x<sub>2</sub>...x<sub>l</sub> = y<sub>1</sub>y<sub>2</sub>...y<sub>r</sub>, where x<sub>i</sub>&nbsp;and y<sub>j</sub>&nbsp;are binary digits (0&nbsp;or 1) or variables i.e. small letters of English alphabet. For every variable there is a fixed length of the binary words that can be substituted for this variable. This length is called a length of variable. In order to solve a word equation we have to assign binary words of appropriate length to all variables (the length of the word assigned to the variable x has to be equal to the length of this variable) in such a way that if we substitute words for variables then both sides of the equation (which are binary words after substitution) become equal.</p>

<p>For a given equation compute how many distinct solutions it has.</p>

<p>Let a, b, c, d, e&nbsp;be variables and let 4, 2, 4, 4, 2&nbsp;be their lengths (4&nbsp;is the length of a, 2&nbsp;is the length of b&nbsp;etc.). Consider the equation: 1bad1 = acbe&nbsp;This equation has 16&nbsp;distinct solutions.</p>

<p>Write a program, that:</p>

<ul>
	<li>reads the number of equations and their descriptions from the standard input;</li>
	<li>finds the number of solutions of every equation;</li>
	<li>writes the results to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is an integer x, 1 &le; x &le; 5, which denotes the number of equations. The following lines contain descriptions of x&nbsp;equations. Each description consists of 6&nbsp;lines. There are no empty lines between descriptions. Each equation is described in the following way:</p>

<p>In the first line of the description there is an integer k, 0 &le; k &le; 26, which denotes the number of distinct variables in the equation. We assume that variables are the first k&nbsp;small letters of English alphabet. In the second line there is a sequence of k positive integers separated by single spaces. These numbers denote the lengths of variables a, b, ...&nbsp;from the equation (the first number is the length of a, the second &mdash; b&nbsp;etc.).</p>

<p>There is an integer l&nbsp;in the third line of the description, which is the length of the left size of equation, i.e. the length of the word built of digits 0&nbsp;or 1&nbsp;and variables (single letters). The left side of the equation is written in the next line as a sequence of digits and variables with no spaces between them. The next two lines contain the description of the right side of the equation. The first of these lines contains a positive integer r, which is the length of the right side of the equation. The second line contains the right side of the equation which is encoded in the same way as the left side. The number of digits plus sum of the lengths of variables (we count all appearances of variables) on each side of the equation is not greater than 10,000.</p>

### 출력

<p>For every&nbsp;i, 1 &le; i &le; x, your program should write the number of distinct solutions of the&nbsp;<img src="%EB%B0%B1%EC%A4%80/Gold/8075.%E2%80%85Word%E2%80%85Equations/85f4bffe.png" data-original-src="https://main.edu.pl/en/images/OI5/row-en-tex.34.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />-th equation to the i-th line of the standard output.</p>