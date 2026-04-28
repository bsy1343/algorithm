# [Gold V] いちご 2 (Strawberry 2) - 24423

[문제 링크](https://www.acmicpc.net/problem/24423)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 150, 정답: 54, 맞힌 사람: 50, 정답 비율: 39.370%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>果物好きのビ太郎は，いちごのつかみ取りに挑戦することにした．ビ太郎の目の前には&nbsp;<var>1</var>&nbsp;脚の机がある．机は長方形の形をしており，縦&nbsp;<var>H</var>&nbsp;行，横&nbsp;<var>W</var>&nbsp;列のマス目状に区切られている．机には&nbsp;<var>N</var>&nbsp;個のいちごが置かれており，<var>i</var>&nbsp;番目 (<var>1 ≦ i ≦ N</var>) のいちごは上から&nbsp;<var>A<sub>i</sub></var>&nbsp;行目，左から&nbsp;<var>B<sub>i</sub></var>&nbsp;列目のマスにある．複数のいちごが同じマスに置かれている可能性もある．</p>

<p>ビ太郎は机から，縦&nbsp;<var>3</var>&nbsp;行，横&nbsp;<var>3</var>&nbsp;列の正方形の領域をなす&nbsp;<var>9</var>&nbsp;個のマスを選び，それらのマスにあるいちごをすべて取る．この動作は&nbsp;<var>1</var>&nbsp;回だけ行う．</p>

<p>ビ太郎は，なるべく多くのいちごを取りたい．</p>

<p>机の大きさといちごの位置についての情報が与えられたとき，取れるいちごの個数の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>H</var> <var>W</var>
<var>N</var>
<var>A<sub>1</sub></var> <var>B<sub>1</sub></var>
<var>A<sub>2</sub></var> <var>B<sub>2</sub></var>
:
<var>A<sub>N</sub></var> <var>B<sub>N</sub></var></pre>

### 출력

<p>標準出力に，取れるいちごの個数の最大値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>3 ≦ H ≦ 1&nbsp;000&nbsp;000&nbsp;000</var>．</li>
	<li><var>3 ≦ W ≦ 1&nbsp;000&nbsp;000&nbsp;000</var>．</li>
	<li><var>1 ≦ N ≦ 60&nbsp;000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ H</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>i</sub>&nbsp;≦ W</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>