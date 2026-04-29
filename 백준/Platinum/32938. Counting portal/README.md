# [Platinum IV] Counting portal - 32938

[문제 링크](https://www.acmicpc.net/problem/32938)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 104, 정답: 25, 맞힌 사람: 25, 정답 비율: 27.174%

### 분류

누적 합, 이분 탐색

### 문제 설명

<p>마인크래프트는 다양한 종류의 블록을 이용해 구조물을 만들 수 있는 게임이다. 게임 내에서 블록은 다음 3가지 종류로 구분할 수 있다.</p>

<ul>
	<li>빈 공간(<span style="color:#e74c3c;"><code>0</code></span>): 비어 있는 공간으로, 어떤 블록도 없는 상태이다.</li>
	<li>옵시디언 블록(<span style="color:#e74c3c;"><code>1</code></span>): 특수한 블록으로, 문제에서 중요한 역할을 하는 블록이다.</li>
	<li>그 외의 블록(<span style="color:#e74c3c;"><code>2</code></span>): 나무 블록, 흙 블록 등이 해당된다.</li>
</ul>

<p>마인크래프트에는 지옥문이라는 특별한 구조물이 있다. 지옥문은 특정한 조건을 만족하는 직사각형 모양의 구멍의 형태를 갖춘 구조물로, 지옥으로 이동하는 통로로 사용된다.</p>

<p>높이 $N$, 너비 $M$인 직사각형 모양의 현재 상태 $S$가 주어진다. 위치 ($r, c$)에 해당되는 $S_{r, c}$는 현재 상태 $S$의 $r$번째 행, $c$번째 열에 해당되는 블록을 나타내며, 위에서 언급한 3가지 종류의 블록(<span style="color:#e74c3c;"><code>0</code></span>, <span style="color:#e74c3c;"><code>1</code></span>, 또는 <span style="color:#e74c3c;"><code>2</code></span>) 중 하나이다.</p>

<p>두 위치 ($r_1, c_1$), ($r_2, c_2$)를 각각 직사각형의 왼쪽 위 꼭짓점과 오른쪽 아래 꼭짓점으로 하여 지옥문을 만들고자 한다. 플레이어는 블록을 제거할 수 없고, 옵시디언 블록만을 자유롭게 설치할 수 있는 상황이다. 이 경우, 지옥문을 만들 수 있는 조건은 다음과 같다.</p>

<ul>
	<li>$r_2 - r_1 \ge 4, c_2 - c_1 \ge 3$</li>
	<li>$c_1 \lt c \lt c_2$를 만족하는 모든 $c$에 대해, $S_{r_{1},c} \neq 2$이고 $S_{r_{2},c} \neq 2$이다.</li>
	<li>$r_1 \lt r \lt r_2$를 만족하는 모든 $r$에 대해, $S_{r,c_{1}} \neq 2$이고 $S_{r,c_{2}} \neq 2$이다.</li>
	<li>$r_1 \lt r \lt r_2, \ c_1 \lt c \lt c_2$를 만족하는 모든 순서쌍 ($r, c$)에 대해, $S_{r,c}=0$이다.</li>
</ul>

<p>실제 마인크래프트와는 달리, 여기서 지옥문의 최대 크기에는 제한이 없다.</p>

<p>이 때, 지옥문을 만들 수 있는 순서쌍 ($r_1, c_1, r_2, c_2$)의 개수를 구하여라.</p>

### 입력

<p>첫 번째 줄에 현재 상태 $S$의 크기 $N$과 $M$이 주어진다. ($5 \le N \le 300$, $4 \le M \le 300$)</p>

<p>두 번째 줄부터 $N$개의 줄에 걸쳐 $M$개의 수가 공백으로 구분되어 주어진다. $i+1$번째 줄의 $j$번째 수는 $S_{i,j}$를 나타낸다. <span style="color:#e74c3c;"><code>0</code></span>은 비어있는 상태, <span style="color:#e74c3c;"><code>1</code></span>은 옵시디언 블록으로 채워진 상태, <span style="color:#e74c3c;"><code>2</code></span>는 그 외의 블록으로 채워진 상태이다.</p>

### 출력

<p>조건에 따라 지옥문을 만들 수 있는 순서쌍 ($r_1, c_1, r_2, c_2$)의 개수를 출력한다.</p>

### 힌트

<p>예제 1에서, 조건에 따라 지옥문을 만들 수 있는 순서쌍의 개수는 3개이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32938.%E2%80%85Counting%E2%80%85portal/3c63ce1b.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32938-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 191px;"></p>