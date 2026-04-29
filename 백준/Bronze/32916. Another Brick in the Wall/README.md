# [Bronze I] Another Brick in the Wall - 32916

[문제 링크](https://www.acmicpc.net/problem/32916)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 185, 정답: 115, 맞힌 사람: 81, 정답 비율: 61.364%

### 분류

사칙연산, 수학, 홀짝성

### 문제 설명

<p>Alice likes building toy walls. She has a lot of $1 \times 2$ bricks and a limited supply of $1 \times 3$ bricks. Both types of bricks have a height of 1 and can not be rotated.</p>

<p>Alice is going to build a one unit thick wall of length $l$ and height $h$ out of these bricks. A wall is <em>solid</em> if there are no seams directly above another seam.</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32916.%E2%80%85Another%E2%80%85Brick%E2%80%85in%E2%80%85the%E2%80%85Wall/b7fbf92d.png" data-original-src="https://boja.mercury.kr/assets/problem/32916-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 141px; height: 47px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32916.%E2%80%85Another%E2%80%85Brick%E2%80%85in%E2%80%85the%E2%80%85Wall/511e3078.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32916-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 140px; height: 66px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32916.%E2%80%85Another%E2%80%85Brick%E2%80%85in%E2%80%85the%E2%80%85Wall/629744d3.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32916-3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 141px; height: 85px;"></td>
		</tr>
		<tr>
			<td>Good seam placement</td>
			<td>Bad seam placement</td>
			<td>Solid $7 \times 4$ wall</td>
		</tr>
	</tbody>
</table>

<p>Help Alice determine the minimum number of $1 \times 3$ bricks required to build a solid wall of length $l$ and height $h$.</p>

### 입력

<p>The only line contains two integers $l$ and $h$, denoting the length and the height of the wall ($5 \le l \le 1000$; $2 \le h \le 1000$).</p>

### 출력

<p>Print the minimum number of $1 \times 3$ bricks required to build a solid $l \times h$ wall.</p>

<p>It can be shown that it is always possible to build a solid wall of length $l$ and height $h$.</p>