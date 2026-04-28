# [Gold I] 最軽量のモビール - 5595

[문제 링크](https://www.acmicpc.net/problem/5595)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 33, 맞힌 사람: 26, 정답 비율: 68.421%

### 분류

수학, 다이나믹 프로그래밍, 트리, 정수론, 트리에서의 다이나믹 프로그래밍, 유클리드 호제법

### 문제 설명

<p>モビールは動く芸術品として広く親しまれている．IOI 日本委員会では，JOI を 広報するためにモビールを作成することになった．JOI 広報用モビールは，棒，紐 （ひも），錘（おもり）の 3 種類の要素を用いて，次のように構成される．</p>

<ul>
	<li>棒の一方の端は青に，もう一方の端は赤に塗られている．</li>
	<li>棒は両端以外の 1 箇所を支点として紐でつるされる．</li>
	<li>支点から赤の端までの長さも支点から青の端までの長さも正整数である．</li>
	<li>棒の両端には，紐で錘か他の棒をつるす．</li>
	<li>錘は紐を用いてどれかの棒の一端につるされる．</li>
	<li>錘には何もつるさない．</li>
	<li>錘の重さは正整数である．</li>
	<li>紐のうち 1 本だけは，片方の端をある棒をつるすためにその棒の支点に結ばれ， もう一方の端は他のどの構成要素とも結ばれていない．他の紐は全て次のいず れかを満たす．
	<ul>
		<li>ある棒の端とある棒の支点を結ぶ．</li>
		<li>ある棒の端とある錘を結ぶ．</li>
	</ul>
	</li>
</ul>

<p>ただし，どの棒においても，バランスが取れている必要がある．棒と紐の重さは無 視できるほど軽いので，棒と紐の重さは全て 0 であるとみなして解答せよ．つまり， それぞれの棒について，</p>

<p>（その棒の赤の端より下につるされている錘の重さの総計） &times; （その棒の支点から赤の端までの長さ）＝（その棒の青の端より下につるされている錘の重さの総計） &times; （その棒の支点から青の端までの長さ）</p>

<p>であるとき，その棒はバランスが取れているとせよ．</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5595.%E2%80%85%E6%9C%80%E8%BB%BD%E9%87%8F%E3%81%AE%E3%83%A2%E3%83%93%E3%83%BC%E3%83%AB/cecb2e0a.png" data-original-src="https://upload.acmicpc.net/b9cb2781-dd88-4439-a9f2-0ac453090c72/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 215px; height: 124px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5595.%E2%80%85%E6%9C%80%E8%BB%BD%E9%87%8F%E3%81%AE%E3%83%A2%E3%83%93%E3%83%BC%E3%83%AB/01660c8c.png" data-original-src="https://upload.acmicpc.net/15d9d267-cd18-49f8-b964-ff7756b934ce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 205px; height: 141px;" /></td>
		</tr>
		<tr>
			<td>簡単なモビールの例</td>
			<td>バランスが取られていないので モビールではない例</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5595.%E2%80%85%E6%9C%80%E8%BB%BD%E9%87%8F%E3%81%AE%E3%83%A2%E3%83%93%E3%83%BC%E3%83%AB/a3c1bc0b.png" data-original-src="https://upload.acmicpc.net/b9085c87-aaa2-4a5d-9162-59abf50e6903/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 273px; height: 209px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5595.%E2%80%85%E6%9C%80%E8%BB%BD%E9%87%8F%E3%81%AE%E3%83%A2%E3%83%93%E3%83%BC%E3%83%AB/6a6eaae0.png" data-original-src="https://upload.acmicpc.net/513b28e5-a8b3-4007-a3ad-d3416e78512b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 270px; height: 215px;" /></td>
		</tr>
		<tr>
			<td>モビールの例</td>
			<td>モビールではない例</td>
		</tr>
	</tbody>
</table>

<p>どのような長さの棒をどのように結びモビールを構成するかは既に決まっている のだが，錘の重さがまだ決まっていない．モビールは軽い方がつりやすいため, なる べく軽いモビールを作りたい．前述したようにどの棒もバランスを取りながら, モ ビールの総重量を最小にするような錘の付け方を求め, そのときのモビールの総重量 を出力するプログラムを作れ. プログラムには以下のモビールの構成に関する情報 が与えられる.</p>

<ul>
	<li>棒の本数 n</li>
	<li>各棒ごとの情報（棒の番号は 1 から n）</li>
	<li>支点から赤の端までの長さと支点から青の端までの長さの比</li>
	<li>赤の端につるす棒の番号 (錘をつるす場合は 0)</li>
	<li>青の端につるす棒の番号 (錘をつるす場合は 0)</li>
</ul>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5595.%E2%80%85%E6%9C%80%E8%BB%BD%E9%87%8F%E3%81%AE%E3%83%A2%E3%83%93%E3%83%BC%E3%83%AB/3714bcaf.png" data-original-src="https://upload.acmicpc.net/08f28bd6-cd96-41be-814a-3388a55fb43d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 217px; height: 122px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5595.%E2%80%85%E6%9C%80%E8%BB%BD%E9%87%8F%E3%81%AE%E3%83%A2%E3%83%93%E3%83%BC%E3%83%AB/64cc61fb.png" data-original-src="https://upload.acmicpc.net/5b3cbfc8-6079-4130-9afe-dc207e1711c2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 245px; height: 122px;" /></td>
		</tr>
		<tr>
			<td>この構成で最軽量のモビール</td>
			<td>最軽量ではないモビール</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">問題 5-2</p>

### 입력

<p>1 行目にはモビールに使われて いる棒の本数 n が書かれている．続く n 行 (1 &le; n &le; 100) には，各々の棒のデー タが書かれている．i + 1 行目 (1 &le; i &le; n) には，4 つの整数 p, q, r, b が空白を区 切りとして書かれており，棒 i において，支点から赤の端までの長さと支点から青 の端までの比が p : q であり，赤の端につるされる棒の番号が r であり，青の端につ るされる棒の番号が b であることを表している．ただし，棒番号 0 は錘がつるされ ることを表している．また，どの入力においても，モビールの重量の最小値を w と し，入力中で比を表すのに用いられる正整数の最大値を L とすると，wL &lt; 2<sup>31</sup> を 満たす．</p>

### 출력

<p>1 行だけであり，モビールの重量を出力する．</p>