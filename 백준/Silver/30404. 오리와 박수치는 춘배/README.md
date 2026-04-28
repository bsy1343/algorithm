# [Silver IV] 오리와 박수치는 춘배 - 30404

[문제 링크](https://www.acmicpc.net/problem/30404)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1135, 정답: 655, 맞힌 사람: 595, 정답 비율: 59.739%

### 분류

그리디 알고리즘

### 문제 설명

<p>춘배는 오리를 보러 왔다. 오리는 춘배가 있는 동안 총 $N$번 &quot;꽥꽥&quot; 소리를 낸다. 오리의 소리를 듣고 감동받은 춘배는 오리에게 박수를 쳐준다.</p>

<p>오리가 $X_i$초에 &quot;꽥꽥&quot; 소리를 낸다면 소리를 들은 춘배는 오리에게 $X_i$초 이상 $X_i+K$ 초 이하에 한 번 이상 박수를 쳐야한다.</p>

<p>만약 오리가 소리를 낸 $X_i$초부터 $X_i+K$초 사이에 한 번도 박수를 쳐주지 않는다면 실망한 오리는 집으로 가버린다. 예를 들어 $K=2, X_i = 5$라면 $5$초, $6$초, $7$초 중 최소 한번은 박수를 쳐야 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30404.%E2%80%85%EC%98%A4%EB%A6%AC%EC%99%80%E2%80%85%EB%B0%95%EC%88%98%EC%B9%98%EB%8A%94%E2%80%85%EC%B6%98%EB%B0%B0/9931ba50.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30404.%E2%80%85%EC%98%A4%EB%A6%AC%EC%99%80%E2%80%85%EB%B0%95%EC%88%98%EC%B9%98%EB%8A%94%E2%80%85%EC%B6%98%EB%B0%B0/9931ba50.png" data-original-src="https://upload.acmicpc.net/031290c4-91ee-47fe-91c5-329304c5b191/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">&lt;박수를 치는 춘배의 모습&gt;</p>

<p>오리가 집으로 가지 않도록 춘배가 박수를 쳐줄 때 박수를 최소 몇 번 쳐야 하는지 구해보자.</p>

### 입력

<p>첫째 줄에 오리가 &quot;꽥꽥&quot; 소리를 내는 횟수 $N$와 정수 $K$가 공백으로 구분되어 주어진다. $(1\le N \le 100\,000$, $0 \le K \le 10^6)$</p>

<p>둘째 줄에 오리가 &quot;꽥꽥&quot; 소리를 내는 시각 $X_1, X_2, ..., X_N$이 공백으로 구분되어 주어진다. $X_i$는 서로 다르며 오름차순으로 주어진다. $(1 \le X_i \le 10^6)$</p>

### 출력

<p>오리가 집으로 가지 않도록 춘배가 박수를 쳐줄 때 박수를 최소 몇 번 쳐야 하는지 출력한다.</p>