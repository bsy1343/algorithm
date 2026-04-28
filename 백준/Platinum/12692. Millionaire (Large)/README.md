# [Platinum II] Millionaire (Large) - 12692

[문제 링크](https://www.acmicpc.net/problem/12692)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 47, 맞힌 사람: 23, 정답 비율: 18.400%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>You have been invited to the popular TV show &quot;Would you like to be a millionaire?&quot;. Of course you would!</p>

<p>The rules of the show are simple:</p>

<ul>
	<li>Before the game starts, the host spins a wheel of fortune to determine <strong>P</strong>, the probability of winning each bet.</li>
	<li>You start out with some money: <strong>X</strong> dollars.</li>
	<li>There are <strong>M</strong> rounds of betting. In each round, you can bet any part of your current money, including none of it or all of it. The amount is not limited to whole dollars or whole cents.
	<p>If you win the bet, your total amount of money increases by the amount you bet. Otherwise, your amount of money decreases by the amount you bet.</p>
	</li>
	<li>After all the rounds of betting are done, you get to keep your winnings (this time the amount is rounded down to whole dollars) only if you have accumulated \$1000000 or more. Otherwise you get nothing.</li>
</ul>

<p>Given <strong>M</strong>, <strong>P</strong> and <strong>X</strong>, determine your probability of winning at least \$1000000 if you play optimally (i.e. you play so that you maximize your chances of becoming a millionaire).</p>

### 입력

<p>The first line of input gives the number of cases, <strong>N</strong>.</p>

<p>Each of the following <strong>N</strong> lines has the format &quot;<strong>M</strong> <strong>P</strong> <strong>X</strong>&quot;, where:</p>

<ul>
	<li><strong>M</strong> is an integer, the number of rounds of betting.</li>
	<li><strong>P</strong> is a real number, the probability of winning each round.</li>
	<li><strong>X</strong> is an integer, the starting number of dollars.</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>N</strong> &le; 100</li>
	<li>0 &le; <strong>P</strong> &le; 1.0, there will be at most 6 digits after the decimal point.</li>
	<li>1 &le; <strong>X</strong> &le; 1000000</li>
	<li>1 &le; <strong>M</strong> &le; 15</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>X</strong>: <strong>Y</strong>&quot;, where:</p>

<ul>
	<li><strong>X</strong> is the test case number, beginning at 1.</li>
	<li><strong>Y</strong> is the probability of becoming a millionaire, between 0 and 1.</li>
</ul>

<p>Answers with a relative or absolute error of at most 10<sup>-6</sup> will be considered correct.</p>

### 힌트

<p>In the first case, the only way to reach \$1000000 is to bet everything in the single round.  In the second case, you can play so that you can still reach \$1000000 even if you lose a bet. Here&#39;s one way to do it:</p>

<ul>
	<li>You have \$600000 on the first round. Bet \$150000.</li>
	<li>If you lose the first round, you have \$450000 left. Bet \$100000.</li>
	<li>If you lose the first round and win the second round, you have \$550000 left. Bet \$450000.</li>
	<li>If you win the first round, you have \$750000 left. Bet \$250000.</li>
	<li>If you win the first round and lose the second round, you have \$500000 left. Bet \$500000.</li>
</ul>