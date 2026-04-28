# [Gold III] 가지 오이 당근 - 31632

[문제 링크](https://www.acmicpc.net/problem/31632)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 537, 정답: 98, 맞힌 사람: 89, 정답 비율: 21.867%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>키위 유치원에서 $N$마리의 어린 키위새들은 재밌는 게임 &quot;가지 오이 당근&quot;을 하고 있습니다. &quot;가지 오이 당근&quot;은 가위바위보와 비슷한 게임으로, 다음과 같은 규칙을 가집니다.</p>

<ul>
	<li>참여하는 모든 키위새는 <span style="color:#8e44ad;"><strong>가지</strong></span>, <span style="color:#27ae60;"><strong>오이</strong></span>, <span style="color:#e67e22;"><strong>당근</strong></span> 중 하나의 채소를 내야 합니다.</li>
	<li><span style="color:#8e44ad;"><strong>가지</strong></span>를 낸 키위새는 <span style="color:#27ae60;"><strong>오이</strong></span>를 낸 키위새가 존재하면 승점을 얻습니다.</li>
	<li><span style="color:#27ae60;"><strong>오이</strong></span>를 낸 키위새는 <span style="color:#e67e22;"><strong>당근</strong></span>을 낸 키위새가 존재하면 승점을 얻습니다.</li>
	<li><span style="color:#e67e22;"><strong>당근</strong></span>을 낸 키위새는 <span style="color:#8e44ad;"><strong>가지</strong></span>를 낸 키위새가 존재하면 승점을 얻습니다.</li>
	<li>모든 키위새가 승점을 얻었거나 모든 키위새가 승점을 얻지 못한 경우 모든 키위새가 비깁니다.</li>
	<li>그렇지 않으면, 승점을 얻은 키위새는 이기고 승점을 얻지 못한 키위새는 집니다.</li>
</ul>

<p style="display:flex;flex-direction:column;align-items:center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31632.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EC%98%A4%EC%9D%B4%E2%80%85%EB%8B%B9%EA%B7%BC/c950999a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31632.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EC%98%A4%EC%9D%B4%E2%80%85%EB%8B%B9%EA%B7%BC/c950999a.png" data-original-src="https://upload.acmicpc.net/711d1649-8650-4f27-adb5-826048049782/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:12em;max-width:100%" /><span style="text-align:center;">가지는 오이를 상대로, 오이는 당근을 상대로, 당근은 가지를 상대로 승점을 얻습니다.</span></p>

<p>유치원의 키위새들은 채소를 내었지만, 여러분은 잠시 쉬고 있느라 몇몇 키위새가 낸 채소를 보지 못했습니다! 그 대신 유치원의 키위새들에게 게임의 결과를 물어보아 각 키위새가 이겼는지, 비겼는지, 졌는지 알아내었습니다. 하지만 키위새는 기억력이 좋지 않아 실제 결과와 다른 결과를 말했을 수도 있습니다.</p>

<p>키위새들이 말한 결과가 가능한 결과인지 판별하고 가능하다면 각 키위새가 낸 채소들의 조합으로 가능한 것을 아무거나 찾아서 출력해 봅시다.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 수 $T$가 주어집니다. $(1 \le T \le 10^5)$</p>

<p>각 테스트 케이스의 첫 번째 줄에 &quot;가지 오이 당근&quot;을 한 키위새의 수 $N$이 주어집니다. $(2 \le N \le 10^5)$</p>

<p>그다음 줄에 <span style="color:#e74c3c;"><code>G</code></span>, <span style="color:#e74c3c;"><code>O</code></span>, <span style="color:#e74c3c;"><code>D</code></span>, <span style="color:#e74c3c;"><code>?</code></span> 만으로 이루어진 길이 $N$의 문자열 $V$가 주어집니다. 이 문자열의 $i$번째 글자 $V_i$는 다음과 같은 정보를 나타냅니다.</p>

<ul>
	<li>$V_i =$ <span style="color:#e74c3c;"><code>G</code></span>: $i$번째 키위새가 채소 <span style="color:#8e44ad;"><strong>가지</strong></span>를 내었습니다.</li>
	<li>$V_i =$ <span style="color:#e74c3c;"><code>O</code></span>: $i$번째 키위새가 채소 <span style="color:#27ae60;"><strong>오이</strong></span>를 내었습니다.</li>
	<li>$V_i =$ <span style="color:#e74c3c;"><code>D</code></span>: $i$번째 키위새가 채소 <span style="color:#e67e22;"><strong>당근</strong></span>을 내었습니다.</li>
	<li>$V_i =$ <span style="color:#e74c3c;"><code>?</code></span>: $i$번째 키위새가 낸 채소를 보지 못했습니다.</li>
</ul>

<p>$V$에 <span style="color:#e74c3c;"><code>?</code></span>가 한 개 이상은 존재합니다.</p>

<p>그다음 줄에 <span style="color:#e74c3c;"><code>W</code></span>, <span style="color:#e74c3c;"><code>D</code></span>, <span style="color:#e74c3c;"><code>L</code></span> 만으로 이루어진 길이 $N$의 문자열 $R$이 주어집니다. 이 문자열의 $i$번째 글자 $R_i$는 다음과 같은 정보를 나타냅니다.</p>

<ul>
	<li>$R_i =$ <span style="color:#e74c3c;"><code>W</code></span>: $i$번째 키위새가 본인이 이겼다고 말했습니다.</li>
	<li>$R_i =$ <span style="color:#e74c3c;"><code>D</code></span>: $i$번째 키위새가 본인이 비겼다고 말했습니다.</li>
	<li>$R_i =$ <span style="color:#e74c3c;"><code>L</code></span>: $i$번째 키위새가 본인이 졌다고 말했습니다.</li>
</ul>

<p>모든 테스트 케이스에서 $N$의 총합이 $2 \times 10^5$를 넘지 않습니다.</p>

### 출력

<p>각 테스트 케이스에 대해 다음 내용을 출력합니다.</p>

<p>만약 키위새들이 채소를 낼 수 있는 조합이 존재한다면 <code><span style="color:#e74c3c;">YES</span></code>를 한 줄에 출력하고, 그다음 줄에 길이 $N$의 문자열 $V&#39;$을 출력합니다. 이때, $V&#39;$은 <span style="color:#e74c3c;"><code>G</code></span>, <span style="color:#e74c3c;"><code>O</code></span>, <span style="color:#e74c3c;"><code>D</code></span> 만으로 이루어진 문자열이어야 하고, $V&#39;$에 따라 키위새들이 &quot;가지 오이 당근&quot;을 진행했을 때 결과가 $R$에서 주어진 결과와 일치해야 합니다. 또한, $V$의 $i$번째 글자 $V_i$가 <code><span style="color:#e74c3c;">?</span></code>가 아니라면 $V&#39;_i$와 $V_i$는 일치해야 합니다.</p>

<p>키위새들이 채소를 낼 수 있는 조합이 존재하지 않는다면 <span style="color:#e74c3c;"><code>NO</code></span>를 한 줄에 출력합니다.</p>