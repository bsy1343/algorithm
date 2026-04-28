# [Gold II] 国土分割 (Land Division) - 24450

[문제 링크](https://www.acmicpc.net/problem/24450)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 50, 맞힌 사람: 49, 정답 비율: 75.385%

### 분류

구현, 브루트포스 알고리즘, 누적 합

### 문제 설명

<p>JOI 国は縦&nbsp;<var>H</var>&nbsp;行，横&nbsp;<var>W</var>&nbsp;列のマス目状に区切られた長方形の形をしている．JOI 国の縦方向は南北方向に平行であり，横方向は東西方向に平行である．北から&nbsp;<var>i</var>&nbsp;行目 (<var>1 ≦ i ≦ H</var>)，西から&nbsp;<var>j</var>&nbsp;列目 (<var>1 ≦ j ≦ W</var>) のマスの人口は&nbsp;<var>A<sub>i,j</sub></var>&nbsp;人である．</p>

<p>JOI 国では，行政の効率化のため，次の条件を満たす境界線を&nbsp;<var>1</var>&nbsp;本以上引くことで，国全体を&nbsp;<var>2</var>&nbsp;つ以上の地区に分割することにした．</p>

<ul>
	<li>境界線はマス目の境界上にある．</li>
	<li>境界線は JOI 国の北端から南端または JOI 国の東端から西端を結ぶ線分である．</li>
</ul>

<p>JOI 国の各マスの人口が与えられるので，考えられる分割方法のうち，すべての地区の人口が等しくなるような分割の方法は何通りあるかを求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>H</var> <var>W</var>
<var>A<sub>1,1</sub></var> <var>A<sub>1,2</sub></var> <var>&hellip;</var> <var>A<sub>1,W</sub></var>
<var>A<sub>2,1</sub></var> <var>A<sub>2,2</sub></var> <var>&hellip;</var> <var>A<sub>2,W</sub></var>
<var>:</var>
<var>A<sub>H,1</sub></var> <var>A<sub>H,2</sub></var> <var>&hellip;</var> <var>A<sub>H,W</sub></var></pre>

### 출력

<p>標準出力に，すべての地区の人口が等しくなるような分割の方法は何通りあるかを&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ H ≦ 50</var>．</li>
	<li><var>1 ≦ W ≦ 50</var>．</li>
	<li><var>1 ≦ A<sub>i,j</sub>&nbsp;≦ 100&nbsp;000</var>&nbsp;(<var>1 ≦ i ≦ H</var>，<var>1 ≦ j ≦ W</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>