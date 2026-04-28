# [Bronze III] Provinces and Gold - 24803

[문제 링크](https://www.acmicpc.net/problem/24803)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 354, 정답: 265, 맞힌 사람: 232, 정답 비율: 78.114%

### 분류

수학, 구현, 사칙연산, 많은 조건 분기

### 문제 설명

<p>Jake is learning how to play the card game Dominion. In Dominion, you can buy a variety of treasure, action, and victory point cards - at the end of the game, the player with the most victory points wins!</p>

<p>Each turn, each player draws 5 cards and can use their action and treasure cards to obtain buying power in order to buy more cards. Since Jake is just starting out, he&#39;s decided to buy only treasure and victory point cards.</p>

<p>This means the cards he can buy are:</p>

<ul>
	<li>Province (costs $8$, worth $6$ victory points)</li>
	<li>Duchy (costs $5$, worth $3$ victory points)</li>
	<li>Estate (costs $2$, worth $1$ victory point)</li>
</ul>

<p>And, there are $3$ kinds of treasure cards:</p>

<ul>
	<li>Gold (costs $6$, worth $3$ buying power)</li>
	<li>Silver (costs $3$, worth $2$ buying power)</li>
	<li>Copper (costs $0$, worth $1$ buying power)</li>
</ul>

<p>At the start of Jake&#39;s turn, he draws $5$ of these cards. Given the number of Golds, Silvers, and Coppers in Jake&#39;s hand, calculate the best victory card and best treasure card he could buy that turn. Note that Jake can buy only one card.</p>

### 입력

<p>The input consists of a single test case on a single line, which contains three non-negative integers $G$, $S$, $C$ ($G + S + C \le 5$) indicating the number of Golds, Silvers, and Coppers Jake draws in his hand.</p>

### 출력

<p>Output the best victory card and the best treasure card Jake can buy this turn, separated with <code>&quot; or &quot;</code>, in this order. If Jake cannot afford any victory cards, output only the best treasure card he can buy.</p>

### 힌트

<p>In Sample Input 1, Jake has $1$ Silver in his hand, which means he has $2$ buying power. This would allow him to either buy an Estate or a Copper.</p>