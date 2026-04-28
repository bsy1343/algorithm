# [Platinum III] Final Standings - 18059

[문제 링크](https://www.acmicpc.net/problem/18059)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 16, 맞힌 사람: 15, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>The GCPC 2019 is finally over. You have worked for five hours and have solved as many problems as possible. However, you still do not know which place you have got, since the scoreboard is still frozen. Of course you think that you and your team have won GCPC 2019.</p>

<p>As there is always a lengthy pause between the end of the contest and unfreezing the scoreboards (someone has to print the certificates and someone has to re-compile the solution slides), you want to use your time to determine how probable it is that your team has won GCPC 2019.</p>

<p>You know the final scoreboard, that is, for all teams which problems they have solved prior to the freeze and which problems they have attempted during the freeze. Also you know from last year how good each team is and you trust your own estimates of each problem&rsquo;s difficulty. To be precise, if a team with strength s &isin; [0, 1] has attempted to solve a problem with difficulty d &isin; [0, 1], you assume that the probability of solving the problem is s &middot; d.</p>

<p>As your team was very quick in solving the simple problems this year, you assume that a team can only have a higher place than you, if they have solved more problems (you assume that you will always win the tie-break).</p>

### 입력

<ul>
	<li>The first line of input contains two integers t and p (1 &le; t, p &le; 100), the number of teams and the number of problems in the contest. The teams are numbered 1 to t and the problems are numbered 1 to p. Your team is team t.</li>
	<li>The second line contains t &minus; 1 real numbers s<sub>1</sub>, . . . , s<sub>t&minus;1</sub> (0 &le; si &le; 1 for each i), where si is the strength of team i.</li>
	<li>The third line contains p real numbers d<sub>1</sub>, . . . , d<sub>p</sub> (0 &le; d<sub>j</sub> &le; 1 for each j), where d<sub>j</sub> is the difficulty of problem j.</li>
	<li>Then follow t &minus; 1 lines describing the state of the problems for the other teams. Every such line contains p characters c<sub>1</sub>, . . . , c<sub>p</sub>, where c<sub>j</sub> in the ith line describes the state of problem j for team i and is X if the team has solved the problem before the freeze, ? if the team submitted a program for this problem after the freeze, and - otherwise.</li>
	<li>The last line of input describes the problems your team solved with p characters, each being either X or -.</li>
</ul>

<p>All real numbers in the input have at most six decimals.</p>

### 출력

<p>Output a single real number, the probability that your team won GCPC 2019. Your answer should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>