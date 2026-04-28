# [Bronze II] 分割 (Split) - 24074

[문제 링크](https://www.acmicpc.net/problem/24074)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 264, 정답: 230, 맞힌 사람: 217, 정답 비율: 91.561%

### 분류

구현

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の整数列&nbsp;<var>A = (A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>)</var>&nbsp;が与えられる．数列&nbsp;<var>A</var>&nbsp;の値はすべて異なる．</p>

<p>最大値で数列を分割したとき，最大値より前にある値の和と，最大値より後ろにある値の和を出力せよ．</p>

<p>すなわち，数列&nbsp;<var>A</var>&nbsp;の最大値を&nbsp;<var>A<sub>x</sub></var>&nbsp;とすると，<var>A<sub>1</sub>&nbsp;+ A<sub>2</sub>&nbsp;+ &hellip; + A<sub>x-1</sub></var>&nbsp;と&nbsp;<var>A<sub>x+1</sub>&nbsp;+ A<sub>x+2</sub>&nbsp;+ &hellip; +A<sub>N</sub></var>&nbsp;を出力せよ．</p>

<p>ただし最大値より前に値がない場合，最大値より前にある値の和は&nbsp;<var>0</var>&nbsp;になる．</p>

<p>同様に最大値より後ろに値がない場合，最大値より後ろにある値の和は&nbsp;<var>0</var>&nbsp;になる．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var></pre>

### 출력

<p>出力は&nbsp;<var>2</var>&nbsp;行からなる．</p>

<p><var>1</var>&nbsp;行目に，整数列&nbsp;<var>A</var>&nbsp;の，最大値より前にある値の和を出力せよ．</p>

<p><var>2</var>&nbsp;行目に，整数列&nbsp;<var>A</var>&nbsp;の，最大値より後ろにある値の和を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ 2000</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>A<sub>i</sub>&nbsp;&ne; A<sub>j</sub></var>&nbsp;(<var>1 ≦ i ＜ j ≦ N</var>)．</li>
</ul>