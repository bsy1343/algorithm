# [Gold I] Deque Game - 21872

[문제 링크](https://www.acmicpc.net/problem/21872)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 217, 정답: 95, 맞힌 사람: 84, 정답 비율: 47.191%

### 분류

수학, 애드 혹, 조합론

### 문제 설명

<blockquote>
<p>21세기 최고의 게임! 연돌이와 세순이들의 극찬을 받아낸 게임! 세계를 매혹한 게임! 바로 Deque Game입니다.</p>
</blockquote>

<p>Deque Game은 두 사람이&nbsp;각자 주어진 블록을 이용해&nbsp;$L$층을 더 다양한 방식으로 쌓을 수 있는 사람이 승리하는 게임이다. Deque Game의 자세한 규칙은 다음과 같다.</p>

<ol>
	<li>총 $K$종류의 블록이 있고, 연돌이와 세순이는 원하는 만큼 블록을 가져다 사용할 수 있다.&nbsp;블록에는&nbsp;$0$이상&nbsp;$K$미만의 정수가 적혀있으며,&nbsp;블록을 여러 개 쌓아서 스택을 만들 수 있다.</li>
	<li>게임 시작 전, 연돌이와 세순이는 각자 $N$, $M$층의 스택을 무수히 많이&nbsp;받는다. 연돌이가&nbsp;받는 모든 스택은 동일하다. 세순이가 받는 모든 스택도 동일하다.</li>
	<li>연돌이와 세순이는&nbsp;매초 본인이 받은 스택 중 하나를 고른다. 그리고 임의의 블록을 끼워 넣는다.&nbsp;스택의 가장 아래나, 가장 위, 심지어 중간에도 끼워 넣을 수 있다. 이미&nbsp;$L$층이 쌓인 스택은 고르지 않는다.</li>
	<li>충분히 많은 시간이 흐르면, 더 이상 새로운 방법으로 $L$층의 스택을 만들&nbsp;수 없을 것이다. 이때,&nbsp;둘 중 더 많은&nbsp;방식으로 $L$층의 스택을 완성한 사람이 승리한다. 만약 $L$층의 스택을 완성하는 방식의 수가 같다면&nbsp;승부가 나지 않는다.</li>
</ol>

<p>예를 들어&nbsp;연돌이는 $2$층짜리 $00$스택을 무수히 많이&nbsp;받고, 세순이는 $2$층짜리 $22$스택을 무수히 많이&nbsp;받았다. 총 $3$종류의 블록을 이용해서 $3$층 스택을 쌓는 방법의 수는 $7$가지로 같다. 이 Deque Game은 승부가 나지 않는다.&nbsp;&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21872.%E2%80%85Deque%E2%80%85Game/a6c8648c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21872.%E2%80%85Deque%E2%80%85Game/a6c8648c.png" data-original-src="https://upload.acmicpc.net/d1f28ae8-b7b2-40f2-8010-c2f950f2e504/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 226px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21872.%E2%80%85Deque%E2%80%85Game/cfe32ae8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21872.%E2%80%85Deque%E2%80%85Game/cfe32ae8.png" data-original-src="https://upload.acmicpc.net/c1a846ea-0684-4879-b6ef-bd22256acf80/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px;" /></p>

<p>곧 밤 10시가 되기 때문에&nbsp;마호가니 아르바이트생 선렬이는&nbsp;문을 닫을 준비를 해야 한다. 하지만 이 순간에도&nbsp;연돌이들과&nbsp;세순이들이 Deque Game을 열심히 하고 있다. 선렬이는 매 게임판을 돌아다니며 Deque Game의 승자를 알려주기로 했다. 재빨리 Deque Game의 승자를 알려주고 게임판을 접지 않으면, 10시에 문을 닫지 못하고 벌금을 내야 할 것이다!</p>

### 입력

<p>첫 번째 줄에 마호가니에서 연돌이와 세순이가 진행하는 Deque Game의 수 $G$가 주어진다. ($1 \leq G&nbsp;\leq 3\,000$)</p>

<p>두 번째 줄에 블록&nbsp;종류의&nbsp;개수를 나타내는 $K$와 쌓아야 하는 스택의 층수를 나타내는 $L$이&nbsp;주어진다. ($1 \leq K \leq 10$, $1 \leq L \leq 2\,000$)</p>

<p>세 번째 줄부터 $G$개의 Deque Game에 대한 정보가 다음과&nbsp;주어진다.</p>

<ul>
	<li>연돌이가&nbsp;받은 스택의 크기를 나타내는 정수 $N$이 주어진다. ($1 \leq N&nbsp;\leq L$)</li>
	<li>연돌이가 받은 스택을 나타내는 문자열 $S$가&nbsp;주어진다.&nbsp;문자열 $S$의 길이는 $N$이고,&nbsp;스택을 나타내는 문자열은&nbsp;최하단 블록부터 주어진다.</li>
	<li>세순이가&nbsp;받은 스택의 크기를 나타내는 정수 $M$이 주어진다. ($1 \leq M&nbsp;\leq L$)</li>
	<li>세순이가 받은 스택을 나타내는 문자열 $T$가&nbsp;주어진다.&nbsp;문자열 $T$의 길이는 $M$이고,&nbsp;스택을 나타내는 문자열은&nbsp;최하단 블록부터 주어진다.</li>
</ul>

<p>연돌이와 세순이가 받은 스택의 블록에는&nbsp;$0$이상&nbsp;$K$미만의 정수가 적혀있다.</p>

### 출력

<p>$G$개의 줄에&nbsp;Deque Game의 승자를 출력한다.</p>

<p>연돌이가 승리하면 <span style="color:#e74c3c;"><code>Y</code></span>를, 세순이가 승리하면 <span style="color:#e74c3c;"><code>S</code></span>를 출력한다. 만약 승부가 나지 않는다면&nbsp;<span style="color:#e74c3c;"><code>YS</code></span>를 출력한다.</p>