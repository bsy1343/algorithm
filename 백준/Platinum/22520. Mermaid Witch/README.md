# [Platinum I] Mermaid Witch - 22520

[문제 링크](https://www.acmicpc.net/problem/22520)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

많은 조건 분기, 기하학, 구현, 수학, 시뮬레이션

### 문제 설명

<p>人魚の魔女 KLARISSA はコンサートホールの中で在りし日の感動を夢見つづけている．彼女の運命の車輪は具現化し，コンサートホールの中で転がり続けている．</p>

<p><i>佐倉杏子</i>はその運命の車輪が円ではなくカラフルな正方形であることに気がついた．運命の車輪はコンサートホールの西から東へ転がろうとしている．<i>佐倉杏子</i>は運命の車輪がある所まで転がったときにその上に飛び移ることにした．そこで飛び移るべき面の色を知り，飛び移るタイミングを見計らいたい．</p>

<p>ここでは車輪を&nbsp;<var>2</var>&nbsp;次元平面における&nbsp;<var>1</var>&nbsp;辺の長さが&nbsp;<var>1</var>&nbsp;の正方形と見なし，西から東へ向かう方向を&nbsp;<var><i>x</i></var>&nbsp;軸の正向き，鉛直上方向を&nbsp;<var><i>y</i></var>&nbsp;軸の正向きとする． 今，運命の車輪の一面が床に対して接地しており，床と反対の面が赤色，東側の面が緑色，床と接地している面が青色，西側の面が白色になっている．現在接地している面のうち最も西の点の&nbsp;<var><i>x</i></var>&nbsp;座標が&nbsp;<var><i>x</i>=<i>A</i></var>&nbsp;であるとする．運命の車輪がすべることなく床に対して転がり続け，ある一面が床に接地した時で，設置している面のうち最も東の点の&nbsp;<var><i>x</i></var>&nbsp;座標が&nbsp;<var><i>x</i>=<i>B</i></var>&nbsp;を初めて超えるとき，床に対して表向きになっている面は何色になるかを求めよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var><i>N</i>&nbsp;<i>A</i>&nbsp;<i>B</i>
<i>x</i><sub>1</sub>&nbsp;<i>y</i><sub>1</sub>
<i>x</i><sub>2</sub>&nbsp;<i>y</i><sub>2</sub>
&hellip;
<i>x</i><sub><i>N</i></sub>&nbsp;<i>y</i><sub><i>N</i></sub>
</var></pre>

<p>コンサートホールの床は下に凸な折れ線として与えられる．<var><i>N</i></var>&nbsp;は折れ線の端点として与えられる点の個数である．<var><i>A</i></var>&nbsp;は車輪の初期のx座標，<var><i>B</i></var>&nbsp;は車輪の目標位置のx座標を表す．</p>

<p><var>(<i>x</i><sub><i>i</i></sub>,<i>y</i><sub><i>i</i></sub>)</var>&nbsp;は折れ線の情報である． コンサートホールの床は点&nbsp;<var>(<i>x</i><sub>1</sub>,<i>y</i><sub>1</sub>)</var>&nbsp;と点&nbsp;<var>(<i>x</i><sub>2</sub>,<i>y</i><sub>2</sub>)</var>&nbsp;を結ぶ線分，点&nbsp;<var>(<i>x</i><sub>2</sub>,<i>y</i><sub>2</sub>)</var>&nbsp;と点&nbsp;<var>(<i>x</i><sub>3</sub>,<i>y</i><sub>3</sub>)</var>&nbsp;を結ぶ線分，...，点&nbsp;<var>(<i>x</i><sub><i>N</i>&minus;1</sub>,<i>y</i><sub><i>N</i>&minus;1</sub>)</var>&nbsp;と点&nbsp;<var>(<i>x</i><sub><i>N</i></sub>,<i>y</i><sub><i>N</i></sub>)</var>&nbsp;を結ぶ線分によってできているものとする．</p>

### 출력

<p>色を1行に出力せよ．赤色なら&nbsp;<code>Red</code>，緑色なら&nbsp;<code>Green</code>，青色なら&nbsp;<code>Blue</code>，白色なら&nbsp;<code>White</code>&nbsp;と出力すること．</p>

### 제한

<ul>
	<li><var>2&le;<i>N</i>&le;30</var></li>
	<li><var>0&le;<i>A</i>&le;200</var></li>
	<li><var>0&le;<i>B</i>&le;200</var></li>
	<li><var><i>A</i>&lt;<i>B</i></var></li>
	<li><var>0&le;<i>x</i><sub><i>i</i></sub>&le;200,0&le;<i>y</i><sub><i>i</i></sub>&le;200(1&le;<i>i</i>&le;<i>N</i>)</var></li>
	<li>入力値はすべて整数である．</li>
	<li><var><i>x</i><sub><i>i</i></sub></var>&nbsp;は狭義単調増加である．すなわち，<var><i>x</i><sub><i>i</i></sub>&lt;<i>x</i><sub><i>i</i>+1</sub></var></li>
	<li><var><i>x</i><sub>1</sub>&lt;<i>A</i>&lt;<i>x</i><sub>2</sub>&minus;1</var></li>
	<li><var><i>x</i><sub><i>N</i>&minus;1</sub>+1&lt;<i>B</i>&lt;<i>x</i><sub><i>N</i></sub></var></li>
	<li>床は下に凸である．すなわち，<var>(<i>y</i><sub><i>i</i>+1</sub>&minus;<i>y</i><sub><i>i</i></sub>)&frasl;(<i>x</i><sub><i>i</i>+1</sub>&minus;<i>x</i><sub><i>i</i></sub>)&lt;(<i>y</i><sub><i>i</i>+2</sub>&minus;<i>y</i><sub><i>i</i>+1</sub>)&frasl;(<i>x</i><sub><i>i</i>+2</sub>&minus;<i>x</i><sub><i>i</i>+1</sub>)</var>&nbsp;が満たされている．</li>
	<li>回転をしたそれぞれの段階において，車輪の頂点の&nbsp;<var><i>x</i></var>&nbsp;座標が&nbsp;<var><i>B</i></var>&nbsp;より&nbsp;<var>10<sup>&minus;5</sup></var>&nbsp;以内の値になることはない．</li>
	<li>車輪の&nbsp;<var>1</var>&nbsp;辺の長さを&nbsp;<var>&plusmn;10<sup>&minus;6</sup></var>&nbsp;だけ変化させても目標位置に達するまでに要する車輪の回転回数は変化せず，また変化させなかった状態から&nbsp;<var><i>x</i></var>&nbsp;座標は高々&nbsp;<var>10<sup>&minus;3</sup></var>&nbsp;しか変化しない．</li>
</ul>

### 힌트

<p>&nbsp;</p>

<p>制約より，次のことが保証される．</p>

<ul>
	<li>初期状態において，車輪が床にめり込んでいることはない．</li>
	<li>車輪が目標位置を初めて越えて回転し終わったとき，必ず車輪のある 1 面が床に接地している．</li>
</ul>