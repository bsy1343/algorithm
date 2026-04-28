# [Gold II] Mirrors - 5857

[문제 링크](https://www.acmicpc.net/problem/5857)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 169, 정답: 40, 맞힌 사람: 33, 정답 비율: 28.448%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션, 최단 경로

### 문제 설명

<p>Farmer John&#39;s cows have been causing too much trouble around the farm, and FJ therefore wants to keep a more watchful eye on them. By installing N reflective fences (1 &lt;= N &lt;= 200) at various locations on the farm, he hopes to be able to see from his house at location (0,0) to the barn at location (a,b).</p>

<p>On a 2D map of FJ&#39;s farm, fence i appears as a short line segment centered at integer location (x_i, y_i) and tilted 45 degrees (either like &#39;/&#39; or like &#39;\&#39;). For example, a fence oriented like &#39;/&#39; at position (3,5) could be described as a line segment from (2.9,4.9) to (3.1,5.1). Each fence (and also the location of the barn) lies at a different position with integer coordinates in the range -1,000,000...1,000,000. No fence lies at (0,0) or (a,b).</p>

<p>FJ plans to sit at his house at position (0,0) and look directly to the right (in the +x direction). With his gaze bouncing off some of the reflective fences on his farm, he hopes to be able to see the point (a,b). Unfortunately, FJ thinks he oriented one of his fences incorrectly (e.g., &#39;\&#39; instead of &#39;/&#39;). Please output the index of the first fence in FJ&#39;s list such that by toggling its direction (between &#39;/&#39; and &#39;\&#39; or vice versa), FJ will be able to see the point (a,b).</p>

<p>If FJ can already see the point (a,b) without toggling any fence, please output 0. If it is still impossible for him to see (a,b) even after toggling up to a single fence, output -1.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers, N, a, and b.</li>
	<li>Lines 2..1+N: Line i+1 describes fence i and contains either &quot;x_i y_i /&quot; or &quot;x_i y_i \&quot;, where (x_i, y_i) is the location of the center of the fence, and \ or / refers to its orientation.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The index of the first fence for which toggling that fence allows FJ to see the point (a,b). If FJ can already see the point (a,b), please output 0, or if there is no way he can see (a,b) even after toggling up to one fence, please output -1.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>A map of the farm looks like this (with H denoting FJ&#39;s house and B denoting the barn): </p>
<pre>
3 .\.....
2 //.\..B
1 .......
0 H../...
  0123456
</pre>

<h4>Output Details</h4>

<p>By toggling the fence at position (3,2), FJ can see the point (a,b). On the map:</p>
<pre>3 .\.....
2 //./--B
1 ...|...
0 H--/...
  0123456</pre>