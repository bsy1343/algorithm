# [Silver V] Crtanje - 20200

[문제 링크](https://www.acmicpc.net/problem/20200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 139, 정답: 76, 맞힌 사람: 66, 정답 비율: 54.545%

### 분류

구현

### 문제 설명

<p>Josip used to code in Logo. He loved to draw pictures, but those days are sadly over. Nostalgic, he decided to draw a line that represents the net worth of his company over a period of n days.</p>

<p>For each of the n days, he knows if the net worth of his company increased by one unit (represented by &#39;+&#39;), decreased by one unit (represented by &#39;-&#39;), or remained the same (represented by &#39;=&#39;) during that day. Before the first day, the net worth was equal to zero.</p>

<p>Josip will draw the line in a big infinite matrix of characters. Indices of matrix rows grow upwards, and indices of columns grow to the right. For the i-th day he will draw some character in the i-th column. The character and the index of the row are decided by the following rules:</p>

<ul>
	<li>If the net worth increased during the i-th day, he will draw &#39;/&#39; in the row with index equal to the net worth at the beginning of the day.</li>
	<li>If the net worth decreased during the i-th day, he will draw &#39;\&#39; in the row with index equal to the net worth at the end of the day.</li>
	<li>If the net worth didn&rsquo;t change during the i-th day, he will draw &#39;_&#39; in the row with index equal to the net worth during the day.</li>
</ul>

<p>All other cells are filled with &#39;.&#39;.</p>

<p>Your task is to output the minimal matrix that contains the whole line, i.e. contains all characters &#39;/&#39;, &#39;\&#39; and &#39;_&#39; that Josip drew.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100), the number of days.</p>

<p>The second line contains a string of n characters &#39;+&#39;, &#39;-&#39; and &#39;=&#39; that represents how the company&rsquo;s net worth changed over the given period.</p>

### 출력

<p>Output the described matrix.</p>