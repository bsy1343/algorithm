# [Platinum II] Lucky Draw - 17793

[문제 링크](https://www.acmicpc.net/problem/17793)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 65, 맞힌 사람: 53, 정답 비율: 47.321%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>You and your friends at the Betting against All Probability Club are visiting a casino where the following game is played.</p>

<p>Each of the n players starts with k lives and puts in a fixed amount of money. In each round of the game, each player flips a biased coin and loses a life if she gets tails. The game ends when only one player remains, in which case this person wins, or ends in a draw if all remaining players lose their last life in the same round. If there is a winner, she wins n times her original bet. In case of a draw, no one wins anything.</p>

<p>Being a BAPC member you quickly realize the casino has an edge here: whenever the game ends in a draw all of the contestants lose the money they bet. You are now wondering what exactly is the probability that this game ends in a draw, so you can figure out how much the casino profits on average.</p>

### 입력

<ul>
	<li>One line containing two integers, 2 &le; n &le; 50, the number of players, 1 &le; k &le; 50, the number of lives each player has, and a floating point number 0.1 &le; p &le; 0.9, the probability the coin lands heads.</li>
</ul>

### 출력

<ul>
	<li>Output a single floating point number: the probability of the game ending in a draw. Your answer should have an absolute error of at most 10<sup>&minus;6</sup>.</li>
</ul>