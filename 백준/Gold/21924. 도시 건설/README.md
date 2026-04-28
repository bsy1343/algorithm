# [Gold IV] 도시 건설 - 21924

[문제 링크](https://www.acmicpc.net/problem/21924)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 6103, 정답: 2748, 맞힌 사람: 2135, 정답 비율: 42.589%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>채완이는 신도시에 건물 사이를 잇는 양방향 도로를 만들려는 공사&nbsp;계획을 세웠다.</p>

<p>공사 계획을 검토하면서 비용이 생각보다 많이 드는 것을 확인했다.</p>

<p>채완이는 공사하는 데 드는 비용을 아끼려고 한다.&nbsp;</p>

<p>모든 건물이 도로를 통해 연결되도록 최소한의 도로를 만들려고 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21924.%E2%80%85%EB%8F%84%EC%8B%9C%E2%80%85%EA%B1%B4%EC%84%A4/17fc07d2.png" data-original-src="https://upload.acmicpc.net/007ab470-3481-47d6-85ec-f5378b3051b3/-/crop/1122x785/404,145/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 455px; width: 650px;" /></p>

<p>위 그림에서 건물과 직선으로 표시된 도로, 해당 도로를 만들 때 드는 비용을 표시해놓은 지도이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21924.%E2%80%85%EB%8F%84%EC%8B%9C%E2%80%85%EA%B1%B4%EC%84%A4/36f78678.png" data-original-src="https://upload.acmicpc.net/c16fc3ee-aaa3-4950-bfa3-57661b00389e/-/crop/1068x727/430,178/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 442px; width: 650px;" /></p>

<p>그림에 있는 도로를 다 설치할 때 드는 비용은 62이다. 모든 건물을 연결하는 도로만&nbsp;만드는 비용은 27로 절약하는 비용은 35이다.</p>

<p>채완이는&nbsp;도로가 너무 많아 절약되는 금액을 계산하는 데 어려움을 겪고 있다.</p>

<p>채완이를 대신해&nbsp;얼마나 절약이 되는지 계산해주자.</p>

### 입력

<p>첫 번째 줄에 건물의 개수 $N$ $(3 \le N \le 10^5 )$와 도로의 개수 $M$ $(2 \le M \le min( {N(N-1)&nbsp;\over 2}, 5&times;10^5)) $가 주어진다.</p>

<p>두 번째 줄 부터 $M + 1$줄까지 건물의 번호 $a$, $b$ $(1 \le a, b \le N, a &ne; b)$와 두 건물 사이 도로를 만들 때 드는 비용 $c (1 \le c \le 10^6)$가 주어진다. 같은 쌍의 건물을 연결하는 두 도로는 주어지지 않는다.</p>

### 출력

<p>예산을 얼마나 절약 할 수 있는지 출력한다. 만약 모든 건물이 연결되어 있지 않는다면 -1을 출력한다.</p>