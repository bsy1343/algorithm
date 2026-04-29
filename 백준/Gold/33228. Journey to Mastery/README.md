# [Gold V] Journey to Mastery - 33228

[문제 링크](https://www.acmicpc.net/problem/33228)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

구현, 많은 조건 분기, 시뮬레이션, 해 구성하기

### 문제 설명

<p>Your best friend Ken has really gotten into the new Street fighter game (Ultra Ultimate Street Fighter 2 Turbo Championship Edition DX+ \&amp; Knuckles). Unfortunately, he is not very good yet, especially on defence, and really wants to attend the Fighting Pro Cup (FPC) in a few months. To get better, he has set up a training mode room where he can set a dummy computer player to fight him one on one using a specific set of actions. Reyn's goal is to consistently hit the training mode dummy without getting hit. To give him an example for how to always play optimally under these particular circumstances, you have decided to write a program that, provided with any computer player actions, always hits the dummy with an attack first.</p>

<p>The fight starts with the player and the dummy $n$ spaces away from each other. They then proceed to take turns taking actions at a regular interval of $1$ unit of time (the dummy takes an action, then the player takes an action $1$ unit of time later, followed by the dummy taking an action $1$ unit of time after that). The completion of every action takes two units of time, <em>but some moves have an additional cooldown of $\mathit{2</em>$ or $\mathit{4}$ units of time after the move is finished}, in which no action can be taken, effectively "skipping" the user's next move(s). The player and the dummy both have a predetermined set of actions to choose from, detailed below:</p>

<p>Training Mode Dummy:</p>

<ul>
	<li><strong>Walk Forward</strong> ("<code>W</code>")

	<ul>
		<li>The user slowly moves a single space toward the opponent. If this action is performed when already $1$ space away from the opponent, it does nothing.</li>
	</ul>
	</li>
	<li><strong>Jump Forward and Kick</strong> ("<code>J</code>")
	<ul>
		<li>The user makes a swift leap, moving $2$ spaces towards the opponent, then performs a kick $1$ unit of time after the action has been initiated. Since the user is in the air, the jump is able to avoid any "Hadouken" attacks for the duration of the action. If the opponent is $1$ space away, after the leap, the kick attack will connect and end the game. If before the start of the action, players are $1$ unit away, the dummy will jump over the player and be $1$ space away on the other side (functionally, the side does not matter). If the players is $2$ spaces away, the jump will only travel $1$ space and end up $1$ space from the player.</li>
	</ul>
	</li>
	<li><strong>Grounded Kick</strong> ("<code>K</code>")
	<ul>
		<li>The user performs a kick attack that hits the opponent if they are up to $2$ spaces away, ending the game if it connects. The kick comes out $1$ unit of time after the attack has been selected and lasts for the next $1$ unit of time. Has a cooldown of $2$ units of time after being used.</li>
	</ul>
	</li>
	<li><strong>Hadouken</strong> ("<code>H</code>")
	<ul>
		<li>A blue fireball that fires immediately, after which it begins travelling horizontally across the screen at a speed of $1$ space per unit of time (by the user's next action it will have traveled $2$ spaces, and by their action after that it will have traveled $4$ spaces). Hits grounded opponents when it reaches the space they are currently on, ending the game on contact. If a Hadouken comes into contact with an opposing Hadouken, the fireballs cancel each other out. Has a cooldown of $2$ units of time after being used.</li>
	</ul>
	</li>
</ul>

<p>Player:</p>

<ul>
	<li><strong>Nothing</strong> ("<code>N</code>")
	<ul>
		<li>The user stands completely stationary for the duration of this action.</li>
	</ul>
	</li>
	<li><strong>Grounded Kick</strong> ("<code>K</code>")
	<ul>
		<li>Identical to dummy Grounded Kick.</li>
	</ul>
	</li>
	<li><strong>Hadouken</strong> ("<code>H</code>")
	<ul>
		<li>Identical to dummy Hadouken.</li>
	</ul>
	</li>
	<li><strong>Shoryuken</strong> ("<code>S</code>")
	<ul>
		<li>The user performs an inhumanly high leap upward, and performs an uppercut that hits an opponent $1$ space away and ends the game on contact. The uppercut comes out immediately as the user selects the attack. <em>For the first unit of time after this action is selected, the user is completely invulnerable to any attacks</em> (so for instance, this move can be used in reaction to a "jump forward and kick" action, and if players are $1$ space away by the time the Shoryuken action is taken, the human player wins, as they land the uppercut and are invulnerable to the kick). Has a cooldown of $4$ units of time after being used.</li>
	</ul>
	</li>
</ul>

<p> </p>

### 입력



### 출력

