# [Gold I] A Holiday of Miss Brute Force - 22462

[문제 링크](https://www.acmicpc.net/problem/22462)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

0-1 너비 우선 탐색, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>全探索お姉さんはとても優秀な女性である。 お姉さんは格子状の道の経路の数え上げを数千程度なら簡単に数え上げてしまう。 あなたと全探索お姉さんは今、六角形のタイルが敷き詰められた部屋にいる。 お姉さんは初めて見る六角形にとても興奮している様子である。 六角形の並びを座標に表すことに不慣れなお姉さんは図1のような座標系で部屋を表した。</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22462.%E2%80%85A%E2%80%85Holiday%E2%80%85of%E2%80%85Miss%E2%80%85Brute%E2%80%85Force/38ca9763.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22462.%E2%80%85A%E2%80%85Holiday%E2%80%85of%E2%80%85Miss%E2%80%85Brute%E2%80%85Force/38ca9763.png" data-original-src="https://upload.acmicpc.net/906c8caa-0d0d-47ea-88f0-78ce3aa2d646/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 305px;" /></p>

<p style="text-align: center;">図1</p>

<p>あなたはこの座標系上である地点からある地点まで移動したい。 しかし、お姉さんは 1 分ごとに動きたい方向をあなたに指示する。 いつものお姉さんなら同じ座標の場所を通らないようにあなたに移動の指示を出すだろう。 しかし、この座標系に不慣れなお姉さんは<var>|x&times;y&times;t|</var>(<var>x</var>：<var>x</var> 座標、<var>y</var>：<var>y</var>座標、<var>t</var>:最初の指示からの経過時間[分])を 6 で割った余り に対応する方向（図で示す番号と対応）を指示するだけで、まったくのでたらめな方向にあなたを誘導する。</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22462.%E2%80%85A%E2%80%85Holiday%E2%80%85of%E2%80%85Miss%E2%80%85Brute%E2%80%85Force/ecbaa5c4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22462.%E2%80%85A%E2%80%85Holiday%E2%80%85of%E2%80%85Miss%E2%80%85Brute%E2%80%85Force/ecbaa5c4.png" data-original-src="https://upload.acmicpc.net/0716d9db-c445-47d4-972e-2f7923eba652/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 238px; height: 285px;" /></p>

<p style="text-align: center;">図2</p>

<p>お姉さんを傷つけたくないあなたは、お姉さんの指示をできるだけ守りつつ目的地までたどり着きたい。 あなたは許された行動は下の 7 つの行動である。</p>

<ul>
	<li>方向 0 へ 1 タイル移動</li>
	<li>方向 1 へ 1 タイル移動</li>
	<li>方向 2 へ 1 タイル移動</li>
	<li>方向 3 へ 1 タイル移動</li>
	<li>方向 4 へ 1 タイル移動</li>
	<li>方向 5 へ 1 タイル移動</li>
	<li>その場に留まる</li>
</ul>

<p>お姉さんが指示を出した直後にあなたはこれら行動のうちの必ず1つを行う。 部屋には家具があり家具が配置されているタイルの中に移動することはできない。 また、<var>y</var> 座標の絶対値が <var>ly</var> を超えたり <var>x</var> 座標の絶対値が <var>lx</var> を超えるような移動は許されていない。 しかし、お姉さんはそのような移動を指示することがある。 指示を無視するとはお姉さんが示した方向と異なる方向へ移動するか、 もしくは、その場に留まることである。 目的地にたどり着くために最小で何度指示を無視すれば良いかを出力せよ。 目的地にたどり着くことが不可能な場合は -1 を出力せよ。</p>

### 입력

<p>入力は以下の形式で与えられる。</p>

<pre>
<var>sx</var> <var>sy</var> <var>gx</var> <var>gy</var>
<var>n</var>
<var>x<sub>1</sub></var> <var>y<sub>1</sub></var>
...
<var>x<sub>i</sub></var> <var>y<sub>i</sub></var>
...
<var>x<sub>n</sub></var> <var>y<sub>n</sub></var>
<var>lx</var> <var>ly</var>
</pre>

<p>ここで、</p>

<ul>
	<li><var>sx</var>, <var>sy</var> は出発地点の座標</li>
	<li><var>gx</var>, <var>gy</var> は目的地の座標</li>
	<li><var>n</var> は部屋に配置されている家具の数</li>
	<li><var>x<sub>i</sub></var>, <var>y<sub>i</sub></var> は家具があるタイルの座標</li>
	<li><var>lx</var>, <var>ly</var> は移動できる <var>X</var>, <var>Y</var> それぞれの座標の絶対値の上限 である。</li>
</ul>

### 출력

<p>
出力は1つの整数を含む1行で出力せよ。
目的地にたどり着ける場合は、最小の指示を無視する回数を出力せよ。
目的地にたどり着くことが不可能な場合は-1を出力せよ。
</p>

### 제한

<ul>
	<li>入力はすべて整数</li>
	<li><var>-lx &le; sx</var>, <var>gx &le; lx</var></li>
	<li><var>-ly &le; sy</var>, <var>gy &le; ly</var></li>
	<li><var>(sx, sy) &ne; (gx, gy)</var></li>
	<li><var>(xi, yi) &ne; (sx, sy)(1&le;i&le;n)</var></li>
	<li><var>(xi, yi) &ne; (gx, gy)(1&le;i&le;n)</var></li>
	<li><var>(xi, yi) &ne; (xj, yj)(i &ne; j)</var></li>
	<li><var>0&le; n &le; 1000</var></li>
	<li><var>-lx &le; xi &le; lx (1&le;i&le;n)</var></li>
	<li><var>-ly &le; yi &le; ly (1&le;i&le;n)</var></li>
	<li><var>0 &lt; lx, ly &le; 100</var></li>
</ul>