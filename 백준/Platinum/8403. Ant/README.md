# [Platinum V] Ant - 8403

[문제 링크](https://www.acmicpc.net/problem/8403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>A Byteotian ant is walking along the edges of ABCDEFGH cube:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8403.%E2%80%85Ant/37d7ff9b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8403.%E2%80%85Ant/37d7ff9b.png" data-original-src="https://upload.acmicpc.net/ee8976db-173f-4282-bae3-958e85de0cad/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>It tries to find out, in how many ways it can go from one given vertex, to another given vertex, walking along exactly <em>k</em>&nbsp;edges (when the ant enters an edge, it will not turn back and will finally reach the second end of this edge). If the ant goes through some edge <em>x</em>&nbsp;times, we count this edge <em>x</em>&nbsp;times. The ant would like to have interesting routes, that is if the ant is in some vertex, it would like to leave this vertex using an edge other than the edge recently used to enter this vertex (i.e. it want not to use the same edge twice in a row).</p>

<p>Our ant is not so smart, because it can only count using integers from 0&nbsp;to <em>p</em> - 1, for some <em>p</em>, so you should compute the result modulo&nbsp;<em>p</em>.</p>

<p>Write a program which:</p>

<ul>
	<li>reads the starting and the ending vertex of the ant&#39;s route, number of edges on the ant&#39;s route, and integer <em>p</em>,</li>
	<li>computes number of interesting routes, which satisfy the ant&#39;s requests, modulo&nbsp;<em>p</em>,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains two capital English letters <em>v</em><sub>1</sub>&nbsp;and&nbsp;<em>v</em><sub>2</sub>&nbsp;(<em>A</em> &le; <em>v</em><sub>1</sub>, <em>v</em><sub>2</sub> &le; <em>H</em>, <em>v</em><sub>1</sub> &ne; <em>v</em><sub>2</sub>), separated by a single space. The two letters denote the starting and ending vertex of the ant&#39;s route respectively. The second line contains two integers <em>k</em>&nbsp;and <em>p</em>&nbsp;(1 &le; <em>k</em> &le; 2 000 000 000, 2 &le; <em>p</em> &le; 1 000 000 000), separated by a single space.</p>

### 출력

<p>Exactly one integer is to be written on the standard output. This integer is the number of interesting routes from the vertex <em>v</em><sub>1</sub>&nbsp;to the vertex&nbsp;<em>v</em><sub>2</sub>, containing exactly <em>k</em>&nbsp;edges, modulo <em>p</em>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8403.%E2%80%85Ant/fadc3494.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8403.%E2%80%85Ant/fadc3494.png" data-original-src="https://upload.acmicpc.net/880aaf92-3c3b-4e02-aff5-45e35b681982/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>