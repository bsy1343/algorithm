# [Platinum IV] 삼각 초콜릿 포장 (Bitter) - 31468

[문제 링크](https://www.acmicpc.net/problem/31468)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 122, 정답: 67, 맞힌 사람: 60, 정답 비율: 60.000%

### 분류

애드 혹, 해 구성하기, 구현, 재귀

### 문제 설명

<p>코코네 초콜릿 가게에서는 밸런타인데이 특별 상품으로 정육각형 3개를 삼각형 모양으로 붙인 초콜릿을 판매하려고 한다. 코코는 같은 크기의 정육각형 $\frac{N(N+1)}{2}$개를 삼각형 모양으로 붙인 형태의 틀에 이 초콜릿들을 빈틈없이 넣어 포장하려고 한다. 그리고 이를 조금 더 예뻐 보이게 하기 위해, 위로 뾰족한 방향으로 배치된 초콜릿은 빨간색, 반대 방향의 초콜릿은 파란색으로 개별 포장을 하기로 했다. 포장이 완료된 상품은 겉에서 볼 때 각각의 육각형이 빨간색인지 파란색인지만 알 수 있고, 어느 칸들이 같은 조각인지는 알 수 없다.</p>

<p style="display: flex; flex-direction: row; justify-content: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31468.%E2%80%85%EC%82%BC%EA%B0%81%E2%80%85%EC%B4%88%EC%BD%9C%EB%A6%BF%E2%80%85%ED%8F%AC%EC%9E%A5%E2%80%85(Bitter)/be562fde.png" data-original-src="https://upload.acmicpc.net/cc0a45c3-1065-48be-ba9f-d04d075afda9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height: 283px; max-width: 100%" /></p>

<p>수학 고수인 코코는 $N$을 $12$로 나눈 나머지가 $0$, $2$, $9$, $11$일 때에만 틀을 초콜릿으로 채울 수 있음을 증명했지만, 실제로 초콜릿을 어떻게 배치할지 고민하고 있다. 코코를 도와 초콜릿을 포장해 주자.</p>

### 입력

<p>첫 번째 줄에 삼각형 틀의 한 변의 길이 $N$이 주어진다. $(2\le N\le 5\, 001)$ $N$을 $12$로 나눈 나머지는 $0$, $2$, $9$, $11$ 중 하나이다.</p>

### 출력

<p>$N$줄에 걸쳐서 빨간색과 파란색 육각형의 배치를 공백 없이 출력한다. 빨간색은 <span style="color:#e74c3c;"><code>R</code></span>, 파란색은 <span style="color:#e74c3c;"><code>B</code></span>로 나타내며, $i$번째 줄에는 그 줄에 속하는 $i$개의 육각형에 해당하는 글자를 왼쪽부터 순서대로 출력한다. ($1\le i\le N$)</p>