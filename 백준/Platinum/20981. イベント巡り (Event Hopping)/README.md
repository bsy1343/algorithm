# [Platinum III] イベント巡り (Event Hopping) - 20981

[문제 링크](https://www.acmicpc.net/problem/20981)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 33, 맞힌 사람: 27, 정답 비율: 49.091%

### 분류

다이나믹 프로그래밍, 이분 탐색

### 문제 설명

<p>IOI 国には&nbsp;<var>2</var>&nbsp;個の町があり，それぞれ&nbsp;<var>1, 2</var>&nbsp;と番号がついている．</p>

<p>これらの町では合計&nbsp;<var>N</var>&nbsp;個のイベントが行われる．これらのイベントには&nbsp;<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号がついている．イベント&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) は町&nbsp;<var>P<sub>i</sub></var>&nbsp;で開催され，開催時刻は時刻&nbsp;<var>S<sub>i</sub>&nbsp;+ 0.1</var>&nbsp;から時刻&nbsp;<var>S<sub>i</sub>&nbsp;+ 0.9</var>&nbsp;までである．ここで&nbsp;<var>S<sub>i</sub></var>&nbsp;は整数である．JOI 君がイベント&nbsp;<var>i</var>&nbsp;に参加するためには，時刻&nbsp;<var>S<sub>i</sub>&nbsp;+ 0.1</var>&nbsp;から時刻&nbsp;<var>S<sub>i</sub>&nbsp;+ 0.9</var>&nbsp;までの間，ずっと町&nbsp;<var>P<sub>i</sub></var>&nbsp;にいる必要がある．</p>

<p>JOI 君はイベント巡りを行うことにした．イベント巡りではいくつかのイベントに参加し，必要ならば町と町の間を移動することもできる．JOI 君は時刻&nbsp;<var>0</var>&nbsp;からイベント巡りを開始する．このとき，好きな町から始めることができる．</p>

<p>JOI 君は町&nbsp;<var>1</var>&nbsp;と町&nbsp;<var>2</var>&nbsp;の間を双方向に移動することができる．<var>2</var>&nbsp;つの町の間を移動するのにかかる時間は，JOI 君がその移動を開始する時刻までに参加したイベントの数を&nbsp;<var>j</var>&nbsp;として，<var>D + K &times; j</var>&nbsp;となる．</p>

<p>イベントと町の間の移動に関する情報が与えられるので，JOI 君が参加できるイベントの数の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<p><var>N</var>&nbsp;<var>D</var>&nbsp;<var>K</var><br />
<var>P<sub>1</sub></var>&nbsp;<var>S<sub>1</sub></var><br />
<var>P<sub>2</sub></var>&nbsp;<var>S<sub>2</sub></var><br />
<var>:</var><br />
<var>P<sub>N</sub></var>&nbsp;<var>S<sub>N</sub></var></p>

### 출력

<p>標準出力に，JOI 君が参加することのできるイベントの数の最大値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 200&nbsp;000</var>．</li>
	<li><var>1 ≦ D ≦ 10<sup>12</sup></var>．</li>
	<li><var>0 ≦ K ≦ 10<sup>12</sup></var>．</li>
	<li><var>1 ≦ P<sub>i</sub>&nbsp;≦ 2</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ S<sub>i</sub>&nbsp;≦ 10<sup>12</sup></var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>S<sub>i</sub>&nbsp;&ne; S<sub>j</sub></var>&nbsp;(<var>1 ≦ i &lt; j ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>