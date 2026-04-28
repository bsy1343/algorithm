# [Silver I] 보드 점프 - 3372

[문제 링크](https://www.acmicpc.net/problem/3372)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 2501, 정답: 751, 맞힌 사람: 637, 정답 비율: 36.255%

### 분류

다이나믹 프로그래밍, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>N &times; N 게임 보드에 양의 숫자들이 적혀있다. 목적은 왼쪽 위에서 오른쪽 아래까지 규칙에 맞게 점프를 해서 가는 것이다. 숫자들은 현재 점에서 갈 수 있는 거리를 의미한다. 반드시 오른쪽이나 아래쪽으로만 갈 수 있으며 0은 더 이상의 진행을 막는 종착점이다. 다시 말해서 현재 점의 숫자만큼 오른쪽이나&nbsp;아래쪽으로 가야한다는 의미이다.</p>

### 입력

<p>첫 번째 줄에는 양에 정수 N(4 &le; N &le; 100)가 들어오고, 그 다음 N개의 줄에 각각 0~9사이의 숫자 N개가 들어온다.</p>

### 출력

<p>왼쪽 위에서 오른쪽 아래로 위의 규칙에 맞게 갈 수 있는 경로의 개수를 출력한다. 경로의 개수는 2<sup>63</sup>-1보다 클 수 있으며,&nbsp;100자리를 넘지는 않는다.</p>

### 힌트

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3372.%E2%80%85%EB%B3%B4%EB%93%9C%E2%80%85%EC%A0%90%ED%94%84/9bbbe94a.png" data-original-src="https://upload.acmicpc.net/563fbfda-6750-49ca-931d-125d4259c870/-/crop/195x192/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 98px; height: 96px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3372.%E2%80%85%EB%B3%B4%EB%93%9C%E2%80%85%EC%A0%90%ED%94%84/5d84787b.png" data-original-src="https://upload.acmicpc.net/563fbfda-6750-49ca-931d-125d4259c870/-/crop/640x192/302,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; height: 96px;" /></td>
		</tr>
		<tr>
			<td>그림 1</td>
			<td>그림 2</td>
		</tr>
	</tbody>
</table>