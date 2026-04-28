# [Platinum I] Keys - 30955

[문제 링크](https://www.acmicpc.net/problem/30955)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 12, 맞힌 사람: 11, 정답 비율: 40.741%

### 분류

많은 조건 분기, 해 구성하기, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Alice and Bob live in a massive mansion with $n$ rooms (one of them denoting outdoors, where they play the Moon game) and $m$ doors between them. Each door connects two rooms or a room with the outdoors and has a single unique key that opens this door only. Every door closes behind you and locks automatically, so one always needs a key to pass through. The building is very large, but Alice and Bob only use one room &ndash; their bedroom. Other rooms are only there to make the house look bigger and make the neighbors jealous.</p>

<p>This unusual way of building their house is now causing some trouble for Alice and Bob. Bob is leaving for a two-week-long trip. In a week, Alice is also going abroad for a month and when she leaves, she needs the right keys to leave the house. However, Bob also needs keys to get back in since Alice will not be there at the time to let him in. Alice and Bob are now trying to figure out how to split the keys to the doors for Alice to be able to get from room 0 (their bedroom) to 1 (outdoors) and Bob to go from room 1 (outdoors) to 0 (bedroom) one week later.</p>

<p>Fortunately, Alice remembered that she could drop some of the keys on her way out for Bob to pick up on his way back. This way, they can both pass through the same doors. She, of course, cannot drop any keys in room 1 (outdoors) since the neighbors could find them and break into their house.</p>

<p>Can you help Alice and Bob split their keys and plan their trip through the house?</p>

<p>You are given the description of Alice and Bob&#39;s mansion: $m$ doors between $n$ rooms numbered $0$ to $n-1$, where $1$ is outdoors and $0$ is the bedroom. The $i$-th door can be opened with the key number $i$ (0-indexed).</p>

<p>You should first print two lines containing space-separated numbers of keys for Alice and Bob, respectively. It is fine if they do not use all the keys, but it is not allowed for them to both have a copy of the same key (or for one of them to have multiple copies of a key).</p>

<p>You should then print instructions that Alice and Bob will follow. First, print Alice&#39;s movements from room $0$ to $1$ by printing commands of one of the two types:</p>

<ul>
	<li>&quot;<code>MOVE x</code>&quot; to move to room $x$ (assuming that there is a door between Alice&#39;s current location and $x$ and that Alice has the key),</li>
	<li>&quot;<code>DROP k1 k2 ...</code>&quot; to drop keys $k_1, k_2, ...$ (printed as space-separated integers) in the room where Alice currently stands. This means that Alice no longer carries these keys.</li>
</ul>

<p>Once Alice is done with her movements, print &quot;<code>DONE</code>&quot; in a new line. She should finish her movement in room $1$. It is fine if Alice passes through room $0$ or $1$ multiple times while following the printed instructions.</p>

<p>Second, print Bob&#39;s movements from room $1$ to $0$ by printing commands of one of the two types:</p>

<ul>
	<li>&quot;<code>MOVE x</code>&quot; to move to room $x$ (assuming that there is a door between Bob&#39;s current location and $x$ and that Bob has the key),</li>
	<li>&quot;<code>GRAB</code>&quot; to grab any keys in the room where Bob is currently standing. Bob always grabs all the keys that Alice left in the room. If Alice left none, he does not grab any.</li>
</ul>

<p>Once Bob is done with his movements, print &quot;<code>DONE</code>&quot; in a new line. He should finish his movement in room $0$. It is fine if Bob passes through room $0$ or $1$ multiple times while following the printed instructions.</p>

<p>Remarks: It is considered acceptable, albeit useless, to <code>DROP</code> an empty list of keys or to grab keys in a room that has no keys, or grab keys in room $1$ (i.e. outside).</p>

### 입력

<p>The first line contains integers $n$ and $m$, the number of rooms (outdoors included) and number of doors. This is followed by $m$ lines that describe the doors. The $i$-th line (count starting from $0$) is described by integers $a_i$, $b_i$, indicating that there is a door between rooms $a_i$ and $b_i$, opened with key $i$.</p>

### 출력

<p>First, print two lines, describing the split of keys. Then, print all the instructions for Alice and Bob, as described in the task description, one per line. If there is no solution, print &quot;<code>No solution</code>&quot; (without the quotes). If there are multiple valid solutions, any of them is accepted.</p>

### 제한

<ul>
	<li>$2 \leq n,m \leq 10^5$</li>
	<li>$0 \leq a_i, b_i &lt; n$</li>
	<li>It is guaranteed that it&#39;s always possible to reach any room from any other room if you have all the keys.</li>
	<li>Each pair of rooms is connected with at most one door.</li>
	<li>No room is connected to itself.</li>
	<li>Your program may print at most $4 \cdot 10^5$ instructions.</li>
</ul>

### 힌트

<p>The first example represents the following floor plan, where blue numbers correspond to key IDs required for each door:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30955.%E2%80%85Keys/817291bf.png" data-original-src="https://upload.acmicpc.net/3f327faa-3ca2-4d59-91ba-45ad08732987/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Alice takes keys 0, 1, and 2 while Bob takes keys 3 and 4. Alice walks from 0 to 1, then to 2, and then to 3. There, she drops key 0. She retraces her way back to 1. Bob starts in 1, walks to 4, then to 3, where he picks up key 0. He retraces his way back to 1, and with the newly picked-up key 0, opens up the door to 0.</p>

<p>In the second example, there is no way for both Alice and Bob to reach their destination. Note that Alice cannot drop keys in room 1.</p>