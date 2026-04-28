# [Gold II] Number Game - 7654

[문제 링크](https://www.acmicpc.net/problem/7654)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 23, 맞힌 사람: 18, 정답 비율: 30.000%

### 분류

수학, 애드 혹, 게임 이론

### 문제 설명

<p>Carl and Ellie are in the midst of another adventure; this time, it is a road trip through Canada! They&rsquo;ve just arrived in Saskatchewan [insert rectangular shape here], right in the middle of the Canadian prairies, and, to their horror, have discovered that all the rumours about it being dreadfully flat are true. Suddenly, the warnings their Canadian friends gave them prior to the trip spring back to mind, such as:</p>

<p>It&rsquo;s so flat, a boy can watch his dog run away!</p>

<p>Or:</p>

<p>It&rsquo;s so flat, it&rsquo;s impossible to jump to your death!</p>

<p>As the driver, Carl is worried about falling asleep at the wheel and has decided to come up with a game to relieve the boredom. As a conscientious driver, he doesn&rsquo;t want the game to be too distracting&mdash;the roads here are unerringly straight, so it&rsquo;s easy to lose track of motion&mdash;so the rules are simple:</p>

<ul>
	<li>Carl picks a number, N, between 1 and 1, 000, 000, 000.</li>
	<li>Carl and Ellie take turns subtracting an integer (between 1 and 20) from N. Carl plays first, and the winner is the one who subtracts off a number to get 0.</li>
</ul>

<p>For example, suppose Carl picks the number 50. He subtracts off the number 5, leaving 45. Ellie subtracts off 17, leaving 28. Carl subtracts off 8, leaving 20. Finally, Ellie subtracts off 20, leaving 0, and wins!</p>

<p>Frankly, Ellie would rather sleep than play this game, so she has reprogrammed the GPS (which isn&rsquo;t necessary in this region, anyway) to play for her instead. Her method of choosing a number is straightforward:</p>

<ul>
	<li>If on a given turn, the number remaining is 20 or less, then she picks that number and wins.</li>
	<li>Otherwise, her choice of number is completely determined by the number Carl just picked, as follows. Before the game starts, Ellie chooses 20 random numbers, 1 &le; a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, . . . , a<sub>20</sub> &le; 20. Then whenever Carl subtracts off the number k, Ellie responds by subtracting off the number ak (unless she can win).</li>
</ul>

<p>Carl needs your help! To help stay motivated playing this game, he would like to know if there exists a winning strategy for him, given the numbers N and a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, . . . , a<sub>20</sub>.</p>

### 입력

<p>Each input case begins with the number N on a line by itself; the next line contains the numbers a1, a2, . . . , a20, separated by spaces. Input terminates with a line containing 0.</p>

### 출력

<p>For each test case, print &ldquo;Carl can win&rdquo; or &ldquo;Carl can&rsquo;t win&rdquo;.</p>

### 힌트

<p>In this example, since Carl chooses N to be 42, it turns out that he has no winning strategy. (Indeed, whichever number he initially subtracts off, Ellie will subtract off a number leaving 21 for Carl. Then whatever number Carl subtracts off next, Ellie will be left with a number between 1 and 20, and she wins!)</p>