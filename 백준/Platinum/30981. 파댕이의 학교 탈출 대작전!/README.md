# [Platinum IV] 파댕이의 학교 탈출 대작전! - 30981

[문제 링크](https://www.acmicpc.net/problem/30981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 152, 정답: 21, 맞힌 사람: 12, 정답 비율: 18.182%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>고등학생이 되어 떡볶이와 튀김이 먹고 싶어진 파댕이는 점심시간에 학교에서 탈출해 분식점에 간다는 사악한 계획을 세웠다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30981.%E2%80%85%ED%8C%8C%EB%8C%95%EC%9D%B4%EC%9D%98%E2%80%85%ED%95%99%EA%B5%90%E2%80%85%ED%83%88%EC%B6%9C%E2%80%85%EB%8C%80%EC%9E%91%EC%A0%84!/24cad9ca.png" data-original-src="https://upload.acmicpc.net/d8f38c22-7d52-4db4-84a1-747e5c97706c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 221px; width: 256px;" /></p>

<p>학교를 나가려고 주변을 살펴본 파댕이는 선생님들이 주변을 감시하고 있어 학교를 쉽게 출입할 수 없다는 사실을 깨달았다. 파댕이가 선생님의 감시에 걸리지 않고 점심시간 내에 떡볶이를 먹고 교실로 돌아올 수 있는지 확인해 주자!</p>

<p>탈출해야 하는 학교는 $N \times M$ 의 격자 구조이며, 파댕이는 다음과 같은 사실들을 알아내었다.</p>

<ul>
	<li>파댕이가 탈출을 결심한 시점은 $t = 1$이며, 파댕이가 교실로 돌아왔을 때에도 $t \le T$를 만족해야 한다.</li>
	<li>파댕이는 현재 교실에 있으며, 교실은 $(1 , 1)$ 칸에, 분식점은 $(N, M)$ 칸에 존재한다.</li>
	<li>각 격자 칸에서 <code><span style="color:#e74c3c;">#</span></code>은 장애물을, <code><span style="color:#e74c3c;">.</span></code>은 빈 공간을 의미한다. 선생님과 파댕이는 장애물 위를 지나갈 수 없으며, 지도 밖으로도 나갈 수 없다.</li>
	<li>파댕이는 $t \equiv 5 \pmod{10}$일 때마다 가만히 있거나 인접한 칸으로 이동할 수 있으며, 파댕이가 분식점에서 식사를 끝낸 시점 $t_{eat}$에 대해 $t_{eat} \equiv 5 \pmod{10}$라면 식사를 끝내자마자 바로 이동할 수 있다.</li>
	<li>선생님은 항상 주어진 경로를 따라 순서대로 이동하며, $t \equiv 0 \pmod{10}$일 때 이동한다.</li>
	<li>선생님은 인접한 8개의 칸만을 감시하고 있으며. 한 칸 위에 선생님이 여러 명 있을 수도 있다. 또한 파댕이는 모든 시점에 선생님의 감시에 걸려서는 안 된다. 단, 인접한 칸으로 이동하는 도중에는 선생님의 감시에 걸리지 않는다.</li>
	<li>파댕이가 교실이나 분식점에 있는 경우에는 선생님의 감시에 걸리지 않는다.</li>
</ul>

<ol>
</ol>

<p>두 칸 $(a , b)$와 $(x , y)$가 서로 인접한다는 것은 $\max (\left\vert a - x \right\vert, \left\vert b - y \right\vert) = 1$임을 의미한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30981.%E2%80%85%ED%8C%8C%EB%8C%95%EC%9D%B4%EC%9D%98%E2%80%85%ED%95%99%EA%B5%90%E2%80%85%ED%83%88%EC%B6%9C%E2%80%85%EB%8C%80%EC%9E%91%EC%A0%84!/74707d94.png" data-original-src="https://upload.acmicpc.net/2a679974-e14a-4616-9ae2-c655600dff81/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 221px; width: 256px;" /></p>

### 입력

<p>첫째 줄에 지도의 세로 길이 $N$ 과 가로 길이 $M$, 선생님의 수 $L$, 남은 점심시간 $T$, 떡볶이와 튀김을 먹는 데 걸리는 시간 $K$가 정수로 주어진다. $(2 \le N, M \le 1,000; 1 \le L \le 2,000; 1 \le T \le 3,600; 1 \le K \le T)$ 둘째 줄부터 $N$개의 줄에 걸쳐 지도가 주어진다. 주어진 지도의 왼쪽 위 꼭짓점의 좌표는 $(1, 1)$, 오른쪽 아래 꼭짓점의 좌표는 $(N, M)$ 이며, $(1, 1)$ 칸과 $(N, M)$ 칸에는 장애물이 없음이 보장된다. 다음 줄부터 $L$개의 데이터가 다음과 같은 형식으로 주어진다.</p>

<ul>
	<li>첫째 줄에 선생님의 이동 경로 길이 $p$가 주어진다. $(1 \le p \le 100)$</li>
	<li>둘째 줄부터 $p$개의 줄에 걸쳐 선생님의 이동 경로 $x_i, y_i$가 주어진다. $(1 \le x_i \le N; 1 \le y_i \le M)$</li>
</ul>

<p>선생님은 항상 이동 경로를 순서대로 따라가며, 이동은 반드시 정지 혹은 인접한 칸으로의 이동이다. 즉, 선생님은 $(x_1, y_1), (x_2, y_2), \cdots, (x_p, y_p), (x_1, y_1), \cdots$의 경로로 이동하게 된다. $t = 1$일 때 선생님의 위치는 $(x_1, y_1)$이다.</p>

### 출력

<p>파댕이가 떡볶이와 튀김을 사 먹고 교실로 돌아올 수 있다면 <code><span style="color:#e74c3c;">YUMMY</span></code>, 없다면 <code><span style="color:#e74c3c;">SAD</span></code>를 출력한다.</p>

### 힌트

<p>$t = n$일 때 선생님의 위치는 $(x_{( \lfloor{\frac{n}{10}}\rfloor \bmod {p} \, + \, 1 )}, y_{( \lfloor{\frac{n}{10}}\rfloor \bmod {p} \, + \, 1 )})$이다.</p>