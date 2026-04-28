# [Gold IV] Another Rock-Paper-Scissors Problem - 7628

[문제 링크](https://www.acmicpc.net/problem/7628)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 33, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

수학, 애드 혹

### 문제 설명

<p>Sonny uses a very peculiar pattern when it comes to playing rock-paper-scissors. He likes to vary his moves so that his opponent can&rsquo;t beat him with his own strategy.</p>

<p>Sonny will play rock (R) on his first game, followed by paper (P) and scissors (S) for his second and third games, respectively. But what if someone else is using the same strategy? To thwart those opponents, he&rsquo;ll then play paper to beat rock, scissors to beat paper, and rock to beat scissors, in that order, for his 4th through 6th games. After that, he&rsquo;ll play scissors, rock, and paper for games 7&ndash;9 to beat anyone copying his last set of moves. Now we&rsquo;re back to the original order&mdash;rock, paper, scissors&mdash;but instead of being predictable and using the same moves, do you know what would be better? You guessed it! Sonny then plays the sequence of moves that would beat anyone trying to copy his whole strategy from his first move, and on it goes... To recap, in symbolic form, Sonny&rsquo;s rock-paper-scissors moves look like this:</p>

<pre>
R P S PSR SRP PSRSRPRPS SRPRPSPSR PSRSRPRPSSRPRPSPSRRPSPSRSRP ...</pre>

<p>The spaces are present only to help show Sonny&rsquo;s playing pattern and do not alter what move he&rsquo;ll play on a certain game.</p>

<p>Naturally, your job is to beat Sonny at his own game! If you know the number of the game that you&rsquo;ll be playing against Sonny, can you figure out what move you would need to play in order to beat him?</p>

### 입력

<p>Each line of the input contains a single integer N, 1 &le; N &le; 10<sup>12</sup>, the number of the game you&rsquo;ll be playing against Sonny. An integer N = 1 indicates it would be Sonny&rsquo;s first game, N = 7 indicates it would be the 7th game, and so forth. The input terminates with a line with N = 0.</p>

<p>Warning: N may be large enough to overflow a 32-bit integer, so be sure to use a larger data type (i.e. long in Java or long long in C/C++) in your program.</p>

### 출력

<p>For each test case, output a single line which contains the letter corresponding to the move you would need to play to beat Sonny on that game.</p>