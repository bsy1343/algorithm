# [Silver IV] Square Tiles (Small) - 12491

[문제 링크](https://www.acmicpc.net/problem/12491)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 76, 맞힌 사람: 72, 정답 비율: 78.261%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>You are selling beautiful geometric pictures. Each one consists of 1x1 square tiles arranged into a non-overlapping grid. For example:</p>

<pre>
    . ## . .
    . ####
    . ####
    . ## . .
</pre>

<p>Blue tiles are represented by &#39;#&#39; characters, and white tiles are represented by &#39;.&#39; characters. You do not use other colors.</p>

<p>&nbsp;</p>

<p>Not everybody likes blue though, and some customers want you to replace all the blue tiles in your picture with red tiles. Unfortunately, red tiles only come in the larger 2x2 size, which makes this tricky.</p>

<p>You can cover any 2x2 square of blue tiles with a single red tile, and then repeat until finished. A red tile cannot overlap another red tile, it cannot cover white tiles, and it cannot go outside the picture. For example, you could add red tiles to the previous picture as follows:</p>

<pre>
    . /\ . .
    . \/ /\
    . /\ \/
    . \/ . .
</pre>

<p>Each red tile is represented here by a pair of &#39;/&#39; characters in the top-left and bottom-right corners, and a pair of &#39;\&#39; characters in the other two corners.</p>

<p>Given a blue and white picture, can you transform it into a red and white picture in this way?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each test case begins with a line containing&nbsp;<strong>R</strong>&nbsp;and&nbsp;<strong>C</strong>, the number of rows and columns in a picture. The next&nbsp;<strong>R</strong>&nbsp;lines each contain exactly&nbsp;<strong>C</strong>&nbsp;characters, describing the picture. As above, &#39;#&#39; characters represent blue tiles, and &#39;.&#39; characters represent white tiles.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 6.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 6.</li>
</ul>

### 출력

<p>For each test case, first output one line containing &quot;Case #x:&quot; where x is the case number (starting from 1).</p>

<p>If it is possible to cover the blue tiles with non-overlapping red tiles, output&nbsp;<strong>R</strong>&nbsp;lines each containing&nbsp;<strong>C</strong>&nbsp;characters, describing the resulting red and white picture. As above, red tiles should be represented by &#39;/&#39; and &#39;\&#39; characters, while white tiles are represented by &#39;.&#39; characters. If multiple solutions are possible, you may output any of them.</p>

<p>If the task is impossible, output a single line containing the text &quot;Impossible&quot; instead.</p>