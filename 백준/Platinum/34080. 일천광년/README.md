# [Platinum IV] 일천광년 - 34080

[문제 링크](https://www.acmicpc.net/problem/34080)

### 성능 요약

시간 제한: 3.9 초, 메모리 제한: 1000 MB

### 통계

제출: 181, 정답: 112, 맞힌 사람: 86, 정답 비율: 63.704%

### 분류

불변량 찾기, 수학, 애드 혹

### 문제 설명

<blockquote>
<p><em><strong>일천광년 앞으로</strong></em></p>

<p><em><strong>끊기지 않을 실로 이어줄래</strong></em></p>

<p><em><strong>그 소매에 사랑을 숨겨보고파</strong></em></p>

<p>    —  一千光年 - iyowa</p>
</blockquote>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34080.%E2%80%85%EC%9D%BC%EC%B2%9C%EA%B4%91%EB%85%84/690e6abc.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34080-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:100%;min-width:500px"></p>


<p><span style="color:#1abc9c;">미쿠</span>는 모래의 행성에, <span style="color:#9b59b6;">플라워</span>는 모래의 행성으로부터 $N\ \text{km}$ 떨어진 푸른 행성에 살고 있다. <span style="color:#1abc9c;">미쿠</span>와 <span style="color:#9b59b6;">플라워</span>는 어느 날, 넘치는 <strong>사랑</strong>을 서로에게 전하기로 했다!</p>

<p>모래의 행성에서 푸른 행성 방향으로 $i\ \text{km}$ 떨어진 위치에 있는 <strong>사랑</strong>의 양은 $L_i$로 표현되며, 초기에는 $L_0=x$, $L_N=y$, $L_j = 0$ ($1 \leq j &lt; N$)이다.</p>

<p><span style="color:#1abc9c;">미쿠</span>와 <span style="color:#9b59b6;">플라워</span>는 $1$의 시간이 지날 때마다 다음과 같이 서로를 향해 <strong>사랑</strong>을 옮긴다. </p>

<ul>
	<li>$L_i \neq 0$을 만족하는 $i$ 중에서 $i$의 최솟값과 최댓값을 각각 $l$과 $r$, 이때의 $\min(L_l,L_r)$을 $M$이라고 하자.</li>
	<li>$r-l&gt;1$인 경우, $L_l$과 $L_r$의 값을 $M$만큼 감소시키고, $L_{l+1}$과 $L_{r-1}$의 값을 $M$만큼 증가시킨다.</li>
	<li>$r-l \leq 1$인 경우, 옮겼을 때 서로의 뜨거운 <strong>사랑</strong>이 너무 가까워져 <span style="color:#1abc9c;">미쿠미쿠해지므로<strong>♪</strong></span> <strong>사랑</strong> 옮기기를 중단한다.</li>
</ul>

<p><span style="color:#1abc9c;">미쿠</span>와<span style="color:#9b59b6;"> 플라워</span>는 여러 상황에서 <strong>사랑</strong>이 어디에 도달할지 궁금해졌다.  $39^{39^{39}}$의 시간이 지났을 때, $Q$개의 상황에 대해 <strong>사랑</strong>이 존재하는 위치와 <strong>사랑</strong>의 양을 구해 주자!</p>

### 입력

<p>첫 번째 줄에 상황의 수 $Q$가 주어진다.</p>

<p>두 번째 줄부터 $Q+1$번째 줄까지 각 줄에 양의 정수 $N$, $x$, $y$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>주어진 $Q$개의 각 상황에 대해, 첫 번째 줄에 <strong>사랑</strong>이 존재하는 위치의 수를 출력한다.</p>

<p>두 번째 줄부터는 모든 <strong>사랑</strong>이 존재하는 위치에 대해, 각 줄에 모래의 행성에 가까운 순으로 모래의 행성으로부터 <strong>사랑</strong>이 존재하는 위치까지의 거리와 <strong>사랑</strong>의 양을 공백으로 구분하여 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq Q \leq 393939$</li>
	<li>$1 \leq N \leq 9460730472580800$</li>
	<li>$1 \leq x, y \leq 10^9$</li>
	<li>$1 \leq N \times x \times y \leq 10^{18}$</li>
</ul>

### 힌트

<p>이 문제는 노래 일천광년 (一千光年)을 모티브로 하였다.</p>

<p></p>