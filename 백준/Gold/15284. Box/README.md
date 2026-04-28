# [Gold IV] Box - 15284

[문제 링크](https://www.acmicpc.net/problem/15284)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 45, 맞힌 사람: 44, 정답 비율: 63.768%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 기하학

### 문제 설명

<p>Bella is working in a factory that produces boxes. All boxes are in a shape of rectangular parallelepipeds. A net of the corresponding parallelepiped is cut out of a flat rectangular piece of cardboard of size w &times;h. This net is a polygon with sides parallel to the sides of the rectangle of the cardboard. The net is bent along several lines and is connected along the edges of the resulting parallelepiped to form a box. The net is bent only along the edges of the resulting box.</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15284.%E2%80%85Box/764088ea.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15284/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:122px; width:141px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15284.%E2%80%85Box/c9c4b82b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15284/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:63px; width:272px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">The first example</td>
			<td style="text-align:center; width:50%">The third example</td>
		</tr>
	</tbody>
</table>

<p>Bella is a software developer and her task is to check whether it is possible to make a box of size a&times;b&times;c out of a cardboard of size w &times; h. Bella did write a program and boxes are being produced. Can you do the same?</p>

### 입력

<p>The first line contains three integers a, b, and c &mdash; the dimensions of the box.</p>

<p>The second line contains two integers w and h &mdash; the width and the height of the cardboard.</p>

<p>All integers are positive and do not exceed 10<sup>8</sup>.</p>

### 출력

<p>Print &ldquo;Yes&rdquo; if it is possible to cut a box a &times; b &times; c out of a cardboard of size w &times; h. Print &ldquo;No&rdquo; otherwise.</p>

### 힌트

<p>There are 11 different nets of a cube, ignoring rotations and mirror images.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15284.%E2%80%85Box/5be7c858.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15284/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:185px; width:525px" /></p>