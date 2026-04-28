# [Gold I] Class Representative Witch - 22521

[문제 링크](https://www.acmicpc.net/problem/22521)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

이분 탐색, 누적 합, 많은 조건 분기

### 문제 설명

<p>委員長の魔女 PATRICIA は，蜘蛛のような糸を吐き結界の中で暮らしている．使い魔の MATHIEU は，委員長の魔女が吐いた糸を引っぱり自在に空を飛んでいる．糸は空間上の線分とみなすことにする．</p>

<p><i>暁美ほむら</i>は委員長の魔女に対して攻撃を仕掛けようとし，爆弾と間違えて花火玉を投げ込んでしまった．その結果，それぞれの糸について，魔女から距離&nbsp;<var><i>p</i><sub>1</sub>,&hellip;,<i>p</i><sub><i>M</i></sub></var>&nbsp;の位置にある部分が切れるだけとなってしまった．花火玉を投げる前，それぞれの糸について，糸の&nbsp;<var>2</var>&nbsp;つの端点と魔女はこの順番で同一直線上に並んでおり，端点のどちらか一方を使い魔が引っ張っていた．爆発で糸は切れ，使い魔が持っていた部分とそこから一つ置きの部分を残して糸の一部は消えてしまった．</p>

<p><i>ほむら</i>は次の戦略を考えるために，残った糸についての情報が知りたいと思っている．残った糸の長さの合計値を求めよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var><i>N</i>&nbsp;<i>M</i>
<i>s</i><sub>1</sub>&nbsp;<i>t</i><sub>1</sub>
&hellip;
<i>s</i><sub><i>N</i></sub>&nbsp;<i>t</i><sub><i>N</i></sub>
<i>p</i><sub>1</sub>
&hellip;
<i>p</i><sub><i>M</i></sub>
</var></pre>

<p><var><i>N</i></var>&nbsp;は空間上の糸の個数，<var><i>M</i></var>&nbsp;は花火玉によって発生した糸の切断の箇所の個数である．</p>

<p><var><i>s</i><sub><i>i</i></sub>,<i>t</i><sub><i>i</i></sub></var>&nbsp;は糸の情報であり，<var><i>s</i><sub><i>i</i></sub></var>&nbsp;は使い間が引っ張っていた側の端点，<var><i>t</i><sub><i>i</i></sub></var>&nbsp;はそうでない側の端点の魔女からの距離である．</p>

<p><var><i>p</i><sub><i>i</i></sub></var>&nbsp;は花火玉によって切断された位置の情報である．</p>

### 출력

<p>花火玉を投げた後，残った糸の長さの合計値を1行に出力せよ．</p>

### 제한

<ul>
	<li><var>1&le;<i>N</i>&le;10<sup>5</sup></var></li>
	<li><var>1&le;<i>M</i>&le;10<sup>5</sup></var></li>
	<li><var>1&le;<i>s</i><sub><i>i</i></sub>&le;10<sup>9</sup></var></li>
	<li><var>1&le;<i>t</i><sub><i>i</i></sub>&le;10<sup>9</sup></var></li>
	<li><var>1&le;<i>p</i><sub><i>i</i></sub>&le;10<sup>9</sup></var></li>
	<li>入力値は全て整数である．</li>
	<li><var><i>s</i><sub>1</sub>,&hellip;,<i>s</i><sub><i>N</i></sub>,<i>t</i><sub>1</sub>,&hellip;,<i>t</i><sub><i>N</i></sub>,<i>p</i><sub>1</sub>,&hellip;,<i>p</i><sub><i>M</i></sub></var>&nbsp;は全て相異なる．</li>
</ul>