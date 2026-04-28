# [Platinum IV] 교실 불 끄기 - 28241

[문제 링크](https://www.acmicpc.net/problem/28241)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 293, 정답: 46, 맞힌 사람: 38, 정답 비율: 17.431%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>송도고등학교의 경비원인 진서는 교실의 불을 모두 끄고 얼른 퇴근하고 싶다. 하지만 진서는 S리그 경기 중에 발생한 무릎 부상으로 인해 계단을 오르내리는 것이 매우 힘들다.</p>

<p>따라서 진서는 최소한의 계단을 사용하여 불을 끄는 방법 중 시간을 최소화하는 방법으로 불을 끌 것이다.</p>

<p style="text-align: center;"><img alt="" height="248" src="%EB%B0%B1%EC%A4%80/Platinum/28241.%E2%80%85%EA%B5%90%EC%8B%A4%E2%80%85%EB%B6%88%E2%80%85%EB%81%84%EA%B8%B0/2b5cc55c.png" data-original-src="https://upload.acmicpc.net/6be598fd-a8c7-483f-8a84-5113e5ccd823/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="269" /></p>

<p style="text-align: center;">불을 끄러 다니는 경비원 진서의 피곤한 모습이다.</p>

<p>학교는 $n$개의 층으로 이루어져 있으며 모든 층에는 계단, $m$개의 교실, 계단이 순서대로 배치되어 있다. 각 교실과 계단은 하나의 칸으로서 표현된다. 한 칸을 이동하는 데에는 $1$분이 걸리고, 층간 이동은 계단을 통해서만 할 수 있다. 특히 학교 건물의 가장 높은 층인 $n$층에는 면학실이 있기에 <strong>모든 교실에 불이 켜져 있다</strong>.</p>

<p style="text-align: center;"><img alt="" height="316" src="%EB%B0%B1%EC%A4%80/Platinum/28241.%E2%80%85%EA%B5%90%EC%8B%A4%E2%80%85%EB%B6%88%E2%80%85%EB%81%84%EA%B8%B0/b620c5c1.png" data-original-src="https://upload.acmicpc.net/636fedc5-3b83-4b30-a243-58f8d10c5073/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="384" /></p>

<p style="text-align: center;">예제로 주어지는 학교의 모습이다. 편의상 양 끝 계단 열에 $0$과 $4$를 부여했다.</p>

<p>진서가 학교의 $1$층 왼쪽 계단 칸에서 출발하여 모든 불을 끄고 마지막으로 $1$층 왼쪽 계단 칸 혹은 $1$층 오른쪽 계단 칸에 도달하는 시간(분)을 계산하는 프로그램을 작성하여라. 단, 진서가 각 교실의 불을 끄는 시간은 매우 짧으므로 고려하지 않는다.</p>

### 입력

<p>첫 번째 줄에는 학교의 층수 $n$과 한 층에 있는 교실의 수 $m$가 공백으로 구분되어 주어진다.</p>

<p>이어서 $n$개의 각 $i+1$번째 줄에는 $i$층에 있는 불이 켜진 교실의 수 $k_i$와 $k_i$개의 불이 켜진 각 교실이 왼쪽 계단 칸으로부터 떨어진 칸의 수 $a_{i,1}, a_{i,2}, \ldots, a_{i,k_i}$가 공백으로 구분되어 순서대로 주어진다.</p>

### 출력

<p>조건에 맞게 불을 다 끄고 나가는 문까지 도달하는 시간(분)의 최솟값을 출력한다.</p>

### 제한

<ul>
	<li>$2 &le; n , m &le; 100\,000$.</li>
	<li>$0 &le; k_i &le; m$.</li>
	<li>$k_n = m$.</li>
	<li>불이 켜진 모든 교실의 수는 $100\,000$ 이하.</li>
	<li>$1 \le a_{i,1} &lt; a_{i,2} &lt; \cdots &lt; a_{i,k_i} \le m$.</li>
</ul>

### 힌트

<ul>
	<li>C/C++의 경우, 32bit 정수형 <span style="color:#e74c3c;"><code>int</code></span>의 범위를 넘어가는 정수를 다루게 되므로 64bit 정수형 <span style="color:#e74c3c;"><code>long long</code></span> 사용을 권장한다.</li>
</ul>