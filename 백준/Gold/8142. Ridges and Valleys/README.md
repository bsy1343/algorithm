# [Gold III] Ridges and Valleys - 8142

[문제 링크](https://www.acmicpc.net/problem/8142)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 129, 정답: 71, 맞힌 사람: 61, 정답 비율: 57.547%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Byteasar loves trekking in the hills. During the hikes he explores all the ridges and valleys in vicinity. Therefore, in order to plan the journey and know how long it will last, he must know the number of ridges and valleys in the area he is going to visit. And you are to help Byteasar.</p>

<p>Byteasar has provided you with a map of the area of his very next expedition. The map is in the shape of a n x n square. For each field (i,j) belonging to the square (for i,j &isin; {1,&hellip;,n}), its height w(i,j) is given.</p>

<p>We say two fields are adjacent if they have a common side or a common vertex (i.e. the field (i,j) is adjacent to the fields (i-1,j-1), (i-1,j), (i-1,j+1), (i,j-1), (i,j+1), (i+1,j-1), (i+1,j), (i+1,j+1), provided that these fields are on the map).</p>

<p>We say a set of fields S forms a ridge (valley) if:</p>

<ul>
	<li>all the fields in S have the same height,</li>
	<li>the set S forms a connected part of the map (i.e. from any field in S it is possible to reach any other field in S while moving only between adjacent fields and without leaving the set S),</li>
	<li>if s &isin; S and the field s&rsquo;&notin; S is adjacent to s, then ws &gt; ws&rsquo; (for a ridge) or ws &lt; ws&rsquo; (for a valley).</li>
</ul>

<p>In particular, if all the fields on the map have the same height, they form both a ridge and a valley.</p>

<p>Your task is to determine the number of ridges and valleys for the landscape described by the map.</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input the description of the map,</li>
	<li>determines the number of ridges and valleys for the landscape described by this map,</li>
	<li>writes out the outcome to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer n (2 &le; n &le; 1,000) denoting the size of the map. In each of the following n lines there is the description of the successive row of the map. In (i+1)&rsquo;th line (for i &isin; {1,&hellip;,n}) there are n integers w(i,1), ..., w(i,n) (0 &le; w<sub>i</sub> &le; 1,000,000,000), separated by single spaces. These denote the heights of the successive fields of the i&#39;th row of the map.</p>

### 출력

<p>The first and only line of the standard output should contain two integers separated by a single space - the number of ridges followed by the number of valleys for the landscape described by the map.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8142.%E2%80%85Ridges%E2%80%85and%E2%80%85Valleys/86488419.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8142.%E2%80%85Ridges%E2%80%85and%E2%80%85Valleys/86488419.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8142/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:177px; width:177px" /></p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8142.%E2%80%85Ridges%E2%80%85and%E2%80%85Valleys/d3a8aca9.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8142.%E2%80%85Ridges%E2%80%85and%E2%80%85Valleys/d3a8aca9.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8142/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:177px; width:177px" /></p>

<p>The above figures show the ridges (continuous line) and the valleys (dashed line).</p>