# [Gold IV] Track Smoothing - 3962

[문제 링크](https://www.acmicpc.net/problem/3962)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 16, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

기하학

### 문제 설명

<p>Bob has the task to plan a racing track of a specific length. He thought it is a great idea to just form a convex polygon that has exactly the required length. Then he was told that racing cars cannot drive such sharp corners like in his plan.</p>

<p>He has to ensure some minimal radius for all curves in his track. Bobs loves the shape of his track, so he don&rsquo;t want to change it too much. His plan is to scale the track down around the balance point of the polygon that specifies his track. Then, he wants to draw the new track with a line that has a constant distance to the scaled track. The chosen distance should be minimal distance that fulfils the given minimum radius constraint. He asks you to write a program to calculate the scale factor for a given track and minimum radius so that the resulting track has the same length as the one of his original plan.</p>

<p>Bob made some drawings of the first test case:</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3962.%E2%80%85Track%E2%80%85Smoothing/77c15c43.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3962.%E2%80%85Track%E2%80%85Smoothing/77c15c43.png" data-original-src="https://www.acmicpc.net/upload/images2/track1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:236px; width:207px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3962.%E2%80%85Track%E2%80%85Smoothing/82494ee8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3962.%E2%80%85Track%E2%80%85Smoothing/82494ee8.png" data-original-src="https://www.acmicpc.net/upload/images2/track2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:234px; width:209px" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">Figure 1 &ndash; Original track and scaled down track</td>
			<td style="text-align: center;">Figure 2 &ndash; Scaled down track and resulting track</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input starts with the number of test cases t (0 &lt; t &le; 100). Every test case starts with a line consisting of two integers: the minimal required radius r and the number of points n of the original track polygon (0 &le; r &le; 1 000; 3 &le; n &le; 10 000). Then n lines follow, where each line specifies 2D-coordinates as two integers x<sub>i</sub> and y<sub>i</sub> (-10 000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 10 000). (0, 0) is the lower left corner. These are the coordinates of the original track in counterclockwise direction. You may safely assume that the area of the given polygon is non-empty.</p>

### 출력

<p>For each test case print out one line. If it is possible to construct a course according to the above description, output the scaling factor, &ldquo;Not possible&rdquo; otherwise. The factor must have a relative or absolute error smaller than 10<sup>-5</sup>.</p>