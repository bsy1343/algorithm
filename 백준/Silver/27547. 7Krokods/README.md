# [Silver IV] 7Krokods - 27547

[문제 링크](https://www.acmicpc.net/problem/27547)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 27, 맞힌 사람: 24, 정답 비율: 68.571%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>When he is not making videos for his <a href="https://www.youtube.com/channel/UCLeaG05z_yu0xK4CyM8byuQ">YouTube channel</a>, the famous programmer influencer Krokod likes to play boardgames with his friend Paula. He wants to play the game <em>7Krokods</em>, but Paula doesn&rsquo;t like complex games, so Krokod decided that they will play only with green and crocodile cards.</p>

<p>Paula has $n$ green cards, and each of them has one of the following letters written on it: <code>d</code>, <code>k</code>, <code>o</code>, or <code>r</code>. Her total score is defined as the sum of the following components:</p>

<ul>
	<li>For each letter, she gets as much points as is the number of cards with that letter written on them, squared. For example, if she has $6$ cards with the letter <code>k</code>, she gets $36$ points.</li>
	<li>For each word <code>krokod</code> she can make from her cards, she gets an extra $7$ points.</li>
</ul>

<p style="text-align: center;">Illustration of the first example.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ad51d1db-7d71-4494-9bf6-afbc5387a6df/-/preview/" style="width: 412px; height: 194px;" /></p>

<p style="text-align: center;">Paula has $2$ letters <code>d</code> ($2 &middot; 2 = 4$ points), $6$ letters <code>k</code> ($6 &middot; 6 = 36$ points), $4$ letters <code>o</code> ($4 &middot; 4 = 16$ points) and $3$ letters <code>r</code> ($3 &middot; 3 = 9$ points). The word krokod can be spelled $2$ times ($7 &middot; 2 = 14$ points). Her total score is $79$. ($4 + 36 + 16 + 9 + 14 = 79$)</p>

<p>Paula also has $m$ crocodile cards. She can replace each of the crocodile cards with a green card having a letter of her choice. She will do it in a way that maximizes her score.</p>

<p>Help her determine the maximum score she can get with her cards.</p>

### 입력

<p>The first line contains integers $n$ and $m$ ($0 &le; n &le; 100$, $0 &le; m &le; 10$), the number of green cards and the number of crocodile&rsquo;s cards.</p>

<p>The second line contains a sequence of $n$ characters, where the $i$-th characters represents the letter on the i-th green card. The sequence consists only of characters <code>d</code>, <code>k</code>, <code>o</code> and <code>r</code>.</p>

### 출력

<p>In the first and only line output Paula&rsquo;s maximum possible score.</p>

### 힌트

<p>Clarification of the first example: Look at the illustation in the task statement.</p>

<p>Clarification of the second example: For the maximum possible score, Paula can replace her crocodile card with a green card having the letter <code>k</code>.</p>