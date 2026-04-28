# [Platinum V] Cube - 9918

[문제 링크](https://www.acmicpc.net/problem/9918)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 89, 맞힌 사람: 78, 정답 비율: 85.714%

### 분류

많은 조건 분기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Folding six squares connected in some special ways can form a cube. &nbsp;For example, in the diagram below, the six squares on the left can be folded into a cube (with face 1 opposite face 4, face 2 opposite face 6, and face 3 opposite face 5) but the six squares on the right cannot be folded into a cube (faces 3 and 5 overlap).</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9918.%E2%80%85Cube/5f230086.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9918.%E2%80%85Cube/5f230086.png" data-original-src="https://upload.acmicpc.net/9e9e3d45-478f-4232-a62b-6ae8c540922a/-/crop/389x292/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 133px; height: 100px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9918.%E2%80%85Cube/cf255aa7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9918.%E2%80%85Cube/cf255aa7.png" data-original-src="https://upload.acmicpc.net/9e9e3d45-478f-4232-a62b-6ae8c540922a/-/crop/389x292/721,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 133px; height: 100px;" /></td>
		</tr>
	</tbody>
</table>

<p>A 6 &times; 6 array is used to represent the six squares. &nbsp;Only 6 of the 36 cells are used to represent the 6 squares. &nbsp;A cell representing a square contains the number for the square. &nbsp; Other cells contain the number 0. &nbsp;Note that the same 6 squares can be represented in many ways. &nbsp;For example, the invalid six squares of the above example can be represented as follows (the one on the right is obtained after a 90 degree rotation of the one on the left):&nbsp;</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td>
			<pre>
0 0 0 0 0 0
0 3 0 5 0 0
1 2 4 6 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0</pre>
			</td>
			<td>
			<pre>
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 5 6
0 0 0 0 0 4
0 0 0 0 3 2
0 0 0 0 0 1</pre>
			</td>
		</tr>
	</tbody>
</table>

<p>Given a square representation, determine if the squares can be folded into a cube; if so, find the face opposite face 1.</p>

### 입력

<p>The input consists of six lines with each line containing six integers. &nbsp;All but six of the input integers are zeros. &nbsp;The non-zero integers are 1, 2, 3, 4, 5, 6.</p>

### 출력

<p>The output consists of a single integer. &nbsp;The integer is 0 if the squares cannot be folded into a cube; otherwise, the integer is the number of the face opposite face 1.</p>