# [Platinum III] Set-constructing Witch - 22522

[문제 링크](https://www.acmicpc.net/problem/22522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

벨만–포드, 다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 최단 경로

### 문제 설명

<p><i>キュゥべえ</i>はワルプルギスの夜に向けて魔女の合成に明け暮れている．ワルプルギスの夜のために，特別な<i>グリーフシード</i>&nbsp;(魔女の卵) を使って手に入れやすい魔女をうまく合成し目的である舞台装置の魔女を創り上げなければならないからである．</p>

<p><i>キュゥべえ</i>は手に入れやすい種類の魔女の<i>グリーフシード</i>から魔女の素となるものを取り出し，空の特別な<i>グリーフシード</i>に入れることで，その<i>グリーフシード</i>に魔女を宿らせることができる．また，この世界には，ある組み合わせで複数の魔女を合成すると新たな&nbsp;<var>1</var>&nbsp;つの魔女を生み出すことができるという合成法則がいくつかある．そこで，いくつかの特別な<i>グリーフシード</i>を使い，それらの中にある魔女の素となるものを合成し，<var>1</var>&nbsp;つの特別な<i>グリーフシード</i>に新たな魔女を宿らせることができる．また，合成した結果空となった特別な<i>グリーフシード</i>は再利用することができる．例えば，<var>3</var>&nbsp;個の特別な<i>グリーフシード</i>に入った魔女を合成すると，それらの&nbsp;<var>3</var>&nbsp;個の<i>グリーフシード</i>は，新たな魔女が宿った&nbsp;<var>1</var>&nbsp;個の特別な<i>グリーフシード</i>と&nbsp;<var>2</var>&nbsp;個の空の特別な<i>グリーフシード</i>となる．しかし，同じ種類の魔女を同時に複数の<i>グリーフシード</i>に入れることは出来ない．</p>

<p><i>キュゥべえ</i>は魔女の特別な<i>グリーフシード</i>への寄宿と魔女の合成を繰り返すことにより舞台装置の魔女を創りだしたい．舞台装置の魔女を創りだすにはいくつの特別な<i>グリーフシード</i>が必要か求めよ．</p>

### 입력

<p>入力は以下のような形式で与えられる．</p>

<pre>
<var><i>N</i>&nbsp;<i>E</i>&nbsp;<i>T</i>
<i>W</i><sub>1</sub>&nbsp;<i>W</i><sub>2</sub>&nbsp;&hellip;&nbsp;<i>W</i><sub><i>N</i></sub>
<i>G</i><sub>1</sub>&nbsp;<i>C</i><sub>1</sub>&nbsp;<i>S</i><sub>1,1</sub>&nbsp;<i>S</i><sub>1,2</sub>&nbsp;&hellip;&nbsp;<i>S</i><sub>1,<i>C</i><sub>1</sub></sub>
<i>G</i><sub>2</sub>&nbsp;<i>C</i><sub>2</sub>&nbsp;<i>S</i><sub>2,1</sub>&nbsp;<i>S</i><sub>2,2</sub>&nbsp;&hellip;&nbsp;<i>S</i><sub>2,<i>C</i><sub>2</sub></sub>
&hellip;
<i>G</i><sub><i>E</i></sub>&nbsp;<i>C</i><sub><i>E</i></sub>&nbsp;<i>S</i><sub><i>E</i>,1</sub>&nbsp;<i>S</i><sub><i>E</i>,2</sub>&nbsp;&hellip;&nbsp;<i>S</i><sub><i>E</i>,<i>C</i><sub><i>E</i></sub></sub>
</var></pre>

<p><var><i>N</i></var>&nbsp;は魔女の種類の個数，<var><i>E</i></var>&nbsp;は合成法則の個数，<var><i>T</i></var>&nbsp;は舞台装置の魔女の番号である．<var><i>W</i><sub><i>i</i></sub></var>&nbsp;は&nbsp;<var><i>i</i></var>&nbsp;番目の魔女が手に入れやすい魔女であるかどうかを表し，<code>1</code>&nbsp;ならば手に入れやすい魔女であり，<code>0</code>&nbsp;ならば手に入れやすい魔女ではない．</p>

<p>続く&nbsp;<var><i>E</i></var>&nbsp;行に合成法則が次のように表される：「番号が&nbsp;<var><i>S</i><sub><i>i</i>,1</sub>&nbsp;<i>S</i><sub><i>i</i>,2</sub>&nbsp;&hellip;&nbsp;<i>S</i><sub><i>i</i>,<i>C</i><sub><i>i</i></sub></sub></var>&nbsp;の魔女を合成することによって&nbsp;<var><i>G</i><sub><i>i</i></sub></var>&nbsp;の番号の魔女が得られる．」</p>

### 출력

<p>舞台装置の魔女を創りだすのに最低限必要な特別な<i>グリーフシード</i>の個数を出力せよ．創りだすことができない場合は&nbsp;<code>-1</code>&nbsp;を出力せよ．</p>

### 제한

<ul>
	<li><var>1&lt;<i>N</i>&le;300</var></li>
	<li><var>0&le;<i>E</i>&le;1000</var></li>
	<li><var>1&le;<i>T</i>&le;<i>N</i></var></li>
	<li><var>0&le;<i>W</i><sub><i>i</i></sub>&le;1&nbsp;(1&le;<i>i</i>&le;<i>N</i>)</var></li>
	<li><var>1&le;<i>G</i><sub><i>i</i></sub>&le;<i>N</i>&nbsp;(1&le;<i>i</i>&le;<i>E</i>)</var></li>
	<li><var>2&le;<i>C</i><sub><i>i</i></sub>&le;10&nbsp;(1&le;<i>i</i>&le;<i>E</i>)</var></li>
	<li><var>1&le;<i>S</i><sub><i>i</i>,<i>j</i></sub>&le;<i>N</i>&nbsp;(1&le;<i>i</i>&le;<i>E</i>,&nbsp;1&le;<i>j</i>&le;<i>C</i><sub><i>i</i></sub>)</var></li>
	<li><var>{<i>G</i><sub><i>i</i></sub>,<i>S</i><sub><i>i</i>,1</sub>&nbsp;<i>S</i><sub><i>i</i>,2</sub>&nbsp;&hellip;&nbsp;<i>S</i><sub><i>i</i>,<i>C</i><sub><i>i</i></sub></sub>}</var>&nbsp;は全て異なる．</li>
	<li>入力中に同一の合成法則が&nbsp;<var>2</var>&nbsp;回以上現れることはない．</li>
</ul>