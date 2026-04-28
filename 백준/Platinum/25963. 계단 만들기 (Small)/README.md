# [Platinum V] 계단 만들기 (Small) - 25963

[문제 링크](https://www.acmicpc.net/problem/25963)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 76, 맞힌 사람: 56, 정답 비율: 51.852%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>때는 2013년, 잼민이 지수는 마인크래프트 게임을 열심히 하고 있다.</p>

<p>지수가 하는 마인크래프트에서는 점프는 한 칸밖에 되지 않으며, 신기하게도 두 칸 이상부터 즉사 낙하 데미지가 들어간다! 따라서 한 곳에서 다른 한 곳으로 이동하기 위해서는 인접한 열의 높이 차가 $1$ 이하여야만 한다. 또한, 모든 블록은 공중에 떠 있을 수 없다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25963.%E2%80%85%EA%B3%84%EB%8B%A8%E2%80%85%EB%A7%8C%EB%93%A4%EA%B8%B0%E2%80%85(Small)/ba5d5a80.png" data-original-src="https://upload.acmicpc.net/886e9077-a576-4fdd-a5b9-4a05f9756981/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 345px;" /></p>

<p>위 그림에서처럼 지수는 왼쪽 끝에서 오른쪽 끝으로 이동하고자 한다. 그런데 지금 상태에서는 인접한 열의 높이 차가 $2$ 이상인 곳이 있어 지수의 캐릭터가 즉사하게 된다. 따라서 몇 개의 블록을 옮겨 블록의 높이 차가 최대 $1$이 되게 하고자 한다. 그러나 지수는 매우 게으른 성격이기 때문에 최소한의 블록만 옮기고 싶다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25963.%E2%80%85%EA%B3%84%EB%8B%A8%E2%80%85%EB%A7%8C%EB%93%A4%EA%B8%B0%E2%80%85(Small)/91ba15ef.png" data-original-src="https://upload.acmicpc.net/0d57b1f9-8864-42e8-a38e-37d7208bea2c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 345px;" /></p>

<p>위 예시에서는 두 개의 블록을 옮기면 모든 인접한 블록의 높이 차가 최대 $1$이 된다!</p>

<p>지수가 왼쪽 끝에서 오른쪽 끝으로 안전하게 도달하기 위해 블록을 옮길 때, 옮겨야 하는 블록의 최소 개수를 구하시오.</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다. $N$은 마인크래프트 맵의 너비이다. ($1 \le N \le 100$)</p>

<p>두 번째 줄에는 $N$개의 수가 주어진다. $i$ 번째 수 $h_i$는 $(i - 1)$ 좌표에 놓인 블록의 높이이다. ($1 \le h_i \le 100$)</p>

<p>블록의 총 개수는 $N\cdot(N + 1) / 2$를 넘지 않는다.</p>

### 출력

<p>첫 번째 줄에 옮겨야 하는 블록의 최소 수를 한 개의 정수로 출력하시오.</p>