# [Bronze II] 一般化うるう年 - 22389

[문제 링크](https://www.acmicpc.net/problem/22389)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 107, 맞힌 사람: 98, 정답 비율: 87.500%

### 분류

수학, 구현, 브루트포스 알고리즘

### 문제 설명

<p>通常，西暦&nbsp;<i>x</i>&nbsp;年がうるう年か否かは以下のように定義されている．</p>

<ol>
	<li><i>x</i>&nbsp;が 400 の倍数であれば，うるう年である．</li>
	<li>そうでないとき，<i>x</i>&nbsp;が 100 の倍数であれば，うるう年ではない．</li>
	<li>そうでないとき，<i>x</i>&nbsp;が 4 の倍数であれば，うるう年である．</li>
	<li>そうでないとき，うるう年ではない．</li>
</ol>

<p>これは次のように一般化できる．ある数列&nbsp;<i>A<sub>1</sub>, ..., A<sub>n</sub></i>&nbsp;について，西暦&nbsp;<i>x</i>&nbsp;年が &quot;一般化うるう年&quot; であるか否かを以下のように定義する．</p>

<ol>
	<li><i>x</i>&nbsp;が&nbsp;<i>A<sub>i</sub></i>&nbsp;の倍数であるような最小の&nbsp;<i>i</i>&nbsp;(<i>1 &le; i &le; n</i>) について，<i>i</i>&nbsp;が奇数であれば一般化うるう年であり，偶数であれば一般化うるう年ではない．</li>
	<li>そのような&nbsp;<i>i</i>&nbsp;が存在しないとき，<i>n</i>&nbsp;が奇数であれば一般化うるう年ではなく，偶数であれば一般化うるう年である．</li>
</ol>

<p>例えば&nbsp;<i>A = [400, 100, 4]</i>&nbsp;のとき，この&nbsp;<i>A</i>&nbsp;に対する一般化うるう年は通常のうるう年と等価になる．</p>

<p>数列&nbsp;<i>A<sub>1</sub>, ..., A<sub>n</sub></i>&nbsp;と正の整数&nbsp;<i>l, r</i>&nbsp;が与えられるので．<i>l &le; x &le; r</i>&nbsp;なる正の整数&nbsp;<i>x</i>&nbsp;のうち，西暦&nbsp;<i>x</i>&nbsp;年が&nbsp;<i>A</i>&nbsp;に対する一般化うるう年であるような&nbsp;<i>x</i>&nbsp;の個数を答えよ．</p>

### 입력

<p>入力は最大で 50 個のデータセットからなる．各データセットは次の形式で表される．</p>

<pre>
<i>n</i> <i>l</i> <i>r</i>
<i>A<sub>1</sub></i>
<i>A<sub>2</sub></i>
<i>...</i>
<i>A<sub>n</sub></i></pre>

<p>整数&nbsp;<i>n</i>&nbsp;は&nbsp;<i>1 &le; n &le; 50</i>&nbsp;を満たす．整数&nbsp;<i>l,r</i>&nbsp;は<i>1 &le; l &le; r &le; 4000</i>&nbsp;を満たす．各&nbsp;<i>i</i>&nbsp;に対し整数&nbsp;<i>A<sub>i</sub></i>&nbsp;は&nbsp;<i>1 &le; A<sub>i</sub>&nbsp;&le; 4000</i>&nbsp;を満たす．</p>

<p>入力の終わりは 3 つのゼロからなる行で表される．</p>

### 출력

<p>各データセットについて，答えを 1 行で出力せよ．</p>