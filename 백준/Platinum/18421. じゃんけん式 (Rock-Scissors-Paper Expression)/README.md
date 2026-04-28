# [Platinum IV] じゃんけん式 (Rock-Scissors-Paper Expression) - 18421

[문제 링크](https://www.acmicpc.net/problem/18421)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 24, 맞힌 사람: 20, 정답 비율: 51.282%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 파싱, 문자열, 트리

### 문제 설명

<p>この問題では，じゃんけんの手「グー」「チョキ」「パー」をそれぞれ R, S, P で表す．R は S に勝ち，S は P に勝ち，P は R に勝つ．</p>

<p>x, y をじゃんけんの手とするとき，x + y, &nbsp; x - y, &nbsp; x * y を以下のように定める (これらは通常の意味での足し算・引き算・掛け算ではない)：</p>

<ul>
	<li>x + y は，x &ne; y のとき x と y のうち勝つ方とし，x = y のとき x とする．</li>
	<li>x - y は，x &ne; y のとき x と y のうち負ける方とし，x = y のとき x とする．</li>
	<li>x * y は，x &ne; y のとき R, S, P のうち x でも y でもないものとし，x = y のとき x とする．</li>
</ul>

<p>じゃんけんの手と +, -, * と括弧からなる式は，以下のように計算する：</p>

<ul>
	<li>括弧の中は先に計算する．例えば，R * (P + S) = R * S = P である．</li>
	<li>括弧の深さが同じ部分については，
	<ul>
		<li>+, - より * の方を優先して計算する．例えば，R - P * S = R - (P * S) = R - R = R である．</li>
		<li>同じ優先順位のもの (+ どうし，- どうし，+ と -，* どうし) については，左から順番に計算する．例えば，R - P + S = (R - P) + S = R + S = R である．</li>
	</ul>
	</li>
</ul>

<p>JOI さんはあるじゃんけんの式を持っていたが，その式の中の R, S, P の一部が見えなくなってしまった．見えなくなってしまった部分が `?&#39; で表された長さ N の文字列 E が与えられる．JOI さんは，見えなくなってしまった部分のそれぞれに R, S, P のいずれかを割り当てる方法であって，式の計算結果が A になるものが何通りあるかを知りたい．その数は非常に大きくなる可能性があるので，1 000 000 007 で割った余りを求めたい．</p>

<p>本問で用いられる文法は，BNF (バッカス・ナウア記法) を用いて以下のように表される．じゃんけんの式の一部が見えなくなってしまったものは &lt;expression&gt; である．</p>

<p>&lt;expression&gt; ::= &lt;term&gt; | &lt;expression&gt; &quot;+&quot; &lt;term&gt; | &lt;expression&gt; &quot;-&quot; &lt;term&gt; &lt;term&gt; ::= &lt;factor&gt; | &lt;term&gt; &quot;*&quot; &lt;factor&gt; &lt;factor&gt; ::= &quot;R&quot; | &quot;S&quot; | &quot;P&quot; | &quot;?&quot; | &quot;(&quot; &lt;expression&gt; &quot;)&quot;</p>

<p>これは例えば，ある文字列が &lt;expression&gt; であるとは，「&lt;term&gt; である」または「&lt;expression&gt; である文字列，`+&#39;，&lt;term&gt; である文字列，をこの順に連結させたもの」または「&lt;expression&gt; である文字列，`-&#39;，&lt;term&gt; である文字列，をこの順に連結させたもの」であることである，というように再帰的に定義されることを意味する．</p>

<p>&lt;expression&gt; である文字列 E と計算結果 A が与えられるので，`?&#39; に R, S, P のいずれかを割り当てる方法であって式の計算結果が A になるものの個数を 1 000 000 007 で割った余りを求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>E</var>
<var>A</var></pre>

### 출력

<p>標準出力に，`?&#39; に R, S, P のいずれかを割り当てる方法であって式の計算結果が A になるものの個数を 1 000 000 007 で割った余りを 1 行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 200 000</var>．</li>
	<li><var>E</var>&nbsp;は長さ&nbsp;<var>N</var>&nbsp;の文字列である．</li>
	<li><var>E</var>&nbsp;は問題文で定められた <expression> である．</expression></li>
	<li><var>A</var>&nbsp;は `R&#39; または `S&#39; または `P&#39; である．</li>
</ul>