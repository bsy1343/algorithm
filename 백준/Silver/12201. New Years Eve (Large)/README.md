# [Silver I] New Years Eve (Large) - 12201

[문제 링크](https://www.acmicpc.net/problem/12201)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 23, 맞힌 사람: 23, 정답 비율: 56.098%

### 분류

구현

### 문제 설명

<p>At new years party there is a pyramidal arrangement of glasses for wine. For example, at the top level, there would just be one glass, at the second level there would be three, then 6 and then 10 and so on and so forth like the following image.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/12201.%E2%80%85New%E2%80%85Years%E2%80%85Eve%E2%80%85(Large)/39185c7a.jpeg" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12200/images.jpeg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:228px; width:212px" /></p>

<p>The glasses are numbered using 2 numbers, L and N. L represents the level of the glass and N represents the number in that level. Numbers in a given level are as follows:</p>

<pre>
Level 1: 
    1

Level 2:
    1
 2     3

Level 3:
      1
   2     3
4     5     6

Level 4:
         1
      2     3
   4     5     6
7     8     9     10
</pre>

<p>Each glass can hold 250ml of wine. The bartender comes and starts pouring wine in the top glass(The glass numbered L = 1 and N = 1) from bottles each of capacity 750ml.</p>

<p>As wine is poured in the glasses, once a glass gets full, it overflows equally into the 3 glasses on the next level below it and touching it, without any wine being spilled outside. It doesn&#39;t overflow to the glasses on the same level beside it. It also doesn&#39;t overflow to the any level below next level (directly).</p>

<p>For example: When the glass of L = 2 and N = 2 overflows, the water will overflow to glasses of L = 3 and N = 2, 4, 5.</p>

<p>Once that the bartender is done pouring B bottles, figure out how much quantity in ml of wine is present in the glass on level L with glass number N.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case consists of three integers, <strong>B</strong>, <strong>L</strong>, <strong>N</strong>, <strong>B</strong> is the number of bottles the bartender pours and <strong>L</strong> is the glass level in the pyramid and <strong>N</strong> is the number of the glass in that level.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where <strong>x</strong> is the test case number (starting from 1) and <strong>y</strong> is the quantity of wine in ml in that glass.</p>

<p>We recommend outputting y to 7 decimal places, but it is not required. y will be considered correct if it is close enough to the correct number: within an absolute or relative error of 10<sup>-6</sup>.&nbsp;</p>

### 제한

<ul>
	<li>1 &le; <strong>T</strong> &le; 150.</li>
	<li>1 &le; <strong>B</strong> &le; 50000.</li>
	<li>1 &le; <strong>L</strong> &le; 400.</li>
	<li>1 &le; <strong>N</strong> &le; Number of glasses on the corresponding level.</li>
</ul>