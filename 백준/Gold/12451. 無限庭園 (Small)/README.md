# [Gold III] 無限庭園 (Small) - 12451

[문제 링크](https://www.acmicpc.net/problem/12451)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>パスカル王国の王様は迷路が大好きである。あるとき王様は家臣に、お城の広大な庭を覆うような迷路を作れと命じた。 これは大変な指示だった。なぜなら、お城の庭は無限に広いからである。 原点をお城の位置に置き、<strong>X</strong>&nbsp;軸方向を東に、<strong>Y</strong>&nbsp;軸方向を北にとると、庭は&nbsp;<strong>X</strong>&ge;0,&nbsp;<strong>Y</strong>&ge;0 となる領域全体に広がっている。</p>

<p>ここで、素晴らしいロボット工学専門家であるあなたは、庭仕事ロボットを改良して、庭に迷路を描くロボットを作ってしまった。 このロボットは A, B 2 つのモードと、 &quot;L,X,R&quot; の文字が続けて書かれたテープ、そしてテープの一箇所を指す読取ヘッダからなる。ロボットはテープの読取ヘッダが指す文字を読み、それに従って動きを変えることができる。読取ヘッダは前から後ろに、一方向に読むことしかできないが、ロボットは今まで読んだテープを含むテープ全体をコピーしてテープの末端に貼り付けることで、テープをさらに読み進めることができる。また、ロボットはテープの任意の箇所を書き換えることができる。</p>

<p>ロボットは以下の処理を順に行う。</p>

<ul>
	<li>読取ヘッダがテープの最後の文字を指している場合、モードに応じて以下のどちらかの処理を行う。
	<ul>
		<li>ロボットが A モードの場合、テープの最初の文字を &quot;X&quot; であれば &quot;L&quot; に、 &quot;L&quot; であれば &quot;X&quot; に書き換える。その後テープ全体をコピーし、コピーしたテープ中の &quot;L&quot; を &quot;R&quot; に、 &quot;R&quot; を &quot;L&quot; に書き換えた上でテープの最後に追加する。その後、モードを B モードとする。</li>
		<li>ロボットが B モードの場合、テープ全体をコピーし、その前後をひっくり返した上でテープの最後に追加する。その後、モードを A モードとする。</li>
	</ul>
	</li>
	<li>前方に距離 2 だけ進み、読取ヘッダをひとつ進ませる。</li>
	<li>読取ヘッダに書いてある文字を読む。文字が &quot;L&quot; なら左に 90 度回転、 &quot;R&quot; なら右に 90 度回転する。 &quot;X&quot; の場合は何もしない。</li>
	<li>ここまでの処理を繰り返す。</li>
</ul>

<p>このロボットを座標 (1,1) に置き、<strong>Y</strong>&nbsp;軸方向正の向きを向かせ、 &quot;X&quot; 一文字だけ書かれたテープを読ませる。ロボットの初期状態は A モードで、読取ヘッダは文字 &quot;X&quot; を指している。ここでロボットを起動すると、ロボットは庭を無限に走り続ける。このロボットの軌跡を迷路の壁とすると、複雑な迷路ができることがわかった。王様はあなたのこの業績を褒めた。</p>

<p><img src="https://onlinejudgeimages.s3.amazonaws.com/problem/12451/images-39.png" style="border:0px; vertical-align:middle" /></p>

<div style="color: rgb(0, 0, 0); font-family: Arial, sans-serif;">図: ロボットの最初 8 歩の動きと状態変化。テープ中の &quot;[]&quot; で囲まれた文字は、読取ヘッダの指している字を示している。</div>

<p>&nbsp;</p>

<p>図は、ロボットがはじめにどのように振る舞うかを表している。座標 (1, 1) からスタートしたロボットは、直後にテープを追加して北に長さ 2 だけ直進し、東へ方向転換する。その後、図のように進んでゆく。</p>

<p>&nbsp;</p>

<p>さて、この迷路が複雑すぎて中から出て来られなくなるとそれはそれで問題である。王様はあなたに、このロボットが描いた迷路を検証するよう命じた。検証のために、あなたは迷路内の指定された 2 点間の最短距離を求めるプログラムを作ることにした。</p>

<p>プログラムは、2 点&nbsp;<strong>P</strong>,&nbsp;<strong>Q</strong>&nbsp;の座標が与えられ、これらの迷路内での最短距離を出力する。簡単のために、距離を測るための道のりは X 軸に垂直あるいは平行な線分のみで構成されるとする。また、壁は通り抜けることはできないものの、壁自体は限りなく薄く、壁のある線にはいくらでも近づけるとする。</p>

### 입력

<p>最初の行はテストケースの個数&nbsp;<strong>T</strong>&nbsp;を表す正の整数である。それ以降の行に、<strong>T</strong>&nbsp;個のケースを表すデータが続く。</p>

<p>それぞれのテストケースは、スペースで区切られた 4 つの偶数からなる 1 行の文字列で表現される。これらの偶数は、順番に&nbsp;<strong>Px</strong>,&nbsp;<strong>Py</strong>,&nbsp;<strong>Qx</strong>,&nbsp;<strong>Qy</strong>&nbsp;を表す。</p>

<p>点 (<strong>Px</strong>,&nbsp;<strong>Py</strong>), (<strong>Qx</strong>,&nbsp;<strong>Qy</strong>) はともに、迷路の壁のない点を指している。これは、迷路の壁の座標が必ず奇数を含むことから明らかである。</p>

<h3>制限</h3>

<ul>
	<li>0 &le;&nbsp;<strong>Px</strong>,&nbsp;<strong>Py</strong>,&nbsp;<strong>Qx</strong>,&nbsp;<strong>Qy</strong>.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>Px</strong>,&nbsp;<strong>Py</strong>,&nbsp;<strong>Qx</strong>,&nbsp;<strong>Qy</strong>&nbsp;&le; 32.</li>
</ul>

### 출력

<p>それぞれのテストケースについて、</p>

<pre>
Case #X: L
</pre>

<p>という 1 行の文字列を出力せよ。ここで、<strong>X</strong>&nbsp;は 1 から始まるテストケースの番号であり、<strong>L</strong>&nbsp;は点&nbsp;<strong>P</strong>&nbsp;から点&nbsp;<strong>Q</strong>&nbsp;までの、本文中で定義された道のりを通った場合の最短距離である。</p>

<p>&nbsp;</p>

<div>&nbsp;</div>