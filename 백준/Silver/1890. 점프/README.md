# [Silver I] 점프 - 1890

[문제 링크](https://www.acmicpc.net/problem/1890)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59958, 정답: 19795, 맞힌 사람: 15302, 정답 비율: 31.903%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>N&times;N 게임판에 수가 적혀져 있다. 이 게임의 목표는 가장 왼쪽 위 칸에서 가장 오른쪽 아래 칸으로 규칙에 맞게 점프를 해서 가는 것이다.</p>

<p>각 칸에 적혀있는 수는 현재 칸에서 갈 수 있는 거리를 의미한다. 반드시 오른쪽이나 아래쪽으로만 이동해야 한다. 0은 더 이상 진행을 막는 종착점이며, 항상 현재 칸에 적혀있는 수만큼 오른쪽이나 아래로 가야 한다. 한 번 점프를 할 때, 방향을 바꾸면 안 된다. 즉, 한 칸에서 오른쪽으로 점프를 하거나, 아래로 점프를 하는 두 경우만 존재한다.</p>

<p>가장 왼쪽 위 칸에서 가장 오른쪽 아래 칸으로 규칙에 맞게 이동할 수 있는 경로의 개수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 게임 판의 크기 N (4 &le; N &le; 100)이 주어진다. 그 다음 N개 줄에는 각 칸에 적혀져 있는 수가 N개씩 주어진다. 칸에 적혀있는 수는 0보다 크거나 같고, 9보다 작거나 같은 정수이며, 가장 오른쪽 아래 칸에는 항상 0이 주어진다.</p>

### 출력

<p>가장 왼쪽 위 칸에서 가장 오른쪽 아래 칸으로 문제의 규칙에 맞게 갈 수 있는 경로의 개수를 출력한다.&nbsp;<span style="line-height:1.6em">경로의 개수는 2</span><sup style="line-height:1.6em">63</sup><span style="line-height:1.6em">-1보다 작거나 같다.</span></p>

### 힌트

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/1890.%E2%80%85%EC%A0%90%ED%94%84/9bbbe94a.png" data-original-src="https://upload.acmicpc.net/563fbfda-6750-49ca-931d-125d4259c870/-/crop/195x192/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 98px; height: 96px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/1890.%E2%80%85%EC%A0%90%ED%94%84/5d84787b.png" data-original-src="https://upload.acmicpc.net/563fbfda-6750-49ca-931d-125d4259c870/-/crop/640x192/302,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; height: 96px;" /></td>
		</tr>
		<tr>
			<td>그림 1</td>
			<td>그림 2</td>
		</tr>
	</tbody>
</table>