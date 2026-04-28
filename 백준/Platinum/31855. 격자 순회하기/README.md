# [Platinum III] 격자 순회하기 - 31855

[문제 링크](https://www.acmicpc.net/problem/31855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 20, 맞힌 사람: 18, 정답 비율: 20.000%

### 분류

구현, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>\(N \times M\) 크기의 격자가 있다. 격자의 한 칸에서 시작해서 모든 칸을 한 번씩 방문한 뒤, 격자 밖으로 나가는 경로를 만들어 보자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1cfe27a7-235e-4963-a8e9-d591c03dc4a6/-/preview/" style="width: 500px; height: 304px;" /></p>

<p>조금만 생각해 보면 아주 간단하게 풀리는 문제라는 사실을 알 수 있다. 하지만 여러분을 괴롭히고 싶었던 치훈이는 여기에 한 가지 조건을 더하기로 했다.</p>

<p><strong>임의의 한 칸에서의 이동 방향이 정해져 있다면</strong> 어떨까? 예를 들어, 위 격자의 \(3\)행 \(2\)열에 있는 칸에서는 무조건 오른쪽으로 이동해야 한다고 생각해 보자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3b8ea2d1-915d-4aeb-9789-6650f3f9f11c/-/preview/" style="height: 299px; width: 300px;" /></p>

<p>이는 다음과 같이 해결할 수 있다. 물론 이것 말고도 다양한 답이 존재한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9b0ca2e0-26bc-4d4c-a5ca-a27277965775/-/preview/" style="height: 281px; width: 500px;" /></p>

<p>이제 여러분의 차례이다. \(x\)행 \(y\)열에 있는 칸에서의 이동 방향이 정해져 있을 때, 격자의 한 칸에서 시작해서 모든 칸을 한 번씩 방문한 뒤, 격자 밖으로 나가는 경로를 출력하는 프로그램을 작성해 보자.</p>

### 입력

<p>첫 번째 줄에 격자의 크기 \(N\)과 \(M\)이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에 \(x\), \(y\), \(d\)가 공백으로 구분되어 주어진다. 이는 격자의 \(x\)행 \(y\)열에 위치한 칸에서 무조건 \(d\)방향으로 이동해야 함을 나타낸다.</p>

<p>\(d\)가 &lsquo;<span style="color:#e74c3c;"><code>U</code></span>&rsquo;라면 위쪽, &lsquo;<span style="color:#e74c3c;"><code>D</code></span>&rsquo;라면 아래쪽, &lsquo;<span style="color:#e74c3c;"><code>L</code></span>&rsquo;이라면 왼쪽, &lsquo;<span style="color:#e74c3c;"><code>R</code></span>&rsquo;이라면 오른쪽을 뜻한다.</p>

### 출력

<p>그런 경로를 만드는 것이 가능하다면, \(N\)줄에 걸쳐 \(M\)길이의 문자열을 공백 없이 출력한다.</p>

<p>\(i\)번째 줄 \(j\)번째 문자는 격자의 \(i\)행 \(j\)열에 위치한 칸에서 이동해야 할 방향을 나타낸다. 방향을 나타내는 문자는 입력의 형식과 동일하다.</p>

<p>가능한 답이 여러 가지라면 그중 아무거나 하나를 출력한다.</p>

<p>만약 출력한 답이 어떤 칸에서 시작하더라도 모든 칸을 한 번씩 방문한 뒤 격자 밖으로 나가지 않거나, \(x\)행 \(y\)열의 문자가 \(d\)가 아니라면 <span style="color:#e74c3c;">틀렸습니다</span>를 받는다.</p>

<p>그런 경로를 만드는 것이 불가능하다면, &lsquo;<span style="color:#e74c3c;"><code>Impossible</code></span>&rsquo;을 출력한다.</p>

### 제한

<ul>
	<li>\(2 \le N \le 50\)</li>
	<li>\(2 \le M \le 50\)</li>
	<li>\(1 \le x \le N\)</li>
	<li>\(1 \le y \le M\)</li>
	<li>\(d\)는 &lsquo;<span style="color:#e74c3c;"><code>U</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>D</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>L</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>R</code></span>&rsquo; 중 하나이다.</li>
</ul>

### 힌트

<p>현재 위치가 \(x\)행 \(y\)열이라고 할 때, 위쪽은 \(x\)가 줄어드는 방향을, 아래쪽은 \(x\)가 증가하는 방향을, 왼쪽은 \(y\)가 감소하는 방향을, 그리고 오른쪽은 \(y\)가 증가하는 방향을 나타낸다.</p>