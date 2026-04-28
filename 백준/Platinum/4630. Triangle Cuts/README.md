# [Platinum IV] Triangle Cuts - 4630

[문제 링크](https://www.acmicpc.net/problem/4630)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 기하학, 구현

### 문제 설명

<table class="table table-bordered">
	<tbody>
		<tr>
			<td style="text-align:center"><img alt="Tri 1" src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/82eb6a51.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/82eb6a51.gif" data-original-src="https://www.acmicpc.net/upload/images2/f1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:122px; width:175px" /></td>
			<td style="text-align:center; vertical-align:middle"><img alt="Tri 2" src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/56fd343a.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/56fd343a.gif" data-original-src="https://www.acmicpc.net/upload/images2/f2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:149px; width:248px" /></td>
			<td style="text-align:center; vertical-align:top"><img alt="Tri 3" src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/458382fb.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/458382fb.gif" data-original-src="https://www.acmicpc.net/upload/images2/f3.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:145px; width:173px" /></td>
			<td style="text-align:center; vertical-align:top"><strong>Disallowed&nbsp; Pattern</strong><br />
			<br />
			<img alt="Tri 4" src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/70d7c2fd.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4630.%E2%80%85Triangle%E2%80%85Cuts/70d7c2fd.gif" data-original-src="https://www.acmicpc.net/upload/images2/f4.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:88px; width:164px" /></td>
		</tr>
		<tr>
			<td style="text-align:center">Figure 1</td>
			<td style="text-align:center">Figure 2</td>
			<td style="text-align:center">Figure 3</td>
			<td style="text-align:center">Figure 4</td>
		</tr>
	</tbody>
</table>

<p>A computer science professor was watching his young daughter use scissors to cut large triangular pieces of paper that were green on one side and white on the other. &nbsp;She always kept the white side of the paper up, so the green side was never visible, and she always followed the same general procedure. Starting with one large white triangle, she would always make exactly three straight cuts, each of which separated one piece of paper into two, and end up with exactly four smaller white triangles. &nbsp;Then she would put the small triangles aside and start over with a new large triangle.</p>

<p>The first three figures show some of the possibilities. All angles are in degrees. &nbsp;In Figures 1 and 2, no cut goes all the way from one vertex of the original large triangle to the opposite side. &nbsp;In fact, these two figures (including any rotations thereof) show the only ways that she could produce four triangles without making such a cut. &nbsp;The pattern in Figure 4 can&#39;t happen, because her cuts always separate the current piece of paper into two pieces; after she cuts off the rightmost triangle in Figure 4, none of the remaining cuts will separate the remaining triangle into two pieces.</p>

<p>The professor imagined a room full of children producing piles of triangles using different methods, and wondered if he could identify his daughter&#39;s work. &nbsp;Given the exact size and shape of four small triangles, could he tell if she could have produced them from one large triangle? &nbsp;After a moment&#39;s thought he realized that he could simplify the problem and consider only the shapes of the triangles, noting that if the shapes were compatible, there would always be some appropriate sizes for the small triangles. &nbsp;This led to the following problem for you to solve: &nbsp;given the angles of a large triangle and four smaller ones, is it possible that the small triangles could have been obtained from the large one using the procedure his daughter was following?</p>

### 입력

<p>The input contains from 1 to 30 datasets followed by a line containing only &quot;0 0 180&quot;. &nbsp;Each dataset contains 15 positive integers separated by single blanks on one line. &nbsp;Each integer is less than 180. &nbsp;Each group of three integers are the vertex angles for one triangle, expressed in degrees. &nbsp;Assume that none of the triangles is flipped over so the green side of the paper is up, and the vertex angles are listed in clockwise order around each individual triangle. &nbsp;</p>

<p>The first four datasets of the sample input below correspond to the figures above.</p>

### 출력

<p>The output contains one line for each data set. &nbsp;If the child&#39;s cutting play, as described above, started with a triangle with the first three angles, and could have ended up with triangles matching the last four triangles in the dataset, then the line contains &quot;yes&quot;. &nbsp;Otherwise the line contains &quot;no&quot;.</p>