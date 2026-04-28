# [Platinum V] Stable Table - 24565

[문제 링크](https://www.acmicpc.net/problem/24565)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 14, 맞힌 사람: 14, 정답 비율: 35.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Avant-garde carpenter Mort S. Tenon specializes in assembling furniture out of odd-shaped pieces of wood. Using strong glue and cleverly-hidden weights and floor anchors, Tenon can make tables that appear to defy gravity, as shown in Figure 1(b). He begins by creating a rectangular block composed of pieces of wood whose vertical cross-sections are rectilinear polygons, that is, polygons whose sides are either horizontal or vertical. Some of these pieces may have holes containing other pieces. Then he removes as many pieces as possible, leaving a structure consisting of the smallest possible number of stable pieces that include the entire top surface of the rectangular block. For aesthetic reasons (something having to do with patterns of wood grain), Mort never has more than two pieces forming the table&#39;s top surface.</p>

<p>Figure 1(a) shows an initial rectangular block with cuts. By removing the pieces numbered $1$ and $2$, $4$ through $7$, and $11$ and $12$, he produces the stable table shown in Figure 1(b). A piece is considered stable if either it is directly in contact with the floor or at least one of its horizontal edges lies above and is in contact with a horizontal edge of a stable piece. The region of contact between two adjacent pieces must have positive area in order for the contact to be stable; contact only along a corner is not sufficient.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td style="width: 50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24565.%E2%80%85Stable%E2%80%85Table/c60ff99e.png" data-original-src="https://upload.acmicpc.net/7bf26d3d-1cc5-488e-bc68-062096ea7d82/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 295px; height: 200px;" /></td>
			<td style="width: 50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24565.%E2%80%85Stable%E2%80%85Table/972be54d.png" data-original-src="https://upload.acmicpc.net/3ca76993-e27c-4b35-b58e-ff642461f5cc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 296px; height: 200px;" /></td>
		</tr>
		<tr>
			<td style="width: 50%;">(a) Original rectangular block</td>
			<td style="width: 50%;">(b) A five-piece stable table</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure K.1: Illustration of Sample Input 1</p>

<p>Given a description of the initial rectangular block of pieces, help Mort determine a stable table with the minimum number of pieces.</p>

### 입력

<p>The first line of input contains two positive integers $h$ and $w$ ($1 \le h,w \le 100$), the height and width of the initial block of pieces. Each of the remaining $h$ lines contains $w$ positive integers describing which piece is associated with each $1\times 1$ unit of the block. Pieces all have distinct numbers from $1$ up through the number of pieces in the block. There can be at most $9\,902$ pieces since the first row of input can have at most two piece numbers. Pieces may have holes containing other pieces; each piece is connected using shared edges among the $1\times 1$ units comprising the piece.</p>

### 출력

<p>Output a single integer equal to the minimum number of pieces in a stable table.</p>