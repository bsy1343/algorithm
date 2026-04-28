# [Platinum IV] Rose Garden Witch - 22514

[문제 링크](https://www.acmicpc.net/problem/22514)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

기하학, 스위핑

### 문제 설명

<p>薔薇園の魔女 GERTRUD は幅&nbsp;<var><i>W</i></var>&nbsp;メートル，高さ&nbsp;<var><i>H</i></var>&nbsp;メートルの長方形の庭でバラを育てている．庭は一辺&nbsp;<var>1</var>&nbsp;メートルの正方形で区切られており，<var><i>W</i>&times;<i>H</i></var>&nbsp;のブロックに分けられている．各ブロックはバラが育てられているか育てられていないかのどちらかである．</p>

<p>ただ驚くべきことに，この庭で育てられているバラはブロックを越えて絡み合い&nbsp;<var>1</var>&nbsp;つの生命体となっている．この生命体は辺を共有しているブロック間を越えて絡み合うことができ，どこかある&nbsp;<var>1</var>&nbsp;点を共有していれば同じ生命体となる．</p>

<p><i>巴マミ</i>は庭の左下の角から直線に必殺技「ティロ・フィナーレ」で巨大な銃を撃ち，その弾丸が通る直線上でその生命体を分割した時，生命体が出来る限り多くの分割数に分断されるようにすることによりダメージを与えたい．ティロ・フィナーレは最大でこの生物を何分割できるか求めよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var><i>H</i>&nbsp;<i>W</i>
<i>f</i><sub>11</sub><i>f</i><sub>12</sub>&hellip;<i>f</i><sub>1<i>W</i></sub>
<i>f</i><sub>21</sub><i>f</i><sub>22</sub>&hellip;<i>f</i><sub>2<i>W</i></sub>
&hellip;
<i>f</i><sub><i>H</i>1</sub><i>f</i><sub><i>H</i>2</sub>&hellip;<i>f</i><sub><i>HW</i></sub>
</var></pre>

<p><var><i>H</i></var>&nbsp;は庭の高さ，<var><i>W</i></var>&nbsp;は庭の幅を表す．</p>

<p><var><i>f</i><sub><i>ij</i></sub></var>&nbsp;は庭の各ブロックを表す文字であり，上から&nbsp;<var><i>i</i></var>&nbsp;行目，左から&nbsp;<var><i>j</i></var>&nbsp;列目のブロックの状態を表す．ブロックにバラが育てられている場合は&nbsp;<var><i>f</i><sub><i>ij</i></sub></var>&nbsp;は&nbsp;<code>&#39;#&#39;</code>&nbsp;となり，そうでない場合は&nbsp;<code>&#39;.&#39;</code>&nbsp;となる．</p>

### 출력

<p>生命体を直線で分割する時に，最大でいくつの部分に分割できるかを1行で出力せよ．</p>

### 제한

<ul>
	<li><var>1&le;<i>H</i>&le;600</var></li>
	<li><var>1&le;<i>W</i>&le;600</var></li>
	<li><var><i>f</i><sub><i>ij</i></sub></var>は&nbsp;<code>&#39;#&#39;</code>,&nbsp;<code>&#39;.&#39;</code>のいずれかである．</li>
	<li>少なくとも&nbsp;<var>1</var>&nbsp;つは<var><i>f</i><sub><i>ij</i></sub>=</var><code>&#39;#&#39;</code>&nbsp;となるマス&nbsp;<var><i>f</i><sub><i>ij</i></sub></var>&nbsp;が存在する．</li>
	<li><var>2</var>&nbsp;つのブロックが辺を共有するとき，それらは<b>隣接している</b>と呼ぶことにする．任意の&nbsp;<var>2</var>&nbsp;つの異なる&nbsp;<code>&#39;#&#39;</code>&nbsp;のブロック&nbsp;<var><i>f</i><sub><i>A</i></sub>,<i>f</i><sub><i>B</i></sub></var>&nbsp;に対して，<var><i>f</i><sub><i>A</i></sub></var>&nbsp;から隣接している&nbsp;<code>&#39;#&#39;</code>&nbsp;のブロックを辿っていって&nbsp;<var><i>f</i><sub><i>B</i></sub></var>&nbsp;に着くことができる．(すなわち，薔薇のブロックは連結である．)</li>
	<li>入力中で&nbsp;<var>1</var>&nbsp;行目の行，<var><i>H</i></var>&nbsp;行目の行，<var>1</var>&nbsp;列目の列，または&nbsp;<var><i>W</i></var>&nbsp;列目の列にあるブロックを<b>盤面の端のブロック</b>と呼ぶことにする．任意の&nbsp;<code>&#39;.&#39;</code>&nbsp;のブロック&nbsp;<var><i>f</i><sub><i>C</i></sub></var>&nbsp;に対して，<var><i>f</i><sub><i>C</i></sub></var>&nbsp;から隣接している&nbsp;<code>&#39;.&#39;</code>&nbsp;のブロックを辿っていって，ある&nbsp;<code>&#39;.&#39;</code>&nbsp;の盤面の端のブロックに着くことができる．(すなわち，入力に&quot;空洞&quot;のブロックは存在しない．)</li>
</ul>