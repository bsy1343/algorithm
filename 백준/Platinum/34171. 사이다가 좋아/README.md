# [Platinum II] 사이다가 좋아 - 34171

[문제 링크](https://www.acmicpc.net/problem/34171)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 15, 정답: 14, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

다이나믹 프로그래밍, 수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>동우는 제로가 싫다. 그래서 동우는 일반 사이다만 마신다.</p>

<p>유틸은 제로가 좋다. 그래서 유틸은 제로 사이다만 마신다.</p>

<p>민재는 스프라이트가 좋다. 그래서 민재는 스프라이트만 마신다.</p>

<p>편의상 일반 사이다, 제로 사이다, 스프라이트를 모두 사이다라고 하자.</p>

<p>그래서 동우와 유틸과 민재는 조개구이를 먹을 때면 <strong>사이다탑</strong>을 쌓기 시작한다. <strong>사이다탑</strong>은 삼각형의 모양이며, 높이 $H$의 <strong>사이다탑</strong>은 $1$층에 사이다 $H$개, $2$층에 사이다 $H-1$개, $\cdots$, $H$층에 사이다 $1$개까지 쌓여 있다. 그리고 각 사이다 캔을 원형으로 생각하고, 일반 사이다는 초록색, 제로 사이다는 검은색, 스프라이트는 노란색을 칠해 도식화할 수 있다. 예를 들어 왼쪽 <strong>사이다탑</strong>을 도식화하여 오른쪽 그림으로 나타낼 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34171.%E2%80%85%EC%82%AC%EC%9D%B4%EB%8B%A4%EA%B0%80%E2%80%85%EC%A2%8B%EC%95%84/283b3d4b.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34171-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:300px;max-width:100%;margin:0 calc(2% + 10px) 0 0;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34171.%E2%80%85%EC%82%AC%EC%9D%B4%EB%8B%A4%EA%B0%80%E2%80%85%EC%A2%8B%EC%95%84/130f5057.png" data-original-src="https://boja.mercury.kr/assets/problem/34171-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:300px;max-width:100%;margin:0 0 0 0;"></p>

<p style="text-align: center;">이 문제를 위해 출제/검수진들이 마신 <strong>사이다탑</strong>이다. 밑변의 수직이등분선을 기준으로 대칭을 이룬다.</p>

<p>동우와 유틸과 민재는 총 $S=\frac{H\left( H+1 \right)}{2}$개의 사이다를 마셔 <strong>사이다탑</strong>을 만들고자 한다. 이때 이 <strong>사이다탑</strong>을 도식화한 그림에 대해, 세 변 중 최소 한 변의 수직이등분선에 대해 대칭이 되어야 한다. 이제 각자 몇 개의 사이다를 마실 지 정해야 한다. 동우는 $N$개의 일반 사이다를, 유틸은 $M$개의 제로 사이다를, 민재는 $K=S-N-M$개의 스프라이트를 마시고, 이 사이다 캔을 모두 사용해, 조건을 만족하는 높이 $H$의 <strong>사이다탑</strong>을 구성할 수 있는 경우의 수를 여러 상황에서 구하고 싶다. $S$가 정해져 있을 때, 주어진 $N,M,K$에 대해 조건에 맞는 <strong>사이다탑</strong>을 쌓을 수 있는 경우의 수를 구해보자.</p>

### 입력

<p>첫 번째 줄에 양의 정수 $H(1\le H\le 50)$가 주어진다.</p>

<p>두 번째 줄에 쿼리의 개수 $Q(1\le Q\le\frac{1}{48}\left( H^4+2H^3+13H^2+12H+60 \right))$가 주어진다.</p>

<p>세 번째 줄부터 $Q$개의 줄에 걸쳐 $N,M,K(0\le K\le M\le N$; $N+M+K=\frac{H\left( H+1 \right)}{2} )$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>$Q$개의 줄에 걸쳐 각 쿼리 별 정답을 $998\, 244\, 353$으로 나눈 나머지를 출력한다. 같은 쿼리는 여러 번 주어지지 않는다.</p>