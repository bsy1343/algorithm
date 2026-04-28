# [Platinum V] Guessing Primes - 25986

[문제 링크](https://www.acmicpc.net/problem/25986)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 141, 정답: 17, 맞힌 사람: 16, 정답 비율: 14.679%

### 분류

수학, 구현, 브루트포스 알고리즘, 정수론, 시뮬레이션, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Your friends are all on board with the hype of a popular game, where you need to guess a five-letter word in six tries. Unfortunately, your language skills are not the greatest, so this game is not really your cup of tea. However, your mathematics skills greatly outmatch your friends&#39;, so you start playing a game called &quot;Brave Alternative Primes Challenge&quot; (Original at <a href="https://converged.yt/primel/">https://converged.yt/primel/</a>.) instead. In order to show off your skills to your friends, you decide to write a program that will always beat the game.</p>

<p>In this game, you need to guess a secret prime number of five digits (i.e., between $10^4$ and $10^5$) in six turns. After guessing a prime number, you will receive a response consisting of five characters, each corresponding to a single digit in your guess:</p>

<ul>
	<li>&quot;<code>g</code>&quot; (green) means you guessed the corresponding digit correctly;</li>
	<li>&quot;<code>y</code>&quot; (yellow) means that the digit is present in a position that is not yet green, but not at this position;</li>
	<li>&quot;<code>w</code>&quot; (white) means that this digit is neither green nor yellow.</li>
</ul>

<p>Note that the interactor colours at most one of your guessed digits per digit in the secret answer. If your guess includes more occurrences of a digit than the answer, only some of them will be green or yellow.</p>

<p>You win the game when the response is green for all five digits.</p>

### 입력



### 출력

