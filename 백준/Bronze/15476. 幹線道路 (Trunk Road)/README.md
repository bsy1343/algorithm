# [Bronze I] 幹線道路 (Trunk Road) - 15476

[문제 링크](https://www.acmicpc.net/problem/15476)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 168, 정답: 145, 맞힌 사람: 133, 정답 비율: 88.667%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>JOI 市は，東西方向にまっすぐに伸びる&nbsp;<var>H</var>&nbsp;本の道路と，南北方向にまっすぐに伸びる&nbsp;<var>W</var>&nbsp;本の道路によって，碁盤の目の形に区分けされている．道路と道路の間隔は&nbsp;<var>1</var>&nbsp;である．JOI 市では，これら&nbsp;<var>H+W</var>&nbsp;本の道路から，東西方向に&nbsp;<var>1</var>&nbsp;本，南北方向に&nbsp;<var>1</var>&nbsp;本，合計&nbsp;<var>2</var>&nbsp;本の道路を幹線道路として選ぶことになった．</p>

<p>北から&nbsp;<var>i</var>&nbsp;本目 (<var>1≦i≦H</var>) の道路と，西から&nbsp;<var>j</var>&nbsp;本目 (<var>1≦j≦W</var>) の道路の交差点を，交差点&nbsp;<var>(i,j)</var>&nbsp;とする．交差点&nbsp;<var>(i,j)</var>&nbsp;と北から&nbsp;<var>m</var>&nbsp;本目 (<var>1≦m≦H</var>) の道路の距離は&nbsp;<var>|i-m|</var>&nbsp;であり，交差点&nbsp;<var>(i,j)</var>&nbsp;と西から&nbsp;<var>n</var>&nbsp;本目 (<var>1≦n≦W</var>) の道路の距離は&nbsp;<var>|j-n|</var>&nbsp;である． また，交差点&nbsp;<var>(i,j)</var>&nbsp;の近くには&nbsp;<var>A_{i,j}</var>&nbsp;人の住人が住んでいる．</p>

<p><var>2</var>&nbsp;本の幹線道路を選んだときの，JOI 市の全ての住人に対する，最寄りの交差点から近い方の幹線道路への距離の総和の最小値を求めよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>H</var> <var>W</var>
<var>A_{1,1}</var> <var>A_{1,2}</var> ... <var>A_{1,W}</var>
:
<var>A_{H,1}</var> <var>A_{H,2}</var> ... <var>A_{H,W}</var>
</pre>

### 출력

<p>JOI 市の全ての住人に対する，最寄りの交差点から近い方の幹線道路への距離の総和の最小値を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ H ≦ 25</var></li>
	<li><var>2 ≦ W ≦ 25</var></li>
	<li><var>0 ≦ A_{i,j} ≦ 100</var>&nbsp;(<var>1 ≦ i ≦ H</var>,&nbsp;<var>1 ≦ j ≦ W</var>)</li>
</ul>