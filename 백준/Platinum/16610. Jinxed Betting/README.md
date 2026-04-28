# [Platinum II] Jinxed Betting - 16610

[문제 링크](https://www.acmicpc.net/problem/16610)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 42, 맞힌 사람: 42, 정답 비율: 32.558%

### 분류

구현, 수학, 시뮬레이션

### 문제 설명

<p>Julia is betting on a large sporting competition involving matches between pairs of teams. There are no parallel matches and each bettor receives one point for every correct bet they make. Julia had a good streak and is in the lead. Now she worries that her good luck may be turning, and decides to change her strategy.</p>

<p>She collaborates with a betting shop owner who tells her the bets made by everyone else. Whenever Julia makes a bet, she first checks the bets of all bettors with the most points so far (except herself of course) and then chooses the same team as the majority. In the case of a tie, she bets on her favourite of the two teams in the game.</p>

<p>Julia wants to know for how many more matches she is guaranteed to stay in the lead in the worst case (i.e., no matter what bets the others make or what the outcomes of the games are). For this problem we consider Julia to be in the lead if there is no other bettor that has strictly more points than her.</p>

<p>For example, suppose as in Sample Input 1 that Julia initially has three points, and there are two other bettors with three and two points respectively. For the first match, she will make the same bet as the other bettor with three points. If this person bets on the losing team and the other bets on the winning team all players have an equal score of three points. If for the next match the other two persons bet on different teams, Julia places the bet on her favourite, which of course may lose. Thus after two more matches she might lose the lead.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer n (3 &le; n &le; 10<sup>5</sup>), the number of people who place their bets.</li>
	<li>One line with n integers p<sub>1</sub>, . . . , p<sub>n</sub> (0 &le; p<sub>i</sub> &le; 10<sup>16</sup> for each i), the points of all people who play the betting game. The first of these numbers corresponds to the score of Julia. You may assume that no other score exceeds Julia&rsquo;s score in the beginning.</li>
</ul>

### 출력

<p>Output the number of matches for which Julia is guaranteed to stay in the lead.</p>