# [Silver II] Volleyball Scores - 15254

[문제 링크](https://www.acmicpc.net/problem/15254)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 20, 맞힌 사람: 16, 정답 비율: 50.000%

### 분류

구현

### 문제 설명

<p>Volleyball has been an Olympic sport since 1964. Teams of 6 players (in beach volleyball: 2 players) hit a ball back and forth, but each team can only touch the ball up to three times until they need to hit it to the other side. There are additional rules, such as the same player not being allowed to touch the ball twice in a row, etc., which make keeping track of the score quite tedious. This is where you come in and write a program to solve this problem for them.</p>

<p>Here&rsquo;s a more precise refresher of volleyball rules. The two teams each consist of 6 players: Team A&rsquo;s players are numbered 1&ndash;6 in this problem, and Team B&rsquo;s players are 7&ndash;12. The two teams take turns serving. The other team wins the point when one of the following things happen to your team:<sup>3</sup></p>

<ol>
	<li>One of your team&rsquo;s players touches the ball twice in a row.</li>
	<li>The ball is touched at least four times in a row by players of your team.</li>
	<li>The ball touches the ground in your court.</li>
	<li>The ball touches the ground out of bounds, and one of your team&rsquo;s players was the last to touch the ball before that.</li>
	<li>One of your team&rsquo;s players touches the ball right after one of your players has served it.</li>
</ol>

<p>Given a sequence of who touched the ball, your goal is to find out the current score (notice that &ldquo;touching&rdquo; the ball may include serving it). You also should output an error message if at any point in time, the wrong team served.</p>

<p><sup>3</sup>We will ignore effects of the net here, as well as a few other details, including the fact that the person serving the ball must normally rotate.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains a number t with 1 &le; t &le; 1000. The second line is a sequence of t &ldquo;ball touches&rdquo;, separated by one empty space, as follows:</p>

<ul>
	<li>A number i with 1 &le; i &le; 12 means that player i touched the ball (this may have been a serve).</li>
	<li>The characters &lsquo;A&rsquo; or &lsquo;B&rsquo; mean that the ball touched the ground in the court of Team A resp. Team B.</li>
	<li>The character &lsquo;X&rsquo; means that the ball touched the ground out of bounds.</li>
</ul>

<p>The first &ldquo;ball touch&rdquo; is always a number, representing the person who served first. The point may be ongoing at the end of the sequence. The input will never contain impossible sequences (except wrong serves).</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the score of the two teams, separated by a single white space. If at any point during the sequence, a player from the wrong team served, output &ldquo;Wrong Serve&rdquo; instead of the score.</p>