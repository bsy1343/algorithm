# [Gold I] ConvexCut - 22479

[문제 링크](https://www.acmicpc.net/problem/22479)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 15, 정답 비율: 68.182%

### 분류

기하학

### 문제 설명

<p>N個の頂点からなる凸多角形が与えられる。各頂点の座標は反時計周りに(X<sub>1</sub>, Y<sub>1</sub>), (X<sub>2</sub> ,Y<sub>2</sub>), &hellip;&hellip;, (X<sub>N</sub>, Y<sub>N</sub>)で表わされる。 点Pを通るどのような直線で凸多角形を切断しても、切断後に得られる2つの凸多角形の面積が等しいような点Pの座標を求めよ。</p>

### 입력

<p>入力は以下の形式で与えられる。</p>

<pre>
N
X<sub>1</sub> Y<sub>1</sub>
X<sub>2</sub> Y<sub>2</sub>
&hellip;&hellip;
X<sub>N</sub> Y<sub>N</sub>
</pre>

### 출력

<p>問題文の条件を満たす点があるのならば、その点の座標を</p>

<pre>
X Y
</pre>

<p>の形式で出力せよ。 点が存在しない場合は&quot;NA&quot;と1行に出力せよ。</p>

### 제한

<ul>
	<li>
	<p>入力は全て整数である</p>
	</li>
	<li>
	<p>3 &le; N &le; 50</p>
	</li>
	<li>
	<p>0 &le; |X<sub>i</sub>|, |Y<sub>i</sub>| &le; 1000000</p>
	</li>
	<li>
	<p>入力の多角形は単純な凸多角形である。</p>
	</li>
	<li>
	<p>出力は、出力座標を(X, Y)、厳密解を(cX, cY)とした時にmax(|X-cX|, |Y-cY|) &le; 0.0001を満たす必要がある</p>
	</li>
</ul>