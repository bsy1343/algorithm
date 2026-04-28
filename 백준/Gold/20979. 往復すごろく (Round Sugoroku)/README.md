# [Gold IV] 往復すごろく (Round Sugoroku) - 20979

[문제 링크](https://www.acmicpc.net/problem/20979)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 49, 맞힌 사람: 41, 정답 비율: 73.214%

### 분류

구현, 자료 구조, 집합과 맵

### 문제 설명

<p>JOI 高校の葵は新しいすごろくを購入した．このすごろくは&nbsp;<var>N+2</var>&nbsp;個のマスが横一列に並んだ形をしている．これらのマスには，左端のマスから右端のマスへと順に，<var>0</var>&nbsp;から&nbsp;<var>N+1</var>&nbsp;までの番号がついている．初め，マス&nbsp;<var>0</var>&nbsp;とマス&nbsp;<var>N+1</var>&nbsp;には&nbsp;<code>X</code>&nbsp;が，マス&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) には&nbsp;<var>S<sub>i</sub></var>&nbsp;が書かれている．ただし，<var>S<sub>i</sub></var>&nbsp;は文字&nbsp;<code>.</code>&nbsp;または&nbsp;<code>#</code>&nbsp;である．</p>

<p>葵はこのすごろくと&nbsp;<var>1</var>&nbsp;つの駒を使って遊んでいる．初め，駒はマス&nbsp;<var>A</var>&nbsp;(<var>1 ≦ A ≦ N</var>) に右を向いた状態で置かれている．ただし，<var>S<sub>A</sub></var>&nbsp;は文字&nbsp;<code>.</code>&nbsp;である．葵は&nbsp;<var>1</var>&nbsp;秒経つごとに，駒を向いている方向へ&nbsp;<var>1</var>&nbsp;マス移動させる．</p>

<p>このすごろくには次のような<strong>ルール</strong>が設定されている．</p>

<ul>
	<li><code>X</code>&nbsp;が書かれたマスに駒が乗ると，駒の向きは反転する．</li>
	<li><code>.</code>&nbsp;が書かれたマスに駒が乗ったとしても，何も起こらない．</li>
	<li><code>#</code>&nbsp;が書かれたマスに駒が乗ると，駒の向きは反転する．このとき，このマスに書かれた文字を&nbsp;<code>.</code>&nbsp;に変更する．したがって，その後はこのマスに駒が乗ったとしても向きは反転しない．</li>
</ul>

<p>なお，駒の反転や文字の変更にかかる時間は無視できる．</p>

<p>すごろくと駒の初めの状態が与えられたとき，<code>#</code>&nbsp;が書かれたマスがすべてなくなるまでに要する時間を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<p><var>N</var>&nbsp;<var>A</var><br />
<var>S</var></p>

<p>ただし，<var>S</var>&nbsp;は長さ&nbsp;<var>N</var>&nbsp;の文字列で，その&nbsp;<var>i</var>&nbsp;文字目 (<var>1 ≦ i ≦ N</var>) は&nbsp;<var>S<sub>i</sub></var>&nbsp;である．</p>

### 출력

<p>標準出力に，<code>#</code>&nbsp;が書かれたマスがすべてなくなるまでに何秒かかるかを&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 200&nbsp;000</var>．</li>
	<li><var>1 ≦ A ≦ N</var>．</li>
	<li><var>S<sub>i</sub></var>&nbsp;は文字&nbsp;<code>.</code>&nbsp;または&nbsp;<code>#</code>&nbsp;である (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>S<sub>A</sub></var>&nbsp;は文字&nbsp;<code>.</code>&nbsp;である．</li>
	<li><var>S<sub>i</sub></var>&nbsp;が文字&nbsp;<code>#</code>&nbsp;であるような&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) が少なくとも&nbsp;<var>1</var>&nbsp;つ存在する．</li>
</ul>