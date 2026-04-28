# [Bronze II] ボールの移動 (Moving Balls) - 24089

[문제 링크](https://www.acmicpc.net/problem/24089)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 223, 정답: 187, 맞힌 사람: 154, 정답 비율: 89.017%

### 분류

구현, 시뮬레이션

### 문제 설명

<p><var>N</var>&nbsp;個のボールがあり，<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号が付けられている．また，何個でもボールを入れることのできる&nbsp;<var>N</var>&nbsp;個の箱があり，箱には&nbsp;<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号が付けられている．</p>

<p>箱&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) には最初，ボール&nbsp;<var>i</var>&nbsp;が入っていた．</p>

<p>JOI 高校の生徒である葵は，この状態から箱とボールに対して&nbsp;<var>M</var>&nbsp;回の操作を行った．<var>j</var>&nbsp;回目 (<var>1 ≦ j ≦ M</var>) の操作は，次のように行われた．</p>

<ul>
	<li>ボール&nbsp;<var>X<sub>j</sub></var>&nbsp;が入っている箱を探し，その箱からボール&nbsp;<var>X<sub>j</sub></var>&nbsp;を取り出す．その後，箱&nbsp;<var>Y<sub>j</sub></var>&nbsp;にボール&nbsp;<var>X<sub>j</sub></var>&nbsp;を入れる．</li>
</ul>

<p>葵が&nbsp;<var>M</var>&nbsp;回の操作をすべて終えた後，<var>N</var>&nbsp;個のボールがそれぞれどの箱に入っているかを求めよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>M</var>
<var>X<sub>1</sub></var> <var>Y<sub>1</sub></var>
<var>X<sub>2</sub></var> <var>Y<sub>2</sub></var>
<var>:</var>
<var>X<sub>M</sub></var> <var>Y<sub>M</sub></var></pre>

### 출력

<p><var>N</var>&nbsp;行で出力せよ．<var>i</var>&nbsp;行目 (<var>1 ≦ i ≦ N</var>) には，葵が&nbsp;<var>M</var>&nbsp;回の操作をすべて終えた後，ボール&nbsp;<var>i</var>&nbsp;が入っている箱の番号を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 2000</var>．</li>
	<li><var>1 ≦ M ≦ 2000</var>．</li>
	<li><var>1 ≦ X<sub>j</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>1 ≦ Y<sub>j</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>