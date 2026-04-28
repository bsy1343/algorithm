# [Gold III] Combat Odds - 11137

[문제 링크](https://www.acmicpc.net/problem/11137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 63, 정답: 26, 맞힌 사람: 21, 정답 비율: 44.681%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>On internet forums for games, you&rsquo;ll always have a bunch of guys complaining about how they&rsquo;re losing. It&rsquo;s always something wrong with the game. Lack of realism and cheating AI is among the top choices. Sadly, it&rsquo;s mostly just lacking skills. To the rest of us, this becomes an everlasting quest to show them how wrong they are!</p>

<p>The latest in the never ending series is a guy claiming that the computer cheats in his newest game. Even though a 70% probability of winning is reported for a battle, he still loses! He is quickly shot down by our army of knowit-alls, but another guy rushes to his support. Even though you can lose a single battle at these odds, he has observed 5 such losses in a row! The probability of that is (1 &minus; 0.7)<sup>5</sup> = 0.00243. Too low to be possible, he claims! Being such an honorable know-it-all, you explain how that might be true if those 5 battles were the only events overall, but throughout a whole game there are a lot more battles than that. The probability of observing such a streak is much larger! To back up your statement, you decide to calculate such probabilities.</p>

<p>A battle has two outcomes, win or lose. The probability of winning is given by p. Given that you simulate N battles, what is the probability of witnessing a losing streak of at least L battles?</p>

### 입력

<p>The first line of input contains a single number T, the number of test cases to follow. Each test case consists of one line containing the three numbers N, L and p, separated by whitespace.</p>

<ul>
	<li>0 &lt; T &le; 200</li>
	<li>0 &le; p &le; 1.0</li>
	<li>0 &lt; N &le; 2000</li>
	<li>0 &lt; L &le; N</li>
	<li>The game in question is Civilization IV. You can assume that this game has a perfect random number generator, and that all battle outcomes are independent.</li>
	<li>An absolute or relative error of up to 10<sup>&minus;7</sup> compared to the correct answer will be accepted.</li>
</ul>

### 출력

<p>For each test case, output a line containing a single floating-point number, the probability of witnessing a losing streak of at least L battles.</p>