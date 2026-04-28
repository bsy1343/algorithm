# [Platinum III] Matrix Game - 17315

[문제 링크](https://www.acmicpc.net/problem/17315)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 50, 맞힌 사람: 12, 정답 비율: 30.000%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>TingTing is a girl that loves matrices. One day, she wants to use a computer to generate a giant&nbsp;<var>n</var>&nbsp;row by&nbsp;<var>m</var>&nbsp;column matrix (you don&#39;t have to worry about how she&#39;ll store it). Her generated matrix will satisfy a mystical property: if we use&nbsp;<var>F</var>[<var>i</var>][<var>j</var>] to represent the cell in the&nbsp;<var>i</var>-th row and&nbsp;<var>j</var>-th column, then&nbsp;<var>F</var>[<var>i</var>][<var>j</var>] will satisfy the following system of equations:</p>

<p><img alt="" src="https://upload.acmicpc.net/4479a323-532d-44f5-9c9d-508f074a33a4/-/preview/" /></p>

<p>where&nbsp;<var>a</var>,&nbsp;<var>b</var>,&nbsp;<var>c</var>, and&nbsp;<var>d</var>&nbsp;are given constants.</p>

<p>TingTing would like to know the value of&nbsp;<var>F</var>[<var>n</var>][<var>m</var>] and she would like you to help her. Since the final value may be very large, you are only required to output it modulo 1,000,000,007.</p>

### 입력

<p>The input will contain the six integers&nbsp;<var>n</var>,&nbsp;<var>m</var>,&nbsp;<var>a</var>,&nbsp;<var>b</var>,&nbsp;<var>c</var>, and&nbsp;<var>d</var>.</p>

### 출력

<p>Output a single integer, the value of&nbsp;<var>F</var>[<var>i</var>][<var>j</var>] modulo 1,000,000,007.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<var>n</var>,&nbsp;<var>m</var>&nbsp;&le; 10<sup>1,000,000</sup></li>
	<li>1 &le;&nbsp;<var>a</var>,&nbsp;<var>b</var>,&nbsp;<var>c</var>,&nbsp;<var>d</var>&nbsp;&le; 10<sup>9</sup></li>
</ul>