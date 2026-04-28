# [Platinum III] Stones - 23066

[문제 링크](https://www.acmicpc.net/problem/23066)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 29, 맞힌 사람: 27, 정답 비율: 39.130%

### 분류

게임 이론, 그리디 알고리즘

### 문제 설명

<p>When Ankica finally caught Branko, he refused to buy her newspapers and demanded they should play a different game because the last one was rigged. Ankica <em>innocently</em> suggested another game involving stones, but Branko was rightly suspicious, and decided to completely change its rules.</p>

<p>The game involves $N$ piles of stones with the $i$-th pile having $a_i$ stones, and players take turns removing some number of stones from a pile. The player that removes the last stone wins the game.</p>

<p>The catch is that the pile from which a player must remove a certain number of stones in a particular turn is forced by the other player.</p>

<p>More precisely, with turns indexed by increasing integers starting from 1, the game proceeds as follows:</p>

<ul>
	<li><strong>The odd-numbered turns</strong> start by Branko pointing to a non-empty pile of stones. Ankica then proceeds to remove at least one (and at most all) stones from the said pile.</li>
	<li><strong>The even-numbered turns</strong> start by Ankica pointing to a non-empty pile of stones. Branko then proceeds to remove at least one (and at most all) stones from the said pile.</li>
</ul>

<p>Branko found a bunch of stones, formed some piles and they began playing. As a professional gamer, Ankica quickly realized that the starting configuration of stones is winning for her, i.e. that she can win no matter how Branko plays the rest of the game.</p>

<p>Could you win the game in Ankica&rsquo;s situation?</p>

### 입력



### 출력

