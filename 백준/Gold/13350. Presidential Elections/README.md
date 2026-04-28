# [Gold IV] Presidential Elections - 13350

[문제 링크](https://www.acmicpc.net/problem/13350)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 142, 정답: 64, 맞힌 사람: 54, 정답 비율: 49.091%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>In a few weeks time, a new president will be elected in the country of Marecia. There are&nbsp;two political parties: the Constituents and the Federals. Each party has one presidential&nbsp;candidate; one of these will become the new president.&nbsp;</p>

<p>This year you are more involved than ever before: you are the candidate for the Constituents!&nbsp;With only a few weeks to go, you decide to take stock of the situation. Instead of touring&nbsp;blindly through the country, you feel that it is better to focus your attention on certain&nbsp;particular states.</p>

<p>The Marecian electoral system is quite complicated. Every registered voter will vote for&nbsp;exactly one of the two candidates, but the totals are not calculated nationwide. Instead,&nbsp;every state has a fixed number of delegates. After the popular vote is in, the delegates from&nbsp;all states travel by foot to the capital of Marecia, the city of Ashwington. One final round of&nbsp;voting is done in Ashwington: every delegate gets to vote for one of the two candidates. A&nbsp;delegate is required by law to vote for the candidate who received the majority of the votes&nbsp;in his own home state.</p>

<p>Your campaign team has painstakingly compiled a very accurate list of voting preferences per&nbsp;state. Therefore you now have the following information about every state:</p>

<ul>
	<li>The number of voters who will definitely vote for the Constituents;</li>
	<li>The number of voters who will certainly vote for the Federals;</li>
	<li>The number of voters who have not made up their minds yet.</li>
</ul>

<p>Voters from the first two categories are not susceptible to any further campaigning, so your&nbsp;focus for the remaining weeks is on people of the third category. Specifically, you would like&nbsp;to know the minimum number of people you still have to convince in order to secure a victory.</p>

<p>If there is a tie on either state or national level, the law states that it is resolved in favour of&nbsp;the oldest of the two political parties, which unfortunately is the Federal party.</p>

### 입력

<p>The first line contains a single integer S, the number of states.</p>

<p>The following S lines each contain four integers D<sub>i</sub>, C<sub>i</sub>, F<sub>i</sub>, U<sub>i</sub>, where</p>

<ul>
	<li>D<sub>i</sub> denotes the number of delegates for the i-th state,</li>
	<li>C<sub>i</sub> denotes the number of registered voters in the i-th state who will definitely vote for&nbsp;the Constituents,</li>
	<li>F<sub>i </sub>denotes the number of registered voters in the i-th state who will certainly vote for&nbsp;the Federals,</li>
	<li>U<sub>i</sub> denotes the number of undecided voters in the i-th state.</li>
</ul>

<p>There are at most 2016 delegates in total, and the total number of registered voters is at most&nbsp;10<sup>9</sup>. Every state has at least one delegate and at least one registered voter. There is at least&nbsp;one state.</p>

### 출력

<p>Output one line with a single integer: the minimum number of voters you have to convince&nbsp;to secure a victory. If it is not possible for you to win the election, output &ldquo;impossible&rdquo;&nbsp;instead.</p>