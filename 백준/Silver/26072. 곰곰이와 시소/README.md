# [Silver II] 곰곰이와 시소 - 26072

[문제 링크](https://www.acmicpc.net/problem/26072)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1003, 정답: 452, 맞힌 사람: 347, 정답 비율: 43.813%

### 분류

수학, 이분 탐색, 물리학

### 문제 설명

<p style="text-align: center;"><img alt="치킨들이 올려져 있는 시소" src="%EB%B0%B1%EC%A4%80/Silver/26072.%E2%80%85%EA%B3%B0%EA%B3%B0%EC%9D%B4%EC%99%80%E2%80%85%EC%8B%9C%EC%86%8C/02a7594e.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26072.%E2%80%85%EA%B3%B0%EA%B3%B0%EC%9D%B4%EC%99%80%E2%80%85%EC%8B%9C%EC%86%8C/02a7594e.png" data-original-src="https://upload.acmicpc.net/008519ed-3e19-4a07-9f9b-a775ebdc2798/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:160px; object-fit:contain; display:inline-block;" /></p>

<p>곰곰이는 $N$개의 치킨들을 커다란 시소 위에 올려놓아 보관하고 있다. 이 시소의 길이는 $L$이다.</p>

<p>$i$번째 치킨은 $w_i$의 무게를 가졌고, 시소의 왼쪽 끝에서 $x_i$만큼 떨어진 위치에 놓여 있다.</p>

<p>시소의 균형이 무너지면 치킨이 바닥에 떨어지기 때문에, 곰곰이는 받침점의 위치를 적절히 옮겨서 시소를 평행하게 하고 싶다.</p>

<p>시소를 평행하게 만드는 받침점의 위치를 구해보자! (시소의 무게는 치킨의 무게에 비해 무시해도 될 정도로 가볍다.)</p>

<p style="text-align: center;"><img alt="곰곰: 고맙습니다" src="%EB%B0%B1%EC%A4%80/Silver/26072.%E2%80%85%EA%B3%B0%EA%B3%B0%EC%9D%B4%EC%99%80%E2%80%85%EC%8B%9C%EC%86%8C/e20b7d28.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26072.%E2%80%85%EA%B3%B0%EA%B3%B0%EC%9D%B4%EC%99%80%E2%80%85%EC%8B%9C%EC%86%8C/e20b7d28.png" data-original-src="https://upload.acmicpc.net/d4f9bca9-9e0c-4348-aaa2-3dbffa219ee6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:160px; object-fit:contain; display:inline-block;" /></p>

### 입력

<p>첫번째 줄에 정수 $N$과 $L$이 공백을 사이에 두고 주어진다. $(1 \le N, L \le 100\,000)$</p>

<p>두번째 줄에 정수 $x_1, x_2, \cdots, x_N$이 공백을 사이에 두고 주어진다. $(0 \le x_i \le L)$</p>

<p>세번째 줄에 정수 $w_1, w_2, \cdots, w_N$이 공백을 사이에 두고 주어진다. $(1 \le w_i \le 100\,000)$</p>

### 출력

<p>시소가 평행하도록 받침점을 놓았을 때, 받침점이 시소의 왼쪽으로부터 떨어져 있는 거리를 출력하라.</p>

<p>절대/상대 오차는 $10^{-6}$까지 허용한다.</p>

### 힌트

<p>받침점의 시소 왼쪽으로부터의 위치를 $X$라고 하자.</p>

<p>시소가 균형을 이루려면,</p>

<ul>
	<li>$W_L = \sum_{1 \le i \le N,\ x_i \lt X} w_i(X - x_i)$</li>
	<li>$W_R = \sum_{1 \le i \le N,\ x_i \gt X} w_i(x_i - X)$</li>
</ul>

<p>로 정의하였을 때 $W_L = W_R$이어야 한다.</p>

<p>$W_L &gt; W_R$ 이라면 시소는 왼쪽으로 기울 것이고, $W_L &lt; W_R$ 이면 시소는 오른쪽으로 기울 것이다.</p>