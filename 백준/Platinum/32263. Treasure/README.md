# [Platinum IV] Treasure - 32263

[문제 링크](https://www.acmicpc.net/problem/32263)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 40.000%

### 분류

자료 구조, 정렬, 애드 혹, 세그먼트 트리

### 문제 설명

<p>A long time ago, Horus and Seth fought over who would succeed Osiris as King. Their contention was judged by Raa, who gave them a series of challenges to determine who is more worthy of the throne. Horus managed to win all of the challenges, but Raa is still not sure if Horus is qualified to rule over Egypt because of his young age. So Raa decided to give Horus one final challenge to prove his strength and settle this fight once and for all.</p>

<p>The final challenge for Horus is to collect $N$ treasure chests numbered from $0$ to $N - 1$ spread all over Egypt. The locations of the chests are given to Horus as points in the $2$-dimensional plane and are pairwise distinct. Specifically, the location of chest $i$ ($0 &le; i &lt; N$) is a point $(X[i], Y [i])$, where both $X[i]$ and $Y [i]$ are integers between $0$ and $5 \cdot 10^8$, inclusive.</p>

<p>Horus is going to record the locations of the chests by taking notes in his papyrus notebook. Each sheet of this notebook can store a single non-negative integer not greater than $2 \cdot 10^9$. Sadly, Seth is going to shuffle the notebook sheets after Horus takes all the notes in his notebook.</p>

<p>Your task is to help Horus by implementing two procedures that would:</p>

<ul>
	<li>record the locations of the chests by writing numbers on the notebook sheets,</li>
	<li>recover the locations of the chests, given the notebook sheets in an arbitrary order.</li>
</ul>

<p>Note that your score in this task depends on the number of sheets used, that is, the number of numbers written in the notebook.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; T &le; 100$</li>
	<li>$1 &le; N &le; 40\, 000$</li>
	<li>$0 &le; X[i] &le; 5 \cdot 10^8$ ($0 &le; i &lt; N$)</li>
	<li>$0 &le; Y [i] &le; 5 \cdot 10^8$ ($0 &le; i &lt; N$)</li>
	<li>No two chests have the same location.</li>
	<li>The total number of chests in all scenarios does not exceed $2 \cdot 10^5$.</li>
	<li>Array $S$ is a permutation of $E$.</li>
</ul>