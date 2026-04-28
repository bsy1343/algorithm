# [Silver II] いちご (Strawberry) - 18418

[문제 링크](https://www.acmicpc.net/problem/18418)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 141, 정답: 101, 맞힌 사람: 89, 정답 비율: 74.167%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Just Oishi Ichigo 農園 (以下 JOI 農園) は東西に細長いことで有名ないちご農園であり，その入り口は農園の最も西にある．以下では，入り口から東に&nbsp;<var>k</var>&nbsp;メートル進んだ場所を地点&nbsp;<var>k</var>&nbsp;と呼ぶことにする．</p>

<p>JOI 農園内には&nbsp;<var>N</var>&nbsp;個のいちごがなっている．それぞれ&nbsp;<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;の番号がつけられている．どのいちごも時刻&nbsp;<var>0</var>&nbsp;までは青い．いちご&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) は地点&nbsp;<var>A<sub>i</sub></var>&nbsp;に実をつけており，時刻&nbsp;<var>T<sub>i</sub></var>&nbsp;になると熟し赤い状態になる．</p>

<p>いちごは青い状態では収穫できない．つまり，いちご&nbsp;<var>i</var>&nbsp;は時刻&nbsp;<var>T<sub>i</sub></var>&nbsp;となるまで収穫できない．あなたは時刻&nbsp;<var>0</var>&nbsp;に地点&nbsp;<var>0</var>&nbsp;にある農園の入り口から出発して，最大秒速&nbsp;<var>1</var>&nbsp;メートルで東西方向に移動しながらいちごを収穫する．いちごを収穫するのにかかる時間は無視できるとする．</p>

<p>いちご農園についての情報が与えられるので，すべてのいちごを赤い状態で収穫したあと入り口に帰ってくるまでにかかる時間の最小値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>T<sub>1</sub></var>
<var>A<sub>2</sub></var> <var>T<sub>2</sub></var>
<var>:</var>
<var>A<sub>N</sub></var> <var>T<sub>N</sub></var></pre>

### 출력

<p>すべてのいちごを赤い状態で収穫したあと入り口に帰ってくるまでにかかる時間の最小値を&nbsp;<var>1</var>&nbsp;行に出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100 000</var>．</li>
	<li><var>0 ≦ A<sub>i</sub>&nbsp;≦ 1 000 000 000 (= 10<sup>9</sup>)</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>0 ≦ T<sub>i</sub>&nbsp;≦ 1 000 000 000 (= 10<sup>9</sup>)</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>