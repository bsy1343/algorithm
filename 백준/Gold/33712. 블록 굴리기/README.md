# [Gold II] 블록 굴리기 - 33712

[문제 링크](https://www.acmicpc.net/problem/33712)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 119, 정답: 51, 맞힌 사람: 41, 정답 비율: 42.708%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 다이나믹 프로그래밍

### 문제 설명

<p>민규는 요즘 유행하는 퍼즐 게임, &lt;블록 굴리기&gt;의 레벨 제작 기능을 사용해 보고 있다.</p>

<p>이 게임은 $2\times 1\times 1$ 크기의 직육면체 블록을 굴려서 특정한 목표 지점에 도달하도록 하는 게임이다. 구체적으로 아래와 같은 규칙을 갖고 있다.</p>

<ul>
	<li>블록과 이동방식: $2\times 1\times 1$ 크기의 블록에 대해, 블록의 여섯 면 중 크기가 $1\times 1$인 면이 바닥과 맞닿으면 세워진 상태, $2\times 1$인 면이 바닥과 맞닿으면 눕혀진 상태라고 정의한다. 블록은 앞뒤좌우 네 방향으로 굴릴 수 있다. 블록을 굴리면 굴린 방향의 옆면이 인접한 바닥과 맞닿는 방향으로 이동한다.</li>
	<li>맵과 타일: 맵은 격자형 평면으로 구성되며, 블록이 이동할 수 있는 일반 타일과 목표 타일로 이루어져 있다. 블록은 맵 내부에서만 이동이 가능하여 경계를 벗어나면 즉시 실패 처리된다.</li>
	<li>목표: 블록을 굴려 목표 타일에 정확히 세워진 상태로 도착하는 것이 목표이다.</li>
	<li>레벨 제작 제한사항: 목표 타일은 1개만 지정할 수 있고, 목표 타일을 포함한 모든 타일은 인접한 변을 통해 연결되어 있어야 한다. 또한 블록은 세워진 상태로 배치해야 하며 일반 타일 위에만 배치할 수 있다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33712.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EA%B5%B4%EB%A6%AC%EA%B8%B0/c4d3eee3.png" data-original-src="https://boja.mercury.kr/assets/problem/33712-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; max-width:75%"></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33712.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EA%B5%B4%EB%A6%AC%EA%B8%B0/8e8a7102.png" data-original-src="https://boja.mercury.kr/assets/problem/33712-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; max-width:75%"></p>

<p style="text-align: center;"><em style="color: #898989;">$K = 6$일 때 목표 지점인 주황색 타일에 대해 파란색 타일을 시작 지점으로 정할 수 있다.</em></p>

<p>민규는 맵을 제작하던 중 특정 타일에서는 목표 타일에 도달할 수 없음을 알게 되었다. 민규를 도와 주어진 맵에서 정해진 횟수 $K$만큼 이동하여 목표 지점의 타일에 도달할 수 있는 시작 지점의 개수를 구하시오.</p>

### 입력

<p>첫 번째 줄에 격자 평면의 가로, 세로 길이 $N$, $M$과 이동 횟수 $K$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $N$개의 줄에 걸쳐 격자 평면의 상태가 공백으로 구분되어 주어진다. <span style="color:#e74c3c;"><code>0</code></span>은 경계 바깥, <span style="color:#e74c3c;"><code>1</code></span>은 일반 타일, <span style="color:#e74c3c;"><code>2</code></span>는 목표 지점의 타일을 나타낸다.</p>

### 출력

<p>첫 번째 줄에 정확히 주어진 이동 횟수만큼 움직였을 때 목표 지점에 도달할 수 있는 시작 지점의 개수를 출력한다.</p>

### 제한

<ul>
	<li>$3 \le N, M \le 150$</li>
	<li>$2 \le K \le 150$</li>
	<li>입력으로 주어지는 수는 모두 정수이다.</li>
</ul>