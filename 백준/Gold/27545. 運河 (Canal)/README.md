# [Gold I] 運河 (Canal) - 27545

[문제 링크](https://www.acmicpc.net/problem/27545)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 19, 정답 비율: 67.857%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>JOIG 王国は <var>H</var> 行 <var>W</var> 列のマス目に区切られた長方形の形をしている．上から <var>i</var> 行目 (<var>1 ≦ i ≦ H</var>)，左から <var>j</var> 列目 (<var>1 ≦ j ≦ W</var>) のマスをマス <var>(i,j)</var> と呼ぶ．</p>

<p>各マスには標高と呼ばれる整数が定まっている．マス <var>(i,j)</var> の標高は <var>A<sub>i,j</sub></var> である．</p>

<p>JOIG 王国では，王国を縦断する運河を建設することにした．運河の建設は，以下のように行われる．</p>

<ul>
	<li>ある整数 <var>k</var> (<var>1 ≦ k &lt; W</var>) を定める．左から <var>k</var> 列目と <var>k+1</var> 列目の間に，王国の上端から下端まで縦断する運河を建設する．</li>
</ul>

<p>運河を横切らず，辺で接している標高が同じマスへの移動を繰り返すことで相互に移動できるマスの集まりをここでは<strong>平地</strong>と呼ぶ．国土を管理しやすくするため，平地の個数ができるだけ少なくなるように運河の建設位置を決めたい．</p>

<p>JOIG 王国の地形の情報が与えられたとき，運河を建設した後の JOIG 王国内の平地の個数としてありうる最小値を求めるプログラムを作成せよ．</p>

<ul>
</ul>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>H</var> <var>W</var>
<var>A<sub>1,1</sub></var> <var>A<sub>1,2</sub></var> <var>&hellip;</var> <var>A<sub>1,W</sub></var>
<var>A<sub>2,1</sub></var> <var>A<sub>2,2</sub></var> <var>&hellip;</var> <var>A<sub>2,W</sub></var>
<var>:</var>
<var>A<sub>H,1</sub></var> <var>A<sub>H,2</sub></var> <var>&hellip;</var> <var>A<sub>H,W</sub></var></pre>

### 출력

<p>運河を建設した後の JOIG 王国内の平地の個数としてありうる最小値を出力せよ．</p>

### 제한

<ul>
	<li><var>H ≧ 1</var>．</li>
	<li><var>W ≧ 2</var>．</li>
	<li><var>H &times; W ≦ 500 000</var>．</li>
	<li><var>1 ≦ A<sub>i,j</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ H</var>，<var>1 ≦ j ≦ W</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>