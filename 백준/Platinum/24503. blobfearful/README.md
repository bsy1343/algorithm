# [Platinum IV] blobfearful - 24503

[문제 링크](https://www.acmicpc.net/problem/24503)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 794, 정답: 155, 맞힌 사람: 100, 정답 비율: 19.493%

### 분류

수학, 정수론, 이분 탐색, 소수 판정, 소인수분해

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24503.%E2%80%85blobfearful/4ce22741.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24503.%E2%80%85blobfearful/4ce22741.png" data-original-src="https://upload.acmicpc.net/a08934b3-63cd-4e95-9a8d-c2ce303e2e32/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 384px;" /><br />
&nbsp;</p>

<p>건우는&nbsp;다음과 같은 문제를 만들었다.</p>

<blockquote>
<p>연구소에 동거하는 채완이와 주환이는 블롭을 아주 좋아한다.</p>

<p>그래서 둘은 블롭을 연구소로 데려와 키운다. 그런데, 키우는 것만으로는 모자란 나머지, 약을 만들어 블롭의 수를 늘리기로 했다.</p>

<p>이 약은 시간이 지날수록 효과가 좋아져&nbsp;$i$일에는 블롭의 수가 전날의 $i$배가 된다. $1$일에는 블롭 한 마리가&nbsp;있고, $2$일부터 약을 사용하기로 했다.</p>

<p>그러나, 급격하게 늘어난 개체수로 인해&nbsp;블롭의 수가 $K$의 배수가 아니라면&nbsp;블롭들이&nbsp;불안해한다.</p>

<p>그래서 주환이는&nbsp;처음으로 블롭들이 불안해하지 않는 날에 약의 사용을 멈추기로 했다.</p>

<p>블롭의 수가 처음으로&nbsp;$K$의 배수가 되는 날을&nbsp;구하여라.</p>
</blockquote>

<p>그러나, 문제가 너무 쉬워 보여 질의를 주기로 했다.</p>

<p>$Q$ 개의 정수 $A_i$에 대하여 $1$일에 블롭 한 마리 대신,&nbsp;$A_i$마리가 있을 때 문제의 정답을 각각 출력하자.</p>

### 입력

<p>첫째 줄에 정수 $K$와 질의의 개수 $Q$가&nbsp;공백으로 구분되어&nbsp;주어진다.</p>

<p>둘째 줄에 질의의 정보 $A_1, A_2, \cdots, A_Q$가&nbsp;공백으로 구분되어 주어진다.</p>

### 출력

<p>각 질의마다 문제의 정답을&nbsp;한 줄에 공백으로 구분하여 순서대로 출력한다.</p>

### 제한

<ul>
	<li>$2 \le&nbsp;K \le&nbsp;10^{15}$</li>
	<li>$1 \le&nbsp;Q \le&nbsp;10^5$</li>
	<li>$1 \le&nbsp;A_q&nbsp;&lt; K$ $(1 \le&nbsp;q \le&nbsp;Q)$</li>
</ul>