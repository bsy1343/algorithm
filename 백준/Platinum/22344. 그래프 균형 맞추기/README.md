# [Platinum III] 그래프 균형 맞추기 - 22344

[문제 링크](https://www.acmicpc.net/problem/22344)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1472, 정답: 398, 맞힌 사람: 323, 정답 비율: 26.850%

### 분류

수학, 그래프 이론, 그래프 탐색, 정렬, 깊이 우선 탐색

### 문제 설명

<p>N개의 정점과 M개의 간선으로 구성된 무방향 단순 연결 그래프가 있다. 그래프의 정점들에는 1 이상 N 이하의 서로 다른 자연수 번호가 붙어 있고, 간선들에는 1 이상 M 이하의 서로 다른 자연수 번호가 붙어 있다.</p>

<p>j (1 &le; j &le; M)번 간선은 a<sub>j</sub>번 정점과 b<sub>j</sub>번 정점을 연결하며, 정수 가중치 c<sub>j</sub>가 붙어 있다.</p>

<p>당신은 모든 정점에 정수 가중치를 부여해야 한다. i (1 &le; i &le; N)번 정점에 부여할 가중치를 x<sub>i</sub>라고 하자.</p>

<p>정점에 가중치를 부여하는 총 비용은 각 정점의 가중치의 절댓값의 합, 즉 |x<sub>1</sub>| + |x<sub>2</sub>| + &middot; &middot; &middot; + |x<sub>N</sub>|과 같다.</p>

<p>그래프의 균형이 맞으려면, 각 간선이 연결하고 있는 두 정점의 가중치의 합이 간선의 가중치와 같아야 한다. 즉, 모든 j (1 &le; j &le; M)에 대해, x<sub>a<sub>j</sub></sub> + x<sub>b<sub>j</sub></sub>이 c<sub>j</sub>와 같아야 한다.</p>

<p>예를 들어, 아래와 같이 5개의 정점과 4개의 간선으로 이루어진 그래프를 생각하자. 그림에서 정점을 나타 내는 원 안에 적힌 수는 정점의 번호이고, 간선을 나타내는 선에 적힌 수는 간선에 붙은 가중치이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22344.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B7%A0%ED%98%95%E2%80%85%EB%A7%9E%EC%B6%94%EA%B8%B0/4c631dd7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22344.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B7%A0%ED%98%95%E2%80%85%EB%A7%9E%EC%B6%94%EA%B8%B0/4c631dd7.png" data-original-src="https://upload.acmicpc.net/b1bc832a-633b-4c14-bc59-e7c0fe7f00ce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 132px; height: 249px;" /></p>

<p>아래의 그림과 같이 각 정점에 [2, -7, 3, -5, 0]의 가중치를 부여해서, 각 간선이 연결하고 있는 두 정점의 가중치의 합이 간선의 가중치와 같게 할 수 있다. 아래 그림에서 정점을 나타내는 원 안에 적힌 수는 정점의 가중치이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22344.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B7%A0%ED%98%95%E2%80%85%EB%A7%9E%EC%B6%94%EA%B8%B0/be7cd536.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22344.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B7%A0%ED%98%95%E2%80%85%EB%A7%9E%EC%B6%94%EA%B8%B0/be7cd536.png" data-original-src="https://upload.acmicpc.net/78b82521-224f-4eda-bd93-2ee2001f1385/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 132px; height: 245px;" /></p>

<p>총 비용은 |2| + | &minus; 7| + |3| + | &minus; 5| + |0| = 2 + 7 + 3 + 5 + 0 = 17이다. 총 비용을 17보다 작게 할 수 있는 방법은 없기 때문에, 위 방법은 총 비용을 최소화하는 방법이다.</p>

<p>아래와 같이 각 정점에 [6, -3, -1, -9, 4]의 가중치를 부여해도 균형이 맞는 그래프가 되지만, 이 경우 총 비용은 17보다 큰 23이 되기 때문에 아래 방법은 총 비용을 최소화하는 방법이 아니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22344.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B7%A0%ED%98%95%E2%80%85%EB%A7%9E%EC%B6%94%EA%B8%B0/fc201513.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22344.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B7%A0%ED%98%95%E2%80%85%EB%A7%9E%EC%B6%94%EA%B8%B0/fc201513.png" data-original-src="https://upload.acmicpc.net/2d164b11-c1b8-4080-85b6-70c7611cd170/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 132px; height: 251px;" /></p>

<p>그래프의 균형이 맞도록 정점에 가중치를 부여하는 것이 <strong>가능한지 확인</strong>하고, 가능하다면 그 중 <strong>총 비용을 최소화</strong>하는 방법을 하나 구하는 프로그램을 작성하라.</p>

### 입력

<p>첫째 줄에 N과 M이 순서대로 공백을 사이에 두고 주어진다.</p>

<p>다음 M개의 줄에 각 간선에 대한 정보가 주어진다. 이 중 j (1 &le; j &le; M)번째 줄에는 세 정수 a<sub>j</sub>, b<sub>j</sub>, c<sub>j</sub>가 공백 하나씩을 사이로 두고 주어진다.</p>

### 출력

<p>만약 그래프의 균형이 맞도록 정점에 정수 가중치를 부여하는 방법이 존재한다면:</p>

<ul>
	<li>첫째 줄에 <code>Yes</code>를 출력한다. 출력은 대소문자를 구분하지 않는다.</li>
	<li>둘째 줄에 각 정점에 부여한 가중치를 나타내는 N개의 정수 x<sub>1</sub>, x<sub>2</sub>, . . ., x<sub>N</sub>을 공백 하나씩 사이에 두고 출력한다. 그래프의 균형이 맞도록 하면서 총 비용을 최소화하는 방법이 여럿 존재한다면, 그러한 방법들 가운데 어떤 것을 출력해도 된다.</li>
</ul>

<p>만약 그래프의 균형이 맞도록 정점에 정수 가중치를 부여하는 방법이 존재하지 않는다면:</p>

<ul>
	<li>첫째 줄에 <code>No</code>를 출력한다. 출력은 대소문자를 구분하지 않는다.</li>
</ul>

### 제한

<ul>
	<li>주어지는 모든 수는 정수이다.</li>
	<li>2 &le; N &le; 100 000</li>
	<li>1 &le; M &le; 200 000</li>
	<li>모든 j (1 &le; j &le; M)에 대해:
	<ul>
		<li>1 &le; a<sub>j</sub> &le; N, 1 &le; b<sub>j</sub> &le; N</li>
		<li>a<sub>j</sub> &ne; b<sub>j</sub>. 즉, 서로 같은 두 정점을 연결하는 간선은 없다.</li>
		<li>&minus;1 000 000 &le; c<sub>j</sub> &le; 1 000 000</li>
	</ul>
	</li>
	<li>모든 j, k (1 &le; j &lt; k &le; M)에 대해, {a<sub>j</sub>, b<sub>j</sub>} &ne; {a<sub>k</sub>, b<sub>k</sub>}. 즉, 서로 다른 두 정점 쌍 (a, b)를 잇는 간선은 많아야 한 개 존재한다.</li>
	<li>그래프는 <strong>연결 그래프</strong>이다. 즉, 그래프에서 어떤 두 정점을 골라도, 간선들을 통해 두 정점을 직, 간접 적으로 잇는 경로가 존재한다.</li>
</ul>

### 힌트

<p>|x|는 x &lt; 0이면 &minus;x, x &ge; 0이면 x인 절댓값 기호이다.</p>