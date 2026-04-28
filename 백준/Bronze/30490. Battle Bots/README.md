# [Bronze II] Battle Bots - 30490

[문제 링크](https://www.acmicpc.net/problem/30490)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 284, 정답: 122, 맞힌 사람: 103, 정답 비율: 43.644%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>You are participating in the Battle-bots Aggressive Power Contest. It is a tournament where each team builds a robot that can battle with other robots, and you win by destroying your opponent&#39;s robot. Specifically, you win when your opponent&#39;s robot stops moving after its only motor is destroyed.</p>

<p>You have outfitted your bot with two weapons: it has a sword that can slash the opponent&#39;s bot in half, and it has a claw that can take a chunk out of your opponent&#39;s bot and crush it into scrap. The attacks take equally long. The program that controls your bot is always running to decide which attack to use next.</p>

<p>If your battle-bot uses the sword attack to cut its opponent in half, the half with the motor will keep moving, and you can ignore the other half. If your battle-bot uses the claw attack, it will take a chunk of size $1$ out of the opponent&#39;s bot, but unless you can take the bot out entirely you have to assume that the motor of the bot is in the piece you have not clawed, and keep fighting.</p>

<p>For example, consider the second sample case. If your opponent&#39;s bot is so big it would take $5$ claw attacks to completely crush it, you could act as follows. Start with a sword slash, cutting it down into two pieces of size $2\frac12$. Then use your claw on the part that is still moving, so it goes down to size $1\frac12$. Cut that piece in half with your sword again to bring it down to size $\frac34$. Then finally use your claw to crush the last moving piece of the bot. That way, you can beat it in four attacks.</p>

<p>Your bot is equipped with a quantum computer that can easily simulate a googol attack patterns per microsecond. However, if it does not know what the fastest attack pattern is, it will never know it has reached that, and never stop searching.</p>

<p>Finish your battle bot by writing a program that, given how many claw attacks it would take to take out the opponent, determines the minimal number of attacks you need in the worst case to take it out.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 10^{18}$), the number of claw attacks it would take to take out your opponent&#39;s bot.</li>
</ul>

### 출력

<p>Output the least number of attacks needed to destroy your opponent&#39;s bot.</p>