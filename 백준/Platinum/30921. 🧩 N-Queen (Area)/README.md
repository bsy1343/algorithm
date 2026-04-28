# [Platinum IV] 🧩 N-Queen (Area) - 30921

[문제 링크](https://www.acmicpc.net/problem/30921)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 185, 정답: 96, 맞힌 사람: 72, 정답 비율: 53.731%

### 분류

수학, 기하학, 다각형의 넓이

### 문제 설명

<p>N-Queen 문제는 크기가 <em>N</em> &times; <em>N</em>인 체스판 위에 <em>N</em>개의 퀸을 서로 공격할 수 없게 놓는 문제이다. 퀸은 같은 행, 열, 또는 대각선 위에 있는 다른 기물을 공격할 수 있다.</p>

<p>이 문제에서는 체스판이 찌그러져 있다. 즉 체스판은 그림과 같은 볼록사각형 ABCD로, 사각형의 네 변을 <em>N</em>등분하고, 네 선분 AB와 CD, AD와 BC에 있는 <em>N</em> &minus; 1개의 등분점들을 마주 보는 것끼리 이어서 만들어진 <em>N</em><sup>2</sup>개의 사각형 칸으로 구성된다.</p>

<p style="display: flex; justify-content: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30921.%E2%80%85%F0%9F%A7%A9%E2%80%85N-Queen%E2%80%85(Area)/728217eb.png" data-original-src="https://upload.acmicpc.net/3305fbf4-06b4-4147-8e21-25537bb44a72/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: max(300px, 30%);" /></p>

<p>이 체스판 위에 퀸 <em>N</em>개를 서로 공격하지 못하도록 놓는 방법들 가운데, 퀸이 위치한 칸의 넓이의 합이 최대가 되는 경우를 구하자.</p>

### 입력

<p>첫째 줄에 <em>N</em>이 주어진다.</p>

<p>둘째 줄에 네 꼭짓점 A, B, C, D의 좌표 <em>x</em><sub><em>A</em></sub>, <em>y</em><sub><em>A</em></sub>, <em>x</em><sub><em>B</em></sub>, <em>y</em><sub><em>B</em></sub>, <em>x</em><sub><em>C</em></sub>, <em>y</em><sub><em>C</em></sub>, <em>x</em><sub><em>D</em></sub>, <em>y</em><sub><em>D</em></sub>가 공백으로 구분되어 주어진다. 점의 순서는 시계방향 또는 반시계방향이다.</p>

### 출력

<p>첫째 줄에 퀸이 위치한 칸의 넓이의 합이 가장 클 때의 값을 출력한다. 절대/상대오차는 10<sup>&minus;9</sup>까지 허용한다.</p>

### 제한

<ul>
	<li>4 &le; <em>N</em> &le; 100. 이 범위에서 항상 퀸 <em>N</em>개를 놓을 수 있는 방법이 있음이 보장된다.</li>
	<li>&minus;1000 &le; <em>x</em><sub><em>A</em></sub>, <em>y</em><sub><em>A</em></sub>, <em>x</em><sub><em>B</em></sub>, <em>y</em><sub><em>B</em></sub>, <em>x</em><sub><em>C</em></sub>, <em>y</em><sub><em>C</em></sub>, <em>x</em><sub><em>D</em></sub>, <em>y</em><sub><em>D</em></sub> &le; 1000</li>
	<li>모든 입력은 정수이다.</li>
</ul>