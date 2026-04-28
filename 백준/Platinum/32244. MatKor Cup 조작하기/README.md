# [Platinum II] MatKor Cup 조작하기 - 32244

[문제 링크](https://www.acmicpc.net/problem/32244)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 24, 맞힌 사람: 20, 정답 비율: 80.000%

### 분류

애드 혹, 해 구성하기, 누적 합

### 문제 설명

<p><code>MatKor Cup</code>의 대회장은 총 $N^2$개의 자리가 $N\times N$ 정사각형 모양으로 배치되어 있으며, 각 자리에서 <code>Wi-Fi</code>를 이용하여 대회를 진행한다. <code>Wi-Fi</code>의 연결 상태는 인터넷 속도에 따라 $1$칸부터 $4$칸까지 총 $4$가지 상태가 있다. 또한 <code>MatKor Cup</code>의 대회장은 짝수 개의 자리가 있다. 즉, $N$은 짝수이다.</p>

<p>대회 운영진인 현우는 미리 <code>MatKor Cup</code>의 자리 배치표를 받았고, 본인이 원하는 대로 등수를 만들고자 각 자리의 인터넷 속도를 바꾸려고 한다. 현우는 각 자리에 연결된 스위치를 눌러 인터넷 속도를 조작한다.</p>

<p>현우가 어떤 자리의 스위치를 한 번 누르게 되면, <code>Wi-Fi</code>의 연결 상태가 한 칸 늘어난다. 단, $4$칸인 상태의 <code>Wi-Fi</code>는 $1$칸이 된다.</p>

<p>또한, 스위치의 전선은 직렬로 연결되어 있어 스위치를 누르면 그 자리뿐만 아니라, 스위치를 누른 자리와 같은 가로줄 및 세로줄에 있는 자리의 <code>Wi-Fi</code>의 연결 상태를 모두 바꾼다. 구체적으로 $\left( a,b \right)$ 위치의 스위치를 누르면 모든 $\left( a,x \right)$, $\left( x,b \right)$ $(1\le x\le N)$ 위치에 있는 $2N-1$개의 <code>Wi-Fi</code>의 연결 상태가 동시에 바뀐다. 이때, $\left( a,b \right)$ 위치의 <code>Wi-Fi</code>도 다른 자리와 마찬가지로 한 번만 전환된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32244.%E2%80%85MatKor%E2%80%85Cup%E2%80%85%EC%A1%B0%EC%9E%91%ED%95%98%EA%B8%B0/e5be61ef.png" data-original-src="https://upload.acmicpc.net/0614b506-c3a8-47aa-8655-7bc397100405/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 640px; max-width: 100%;" /></p>

<p>현우는 최대한 적게 일하고 싶기 때문에, 스위치를 최소한으로 눌러서 세팅을 완료하고자 한다. 현재 각 자리의 <code>Wi-Fi</code>의 연결 상태와 현우가 원하는 최종 <code>Wi-Fi</code>의 연결 상태가 주어졌을 때, 스위치를 최소한으로 눌러 세팅을 완료할 수 있도록 도와주자.</p>

### 입력

<p>첫 번째 줄에 숫자 $N(2\leq N\leq 1\, 000$; $N$은 짝수$)$이 주어진다.</p>

<p>두 번째 줄부터 $N$줄에 걸쳐 초기 <code>Wi-Fi</code> 연결 상태가 주어진다. 각 줄에서는 $N$개의 자리의 초기 <code>Wi-Fi</code> 연결 상태가 공백 없이 주어진다.</p>

<p>$N+2$번째 줄부터 $N$줄에 걸쳐 현우가 세팅해야 하는 최종 <code>Wi-Fi</code> 연결 상태가 위와 같은 형식으로 주어진다.</p>

<p>각 자리의 <code>Wi-Fi</code> 연결 상태는 칸 수를 의미하는 $1$ 이상 $4$ 이하의 정수로 주어진다.</p>

### 출력

<p>첫 번째 줄에 필요한 스위치의 최소 조작 횟수를 출력한다.</p>

<p>만약 초기 <code>Wi-Fi</code>의 연결 상태에서 최종 <code>Wi-Fi</code>의 연결 상태를 만드는 것이 불가능하다면 첫 번째 줄에 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>