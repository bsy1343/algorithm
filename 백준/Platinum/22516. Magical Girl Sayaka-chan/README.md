# [Platinum IV] Magical Girl Sayaka-chan - 22516

[문제 링크](https://www.acmicpc.net/problem/22516)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 25, 맞힌 사람: 23, 정답 비율: 53.488%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 누적 합

### 문제 설명

<p>世の中の少女たちはキュゥべえと契約し願いを叶えてもらい，それとひきかえに魔法少女となる．使う魔法の形・効果は願いに強く影響を受ける．魔法少女<i>さやか</i>ちゃんは最近キュゥべえと契約した新米魔法少女である．<i>さやか</i>の願いは「事故のため指が動かなくなり，音楽を演奏するのを諦めていた男の子を助けること」であったので，作る魔方陣は音符が輪の上に並んだ形をしている．</p>

<p><i>さやか</i>は&nbsp;<var><i>N</i></var>&nbsp;個の音符を持っており，それらを輪の上に並べることによって魔方陣を作る．音符をどのような順番で並べるかは彼女の自由である．魔方陣を作るために精神力が消費され，その量は音符の配置によって以下のように決まる．</p>

<ul>
	<li>まず，&nbsp;<var><i>M</i></var>&nbsp;個の正の整数からなる<b>音楽的美しさ</b>&nbsp;<var><i>S</i><sub>1</sub>,&nbsp;&hellip;,&nbsp;<i>S</i><sub><i>M</i></sub></var>&nbsp;が定められている，</li>
	<li>各音符は音程を持っており，音程は&nbsp;<var>1</var>&nbsp;から&nbsp;<var><i>M</i></var>&nbsp;の整数&nbsp;<var><i>K</i><sub>1</sub>,&nbsp;&hellip;,&nbsp;<i>K</i><sub><i>N</i></sub></var>&nbsp;で表される．</li>
	<li>音程が&nbsp;<var><i>a</i>,&nbsp;<i>b</i>&nbsp;(<i>a</i>&le;<i>b</i>)</var>&nbsp;であるような 2 つの音符の間の<b>反発力</b>とは，&nbsp;<var>[(<i>S</i><sub><i>a</i></sub>&nbsp;+&nbsp;&hellip;&nbsp;+&nbsp;<i>S</i><sub><i>b</i></sub>)&frasl;<i>L</i>]</var>&nbsp;で定められる量である．ここで，<var><i>L</i></var>&nbsp;は入力で与えられる定数であり，実数&nbsp;<var><i>x</i></var>&nbsp;に対して&nbsp;<var>[<i>x</i>]</var>&nbsp;は&nbsp;<var><i>x</i></var>&nbsp;を越えない最大の整数を表すものとする．</li>
	<li><i>さやか</i>の消費する精神力は，各2つの隣り合う音符 (<var><i>N</i></var>&nbsp;組存在する) の間の反発力の合計値である．</li>
</ul>

<p>例えば音楽的美しさがそれぞれ&nbsp;<var>{100,&nbsp;200,&nbsp;300,&nbsp;400,&nbsp;500}</var>&nbsp;で，音程が&nbsp;<var>{1,&nbsp;3,&nbsp;5,&nbsp;4}</var>&nbsp;である音符をこの順番で並べて魔方陣を作った時，消費される精神力は&nbsp;<var>37&nbsp;(=[(100+200+300)&frasl;99]+[(300+400+500)&frasl;99]+[(500+400)&frasl;99]+[(400+300+200+100)&frasl;99])</var>&nbsp;となる．</p>

<p>使うべき音符の音程の組み合わせと各音程の音楽的美しさが与えられるので，消費される精神力の最小値を求めよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var><i>N</i>&nbsp;<i>M</i>&nbsp;<i>L</i>
<i>K</i><sub>1</sub>&nbsp;<i>K</i><sub>2</sub>&nbsp;&hellip;&nbsp;<i>K</i><sub><i>N</i></sub>
<i>S</i><sub>1</sub>&nbsp;<i>S</i><sub>2</sub>&nbsp;&hellip;&nbsp;<i>S</i><sub><i>M</i></sub></var></pre>

<p><var><i>N</i></var>&nbsp;は<i>さやか</i>の持っている音符の数，<var><i>M</i></var>&nbsp;は音楽的美しさの値の個数，<var><i>L</i></var>&nbsp;は反発力を定めるのに使われる定数である．</p>

<p><var><i>K</i><sub><i>i</i></sub></var>&nbsp;は音符の音程を表し，<var><i>S</i><sub><i>j</i></sub></var>&nbsp;は音楽的美しさを表す．</p>

### 출력

<p>消費される精神力の最小値を&nbsp;<var>1</var>&nbsp;行に出力せよ．</p>

### 제한

<ul>
	<li><var>3&le;<i>N</i>&le;2,000</var></li>
	<li><var>1&le;<i>M</i>&le;10<sup>5</sup></var></li>
	<li><var>1&le;<i>L</i>&le;10<sup>5</sup></var></li>
	<li><var>1&le;<i>K</i><sub><i>i</i></sub>&le;<i>M</i></var></li>
	<li><var>1&le;<i>S</i><sub><i>j</i></sub>&le;10<sup>5</sup></var></li>
	<li>入力値は全て整数である．</li>
</ul>