# [Silver II] blobblush - 24500

[문제 링크](https://www.acmicpc.net/problem/24500)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1406, 정답: 589, 맞힌 사람: 502, 정답 비율: 41.215%

### 분류

수학, 애드 혹, 비트마스킹

### 문제 설명

<p>귀여운 아기 주환이에게는 $1$부터 $N$까지의 양의 정수가 적힌 숫자 카드가 있다.</p>

<p>주환이는 오늘이 자신과 가장 친한 아기 블롭의&nbsp;생일이라는 사실을 알고,&nbsp;선물로 $K$장의 카드를 주었다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24500.%E2%80%85blobblush/1440c98b.png" data-original-src="https://upload.acmicpc.net/bc81653f-f48e-4354-b293-76cc7c9c8ee3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px;" /></p>

<p>주환이는&nbsp;카드를 다음 조건에 맞게 뽑았다.</p>

<ul>
	<li>뽑은 카드들에 적힌 수를 모두 &oplus;한 값이 최대가 되어야 한다. &oplus;는 배타적 논리합(xor)을 의미한다.</li>
	<li>첫 번째 조건에 맞게 카드를 뽑는 방법이 여러 가지인 경우, 카드를 최대한 적게 뽑아야 한다.</li>
	<li>두 번째 조건에 맞게 카드를 뽑는 방법이 여러 가지인 경우, 사전 순으로 가장 앞서도록 뽑아야 한다.</li>
</ul>

<p>$K$와&nbsp;고른 카드에 적힌 각 수를&nbsp;구하자.</p>

### 입력

<p>첫째 줄에&nbsp;$N$이 주어진다.</p>

### 출력

<p>첫째 줄에 $K$를 출력한다. $K$는 $N$ 이하인&nbsp;양의 정수이다.</p>

<p>둘째 줄부터&nbsp;조건을 만족하는 $K$개의 카드에 적힌 양의 정수를 한 줄에 하나씩 오름차순으로 출력한다.</p>

<p>가능한 답이 여러 경우라면, 사전 순으로 가장 앞서는 것을 출력한다.</p>

### 제한

<ul>
	<li>$1&nbsp;\leq&nbsp;N \leq 10^{18}$</li>
</ul>

### 힌트

<p>길이 K의 수열 A가 같은 길이의 수열 B보다 사전순으로 앞선다는 것은, A의 1~(i-1)번째 원소와 B의 1~(i-1)번째 원소가 같으면서, A의 i번째 원소가 B의 i번째 원소보다 작은 i가 있다는 것이다.</p>