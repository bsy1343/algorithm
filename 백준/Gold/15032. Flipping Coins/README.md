# [Gold IV] Flipping Coins - 15032

[문제 링크](https://www.acmicpc.net/problem/15032)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 43, 맞힌 사람: 42, 정답 비율: 87.500%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 확률론

### 문제 설명

<p>Here&rsquo;s a jolly and simple game: line up a row of N identical coins, all with the heads facing down onto the table and the tails upwards, and for exactly K times take one of the coins, toss it into the air, and replace it as it lands either heads-up or heads-down. You may keep all of the coins that are face-up by the end.</p>

<p>Being, as we established last year, a ruthless capitalist, you have resolved to play optimally to win as many coins as you can. Across all possible combinations of strategies and results, what is the maximum expected (mean average) amount you can win by playing optimally?</p>

### 입력

<ul>
	<li>One line containing two space-separated integers:
	<ul>
		<li>N (1 &le; N &le; 400), the number of coins at your mercy;</li>
		<li>K (1 &le; K &le; 400), the number of flips you must perform.</li>
	</ul>
	</li>
</ul>

### 출력

<p>Output the expected number of heads you could have at the end, as a real number. The output must be accurate to an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>