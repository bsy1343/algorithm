# [Platinum III] The Grove - 26989

[문제 링크](https://www.acmicpc.net/problem/26989)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 6, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 기하학, 너비 우선 탐색, 비트마스킹

### 문제 설명

<p>The pasture contains a small, contiguous grove of trees that has no &#39;holes&#39; in the middle of the it. Bessie wonders: how far is it to walk around that grove and get back to my starting position? She&#39;s just sure there is a way to do it by going from her start location to successive locations by walking horizontally, vertically, or diagonally and counting each move as a single step. Just looking at it, she doesn&#39;t think you could pass &#39;through&#39; the grove on a tricky diagonal. Your job is to calculate the minimum number of steps she must take.</p>

<p>Happily, Bessie lives on a simple world where the pasture is represented by a grid with R rows and C columns (1 &le; R &le; 50, 1 &le; C &le; 50). Here&#39;s a typical example where &#39;.&#39; is pasture (which Bessie may traverse), &#39;X&#39; is the grove of trees, &#39;*&#39; represents Bessie&#39;s start and end position, and &#39;+&#39; marks one shortest path she can walk to circumnavigate the grove (i.e., the answer):</p>

<pre>
...+...
..+X+..
.+XXX+.
..+XXX+
..+X..+
...+++*</pre>

<p>The path shown is not the only possible shortest path; Bessie might have taken a diagonal step from her start position and achieved a similar length solution. Bessie is happy that she&#39;s starting &#39;outside&#39; the grove instead of in a sort of &#39;harbor&#39; that could complicate finding the best path.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: R and C</li>
	<li>Lines 2..R+1: Line i+1 describes row i with C characters (with no spaces between them).</li>
</ul>

### 출력

<ul>
	<li>Line 1: The single line contains a single integer which is the smallest number of steps required to circumnavigate the grove.</li>
</ul>