# [Platinum II] Codenames - 21174

[문제 링크](https://www.acmicpc.net/problem/21174)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 6, 맞힌 사람: 6, 정답 비율: 26.087%

### 분류

비트마스킹, 조합론, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 수학, 파싱, 문자열

### 문제 설명

<p>Codenames is a popular board game. Two teams compete by each having a &quot;spymaster&quot; give one-word clues that can point to multiple words on the board. The other players on the team attempt to guess their team&#39;s words while avoiding the words of the other team. The objective is to be the first team to have all their team&#39;s words revealed.</p>

<p>Players split into two teams: red and blue. One player of each team is selected as the team&#39;s spymaster; the others are field operatives.</p>

<p>$N$ Codename cards, each bearing a word, are laid out in a line. Each word represents one of the following: a red agent, a blue agent, an assassin, or an innocent bystander. All players can see all the Codename words, but only the spymasters know the identities of the cards.</p>

<p>Teams take turns. On each turn, the appropriate spymaster gives a verbal hint about the words on the respective cards. Each hint may only consist of one single word and a number. The spymaster&#39;s hint should be as close to their own agents&#39; cards as possible. The hint&#39;s number tells the field operatives the maximum number of guesses to make.</p>

<p>After a spymaster gives the hint, their field operatives make guesses about which Codename cards bear words related to the hint and point them out, one at a time. When a Codename card is pointed out, the spymaster reveals the identity of that card-&ndash;-a blue agent card, a red agent card, an innocent bystander card, or the assassin card. Depending on the identity of the card, one of these things happens:</p>

<ul>
	<li>If an assassin is pointed out, the game ends immediately, and their team loses.</li>
	<li>If an innocent bystander is pointed out, the turn simply ends.</li>
	<li>If an agent of the other team is pointed out, the turn ends, and that other team is one agent closer to winning.</li>
	<li>If an agent of their team is pointed out, they are one agent closer to winning, and they may choose to make another guess.</li>
</ul>

<p>The game ends when all of one team&#39;s agents are identified (winning the game for that team), or when one team has identified the assassin (losing the game).</p>

<p>To simplify the problem, let&#39;s assume that both teams share the same dictionary of hint words and their associations with Codename cards. For example, consider this board ($N = 6$):</p>

<table class="table table-bordered table-center-80 td-center">
	<tbody>
		<tr>
			<td><code>Plate</code>(R)</td>
			<td><code>Screen</code>(I)</td>
			<td><code>Novel</code>(A)</td>
			<td><code>Robin</code>(B)</td>
			<td><code>Iron</code>(R)</td>
			<td><code>Server</code>(B)</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Table 1:&nbsp;(R: Red team&#39;s agent; B: Blue team&#39;s agent; I: Innocent bystander; A: Assassin)</p>

<p>The list of hint words and their associated Codenames cards is given in Table 2.</p>

<table class="table table-bordered table-center-50 td-center">
	<tbody>
		<tr>
			<td><code>Alfred</code></td>
			<td><code>Robin, Server, Plate</code></td>
		</tr>
		<tr>
			<td><code>Net</code></td>
			<td><code>Server, Screen, Plate</code></td>
		</tr>
		<tr>
			<td><code>Computer</code></td>
			<td><code>Screen, Server</code></td>
		</tr>
		<tr>
			<td><code>Twitter</code></td>
			<td><code>Screen, Robin, Server</code></td>
		</tr>
		<tr>
			<td><code>Crusoe</code></td>
			<td><code>Robin, Novel</code></td>
		</tr>
		<tr>
			<td><code>Film</code></td>
			<td><code>Iron, Screen</code></td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Table 2:&nbsp;A list of hint words and their associated Codenames cards.</p>

<p>Once the spymaster gives a hint word and a number, $K$ (an integer between 1 and the number of unrevealed words associated with the hint), their field operatives make random guesses---with equal probability---from the list of associated words that are not revealed yet. They will continue to make guesses until one of the following happens: (1) they get $K$ hits, (2) they have won the game, or (3) their turn ends with a miss. They will never make guesses outside the list or use hints from the previous rounds. It is illegal for the spymaster to give a hint word whose all associated Codename cards have already been revealed. All hint words can be used multiple times by either team.</p>

<p>For example, assuming the blue team goes first in the first round, the blue spymaster may give a hint &quot;Twitter, 2&quot;. The blue team has $1/3$ chance of guessing &quot;Screen&quot;, &quot;Robin&quot; and &quot;Server&quot;, respectively. If they happen to guess &quot;Screen&quot;, their turn ends as the word is an innocent bystander. Otherwise, they get a hit and will make another guess, with $1/2$ chance on either of the remaining two words. Regardless of the choice, their turn will end after this guess, and the red team will start their turn with the red spymaster giving a hint.</p>

<p>Now you are selected as the spymaster, and your team (color specified in the input) goes first. Assuming both spymasters play optimally, what is your probability of winning the game?</p>

### 입력

<p>The first line consists of an integer and a character, separated by a single space. The integer is $N$ ($1 \leq N \leq 15$), the size of the board. The character is R or B, indicating your team (red or blue).</p>

<p>The second line consists of $N$ distinct words, separated by a single space. Each word consists of up to 20 lowercase English letters.</p>

<p>The third line consists of $N$ single-character strings, separated by a single space. The $i$-th string indicates the identity of the $i$-th word, with the following meaning: R---Red team&#39;s agent; B---Blue team&#39;s agent; I---Innocent bystander; A---Assassin. There are one or more &quot;R&quot; and &quot;B&quot; words, and there are zero or more &quot;I&quot; and &quot;A&quot; words.</p>

<p>The fourth line consists of an integer $M$ ($1 \leq M \leq 50$), which is the number of hint words.</p>

<p>Each of the following $M$ lines consists of an integer $H_i$ ($1 \leq H_i \leq N$), followed by $H_i$ distinct words separated by a single space. It describes the associated Codename cards with the $i$-th hint word. All words are guaranteed to appear on the board.</p>

### 출력

<p>Probability of winning the game. Your answer will be considered correct if it has an absolute error of at most $10^{-4}$ with the judges&#39; data.</p>

### 힌트

<p>The blue spymaster has three hint words to choose from (in any case, their team can only make one guess in the turn, so the choice of $K$ does not matter):</p>

<ol>
	<li>If they choose the first, their team has $1/2$ probability of guessing &quot;apple&quot; and wins the game, and $1/2$ probability of guessing &quot;java&quot; and ends the turn, which allows the red spymaster to give the third hint word and win. So the blue team&#39;s winning chance is $1/2$ in this case;</li>
	<li>If they choose the second, their team has $1/2$ probability of guessing &quot;apple&quot; and wins the game, and $1/2$ probability of guessing &quot;dog&quot; and loses the game. So the blue team&#39;s winning chance is also $1/2$;</li>
	<li>If they choose the third, their team has $1/2$ probability of guessing &quot;sleep&quot; and loses the game, and $1/2$ probability of guessing &quot;java&quot; and ends the turn, which allows the red spymaster to give the third hint word and win. So the blue team&#39;s winning chance is $0$ in this case.</li>
</ol>

<p>To sum up, the best strategy for the blue spymaster is either (1) or (2) and their winning chance is $1/2$.</p>