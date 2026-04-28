# [Gold I] 운동장 그리기 - 31446

[문제 링크](https://www.acmicpc.net/problem/31446)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 42, 맞힌 사람: 34, 정답 비율: 50.746%

### 분류

애드 혹, 기하학, 해 구성하기, 픽의 정리

### 문제 설명

<p style="display: flex; flex-direction: row; justify-content: center;"><img alt="운동장 그리기" src="%EB%B0%B1%EC%A4%80/Gold/31446.%E2%80%85%EC%9A%B4%EB%8F%99%EC%9E%A5%E2%80%85%EA%B7%B8%EB%A6%AC%EA%B8%B0/97e22c72.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31446.%E2%80%85%EC%9A%B4%EB%8F%99%EC%9E%A5%E2%80%85%EA%B7%B8%EB%A6%AC%EA%B8%B0/97e22c72.png" data-original-src="https://upload.acmicpc.net/be6ba993-19ec-481f-b6d0-d7d27e13069e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height: 150px; max-width: 100%;" /></p>

<p>유틸은 운동회 준비를 위해 운동장에 경계선을 그리려고 한다. 운동장은 꼭짓점이 $N$개이고 어떤 내각도 $180^{\circ}$가 아닌 단순다각형 $P$ 모양이며, 넓이는 $S$이다. 또한, 운동장의 각 꼭짓점의 $x$좌표와 $y$좌표는 $0$ 이상 $10^9$ 이하의 정수여야 한다. 유틸이 그릴 수 있는 운동장의 모양을 하나 찾아 주자.</p>

### 입력

<p>첫째 줄에 $P$의 꼭짓점 개수 $N$과 $P$의 넓이의 두 배를 나타내는 정수 $2S$가 공백으로 구분되어 주어진다. $(3 \le N \le 5000;$ $1 \le 2S \le 5 \times 10^8)$</p>

### 출력

<p>유틸이 그릴 수 있는 운동장의 모양 $P$가 존재하면 첫째 줄에 <code><span style="color:#e74c3c;">YES</span></code>를 출력하고, 둘째 줄부터 $N$개의 줄에 걸쳐 $P$의 각 꼭짓점을 반시계 방향으로 돌아가며 $x$좌표와 $y$좌표를 나타내는 정수를 공백으로 구분하여 출력한다. $P$가 존재하지 않으면 첫째 줄에 <code><span style="color:#e74c3c;">NO</span></code>를 출력한다.</p>

### 힌트

<p>어떤 닫힌 경로가 반시계 방향이라는 것은 경로를 따라 이동하는 동안 경로의 내부가 항상 이동 방향의 왼쪽에 위치한다는 뜻이다.</p>