# [Platinum I] 편세권 (Hard) - 31850

[문제 링크](https://www.acmicpc.net/problem/31850)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 131, 정답: 41, 맞힌 사람: 33, 정답 비율: 30.556%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>왕복 4시간 통학에 지친 현성이는 자취방을 구하려고 한다.</p>

<p>현성이가 방을 고르는 기준은 월세와 편의점까지의 거리뿐이다. 가장 마음에 드는 방을 구하기 위해 현성이는 지도 위의 모든 방에 편세권 점수를 매겨 그 중 편세권 점수가 가장 낮은 집을 고르려고 한다. 편세권 점수의 계산 방식은 다음과 같다.</p>

<p style="text-align: center;">편세권 점수 = (방에서 가장 가까운 편의점까지의 거리 &times; 월세)</p>

<p>현성이가 보고 있는 지도는 $N \times M$ 크기의 격자로 이루어져 있다. 지도의 $x$행 $y$열에 있는 칸의 위치를 $(x,y)$로 나타내자. 방의 위치가 $(a, b)$, 편의점의 위치가 $(c, d)$일 때 방에서 편의점까지의 거리는 $|a-c|+|b-d|$ 로 계산한다.</p>

<p>현성이는 가장 낮은 편세권 점수를 가진 방을 골랐다. 이 방의 편세권 점수는 몇 점일까?</p>

### 입력

<p>첫 번째 줄에 지도의 크기를 나타내는 정수 $N$과 $M$, 방의 개수 $R$, 편의점의 개수 $C$가 공백으로 구분되어 주어진다. </p>

<p>두 번째 줄부터 $R$개의 줄에 걸쳐 방의 정보를 나타내는 세 정수 $a_i$, $b_i$, $p_i$가 공백으로 구분되어 주어진다. 이는 $i$번째 방이 $(a_i, b_i)$에 있으며, 월세가 $p_i$임을 나타낸다.</p>

<p>$R+2$번째 줄부터 $C$개의 줄에 걸쳐 편의점의 정보를 나타내는 두 개의 정수 $c_j$, $d_j$가 공백으로 구분되어 주어진다. 이는 $j$번째 편의점이 $(c_j, d_j)$에 있음을 나타낸다.</p>

<p>모든 방과 편의점의 위치는 서로 다르다. 즉, 한 위치에는 최대 한 개의 방이나 한 개의 편의점만이 있을 수 있다.</p>

### 출력

<p>첫째 줄에 현성이가 고른 방의 편세권 점수를 출력한다.</p>

### 제한

<ul>
	<li>$2 \le N \le 5\times10^5$</li>
	<li>$2 \le M \le 5\times10^5$</li>
	<li>$2 \le R+C \le \min(NM, 5\times10^5)$</li>
	<li>$1 \le a_i, c_j \le N$</li>
	<li>$1 \le b_i, d_j \le M$</li>
	<li>$1 \le p_i \le 10^5$</li>
	<li>방과 편의점은 각각 $1$개 이상 존재한다.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31850.%E2%80%85%ED%8E%B8%EC%84%B8%EA%B6%8C%E2%80%85(Hard)/4aaa2e76.png" data-original-src="https://upload.acmicpc.net/38a233b9-1045-4c42-85a5-6681844584ae/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>예제 1번의 경우 월세가 $3$이고, 편의점까지의 거리가 $2$인 자취방의 편세권 점수가 $6$으로 가장 낮다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31850.%E2%80%85%ED%8E%B8%EC%84%B8%EA%B6%8C%E2%80%85(Hard)/2f4ebe4b.png" data-original-src="https://upload.acmicpc.net/1e14317a-6e9c-4412-a6df-795e02f31178/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>예제 2번의 경우 월세가 $2$이고, 편의점까지의 거리가 $2$인 자취방의 편세권 점수가 $4$로 가장 낮다.</p>