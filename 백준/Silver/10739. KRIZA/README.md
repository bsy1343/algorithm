# [Silver I] KRIZA - 10739

[문제 링크](https://www.acmicpc.net/problem/10739)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 136, 정답: 59, 맞힌 사람: 44, 정답 비율: 37.607%

### 분류

수학

### 문제 설명

<p>The state of the economy is bad, the crysis is striking the country and people are losing their jobs. However, Sisyphus, the main hero of this task, has found himself a new job. Starting next monday, Sisyphus will be an assistant locksmith in a hotel. Naturally, first he needs to demonstrate his locksmithing abilities to the head locksmith.</p>

<p>This is why the head locksmith has given Sisyphus N keys on a big round pendant, blindfolded him and led him into a big room. That room contains N locked doors, denoted with numbers from 1 to N. Each of the keys on the pendant unlocks precisely one door.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10739.%E2%80%85KRIZA/63565ac1.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10739.%E2%80%85KRIZA/63565ac1.png" data-original-src="https://www.acmicpc.net/upload/images3/kriza.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:198px; width:214px" /></p>

<p>Sisyphus&rsquo; job is to unlock and lock each door again. He does this in a way that he moves along the wall, not changing direction, until he reaches a door. When he reaches a door, he tries unlocking it using the first (leftmost) key. In the case when the key doesn&rsquo;t unlock the door, Sisyphus moves it to the other (right) side of pendant and repeats this procedure until he finds the right key. His work is done when he goes through all the doors. The first door Sisyphus unlocked is denoted with 1, the next with 2, the one after with 3 and so on...</p>

<p>What Sisyphus doesn&rsquo;t know is that the head locksmith is, in fact, testing his endurance so he led him into a circular room. Therefore, Sisyphus will, after unlocking and locking the last door, go unlocking and locking the first door again. Because he&rsquo;s a hardworking and persistent fellow, Sisyphus has been doing this job for hours and hours without saying a single word. Only after the Kth successful unlocking and locking of a door he spoke: &quot;If only I knew how many times so far I&rsquo;ve put a wrong key in a door&rsquo;s lock!&quot; Your task is to answer his question!</p>

### 입력

<p>The first line of input contains the integers N (1 &le; N &le; 10<sup>5</sup>) and K (1 &le; K &le; 10<sup>9</sup>) from the task.</p>

<p>The ith of the following N lines contains the integer vi (1 &le; vi &le; N) which denotes that the ith key on the pendant (from left to right) unlocks the door vi.</p>

### 출력

<p>The first and only line of output must contain an integer representing the answer to Sisyphus&rsquo; question.</p>

### 힌트

<p>Clarification of the second example:</p>

<ul>
	<li>The first locking/unlocking (door 1) &ndash; keys (left to right): 4 2 1 3</li>
	<li>The second locking/unlocking (door 2) &ndash; keys (left to right): 1 3 4 2</li>
	<li>The third locking/unlocking (door 3) &ndash; keys (left to right): 2 1 3 4</li>
	<li>The fourth locking/unlocking (door 4) &ndash; keys (left to right): 3 4 2 1</li>
	<li>The fifth locking/unlocking (door 1) &ndash; keys (left to right): 4 2 1 3</li>
	<li>The sixth locking/unlocking (door 2) &ndash; keys (left to right): 1 3 4 2</li>
	<li>The misplaced keys are underlined.</li>
</ul>