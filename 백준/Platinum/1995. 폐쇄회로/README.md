# [Platinum III] 폐쇄회로 - 1995

[문제 링크](https://www.acmicpc.net/problem/1995)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 34, 맞힌 사람: 10, 정답 비율: 34.483%

### 분류

다이나믹 프로그래밍, 자료 구조, 기하학, 세그먼트 트리

### 문제 설명

<p>볼록 n각형 모양의 건물이 있고, 건물 밖에 CCTV 몇 개를 설치해 건물 주위를 감시하려고 한다. 이때, 건물 밖에 m개의 장소가 주어져 있어 그 곳에만 CCTV를 설치할 수 있다.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/779668d5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/779668d5.png" data-original-src="https://upload.acmicpc.net/3d268f04-4456-474e-bfc3-303078709cf8/-/crop/638x622/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 205px; height: 200px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/1aa6159b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/1aa6159b.png" data-original-src="https://upload.acmicpc.net/3d268f04-4456-474e-bfc3-303078709cf8/-/crop/638x622/782,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 205px; height: 200px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/034676a0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/034676a0.png" data-original-src="https://upload.acmicpc.net/bef554a8-bae2-4627-aca2-f6c86e969e59/-/crop/633x622/446,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 204px; height: 200px;" /></td>
		</tr>
		<tr>
			<td>그림 1</td>
			<td>그림 2</td>
			<td>그림 3</td>
		</tr>
	</tbody>
</table>

<p>위 그림 1과 같이 CCTV를 설치할 수 있는 장소가 주어져 있을 때, 1번 위치에 CCTV를 설치하면(그림 2) 빨간색으로 표시한 2개의 외벽을 감시할 수 있다. 단, 외벽과 CCTV의 위치가 일직선상에 위치한 경우에는 그 외벽을 감시하지 못한다고 가정한다. 예를 들어 6번 위치에 CCTV를 설치하면(그림 3) 파란색으로 표시한 벽면은 감시하지 못한다.</p>

<p>이때, CCTV를 몇 군데에 설치하여 건물 외벽을 모두 감시하도록 만들 수 있다. 위 그림 1과 같은 경우에는 1, 2, 4, 6 위치에 CCTV를 설치하거나(그림 4), 혹은 1, 3, 5, 7번 위치에 CCTV를 설치하면(그림 5) 건물 외벽을 모두 감시할 수 있다.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/03119f40.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/03119f40.png" data-original-src="https://upload.acmicpc.net/95a1ec4a-313c-4e8e-ae6b-5f3d1029a30c/-/crop/632x622/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 203px; height: 200px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/d2252dc8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1995.%E2%80%85%ED%8F%90%EC%87%84%ED%9A%8C%EB%A1%9C/d2252dc8.png" data-original-src="https://upload.acmicpc.net/95a1ec4a-313c-4e8e-ae6b-5f3d1029a30c/-/crop/632x622/788,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 203px; height: 200px;" /></td>
		</tr>
		<tr>
			<td>그림 4</td>
			<td>그림 5</td>
		</tr>
	</tbody>
</table>

<p>그런데 각각의 위치마다 CCTV를 설치하는 데 드는 비용이 다르다. 우리가 할 일은 건물 외벽을 모두 감시하도록 CCTV를 설치할 때 드는 최소 비용을 구하는 것이다.</p>

### 입력

<p>첫 번째 줄에 자연수 n(1 &le; n &le; 1,000)과 m(1 &le; m &le; 1,000)의 값이 주어진다. 두 번째 줄부터 차례로 n개의 줄에 걸쳐 다각형을 이루는 꼭짓점들의 x, y 좌표가 반시계 방향으로 하나씩 주어진다. 그 다음 m개 줄에는 CCTV를 설치할 수 있는 곳의 x, y좌표, 그리고 그 위치에 설치할 때 드는 비용이 차례로 주어진다. 두 좌표 사이에는 빈 칸이 하나 있다. 모든 좌표값은 절댓값이 100,000을 넘지 않는 정수이며 CCTV를 설치할 때 드는 비용은 100,000 이하의 자연수이다. 다각형의 인접한 두 변이 일직선상에 위치하는 경우는 없다고 가정해도 좋다.</p>

### 출력

<p>첫 번째 줄에 최소 비용을 출력한다. 건물 외벽을 모두 감시하도록 CCTV를 설치하는 것이 불가능하다면 -1을 출력하면 된다.</p>