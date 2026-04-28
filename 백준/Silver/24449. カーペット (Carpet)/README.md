# [Silver I] カーペット (Carpet) - 24449

[문제 링크](https://www.acmicpc.net/problem/24449)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 109, 맞힌 사람: 96, 정답 비율: 78.689%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>オシャレ好きのビ太郎は，カーペットを新調した．カーペットは縦&nbsp;<var>H</var>&nbsp;行，横&nbsp;<var>W</var>&nbsp;列のマス目状に区切られた長方形の形をしており，各マスは白か黒のいずれかの色で塗られている．カーペットの上から&nbsp;<var>i</var>&nbsp;行目，左から&nbsp;<var>j</var>&nbsp;列目 (<var>1 ≦ i ≦ H</var>，<var>1 ≦ j ≦ W</var>) にあるマスの色は，文字列&nbsp;<var>S<sub>i</sub></var>&nbsp;の&nbsp;<var>j</var>&nbsp;文字目が&nbsp;<code>.</code>&nbsp;のとき白色，<code>#</code>&nbsp;のとき黒色である．</p>

<p>ビ太郎は，カーペットの最も左上のマスに駒を置き，以下の操作を何回か行うことで，その駒をカーペットの最も右下のマスに到達させるという遊びを思いついた．</p>

<ul>
	<li>駒が置かれているマスと色が異なり，かつ上下左右に隣接するマスを&nbsp;<var>1</var>&nbsp;つ選び，そのマスに駒を移動させる．</li>
</ul>

<p>ビ太郎は，到達までの操作回数をなるべく少なくしたい．ただし，カーペットの模様によっては到達させられないかもしれない．</p>

<p>カーペットの模様の情報が与えられたとき，操作を繰り返すことで左上のマスから右下のマスに駒を到達させることが可能かを判定し，可能ならば操作回数の最小値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>H</var> <var>W</var>
<var>S<sub>1</sub></var>
<var>S<sub>2</sub></var>
<var>:</var>
<var>S<sub>H</sub></var></pre>

### 출력

<p>操作を繰り返すことで左上のマスから右下のマスに駒を到達させることが可能な場合は操作回数の最小値を，不可能な場合は&nbsp;<code>-1</code>&nbsp;を，標準出力に&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ H ≦ 500</var>．</li>
	<li><var>1 ≦ W ≦ 500</var>．</li>
	<li><var>(H, W) &ne; (1, 1)</var>．</li>
	<li><var>S<sub>i</sub></var>&nbsp;は長さ&nbsp;<var>W</var>&nbsp;の文字列である (<var>1 ≦ i ≦ H</var>)．</li>
	<li><var>S<sub>i</sub></var>&nbsp;の 各文字は&nbsp;<code>.</code>&nbsp;または&nbsp;<code>#</code>&nbsp;である (<var>1 ≦ i ≦ H</var>)．</li>
	<li><var>H, W</var>&nbsp;は整数である．</li>
</ul>