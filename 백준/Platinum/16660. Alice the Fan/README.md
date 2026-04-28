# [Platinum III] Alice the Fan - 16660

[문제 링크](https://www.acmicpc.net/problem/16660)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 84, 정답: 30, 맞힌 사람: 28, 정답 비율: 35.443%

### 분류

다이나믹 프로그래밍, 구현

### 문제 설명

<p>Alice is a big fan of volleyball and especially of the very strong &ldquo;Team A&rdquo;.</p>

<p>Volleyball match consists of up to five sets. During each set teams score one point for winning a ball. The first four sets are played until one of the teams scores at least 25 points and the fifth set is played until one of the teams scores at least 15 points. Moreover, if one of the teams scores 25 (or 15 in the fifth set) points while the other team scores 24 (or 14 in the fifth set), the set is played until the absolute difference between teams&rsquo; points becomes two. The match ends when one of the teams wins three sets. The match score is the number of sets won by each team.</p>

<p>Alice found a book containing all the results of all matches played by &ldquo;Team A&rdquo;. The book is old, and some parts of the book became unreadable. Alice can not read the information on how many sets each of the teams won, she can not read the information on how many points each of the teams scored in each set, she even does not know the number of sets played in a match. The only information she has is the total number of points scored by each of the teams in all the sets during a single match.</p>

<p>Alice wonders what is the best match score &ldquo;Team A&rdquo; could achieve in each of the matches. The bigger is the difference between the number of sets won by &ldquo;Team A&rdquo; and their opponent, the better is the match score. Find the best match score or conclude that no match could end like that. If there is a solution, then find any possible score for each set that results in the best match score.</p>

### 입력

<p>The first line contains a single integer m (1 &le; m &le; 50 000) &mdash; the number of matches found by Alice in the book.</p>

<p>Each of the next m lines contains two integers a and b (0 &le; a, b &le; 200) &mdash; the number of points scored by &ldquo;Team A&rdquo; and the number of points scored by their opponents respectively.</p>

### 출력

<p>Output the solution for every match in the same order as they are given in the input. If the teams could not score a and b points respectively, output &ldquo;Impossible&rdquo;.</p>

<p>Otherwise, output the match score formatted as &ldquo;x:y&rdquo;, where x is the number of sets won by &ldquo;Team A&rdquo; and y is the number of sets won by their opponent.</p>

<p>The next line should contain the set scores in the order they were played. Each set score should be printed in the same format as the match score, with x being the number of points scored by &ldquo;Team A&rdquo; in this set, and y being the number of points scored by their opponent.</p>