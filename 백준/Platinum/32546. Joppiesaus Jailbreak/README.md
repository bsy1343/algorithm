# [Platinum III] Joppiesaus Jailbreak - 32546

[문제 링크](https://www.acmicpc.net/problem/32546)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 10, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

수학

### 문제 설명

<p>You have recently decided to pick up speedrunning the video game <em>Bario:\ A Plumber's Cousin</em>. In this 2D platforming console classic, you play as Bario, an Italian electrician travelling the world to find his long lost cousin. The game consists of a number of side-scrolling levels with a bus at the end that takes Bario to the next level. Unfortunately, years of optimizations have led to a world record that is currently tied between hundreds of speedrunners and you feel like matching the world record at this point is no longer that big of an achievement. Instead, you try to beat the tied world record by any means necessary.</p>

<p>At first, this seems impossible: Bario has a maximum right speed of $1000$ pixels per second, and the current strategies already hold this speed through the entire level. However, completing a level always takes an integer number of frames. If Bario reaches the bus halfway through a frame, the game still has to wait for the frame to complete before starting the next level. Normally, this does not influence speedrunning, as each console runs the game at the same, constant frame rate $f$. That is, unless you apply a specific condiment mix to the game disk. You would prefer not to go into detail as to how you know this, but applying a specific mix of mayonnaise and curry spices (more commonly known as the Dutch specialty Joppiesaus) to the game disk allows you to set the frame rate of the game to any positive real number. This new frame rate cannot exceed the original frame rate $f$ and remains constant for the entire game. Using your new strategy, what is the fastest time in which you can finish the game? The timing stops when the final frame ends.</p>

<p>For example, consider the third sample input. By modifying the game to run at $\frac{3000}{1249}$ frames per second, both levels complete in $15$ frames, or $6.245$ seconds. The total time of $12.49$ seconds beats the current world record of $12.6$ seconds at the original $10$ frames per second.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $f$ ($1 \leq n \leq 10^5$, $1 \leq f \leq 10^3$), the number of levels and the original frame rate of the game in frames per second.</li>
	<li>One line with $n$ integers $\ell$ ($1 \leq \ell \leq 10^6$), the length of each level in pixels. The total length of all levels does not exceed $10^6$ pixels.</li>
</ul>

### 출력

<p>Output the fastest time, in seconds, in which you can finish the game.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>