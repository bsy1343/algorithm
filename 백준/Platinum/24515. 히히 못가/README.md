# [Platinum III] 히히 못가 - 24515

[문제 링크](https://www.acmicpc.net/problem/24515)

### 성능 요약

시간 제한: 1.5 초  (하단 참고), 메모리 제한: 1024 MB

### 통계

제출: 616, 정답: 176, 맞힌 사람: 127, 정답 비율: 27.021%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24515.%E2%80%85%ED%9E%88%ED%9E%88%E2%80%85%EB%AA%BB%EA%B0%80/1d34825d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24515.%E2%80%85%ED%9E%88%ED%9E%88%E2%80%85%EB%AA%BB%EA%B0%80/1d34825d.png" data-original-src="https://upload.acmicpc.net/a2316711-75e0-4902-a1b7-8f2b203f8704/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 400px; width: 400px;" /><br />
&nbsp;</p>

<p>$N \times N$ 격자 모양의 땅에서&nbsp;로미오는 가장 왼쪽 위 칸, 줄리엣은 가장 오른쪽 아래 칸에 살고 있다. 로미오는 매일 줄리엣을 만나러 가는데, 상하좌우로 인접한 칸으로 이동할 수 있고&nbsp;땅 밖으로는 나갈 수 없다.</p>

<p>주변을 어슬렁거리던 솔로 부대 상원이는 로미오와 줄리엣의 만남이 마음에&nbsp;들지 않는다. 수많은 솔로들의 후원으로 돈이 많은 상원이는 로미오와 줄리엣이 만날 수 없도록 주변 땅을 사버리기로 했다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24515.%E2%80%85%ED%9E%88%ED%9E%88%E2%80%85%EB%AA%BB%EA%B0%80/f276e5f4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24515.%E2%80%85%ED%9E%88%ED%9E%88%E2%80%85%EB%AA%BB%EA%B0%80/f276e5f4.png" data-original-src="https://upload.acmicpc.net/658a1f14-0125-4490-891a-2648dbfc5d5b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 190px; width: 400px;" /></p>

<p>땅은 몇 개의 영역으로 구분되어있고&nbsp;이 영역 단위로만 땅을 살 수 있다. 각 영역의 구분을 위해 격자 칸마다 알파벳 대문자를 적어 놓았는데,&nbsp;상하좌우로 인접한&nbsp;두 칸의 알파벳이 같다는 것은 같은 영역에 속한 땅이라는 뜻이다. 어떤&nbsp;두 칸의 알파벳이 같더라도 연결되어 있지 않다면, 다른 영역에 속할 수 있다.</p>

<p>로미오가 줄리엣을 만나는 것을 막기 위해 상원이가 최소&nbsp;몇 칸의 땅을 사야 하는지 구해보자.</p>

### 입력

<p>첫 번째 줄에 $N$이 주어진다. $(2&nbsp;\le N \le 1\,000)$</p>

<p>두 번째 줄부터 $N$개의 줄에 땅의 정보를 나타내는 알파벳 대문자 $N$개가 주어진다.&nbsp;단, 로미오와 줄리엣의 위치는 <span style="color:#e74c3c;"><code>.</code></span>으로 주어진다.</p>

### 출력

<p>상원이가 최소 몇 칸의 땅을 사야 하는지 출력한다.</p>