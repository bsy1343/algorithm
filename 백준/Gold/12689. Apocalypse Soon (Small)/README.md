# [Gold IV] Apocalypse Soon (Small) - 12689

[문제 링크](https://www.acmicpc.net/problem/12689)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 4, 정답 비율: 33.333%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Oh no! The delicate political balance of the world has finally collapsed, and everybody has declared war on everybody else. You warned whoever would listen that this would happen, but did they pay attention? Ha! Now the only thing you can hope for is to survive as long as possible.</p>

<p>Fortunately (sort of), everyone&#39;s industrial centers have already been nuked, so the only method of attack available to each nation is to hurl wave after wave of conscripted soldiers at each other. This limits each nation to attacking only its immediate neighbors. The world is a R-by-C grid with R rows, numbered from 1 in the far North to R in the far South, and C columns, numbered from 1 in the far West to C in the far East. Each nation occupies one square of the grid, which means that each nation can reach at most 4 other adjacent nations.</p>

<p>Every nation starts with a specific strength value, known to everyone. They have no concept of advanced strategy, so at the beginning of each day, they will simply choose their strongest neighbor (breaking ties first by Northernmost nation, then by Westernmost) and attack them with an army. The army will have a power equal to the current strength S of the nation; by the end of the day, it will have depleted that neighbor&#39;s strength by S. A nation whose strength reaches 0 is destroyed. Note that all nations attack at the same time; an army&#39;s power is the same regardless of whether its nation is attacked that day.</p>

<p>Your nation is located at (c, r), in row r and column c. Fortunately, your nation is listening to your advice, so you don&#39;t have to follow this crazy strategy. You may choose to attack any of your neighbors on a given day (or do nothing at all). You can&#39;t attack multiple neighbors, however, or attack with an army of less than full power.</p>

<p>Determine the maximum number days you can survive.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. The first line of each test case contains four integers,&nbsp;<strong>C</strong>,&nbsp;<strong>R</strong>,&nbsp;<strong>c</strong>, and&nbsp;<strong>r</strong>. The next&nbsp;<strong>R</strong>&nbsp;lines each contain&nbsp;<strong>C</strong>integers, giving the starting strength&nbsp;<strong>S<sub>ci,ri</sub></strong>&nbsp;of the nation in column&nbsp;<strong>ci</strong>&nbsp;and row&nbsp;<strong>ri</strong>. It may be 0, indicating that the nation has already been destroyed. Your nation&#39;s starting strength will not be 0.</p>

<p>&nbsp;</p>

<p>Limits</p>

<ul>
	<li>1 &le; T &le; 100</li>
	<li>1 &le; c &le; C</li>
	<li>1 &le; r &le; R</li>
	<li>1 &le; C &le; 5</li>
	<li>1 &le; R &le; 5</li>
	<li>0 &le; S<sub>ci,ri</sub>&nbsp;&le; 10</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>A</strong>: &quot; followed by:</p>

<ul>
	<li>&quot;<strong>B</strong>&nbsp;day(s)&quot;, where&nbsp;<strong>B</strong>&nbsp;is the most days you can hope to survive.</li>
	<li>&quot;forever&quot;, if you can outlast all your neighbors.</li>
</ul>