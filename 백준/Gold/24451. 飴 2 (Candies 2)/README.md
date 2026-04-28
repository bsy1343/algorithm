# [Gold I] 飴 2 (Candies 2) - 24451

[문제 링크](https://www.acmicpc.net/problem/24451)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 270, 정답: 77, 맞힌 사람: 69, 정답 비율: 31.944%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>机の上に&nbsp;<var>N</var>&nbsp;個の飴が横一列に並んでおり，左から順に&nbsp;<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号が付けられている．飴&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) の美味しさは&nbsp;<var>A<sub>i</sub></var>&nbsp;である．</p>

<p>JOI 君は，<var>N</var>&nbsp;個の飴のうちいくつかを選んで食べることにした．</p>

<p>ただし，飴を食べ過ぎないために，どの連続する&nbsp;<var>K</var>&nbsp;個の飴についても，そのうち高々&nbsp;<var>2</var>&nbsp;個しか食べないようにする．すなわち，どの&nbsp;<var>j</var>&nbsp;(<var>1 ≦ j ≦ N - K + 1</var>) についても，飴&nbsp;<var>j</var>&nbsp;から飴&nbsp;<var>j + K - 1</var>&nbsp;までの連続する&nbsp;<var>K</var>&nbsp;個の飴のうち，食べる飴の個数は&nbsp;<var>2</var>&nbsp;個以下でなければならない．</p>

<p>このもとで，JOI 君は食べる飴の美味しさの合計をできるだけ大きくしたい．</p>

<p><var>N</var>&nbsp;個の飴の美味しさと&nbsp;<var>K</var>&nbsp;が与えられたとき，JOI 君が食べる飴の美味しさの合計の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>K</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p>標準出力に，JOI 君が食べる飴の美味しさの合計の最大値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ K ≦ N ≦ 3&nbsp;000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ 10<sup>9</sup></var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>