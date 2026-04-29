# [Platinum V] Coin Exchange - 33660

[문제 링크](https://www.acmicpc.net/problem/33660)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

구현, 그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>Lorenzo of Valtier is a traveling merchant navigating the fractured realms of the Five Kingdoms. Each nation mints its own unique coins using secretive forging techniques, creating a hidden economy of conversions:</p>

<p><b>Currencies</b></p>

<ul>
	<li>Aetherspire Dominion: Obsidian discs etched with celestial runes (Aetherspire Coin)</li>
	<li>Bleakmarch Protectorate: Bone-white tetrahedrons that scream when heated (Bleakmarch Coin)</li>
	<li>Crimson Falconate: Blood-veined square that warm before storms (Crimson Coin)</li>
	<li>Drowned King’s Reach: Barnacle-encrusted hexagons that smell of brine (Drowned Coin)</li>
	<li>Emberveil Syndicate: Geometric amber prisms containing frozen flames (Emberveil Coin)</li>
</ul>

<p><b>Exchange Rates</b> (Black Market, One-way Currency Exchange):</p>

<ul>
	<li>$3$ Aetherspire $→$ $1$ Bleakmarch ("Three stars bow to the Pale Lord")</li>
	<li>$3$ Bleakmarch $→$ $1$ Crimson ("The Bloodied Falcon’s Toll")</li>
	<li>$5$ Aetherspire $→$ $1$ Crimson ("Stardust to Blood" smuggling route)</li>
	<li>$3$ Emberveil $→$ $2$ Drowned ("Fire drowns in black waters")</li>
	<li>$3$ Bleakmarch $→$ $4$ Emberveil ("Bleaching the Pale Mark")</li>
</ul>

<p><b>Forbidden Technique</b>: The Argentum Revenant Tome allows you to exchange $2$ Drowned $→$ $3$ Bleakmarch ("Raising Drowned Silver") for a maximum of $X$ uses, after which the Pale Inquisition is triggered.</p>

<p>Given Lorenzo of Valtier’s initial coin stash and a limit of $X$ on the number of times the forbidden technique may be used, your goal is to maximize the number of Crimson Falconate coins that can be obtained using a series of exchanges. Solving this puzzle may unlock the secret behind how Lorenzo of Valtier became wealthy!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33660.%E2%80%85Coin%E2%80%85Exchange/6053366a.png" data-original-src="https://boja.mercury.kr/assets/problem/33660-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 313px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Echange Rates. (Coin images created by DALL·E-3)</p>

### 입력

<p>A line containing six integers: $A$ (Aetherspire Coin), $B$ (Bleakmarch Coin), $C$ (Crimson Coin), $D$ (Drowned Coin), $E$ (Emberveil Coin), $X$ (maximum use of the Forbidden Technique) satisfying $0≤A,B,C,D,E,X≤10^9$.</p>

### 출력

<p>A single integer indicating the number of maximum possible Crimson Coins that can be obtained using a series of zero or more of exchanges.</p>