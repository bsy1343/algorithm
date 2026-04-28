# [Platinum V] Rock Paper Scissors - 23009

[문제 링크](https://www.acmicpc.net/problem/23009)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 23, 정답: 10, 맞힌 사람: 10, 정답 비율: 43.478%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>You and your friend like to play&nbsp;<a href="https://en.wikipedia.org/wiki/Rock_paper_scissors">Rock Paper Scissors</a>. Each day you play exactly $60$&nbsp;rounds and at the end of each day, you tally up the score from these&nbsp;$60$&nbsp;rounds.</p>

<p>During each round, without any knowledge of the other person&#39;s choice, you each make your choice. Then, you both reveal the choice you made and determine your score. Rock wins over Scissors, Scissors wins over Paper, and Paper wins over Rock. Let&nbsp;<code>R</code>&nbsp;represent Rock,&nbsp;<code>P</code>&nbsp;represent Paper, and&nbsp;<code>S</code>&nbsp;represent Scissors. Every day you both agree on values&nbsp;$W$&nbsp;and&nbsp;$E$. If your choice wins, you get&nbsp;$W$&nbsp;points. If you and your friend both pick the same choice, you get&nbsp;$E$&nbsp;points. If your choice loses, you get nothing.</p>

<p>By accident, you see your friend&#39;s strategy written in an open notebook on a desk one day. Your friend keeps track of how many times you have chosen&nbsp;<code>R</code>,&nbsp;<code>P</code>, and&nbsp;<code>S</code>&nbsp;so far during one day. Let&nbsp;$A_i$&nbsp;be your choice of&nbsp;<code>R</code>,&nbsp;<code>P</code>, or&nbsp;<code>S</code>&nbsp;on round&nbsp;$i$, while&nbsp;$B_i$&nbsp;is your friend&#39;s choice on the same round. Let&nbsp;$r_i$&nbsp;be the number of times&nbsp;$A_j=$&nbsp;<code>R</code>&nbsp;for&nbsp;$1 \le j \le (i - 1)$. Similarly, let&nbsp;$p_i$&nbsp;and&nbsp;$s_i$&nbsp;be the total number of times you have chosen&nbsp;<code>P</code>&nbsp;and&nbsp;<code>S</code>, respectively, prior to round&nbsp;$i$.</p>

<p>On round&nbsp;$1$&nbsp;of each day,&nbsp;$i=1$&nbsp;and&nbsp;$r_1=s_1=p_1=0$, and your friend plays randomly due to the lack of information (i.e. your friend chooses each option with probablity $1/3$). On every subsequent round, your friend decides&nbsp;$B_i$&nbsp;by choosing&nbsp;<code>R</code>&nbsp;with probability&nbsp;$Pr[$<code>R</code>$]=s_i/(i-1)$,&nbsp;<code>P</code>&nbsp;with probability&nbsp;$Pr[$<code>P</code>$]=r_i/(i-1)$, and&nbsp;<code>S</code>&nbsp;with probability&nbsp;$Pr[$<code>S</code>$]=p_i/(i-1)$. This strategy is adaptive and tough to beat!</p>

<p>You are going on vacation for the next&nbsp;$T$&nbsp;days. You must leave your assistant with instructions on what choice to pick each round each day. Let integer&nbsp;$X$&nbsp;be the average reward you are aiming for in this game after&nbsp;$T$&nbsp;days. Given&nbsp;$W$&nbsp;and&nbsp;$E$&nbsp;(different values for different days), provide your instructions as a string of&nbsp;$60$&nbsp;characters, ordered from round&nbsp;$1$&nbsp;to round $60$. Each character represents your choice for the corresponding round. Your goal is to choose your set of instructions so that the average&nbsp;<a href="https://en.wikipedia.org/wiki/Expected_value">expected value</a>&nbsp;of the reward across all the days of your gameplay is at least&nbsp;$X$. Note that you can choose different instructions for different values of&nbsp;$W$&nbsp;and&nbsp;$E$.</p>

### 입력

<p>The first line of the input gives the number of days,&nbsp;$T$. The second line contains an integer&nbsp;$X$, your targeted average reward after these&nbsp;$T$&nbsp;days. Then the description of&nbsp;$T$&nbsp;days follows. Each day is described as two integers&nbsp;$W$&nbsp;and&nbsp;$E$.&nbsp;$W$&nbsp;is how much you get if your choice wins for each round that day.&nbsp;$E$&nbsp;is how much you get for each round when your choice is the same as your friend&#39;s choice.</p>

<p>All the tests (except the sample test below) are generated as follows. We choose&nbsp;$50$&nbsp;different values&nbsp;$G$&nbsp;between&nbsp;$5$&nbsp;and&nbsp;$95$&nbsp;(with uniform distribution). Then for each of these values, there will be&nbsp;$4$&nbsp;days, with&nbsp;$W$&nbsp;equal to&nbsp;$10 \times G$&nbsp;and&nbsp;$E$&nbsp;equal to&nbsp;$W$, $\frac{W}{2}$, $\frac{W}{10}$, and $0$. Do not assume anything about the order of these days.</p>

### 출력

<p>For each day, output one line containing&nbsp;<code>Case #x:&nbsp;A<sub>1</sub>A<sub>2</sub>&hellip;A<sub>60</sub></code>, where $x$ is the day number (starting from 1) and&nbsp;$A_i$&nbsp;is your choice of&nbsp;<code>R</code>,&nbsp;<code>P</code>, or&nbsp;<code>S</code>&nbsp;on the&nbsp;$i$-th round of the game. There should be no spaces between the choices.</p>

<p>The list of choices should result in an expected value that is greater than or equal to&nbsp;$X$&nbsp;on average after&nbsp;$T$&nbsp;days. There may be multiple solutions for a test case. If so, you may output any one of them. It is guaranteed that for given&nbsp;$X$&nbsp;a solution exists.</p>

### 제한

<ul>
	<li>$T=200$&nbsp;(for all tests except the sample where&nbsp;$T=2$).</li>
	<li>$50 \le W \le 950$.</li>
	<li>$0 \le E \le W$&nbsp;and&nbsp;$E$&nbsp;is one of&nbsp;$W$, $\frac{W}{2}$, $\frac{W}{10}$, or $0$.</li>
	<li>Each day you play exactly 60 rounds.</li>
</ul>

### 힌트

<p>In this sample test our targeted (average) reward across all $T=2$&nbsp;days is&nbsp;$30$.</p>

<p>For the first day, since&nbsp;$W=60$, you can reach the total target by winning at least once. One possible strategy is to just get to that single win.</p>

<ul>
	<li>On round&nbsp;$1$, you choose&nbsp;$A_1=$&nbsp;<code>R</code>. You have an equal chance of a win, a tie, or a loss, giving you an expected value of&nbsp;$20$.</li>
	<li>On round&nbsp;$2$, $r_2=1$&nbsp;and&nbsp;$p_2=s_2=0$. Your friend&#39;s probability of choosing&nbsp;<code>P</code>&nbsp;is&nbsp;$Pr[$<code>P</code>$]=r_2/1=1$, which guarantees your friend&#39;s choice&nbsp;$B_2=$&nbsp;<code>P</code>.</li>
	<li>If you choose&nbsp;$A_2=$&nbsp;<code>S</code>, you are guaranteed a win, giving you a score of&nbsp;$60$&nbsp;for round&nbsp;$2$.</li>
	<li>Regardless of what you choose for all following rounds in the game, your expected value after just two rounds is&nbsp;$20+60=80$, which is enough to reach our target.</li>
</ul>

<p>Moreover, as we already will have the average across all 2 days at least&nbsp;$\frac{80}{2}=40 \ge X=30$, for the second day we can use any strategy.</p>

<p>Note that this is not a unique solution. As long as the average expected score is&nbsp;$\ge 30$, other outputs would also be accepted.</p>