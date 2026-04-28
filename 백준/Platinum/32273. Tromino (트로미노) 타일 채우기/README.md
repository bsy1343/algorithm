# [Platinum II] Tromino (트로미노) 타일 채우기 - 32273

[문제 링크](https://www.acmicpc.net/problem/32273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 9, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

수학, 그리디 알고리즘, 비트마스킹, 분할 정복, 홀짝성

### 문제 설명

<p>Bert는 Tromino (트로미노) 타일을 이용하여 격자 보드를 채우는 놀이를 좋아한다. Tromino란 $1 \times 1$ 크기의 정사각형 3개를 변끼리 이어 붙인 도형인데, 이 문제에서는 방향성을 따져 아래와 같이 4가지 종류 트로미노 타일이 있다고 한다 (편의상 A, B, C, D 로 구분한다). 그림에서처럼 각 트로미노의 3칸 중 나머지 두 칸과 인접한 칸을 &quot;중심&quot;으로 여기며 이 문제에서는 각 트로미노의 중심을 <code>O</code> 를 이용하여 표시한다 (이 표기는 문제 입력/출력/풀이와는 무관하며 지문에 포함된 그림에만 사용된다).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/fead6f0e.png" data-original-src="https://upload.acmicpc.net/30eab2c6-fde8-48f3-9e9a-5ceb11e47c7a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 117px; width: 420px;" /></p>

<p>크기가 $2^K \times 2^K$ 이며 $x$행 $y$열에 구멍이 한 칸 있는 임의의 격자 보드가 있을 때, 총 $(2^K \times 2^K -1)/3$ 개의 트로미노 타일을 이용하여 (1) 타일이 서로 겹치지 않고, (2) 어떤 타일도 격자 보드를 벗어나지 않도록 하며 (3) 구멍을 타일로 덮지 않으면서 격자 보드의 나머지 칸을 모두 덮는 방법이 존재한다는 것은 잘 알려진 사실이다. 이 문제에서 $0 \le x, y \lt 2^K$ 라 하자.</p>

<p>이를테면 아래 그림의 좌측은 $K = 2$ 이고 구멍이 $(x, y) = (2, 0)$ 인 격자 보드를 보여주고, 우측은 해당 격자를 트로미노 5개로 덮는 방법을 보여준다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/6bcafa47.png" data-original-src="https://upload.acmicpc.net/ba20ae0a-3fd2-401e-90aa-5d89f5e0bfa4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 380px;" /></p>

<p>다양한 격자 보드로 놀던 중 Bert는 아래와 같은 재귀 알고리즘을 이용하여 격자 보드를 채운 후, A/B/C/D 타일을 각각 몇 개씩 사용하는지 알아보기로 했다. 이 알고리즘의 입력은 격자의 크기와 구멍의 위치를 나타내는 $(K, x, y)$ 이며, 출력은 길이가 4인 정수 배열인데 이는 각 타일을 몇 개씩 사용했는지 알려준다. 이 때, $0 \le x, y \lt 2^{K}$ 이고 $1 \le K$ 라 가정하자.</p>

<p>단계 (1): $K = 1$ 인 경우: $(x, y)$를 덮지 않도록 4개의 타일 중 하나를 이용하여 세 칸을 덮는다.</p>

<p>단계 (2): $K \ge 2$ 인 경우: 현재의 격자 보드를 4등분 하여 $2^{K-1} \times 2^{K-1}$ 크기의 &quot;작은&quot; 격자 보드 4개가 있다고 생각해보자.</p>

<p>단계 (2-1): 이 때, 아래 그림처럼 4등분 된 작은 격자 보드 중 한 곳에 구멍 $(x, y)$가 있으므로 해당하는 작은 격자 보드는 재귀적으로 처리한다 (아래 그림에서 4등분 된 &quot;작은&quot; 격자 보드 중 구멍을 포함한 보드는 회색 배경과 &quot;H&quot; 로 표시되어있다).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/5bc00af5.png" data-original-src="https://upload.acmicpc.net/e419160a-b64f-4c8f-bd6d-063346fdb2ac/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 135px; width: 600px;" /></p>

<p>단계 (2-2): 원래의 &quot;큰&quot; 격자 보드의 정 중앙에 위치한 4개의 칸 $(2^{K-1}-1, 2^{K-1}-1)$, $(2^{K-1}-1, 2^{K-1})$, $(2^{K-1}, 2^{K-1}-1)$, $(2^{K-1}, 2^{K-1})$ 중 단계 (2-1) 에서 재귀적으로 처리한 한 칸을 제외하면 세 칸이 남는다. 이 세 칸을 덮도록 A/B/C/D 타일 중 하나를 골라 사용하면, 남은 3개의 작은 격자 보드들도 재귀적으로 처리할 수 있다. 예를 들어, 아래 좌측 그림의 경우 D 타일을 이용하여 중앙의 세 칸을 덮었으므로, 이렇게 덮인 세 칸이 마치 새로운 &quot;구멍&quot;인 것으로 여기면서 재귀적으로 작은 격자 보드를 처리할 수 있다.</p>

<ul>
<li>우측 상단의 작은 보드는 $(2^{K-1}-1, 2^{K-1}$) 칸에 구멍이 있는 것으로 여기고 재귀적으로 타일을 덮을 수 있고</li>
<li>좌측 하단의 작은 보드는 $(2^{K-1}, 2^{K-1}-1$) 칸에 구멍이 있는 것으로 여기고 재귀적으로 타일을 덮을 수 있고</li>
<li>우측 하단의 작은 보드는 $(2^{K-1}, 2^{K-1}$) 칸에 구멍이 있는 것으로 여기고 재귀적으로 타일을 덮을 수 있다.</li>
</ul>

<p>아래 그림에서 두 번째부터 네 번째까지는 이와 비슷하게 C, B, A 타일이 사용된 경우를 순서대로 보여준다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/4be434d8.png" data-original-src="https://upload.acmicpc.net/273e43d2-ea31-4e4f-b9a2-c0eefc7b2f93/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 135px; width: 600px;" /></p>

<p>단계 (3): 재귀 알고리즘이 수행을 마치면 길이가 4인 정수 배열을 출력하는데, 이는 격자 보드를 채우기 위해 사용된 A/B/C/D 타일의 개수를 나타낸다. 편의상 이 출력된 배열을 $F(K, x, y)$로 나타내자.</p>

<p>아래 그림은 입력이 $(1, 0, 0)$ 일 때 알고리즘이 격자 보드를 채운 모습을 보여주며, $F(1, 0, 0) = [0, 0, 0, 1]$ 임을 알 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/52d950d1.png" data-original-src="https://upload.acmicpc.net/ed253b52-62b2-435d-a328-2c69dfbacae5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 76px; width: 80px;" /></p>

<p>아래 그림은 입력이 $(2, 2, 0)$ 일 때 알고리즘이 격자 보드를 채운 모습을 보여주며, $F(2, 2, 0) = [1, 2, 0, 2]$ 임을 알 수 있다.</p>

<ul>
<li>좌측 그림: 알고리즘의 (2-2) 단계에 해당하며, B 타일을 &quot;큰&quot; 격자 보드의 중앙에 배치한 모습이다. 이 타일로 덮인 3개의 칸은 구멍이 아니지만 알고리즘을 재귀적으로 활용하기 위해 마치 구멍이 있다고 생각하고 (2-2) 단계를 진행한다.</li>
<li>중앙 그림: 알고리즘의 (2-1), (2-2) 단계에서 재귀적으로 처리되는 4개의 &quot;작은&quot; 격자 보드에 타일이 채워진 모습이다. 원래 구멍이 있는 좌측 하단의 작은 보드에는 대문자 &quot;X&quot;가 구멍의 위치를 나타내고, 나머지 3개의 작은 보드에는 알고리즘 수행을 위해 가짜로 만든 구멍의 위치가 소문자 &quot;x&quot;로 표시되어있다 (이는 좌측 그림에서 B 타일로 덮힌 칸들이다).</li>
<li>우측 그림: 알고리즘이 수행을 마친 후 원래의 격자 보드가 어떤 타일로 덮였는지 나타낸다 (처음 살펴본 예제와 동일하다). 이 알고리즘의 출력은 $[1, 2, 0, 2]$ 이다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/21547ad7.png" data-original-src="https://upload.acmicpc.net/5e7064fc-9633-4818-a558-a30bc73ec965/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 211px; width: 600px;" /></p>

<p>아래 그림은 입력이 $(3, 7, 6)$ 일 때 알고리즘이 격자 보드를 채운 모습을 보여주며, $F(3, 7, 6) = [8, 6, 5, 2]$ 임을 알 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32273.%E2%80%85Tromino%E2%80%85(%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8)%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0/3a72cf19.png" data-original-src="https://upload.acmicpc.net/8c591f37-8cb9-4e4d-be3f-291c98fe2c09/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 288px; width: 300px;" /></p>

<p>Bert는 $(K, x, y)$가 주어졌을 때 $F(K, x, y)$ 를 구하는 것이 너무나 쉽기 때문에 더 어려운 문제를 만들어 달라고 Alice에게 부탁했다. Alice는 아래와 같은 새로운 문제를 내주었다:</p>

<ul>
<li>입력으로 정수 $K$와 정수 배열 $V = [v_A, v_B, v_C, v_D]$이 주어졌을 때 $F(K, x, y) = V$가 되는 $x, y$를 찾아보자.</li>
<li>만약 이를 만족하는 $(x, y)$ 쌍이 여럿 존재한다면 그 중 아무거나 찾아도 무방하다.</li>
<li>만약 이를 만족하는 $(x, y)$ 쌍이 존재하지 않는다면 $x = -1, y = -1$ 을 출력하면 된다.</li>
</ul>

<p>입력으로 배열 $V$ 가 주어졌을 때 위 문제를 풀어보자.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스는 $K, v_A, v_B, v_C, v_D$ 값이 공백으로 구분되어 한 줄에 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답인 $x$와 $y$를 공백으로 구분하여 각 줄에 출력한다.</p>

### 제한

<ul>
<li>$1 \le T \le 300\,000$</li>
<li>$1 \le K \le 30$</li>
<li>$0 \le v_A, v_B, v_C, v_D \le 10^{18}$</li>
</ul>