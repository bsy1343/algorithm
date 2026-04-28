# [Platinum IV] 게임판 - 29892

[문제 링크](https://www.acmicpc.net/problem/29892)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 216, 정답: 67, 맞힌 사람: 49, 정답 비율: 31.818%

### 분류

구현, 누적 합, 슬라이딩 윈도우

### 문제 설명

<p>$N$행 $M$열 크기의 격자판이 있다. 격자판의 각 칸은 비어있거나 1번 말 혹은 2번 말이 놓여있다. 편의상 $X$행 $Y$열($1 \leq X \leq N, 1 \leq Y \leq M$)의 칸을 ($X$, $Y$)로 표시한다. 가장 왼쪽 위 칸은 $(1, 1)$이고, 가장 오른쪽 아래 칸은 $(N, M)$이다.</p>

<p>주원이와 준원이는 이 격자판에서 게임을 하려고 한다. 주원이는 $1$번 말을, 준원이는 $2$번 말을 선택했다. 게임을 진행하기 위해선 한 변의 길이가 홀수 $K$인 정사각형 크기의 격자판이 필요했기 때문에, 격자판의 일부를 선택해 그 안에서만 게임을 진행하려고 한다.</p>

<p>게임을 공정하게 진행하기 위해서, 주원과 준원은 선택할 수 있는 $K$행 $K$열 크기의 격자판 중에서 유리도 차이가 가장 작은 격자판을 선택하려고 한다. 한 사람의 유리도는 선택한 격자판 안에 있는 자기 말들과 격자판의 중앙과의 거리의 합으로 계산된다. 선택한 격자판의 가장 왼쪽 위 칸이 $(X, Y)$일 때 격자판 중앙의 위치는 $(X+\frac{K-1}{2}, Y+\frac{K-1}{2})$이며, 두 칸의 위치 $(X_1, Y_1)$와 $(X_2, Y_2)$ 사이의 거리는 $|X_1 - X_2| + |Y_1 - Y_2|$로 정의된다. 예를 들어, $(1, 3)$과 $(5, 1)$ 사이의 거리는 $(5-1) + (3-1)$인 $6$이다.</p>

<p>아래 그림과 같은 상태의 $4$행 $5$열 크기의 격자판이 주어졌고, 이 안에서 게임을 위한 $3$행 $3$열 크기의 격자판을 선택하려고 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29892.%E2%80%85%EA%B2%8C%EC%9E%84%ED%8C%90/c74ea9bf.png" data-original-src="https://upload.acmicpc.net/72799b83-238e-47b3-92ea-70eb9015db19/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 318px; height: 249px;" /></p>

<p>게임을 진행할 격자판의 가장 왼쪽 위 칸과 오른쪽 아래 칸을 각각 $(1, 1)$과 $(3, 3)$으로 했을 때, 격자판 안의 $1$번 말들과 중앙인 $(2, 2)$와의 거리의 합은 $6$이고, $2$번 말들과 중앙의 거리의 합은 $0$이므로 유리도의 차이는 $6$이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29892.%E2%80%85%EA%B2%8C%EC%9E%84%ED%8C%90/820024c5.png" data-original-src="https://upload.acmicpc.net/6ff148e2-f29d-4f89-93b2-2a2def181282/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 324px; height: 256px;" /></p>

<p>가장 왼쪽 위 칸과 오른쪽 아래 칸이 각각 $(2, 1)$과 $(4, 3)$인 격자판을 선택한다면 $1$번 말과 중앙의 거리의 합은 $0+1=1$이며, $2$번 말의 거리의 합은 $1+1 = 2$로, 유리도의 차이는 $1$이 된다. 이 $N$행 $M$열의 격자판에서 선택 가능한 모든 격자판을 봐도 유리도의 차이가 $1$보다 작은 경우는 없기 때문에 문제의 정답은 $1$이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29892.%E2%80%85%EA%B2%8C%EC%9E%84%ED%8C%90/40537cc6.png" data-original-src="https://upload.acmicpc.net/e759e19e-7fba-4dbd-a9e9-73d72a3033b6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 324px; height: 257px;" /></p>

<p>주원과 준원이 선택할 수 있는 격자판 중 유리도의 차이가 가장 작을 때의 차이를 찾아주자.</p>

### 입력

<p>첫 번째 줄에 $N$, $M$, $K$가 공백을 사이에 두고 주어진다.</p>

<p>다음 $N$개의 줄에는 격자판의 상태를 의미하는 길이 $M$의 문자열이 주어진다. 문자열은 <span style="color:#e74c3c;"><code>.</code></span>, <span style="color:#e74c3c;"><code>1</code></span>, <span style="color:#e74c3c;"><code>2</code></span>로 이루어져 있고, 아래와 같은 의미를 가진다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>.</code></span> : 빈 칸</li>
	<li><span style="color:#e74c3c;"><code>1</code></span> : $1$번 말이 놓여있는 칸</li>
	<li><span style="color:#e74c3c;"><code>2</code></span> : $2$번 말이 놓여있는 칸</li>
</ul>

### 출력

<p>첫 번째 줄에 가능한 유리도의 차이 중 최솟값을 출력한다.</p>

### 제한

<ul>
	<li>주어지는 모든 수는 정수이다.</li>
	<li>$1 \leq N, M \leq 500$</li>
	<li>$1 \leq K  \leq \min(N, M)$</li>
	<li>$K$는 홀수이다.</li>
	<li>주어지는 격자판의 상태는 <span style="color:#e74c3c;"><code>.</code></span>, <span style="color:#e74c3c;"><code>1</code></span>, <span style="color:#e74c3c;"><code>2</code></span>로 이루어져 있다.</li>
</ul>