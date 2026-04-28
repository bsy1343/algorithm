# [Platinum I] 두 배 - 32030

[문제 링크](https://www.acmicpc.net/problem/32030)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 168, 정답: 49, 맞힌 사람: 48, 정답 비율: 38.095%

### 분류

다이나믹 프로그래밍, 자료 구조, 그래프 이론, 문자열, 최단 경로, 데이크스트라, z

### 문제 설명

<p>밍구는 차세대 채팅 앱 ChatChatA을 개발했다!</p>

<p>ChatChatA를 배포하고 나니, 치명적인 버그 리포트가 밍구에게 날아왔다! 메시지를 입력하는 과정에서, 메시지의 마지막 글자가 특정 글자일 때, 특정 글자를 입력하면 메시지가 &ldquo;두 배&rdquo; 된다는 것이다!</p>

<p>정확히 풀어 설명하면 &ldquo;두 배&rdquo; 된다는 것은 다음과 같다.</p>

<ul>
	<li>현재 입력 중인 메시지를 <em>M</em>, <em>M</em>의 마지막 글자를 <em>s</em>, 입력할 글자를 <em>c</em>라고 하자.</li>
	<li>메시지가 &ldquo;두 배&rdquo; 되는 (<em>s</em>, <em>c</em>) 쌍의 집합을 <em>D</em>라 하자.
	<ul>
		<li>(<em>s</em>, <em>c</em>) &isin; <em>D</em> 이면, <em>c</em>를 입력했을 때 <em>M</em>은 <em>M</em> + <em>c</em>가 아닌 <em>M</em> + <em>M</em> + <em>c</em>가 된다!</li>
		<li>(<em>s</em>, <em>c</em>) &notin; <em>D</em>이면, <em>c</em>를 입력했을 때 <em>M</em>은 <em>M</em> + <em>c</em>가 된다.</li>
	</ul>
	</li>
	<li><em>M</em>이 빈 문자열이라면, <em>M</em>은 &ldquo;두 배&rdquo; 되지 않는다.</li>
</ul>

<p>ChatChatA의 사용자인 구밍이는 문자열 <em>T</em>를 입력하기 위한 최소의 입력 수가 궁금해졌다.</p>

<p>현재 메시지 <em>M</em>은 빈 문자열로 시작하고, 매 입력은 다음 두 행동 중 하나이다.</p>

<ul>
	<li><em>M</em>에 문자 <em>c</em>를 추가한다. 위 조건에 따라서 메시지가 &ldquo;두 배&rdquo; 될 수 있다.</li>
	<li><em>M</em>의 마지막 글자를 삭제한다. 단, <em>M</em>이 빈 문자열이 아닐 때에만 이 행동을 선택할 수 있다.</li>
</ul>

<p>현재 메시지 <em>M</em>이 <em>T</em>가 되기 위한 최소의 입력 수를 구밍이 대신 구해주자!</p>

### 입력

<p>첫 줄에 <em>D</em>의 크기 <em>N</em>이 주어진다. (1 &le; <em>N</em> &le; 676 = 26<sup>2</sup>)</p>

<p>둘째 줄에 길이 <em>N</em>의 영어 소문자 문자열 <em>S</em>, 셋째 줄에 길이 <em>N</em>의 영어 소문자 문자열 <em>C</em>가 주어진다.</p>

<p><em>S</em>의 <em>i</em>번째 글자를 <em>S</em><sub><em>i</em></sub>, <em>C</em>의 <em>i</em>번째 글자를 <em>C</em><sub><em>i</em></sub>라고 하면, <em>D</em> = {(<em>S</em><sub><em>i</em></sub>, <em>C</em><sub><em>i</em></sub>) : 1 &le; <em>i</em> &le; <em>N</em>}이다.</p>

<p>|<em>D</em>| = <em>N</em>이다. 즉, 같은 (<em>S</em><sub><em>i</em></sub>, <em>C</em><sub><em>i</em></sub>) 쌍은 주어지지 않는다.</p>

<p>넷째 줄에 입력할 영어 소문자로 이루어진 문자열 <em>T</em>가 주어진다. (1 &le; |<em>T</em>| &le; 500&thinsp;000)</p>

### 출력

<p>첫 줄에 현재 메시지를 <em>T</em>로 만드는 데 필요한 최소의 입력 수를 출력한다.</p>

<p>만약 현재 메시지를 <em>T</em>로 만들지 못한다면 &minus;1을 출력한다.</p>