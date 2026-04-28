# [Gold V] 爆発の連鎖 - 22362

[문제 링크](https://www.acmicpc.net/problem/22362)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 62, 맞힌 사람: 59, 정답 비율: 93.651%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>あなたは爆弾を使ったゲームで遊んでいる．このゲームのフィールドは幅&nbsp;<i>W</i>&nbsp;マス，高さ&nbsp;<i>H</i>&nbsp;マスのマス目状である．このフィールドの左から&nbsp;<i>x</i>&nbsp;列目，上から&nbsp;<i>y</i>&nbsp;行目のマスは&nbsp;<i>(x, y)</i>&nbsp;と表される．</p>

<p>このフィールド上に&nbsp;<i>N</i>&nbsp;個の爆弾が配置されており，<i>i</i>&nbsp;番目の爆弾の位置は&nbsp;<i>(x<sub>i</sub>, y<sub>i</sub>)</i>&nbsp;である．このゲームの爆弾は，爆発したとき爆弾のあるマスから上下左右それぞれの方向&nbsp;<i>D</i>&nbsp;マス以内の十字型の領域内にある爆弾を誘爆して消失する．また，爆弾は別の爆弾によって誘爆されたときにも連鎖して爆発する．この爆発は他に爆発する爆弾が無くなるまで続く．</p>

<p>このゲームの攻略には，ある爆弾を爆発させたときに合計で何個の爆弾が爆発するか知ることが重要である．あなたは攻略を有利に進めるためのプログラムを作ることにした．</p>

<p>例として，入力サンプルの最後のデータセットは以下の図のようになる．このデータセットでは&nbsp;<i>(4, 1)</i>&nbsp;の位置にある 4 番目の爆弾が最初に爆発する．その後，以下のように爆発が連鎖する．</p>

<ul>
	<li><i>(4, 1)</i>&nbsp;の位置の爆弾から上下左右それぞれの方向 3 マス以内にある爆弾を誘爆する．</li>
	<li><i>(5, 1)</i>&nbsp;と&nbsp;<i>(4, 4)</i>&nbsp;の位置の爆弾が誘爆により連鎖して爆発し，各々の上下左右それぞれの方向 3 マス以内にある爆弾を誘爆する．</li>
	<li><i>(3, 4)</i>&nbsp;と&nbsp;<i>(1, 4)</i>&nbsp;の位置の爆弾が誘爆により連鎖して爆発する．このとき新しく誘爆される爆弾はない．</li>
</ul>

<p>よって&nbsp;<i>(4, 1)</i>&nbsp;の位置にある爆弾が爆発すると合計で 5 つの爆弾が爆発する．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22362.%E2%80%85%E7%88%86%E7%99%BA%E3%81%AE%E9%80%A3%E9%8E%96/d897b49f.png" data-original-src="https://upload.acmicpc.net/747629b7-112b-47c0-87f9-e7753774dd08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 272px; height: 200px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22362.%E2%80%85%E7%88%86%E7%99%BA%E3%81%AE%E9%80%A3%E9%8E%96/78c6f4bf.png" data-original-src="https://upload.acmicpc.net/17dca2f6-9455-463a-a08e-4ec193a004b4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 278px; height: 200px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22362.%E2%80%85%E7%88%86%E7%99%BA%E3%81%AE%E9%80%A3%E9%8E%96/be763586.png" data-original-src="https://upload.acmicpc.net/90615b89-f702-4bcb-bf05-ed846922763c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 278px; height: 200px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22362.%E2%80%85%E7%88%86%E7%99%BA%E3%81%AE%E9%80%A3%E9%8E%96/5ff4fd44.png" data-original-src="https://upload.acmicpc.net/4d8a64e7-0851-47af-be2e-3210d1f0acde/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 278px; height: 200px;" /></p>

### 입력

<p>入力は最大で 50 個のデータセットからなる．各データセットは次の形式で表される．</p>

<pre>
<i>W</i> <i>H</i> <i>N</i> <i>D</i> <i>B</i>
<i>x<sub>1</sub></i> <i>y<sub>1</sub></i>
<i>x<sub>2</sub></i> <i>y<sub>2</sub></i>
<i>...</i>
<i>x<sub>N</sub></i> <i>y<sub>N</sub></i></pre>

<p>各データセットは&nbsp;<i>N+1</i>&nbsp;行からなる．</p>

<p>1 行目はフィールドの幅&nbsp;<i>W</i>&nbsp;(<i>1 &le; W &le; 100</i>)，高さ&nbsp;<i>H</i>&nbsp;(<i>1 &le; H &le; 100</i>)，爆弾の数&nbsp;<i>N</i>&nbsp;(<i>1 &le; N &le; min(100, WH)</i>)，爆弾の爆発の大きさ&nbsp;<i>D</i>&nbsp;(<i>1 &le; D &le; 100</i>)，最初に爆発する爆弾の番号&nbsp;<i>B</i>&nbsp;(<i>1 &le; B &le; N</i>) を表す整数である．</p>

<p>2 行目から続く&nbsp;<i>N</i>&nbsp;行はそれぞれ&nbsp;<i>N</i>&nbsp;個の爆弾の位置を表す．<i>i + 1</i>&nbsp;行目は&nbsp;<i>i</i>&nbsp;番目の爆弾の位置&nbsp;<i>(x<sub>i</sub>, y<sub>i</sub>)</i>&nbsp;を表す整数であり&nbsp;<i>1 &le; x<sub>i</sub>&nbsp;&le; W</i>，<i>1 &le; y<sub>i</sub>&nbsp;&le; H</i>&nbsp;を満たす．各データセットについて同じマスに複数の爆弾が配置されることはない．</p>

<p>入力の終わりは 5 つのゼロからなる行で表される．</p>

### 출력

<p>各データセットについて，最初に&nbsp;<i>B</i>&nbsp;番目の爆弾が爆発したときに，最終的に爆発する爆弾の数を 1 行で出力せよ．</p>