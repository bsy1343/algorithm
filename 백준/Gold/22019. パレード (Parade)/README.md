# [Gold II] パレード (Parade) - 22019

[문제 링크](https://www.acmicpc.net/problem/22019)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 104, 정답: 50, 맞힌 사람: 40, 정답 비율: 47.059%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>JOI 王国では，JOIG の開催を記念して鼓笛隊のパレードを行うことになった．</p>

<p>JOI 王国には&nbsp;<var>N</var>&nbsp;個の都市があり，<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号が付けられている．また，鼓笛隊が通行可能な一方通行の道が&nbsp;<var>M</var>&nbsp;本あり，<var>1</var>&nbsp;から&nbsp;<var>M</var>&nbsp;までの番号が付けられている．道&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ M</var>) は都市&nbsp;<var>A<sub>i</sub></var>&nbsp;から都市&nbsp;<var>B<sub>i</sub></var>&nbsp;へ向かう一方通行の道であり，長さは&nbsp;<var>C<sub>i</sub></var>&nbsp;である．</p>

<p>パレードでは，鼓笛隊は次の条件を満たすように移動しなければならない．</p>

<ul>
	<li>都市&nbsp;<var>1</var>&nbsp;を出発し，何本かの道を進行方向に進むことを繰り返して都市&nbsp;<var>N</var>&nbsp;へ向かう．</li>
	<li>鼓笛隊が通る道の長さの総和は&nbsp;<var>L</var>&nbsp;以下である．</li>
</ul>

<p>JOI 王国の女王であるあなたは，この条件を満たす鼓笛隊の移動経路が無いかもしれないことに気が付いた．そこで，パレードを行うために，パレード当日に&nbsp;<var>0</var>&nbsp;本以上の道の進行方向を反転させることにした．</p>

<p>混乱を避けるため，なるべく進行方向を反転させる道の本数は少なくしたい．</p>

<p>JOI 王国の都市と道の情報と，整数&nbsp;<var>L</var>&nbsp;が与えられたとき，いくつかの道の進行方向を反転させることでパレードを行うことができるかを判定し，もし行うことができる場合はパレードを行うために必要な進行方向を反転させる道の本数の最小値を出力せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var> <var>L</var>
<var>A<sub>1</sub></var> <var>B<sub>1</sub></var> <var>C<sub>1</sub></var>
<var>A<sub>2</sub></var> <var>B<sub>2</sub></var> <var>C<sub>2</sub></var>
<var>:</var>
<var>A<sub>M</sub></var> <var>B<sub>M</sub></var> <var>C<sub>M</sub></var></pre>

### 출력

<p>標準出力に，パレードを行うために必要な進行方向を反転させる道の本数の最小値を&nbsp;<var>1</var>&nbsp;行で出力せよ．ただし，どのように道の進行方向を反転させてもパレードを行うことができない場合は，<code>-1</code>&nbsp;を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 1&nbsp;000</var>．</li>
	<li><var>0 ≦ M ≦ 1&nbsp;000</var>．</li>
	<li><var>1 ≦ L ≦ 1&nbsp;000&nbsp;000&nbsp;000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ i ≦ M</var>)．</li>
	<li><var>1 ≦ B<sub>i</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ i ≦ M</var>)．</li>
	<li><var>A<sub>i</sub>&nbsp;&ne; B<sub>i</sub></var>&nbsp;(<var>1 ≦ i ≦ M</var>)．</li>
	<li><var>(A<sub>i</sub>, B<sub>i</sub>) &ne; (A<sub>j</sub>, B<sub>j</sub>)</var>&nbsp;(<var>1 ≦ i &lt; j ≦ M</var>)．</li>
	<li><var>1 ≦ C<sub>i</sub>&nbsp;≦ 1&nbsp;000&nbsp;000</var>&nbsp;(<var>1 ≦ i ≦ M</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>