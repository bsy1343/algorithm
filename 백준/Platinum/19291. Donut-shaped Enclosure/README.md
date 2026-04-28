# [Platinum I] Donut-shaped Enclosure - 19291

[문제 링크](https://www.acmicpc.net/problem/19291)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 24, 맞힌 사람: 21, 정답 비율: 33.871%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>2차원 평면에서 보통 사용되는 거리 체계는 유클리드(Euclid) 거리다. 유클리드&nbsp;거리에서 두 점 $(x_1, y_1)$과 $(x_2, y_2)$사이의 거리는 $\sqrt{(x_1 - x_2)^2 + (y_1 - y_2)^2}$로 나타낸다.</p>

<p>이 문제에서는 유클리드 거리 대신 체비쇼프(Chebyshev) 거리를 다룬다. 체비쇼프 거리에서 $(x_1, y_1)$과 $(x_2, y_2)$사이의 거리는 $\max{(|x_1 - x_2|, |y_1 - y_2|)}$로 나타낸다.</p>

<p>어떤 거리 체계에 대하여 반지름이 $r$인 <strong>원</strong>은 특정한 점 $(x_c, y_c)$와의 거리가 $r$인 점 $(x,y)$의 집합이다. 원의 형태는 어떤 거리 체계를 쓰느냐 에 따라 다른데, (그림 1)에서 보이듯 유클리드 거리에서는 우리가 보통 아는 원형이고,&nbsp;체비쇼프 거리에서는 한 변의 길이가 $2r$인&nbsp;정사각형이 원이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19291.%E2%80%85Donut-shaped%E2%80%85Enclosure/d62b5c2b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19291.%E2%80%85Donut-shaped%E2%80%85Enclosure/d62b5c2b.png" data-original-src="https://upload.acmicpc.net/4d17ac73-65d2-4b10-9c45-97f74b9bae77/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 361px; height: 183px;" /></p>

<p style="text-align: center;">그림 1 : 유클리드 거리와 체비쇼프 거리에서의 원</p>

<p>또한, 어떤 거리 체계에 대하여 안쪽 반지름이 $l$이고, 바깥쪽 반지름이 $r$인 <strong>도넛</strong>은 특정한 점 $(x_c, y_c)$와의 거리가 $l$이상 $r$이하인 점 $(x,y)$들의 집합이다.</p>

<p>(그림 2)에서 왼쪽은 유클리드 거리에서의 도넛이고, 오른쪽은 체비쇼프 거리에서의 도넛이다. 회색 영역이 도넛에 포함된 영역이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19291.%E2%80%85Donut-shaped%E2%80%85Enclosure/b2748e61.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19291.%E2%80%85Donut-shaped%E2%80%85Enclosure/b2748e61.png" data-original-src="https://upload.acmicpc.net/cb7a2af0-7066-406c-8118-71e69b10ec5a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 383px; height: 196px;" /></p>

<p style="text-align: center;">그림 2 : 유클리드 거리와 체비쇼프 거리에서의 도넛</p>

<p>범수는 $N$개의 점 $P_1$, $P_2$, $\cdots$, $P_N$과 체비쇼프 거리에서의 안쪽 반지름이 $L$이고 바깥쪽 반지름이 $R$인 도넛을 가지고 놀고 있다. $P_i$는 $(x_i, y_i)$에 위치하며, 도넛중심의 위치는 중심의 좌표를 격자점에 두는 것만 지키면, 범수가 마음껏 바꿀 수 있다. 만약 $P_i$가&nbsp;도넛 영역에 들어가 있다면, 범수는 강제적으로 $S_i$점을 얻게 되고, 도넛 영역에 들어가 있지 않다면 아무 점수도 얻지 않는다. 이 때,&nbsp;범수가 얻을 수 있는 점수의 최댓값을 구하는 프로그램을 작성하라.</p>

### 입력

<p>입력의 첫 번째 줄에는 세 정수 $N$, $L$, $R$($1 &le; N &le; 10^5$, $1 &le; L &le; R &le; 10^9$)이 공백 하나로 구분되어 주어진다.</p>

<p>다음 $N$개의 줄의 $i$번째 줄에는 $x_i$, $y_i$, $S_i$($-10^9 &le; x_i, y_i &le; 10^9$, $-10^4 &le; S_i &le; 10^4$)가&nbsp;공백 하나로 구분되어 주어진다. 같은 위치에 여러 점이 있을 수 있다.</p>

### 출력

<p>첫 번째 줄에 범수가 얻을 수 있는 점수의 최댓값을 출력한다.</p>

### 힌트

<p>첫 번째 예제는 도넛의 중심을 $(1,0)$이나 $(-1,0)$에 두면 된다.</p>

<p>두 번째 예제는 도넛이 너무 커졌기 때문에, $-100$을 피해서 $1$하나를 포함 시키는 것이 최적이다.</p>