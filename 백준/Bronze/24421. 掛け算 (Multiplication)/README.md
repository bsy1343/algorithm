# [Bronze II] 掛け算 (Multiplication) - 24421

[문제 링크](https://www.acmicpc.net/problem/24421)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 260, 정답: 230, 맞힌 사람: 215, 정답 비율: 89.212%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>JOI 高校の生徒である葵は，図書室で巻物を見つけた．この巻物には&nbsp;<var>N</var>&nbsp;個の整数が一列に書かれており，左から&nbsp;<var>i</var>&nbsp;番目 (<var>1 ≦ i ≦ N</var>) の数は&nbsp;<var>A<sub>i</sub></var>&nbsp;である．</p>

<p>葵は巻物を見て，「この&nbsp;<var>N</var>&nbsp;個の整数の中から&nbsp;<var>3</var>&nbsp;個を選んで，<strong>左から順に</strong>&nbsp;<var>x, y, z</var>&nbsp;としたとき，<var>x &times; y = z</var>&nbsp;となるような整数の選び方は何通りあるのか」という疑問を持った．</p>

<p>巻物に書かれた&nbsp;<var>N</var>&nbsp;個の整数が与えられたとき，葵の疑問の答えを求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p>標準出力に，葵の疑問の答えを&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>3 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ 999</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>