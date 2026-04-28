# [Silver V] 나뭇잎 학회 - 26005

[문제 링크](https://www.acmicpc.net/problem/26005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 934, 정답: 623, 맞힌 사람: 553, 정답 비율: 67.275%

### 분류

수학, 애드 혹, 사칙연산

### 문제 설명

<p>기선이는 퀴즈를 좋아해서 알고리즘 학회에 들어가고자 하이아크에 방문하였다. 하지만 학회 문 앞에는 단 한 개의 전구, 여러 개의 스위치와 함께 다음과 같은 쪽지가 붙어있었다. </p>

<ul>
	<li>
	<p>보이는 것과 같이 하나의 전구와 $N \times N$ 개의 스위치가 $N \times N$ 배열로 있습니다.</p>
	</li>
	<li>
	<p>이 스위치 중 단 하나만 전구와 연결되어 있으며, 연결된 스위치를 누르면 전구가 깜빡입니다.</p>
	</li>
	<li>
	<p>스위치에는 특수 장치가 적용되어 있어서 상하좌우로 인접한 두 개의 스위치를 동시에 눌러야만 합니다.</p>
	</li>
	<li>
	<p>예를 들어 $N=3$일 때, 당신이 $5$번 스위치를 누르고 싶다면 인접한 스위치 상($2$), 하($8$), 좌($4$), 우($6$) 중 하나의 스위치와 같이 한 번에 눌러야 합니다.</p>

	<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/8ef8f4be.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/8ef8f4be.png" data-original-src="https://upload.acmicpc.net/a0c88181-fff9-4760-bdc8-fccc4ed74786/-/crop/532x532/7,9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 200px; width: 200px;" /></p>
	</li>
	<li>
	<p>당신은 전구와 연결된 스위치가 어느 것인지 알아내서 답을 제출해야 합니다.</p>
	</li>
</ul>

<p>&#39;너무 쉽잖아&#39; 생각하고 스위치를 누르려는 순간, 밑에 작게 쓰여있는 글씨를 보고 경악하고 말았다. </p>

<ul>
	<li>
	<p>단, 두 개의 스위치를 한 번에 누를 때마다 나뭇잎 하나를 문틈으로 제출해야 합니다.</p>
	</li>
</ul>

<p>귀찮음이 많은 기선이는 밖에서 최소한의 나뭇잎만 주워오려고 한다. 어떤 경우에도 정답을 맞히는 데 필요한 나뭇잎의 최소 개수를 여러분이 대신 구해보자. </p>

### 입력

<p>$N$ 이 주어진다. ($1 \le N \le 1\,000$)</p>

### 출력

<p>어떤 경우에도 정답을 맞히는 데 필요한 나뭇잎의 최소 개수를 출력한다.</p>

### 힌트

<p>$N=2$ 일 때는 다음과 같다.</p>

<p><strong>ⅰ) 전구가 $1$번 스위치와 연결되어 있는 경우 </strong></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="https://upload.acmicpc.net/cd345f8d-3b0e-4fa3-8f73-9b6f0d34d2b1/-/crop/245x244/6,8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 151px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="https://upload.acmicpc.net/73fb1dc9-15fe-4855-b23d-e1e994ec0639/-/crop/245x246/4,4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 149px;" /></p>

<ol>
	<li>$3$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡이지 않는다.</li>
	<li>$2$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡이지 않는다.</li>
</ol>

<p>$2$번, $3$번, $4$번 스위치를 눌렀으나 전구가 깜빡이지 않았으므로 $1$번 스위치가 전구와 연결되어 있다는 사실을 알 수 있다. </p>

<p><strong>ⅱ) 전구가 $2$번 스위치와 연결되어 있는 경우</strong></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="https://upload.acmicpc.net/cd345f8d-3b0e-4fa3-8f73-9b6f0d34d2b1/-/crop/245x244/6,8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 151px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="https://upload.acmicpc.net/73fb1dc9-15fe-4855-b23d-e1e994ec0639/-/crop/245x246/4,4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 149px;" /></p>

<ol>
	<li>$3$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡이지 않는다.</li>
	<li>$2$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡인다.</li>
</ol>

<p>$2$번 스위치가 전구와 연결되어 있다는 사실을 알 수 있다. </p>

<p><strong>ⅲ) 전구가 $3$번 스위치와 연결되어 있는 경우</strong></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="https://upload.acmicpc.net/cd345f8d-3b0e-4fa3-8f73-9b6f0d34d2b1/-/crop/245x244/6,8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 151px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="https://upload.acmicpc.net/73fb1dc9-15fe-4855-b23d-e1e994ec0639/-/crop/245x246/4,4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 149px;" /></p>

<ol>
	<li>$3$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡인다.</li>
	<li>$2$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡이지 않는다.</li>
</ol>

<p>$3$번 스위치가 전구와 연결되어 있다는 사실을 알 수 있다.</p>

<p><strong>ⅳ) 전구가 $4$번 스위치와 연결되어 있는 경우</strong></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/5dc304aa.png" data-original-src="https://upload.acmicpc.net/cd345f8d-3b0e-4fa3-8f73-9b6f0d34d2b1/-/crop/245x244/6,8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 151px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26005.%E2%80%85%EB%82%98%EB%AD%87%EC%9E%8E%E2%80%85%ED%95%99%ED%9A%8C/b41d0cdd.png" data-original-src="https://upload.acmicpc.net/73fb1dc9-15fe-4855-b23d-e1e994ec0639/-/crop/245x246/4,4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 149px;" /></p>

<ol>
	<li>$3$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡인다.</li>
	<li>$2$번 스위치와 $4$번 스위치를 누른다. 전구가 깜빡인다.</li>
</ol>

<p>$4$번 스위치가 전구와 연결되어 있다는 사실을 알 수 있다.</p>

<p>전구가 $1$번, $2$번, $3$번, $4$번 중 어떤 스위치와 연결되어 있든 최대 2개의 나뭇잎으로 전구의 위치를 찾을 수 있으니 필요한 나뭇잎의 최소 개수는 2개이다.</p>