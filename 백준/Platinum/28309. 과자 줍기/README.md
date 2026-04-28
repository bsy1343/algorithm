# [Platinum IV] 과자 줍기 - 28309

[문제 링크](https://www.acmicpc.net/problem/28309)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 50, 맞힌 사람: 35, 정답 비율: 32.110%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 정렬, 정수론, 조합론, 분할 정복을 이용한 거듭제곱, 페르마의 소정리

### 문제 설명

<p>Albert와 Bob은 &quot;과자 줍기&quot; 보드 게임을 즐겨한다.</p>

<p>이 게임은 크기가 $R \times C$ 인 격자 보드를 사용하여 진행하는데, 먼저 Bob이 $N$개의 칸을 골라 과자를 올려둔다. 단, 각 칸에는 최대 1개의 과자만 올려둘 수 있고 좌측상단 $(1, 1)$ 혹은 우측하단 $(R, C)$에는 과자를 올려둘 수 없다. 이후 Albert는 게임 말을 $(1, 1)$칸에 올려둔 후 우측 혹은 아래로만 이동하여 $(R, C)$ 칸에 도달하여야 하고 이동한 경로를 따라 최대한 많은 과자를 주워야 한다. 예를 들어 아래 그림의 경우 $R = 3, C = 5$ 그리고 $N = 3$인 경우를 나타낸다. 편의상 과자의 위치는 크기가 $N$인 두 배열 $X, Y$로 행/열을 나타내기로 하며 아래 예제의 경우 $X = [1, 1, 2]$ 그리고 $Y = [3, 4, 3]$이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28309.%E2%80%85%EA%B3%BC%EC%9E%90%E2%80%85%EC%A4%8D%EA%B8%B0/384a4c44.png" data-original-src="https://upload.acmicpc.net/1a670a77-04d1-46c4-9992-4cc50df0b9cc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 103px; width: 150px;" /></p>

<p>S로 표시된 $(1, 1)$ 에서 출발하여 E로 표시된 $(3, 5)$ 칸으로 가는 방법은 여럿 존재하는데, 아래 그림과 같은 방법으로 $(1, 1) \rightarrow (2, 1) \rightarrow (2, 2) \rightarrow (2, 3) \rightarrow (2, 4) \rightarrow (3, 4) \rightarrow (3, 5)$ 로 이동한다면 1개의 과자만 줍게 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28309.%E2%80%85%EA%B3%BC%EC%9E%90%E2%80%85%EC%A4%8D%EA%B8%B0/89452d3d.png" data-original-src="https://upload.acmicpc.net/72de8338-372a-4270-a344-73bf4ba28110/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 98px; width: 149px;" /></p>

<p>하지만 아래와 같이 여섯 가지 다른 방법으로 총 2개의 과자를 주울 수도 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28309.%E2%80%85%EA%B3%BC%EC%9E%90%E2%80%85%EC%A4%8D%EA%B8%B0/fcd774a7.png" data-original-src="https://upload.acmicpc.net/426c3cc1-69e8-47de-9dd8-e1214ae3d547/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 222px; width: 550px;" /></p>

<p>이 예제에서 과자를 3개 주우면서 S칸에서 E칸으로 도달하는 방법은 없다.</p>

<p>Albert는 입력으로 주어진 보드에서 최대한 많은 과자를 줍는 서로 다른 방법의 수가 몇 가지나 되는지 궁금해졌다 - Albert를 도와 이 값을 구해보자. 위 예제의 정답은 6이다.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스의 첫 줄에는 $R, C, N$ 값이 공백으로 구분되어 주어진다. 다음 $N$줄에 걸쳐 각 줄에 $i$번째 과자가 놓인 칸의 행 위치 ($X_i$)와 열 위치 ($Y_i)$ 가 공백으로 구분되어 주어진다.</p>

### 출력

<p>각 테스트 케이스에서 시작 칸 $(1, 1)$에서 도착 칸 $(R, C)$까지 이동하며 최대한 많은 과자를 줍는 방법의 수를 각 줄에 출력한다. 단, 이 수가 매우 클 수 있으므로 1000003으로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 20$</li>
	<li>$1 \le R, C \le 10^6$</li>
	<li>$1 \le N \le 100$</li>
	<li>$1 \le i \le N$인 $i$에 대하여:
	<ul>
		<li>$1 \le X_i \le R$</li>
		<li>$1 \le Y_i \le C$</li>
		<li>$(X_i, Y_i) \ne (1, 1)$</li>
		<li>$(X_i, Y_i) \ne (R, C)$</li>
	</ul>
	</li>
	<li>$1 \le i, j \le N$인 $i \ne j$에 대하여: $(X_i, Y_i) \ne (X_j, Y_j)$</li>
</ul>