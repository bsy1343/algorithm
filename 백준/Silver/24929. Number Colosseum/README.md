# [Silver III] Number Colosseum - 24929

[문제 링크](https://www.acmicpc.net/problem/24929)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 43, 맞힌 사람: 39, 정답 비율: 51.316%

### 분류

구현, 자료 구조, 시뮬레이션, 스택

### 문제 설명

<p>Welcome to the Number Colosseum, where two teams of integers are preparing to battle! On the left side of the number line we have team&nbsp;<i>Negatives</i>&nbsp;while on the right side we have team&nbsp;<i>Positives</i>. Every integer fighting in the colosseum is on one of these two teams.</p>

<p>At the start of the battle, the contestants line up outside the colosseum. One by one, the contestants enter the colosseum and follow these rules:</p>

<ul>
	<li>If there are no contestants from the other team, this contestant will wait and become the most recent contestant to have entered the colosseum.</li>
	<li>If at least one contestant of the opposing team is in the colosseum, this contestant will fight the contestant on the opposing team who has most recently entered the colosseum. The winner of a fight between a negative integer and positive integer is the one with the highest absolute value. After a fight occurs, the value of the winner becomes the sum of two fighting integers while the loser leaves. Note that if the two integers have the same absolute value, they both lose and both leave. If there is a winner, they will continue fighting as long as there are more opposing contestants. Otherwise, they will wait.</li>
</ul>

<p>After all of the integers have entered the colosseum, only one team may be declared the winners of the Number Colosseum! Given the lineup of contestants for the upcoming battle, write a program to determine which team will triumph as well as the state of the colosseum after all fights have occurred.</p>

### 입력

<p>The first line contains a single integer $N$ ($1&le;N&le;5&sdot;10^5$), which is the number of contestants who will enter the colosseum. The second line contains the lineup of contestants. This will contain&nbsp;$N$&nbsp;space-separated integers&nbsp;$x_1,x_2, \dots ,x_N$&nbsp;($1&le;|x_i|&le;10^6$&nbsp;for each&nbsp;$1&le;i&le;N$), the value of the&nbsp;$i$th contestant entering the colosseum.</p>

### 출력

<p>Display the winning team with either&nbsp;<code>Positives win!</code>&nbsp;or&nbsp;<code>Negatives win!</code>. On the following line display the list of integers remaining in the colosseum after all fighting has finished. Display these integers in the order of arrival into the colosseum.</p>

<p>If neither team wins, display&nbsp;<code>Tie!</code>&nbsp;instead.</p>

### 힌트

<p>In Sample Input $1$,&nbsp;$N=4$ and the contestants have lined up in this order&nbsp;$[-3,-4,9,1]$.</p>

<ul>
	<li>First, contestant $-3$&nbsp;enters the colosseum which now contains&nbsp;$(-3)$.</li>
	<li>Next, contestant $-4$&nbsp;enters the colosseum which now contains&nbsp;$(-3,-4)$.</li>
	<li>Then,&nbsp;$9$&nbsp;enters and fights $-4$. Contestant&nbsp;$9$&nbsp;wins and becomes&nbsp;$5$&nbsp;while contestant $-4$&nbsp;loses and leaves. Then&nbsp;$5$&nbsp;fights $-3$, wins, and becomes&nbsp;$2$&nbsp;while $-3$&nbsp;loses and leaves. The colosseum now contains&nbsp;$(2)$.</li>
	<li>Finally,&nbsp;$1$&nbsp;enters the colosseum. The final state of the Colosseum is&nbsp;$(2,1)$&nbsp;and Positives win!</li>
</ul>