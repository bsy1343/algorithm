# [Gold III] Save your cats - 22570

[문제 링크](https://www.acmicpc.net/problem/22570)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 20, 맞힌 사람: 18, 정답 비율: 85.714%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Nicholas Y. Alford was a cat lover. He had a garden in a village and kept many cats in his garden. The cats were so cute that people in the village also loved them.</p>

<p>One day, an evil witch visited the village. She envied the cats for being loved by everyone. She drove magical piles in his garden and enclosed the cats with magical fences running between the piles. She said &ldquo;Your cats are shut away in the fences until they become ugly old cats.&rdquo; like a curse and went away.</p>

<p>Nicholas tried to break the fences with a hummer, but the fences are impregnable against his effort. He went to a church and asked a priest help. The priest looked for how to destroy the magical fences in books and found they could be destroyed by holy water. The Required amount of the holy water to destroy a fence was proportional to the length of the fence. The holy water was, however, fairly expensive. So he decided to buy exactly the minimum amount of the holy water required to save all his cats. How much holy water would be required?</p>

### 입력

<p>The input has the following format:</p>

<pre>
<i>N M</i>
<i>x</i><sub>1</sub> <i>y</i><sub>1</sub>
.
.
.
<i>x</i><sub><i>N</i></sub> <i>y</i><sub><i>N</i></sub>
<i>p</i><sub>1</sub> <i>q</i><sub>1</sub>
.
.
.
<i>p</i><sub><i>M</i></sub> <i>q</i><sub><i>M</i></sub></pre>

<p>The first line of the input contains two integers&nbsp;<i>N</i>&nbsp;(2 &le;&nbsp;<i>N</i>&nbsp;&le; 10000) and&nbsp;<i>M</i>&nbsp;(1 &le;&nbsp;<i>M</i>).&nbsp;<i>N</i>&nbsp;indicates the number of magical piles and&nbsp;<i>M</i>&nbsp;indicates the number of magical fences. The following&nbsp;<i>N</i>&nbsp;lines describe the coordinates of the piles. Each line contains two integers&nbsp;<i>x<sub>i</sub></i>&nbsp;and&nbsp;<i>y<sub>i</sub></i>&nbsp;(-10000 &le;&nbsp;<i>x<sub>i</sub></i>,&nbsp;<i>y<sub>i</sub></i>&nbsp;&le; 10000). The following&nbsp;<i>M</i>&nbsp;lines describe the both ends of the fences. Each line contains two integers&nbsp;<i>p<sub>j</sub></i>&nbsp;and&nbsp;<i>q<sub>j</sub></i>&nbsp;(1 &le;&nbsp;<i>p<sub>j</sub></i>,&nbsp;<i>q<sub>j</sub></i>&nbsp;&le;&nbsp;<i>N</i>). It indicates a fence runs between the&nbsp;<i>p<sub>j</sub></i>-th pile and the&nbsp;<i>q<sub>j</sub></i>-th pile.</p>

<p>You can assume the following:</p>

<ul>
	<li>No Piles have the same coordinates.</li>
	<li>A pile doesn&rsquo;t lie on the middle of fence.</li>
	<li>No Fences cross each other.</li>
	<li>There is at least one cat in each enclosed area.</li>
	<li>It is impossible to destroy a fence partially.</li>
	<li>A unit of holy water is required to destroy a unit length of magical fence.</li>
</ul>

### 출력

<p>Output a line containing the minimum amount of the holy water required to save all his cats. Your program may output an arbitrary number of digits after the decimal point. However, the absolute error should be 0.001 or less.</p>