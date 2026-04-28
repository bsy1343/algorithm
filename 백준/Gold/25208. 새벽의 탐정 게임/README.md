# [Gold II] 새벽의 탐정 게임 - 25208

[문제 링크](https://www.acmicpc.net/problem/25208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 715, 정답: 223, 맞힌 사람: 173, 정답 비율: 33.398%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>새벽의 탐정 게임은 재미있는 2인용 보드게임이다. 한 명은 탐정, 다른 한 명은 도둑 역할을 맡는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25208.%E2%80%85%EC%83%88%EB%B2%BD%EC%9D%98%E2%80%85%ED%83%90%EC%A0%95%E2%80%85%EA%B2%8C%EC%9E%84/c2e23b84.png" data-original-src="https://upload.acmicpc.net/a3b202e6-a324-4752-a49b-48dcc39531df/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>게임은 $N$행 $M$열 격자 위에서 진행된다. 격자의 각 칸은 벽이 설치되어 있거나 비어있고, 역할에 관계없이 벽 위에 서거나 벽을 넘어갈 수 없다. 임의의 두 빈칸은 상하좌우로 인접한 빈칸들을 거쳐 이동할 수 있다. 다시 말해 어느 빈칸에서 출발해도 다른 모든 빈칸으로 이동할 수 있다.</p>

<p>도둑은 밤 동안 은밀하게 어떤 칸으로 이동하고, 다시 밤이 찾아오기 전엔 그 칸에서 움직일 수 없다. 탐정은 새벽이 밝아오면 단서를 모아 도둑의 위치를 밝혀내고 감옥에 가두어야 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25208.%E2%80%85%EC%83%88%EB%B2%BD%EC%9D%98%E2%80%85%ED%83%90%EC%A0%95%E2%80%85%EA%B2%8C%EC%9E%84/d538e4be.png" data-original-src="https://upload.acmicpc.net/6aee3896-2c54-4dea-874d-521f6c60f4bc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>감옥은 위 전개도를 접은 모습이다. 다시 말해, 다섯 면이 막혀있고 나머지 한 면이 뚫려있는 정육면체이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25208.%E2%80%85%EC%83%88%EB%B2%BD%EC%9D%98%E2%80%85%ED%83%90%EC%A0%95%E2%80%85%EA%B2%8C%EC%9E%84/cd4ea399.png" data-original-src="https://upload.acmicpc.net/cbcb4065-a7c8-4adc-8b61-59518cea3d7f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>탐정은 자신이 있는 칸에&nbsp;감옥의 뚫린 면이 바닥을 향하게 하여 놓는다. 감옥은 상하좌우 중 벽이 없는 한 방향으로 굴릴 수 있고, 그에 따라 바닥을 향하는 면이 바뀌게 된다. 즉, 이동하려는 칸의 바닥과 수직으로 접하고 있는 면이 이동 후 바닥을 향하게 된다.</p>

<p>도둑을 감옥에 가두려면,&nbsp;감옥의 뚫린&nbsp;면이 바닥을 향할 때 도둑이 같은&nbsp;칸에 있어야 한다. 만약 막힌 면이 바닥을 향할 때 도둑이 같은 칸에 있다면 도둑은 바로 승리를 선언하고 탐정은 패배하게 된다.</p>

<p>당신은 탐정 역할이고, 도둑의 위치를 특정했다. 이제&nbsp;도둑을 감옥으로 가두기만 하면 승리할 수 있다.&nbsp;당신의 위치와 도둑의 위치가 주어질 때, 감옥을 최소 몇 번 굴려야 당신이 게임에서 승리할 수 있을지 알아보자.</p>

### 입력

<p>첫 번째 줄에 보드의 크기 $N$, $M$이 주어진다.</p>

<p>두 번째 줄부터 $N$개의 줄에 각각 $M$개의 문자로 보드의 상태가 주어진다. 벽이 있는 칸은 <code>#</code>, 빈칸은 <code>.</code>, 탐정의&nbsp;위치는 <code>D</code>, 도둑의 위치는 <code>R</code>로 주어진다.</p>

### 출력

<p>탐정이 승리할 수 있다면 도둑을 가두는데 필요한 최소 이동 횟수를 출력한다.</p>

<p>그렇지 않다면 -1을 출력한다.</p>

### 제한

<ul>
	<li>4 &le; $N$, $M$ &le; 500</li>
	<li>입력에 <code>D</code>와 <code>R</code>은 한 개씩만 주어진다.</li>
	<li>탐정이 있는 칸과&nbsp;도둑이 있는 칸은&nbsp;모두 벽이 아니다.</li>
	<li>보드의 테두리, 즉 1행, 1열, N행, M열에 해당하는 칸은 벽이다.</li>
</ul>