# [Gold II] Basketball - 15257

[문제 링크](https://www.acmicpc.net/problem/15257)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

수학, 구현, 브루트포스 알고리즘, 기하학, 확률론, 물리학

### 문제 설명

<p>Basketball is the other sport we&rsquo;re supposed to be excited about at USC (besides women&rsquo;s soccer, of course). Somehow, it never seems to quite catch on. So in case you aren&rsquo;t sure how basketball works: each team has 5 players, who pass the ball around and try to get it in the opposing team&rsquo;s basket, which is suspended about 50ft high in the air. There are some rules about how long you are allowed to be in various places, what are the exact ways in which you are allowed to punch the other players, why you can or cannot hold on to the ball in various situations, and various other arbitrary things.</p>

<p>A very important part of basketball is rebounds. No, not that kind! When your team throws the ball in the general direction of the other team&rsquo;s basket, it doesn&rsquo;t always go in. Instead, it will often bounce off the rim, and in a pretty random direction. You&rsquo;d then rather your team catch the ball and get to take another shot, than the other team catch the ball and break away towards your basket and take a shot. It&rsquo;s thus a very important decision where to place your players to catch those rebounds. On the one hand, you want to place your players so they are close to the places where the ball will likely land. But you also want them to be in places where they are likely to score when they get the ball. And you want them to be in places where they can prevent the other team from scoring if they catch the ball first. Optimizing this is quite difficult, and indeed, professional sports teams do use sophisticated algorithms to determine rebound strategies<sup>4</sup>.</p>

<p>The basketball field is a rectangle with corners (0.0, 0.0) and (94.0, 50.0) (measured in feet). Your team&rsquo;s basket is at location (0.0, 25.0), and the other team&rsquo;s basket at (94.0, 25.0). You will be given the locations of the other team&rsquo;s 5 players, and the candidate locations where you can in principle place your own 5 players. You will also be given a list of locations where the ball may bounce, and for each location, the probability that the ball goes there. For each location, the player closest to that location will get the rebound. The player will run in a beeline to that location to pick up the ball, then run in a beeline to the other team&rsquo;s basket. Simultaneously, all of the other team&rsquo;s players will run in a beeline to their own basket to defend it. All players run at the same speed of 20 feet per second. Let t be the number of seconds by which the person with the ball outruns the fastest defender, i.e., how much earlier he/she gets to the basket. (If the fastest defender outruns the person with the ball, t can be negative.) If t &ge; 0, then the probability of scoring is 1&minus;2<sup>&minus;(t+1)</sup>. If t &lt; 0, then the probability of scoring is 2<sup>t&minus;1</sup>. In keeping with basic basketball rules, we will treat each scored basket as 2 points.</p>

<p>Your goal is to find the locations for your 5 players that maximize the expected number of points that your team will get from the rebound. (Points for the other team count as negative points.)</p>

<p><sup>4</sup>One of the leading sports analytics teams doing this kind of computation grew out of USC&rsquo;s own ISI.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers n, m. 5 &le; n &le; 15 is the number of candidate locations where you can place your players, and 1 &le; m &le; 100 is the number of locations where the ball could rebound.</p>

<p>This is followed by a line with ten doubles x<sub>1</sub><sup>&minus;</sup>, y<sub>1</sub><sup>&minus;</sup>, x<sub>2</sub><sup>&minus;</sup>, y<sub>2</sub><sup>&minus;</sup>, . . . , x<sub>5</sub><sup>&minus;</sup>, y<sub>5</sub><sup>&minus;</sup>; these are the locations of the opposing players. Next is a line with 2n doubles x<sub>j</sub><sup>+</sup>, y<sub>j</sub><sup>+</sup>, which give you the candidate locations for your players. Finally, there is line with 3m doubles, consisting of m triples x<sub>k</sub><sup>◦</sup>, y<sub>k</sub><sup>◦</sup>, p<sub>k</sub>. The first two doubles of a triple are the coordinates of the k th location where the ball may bounce, while p<sub>k</sub> &isin; [0, 1] is the probability that the ball bounces to location k. All x coorcinates (players/candidates/rebound) are between 0 and 90, and all y locations between 0 and 50. We will guarantee that &Sigma;<sub>k</sub>p<sub>k</sub> = 1. Also, we will ensure that for each (x<sub>k</sub><sup>◦</sup>, y<sub>k</sub><sup>◦</sup>), there are never two player/candidate locations whose distance to it are the same (or within less than 0.001). So you don&rsquo;t have to worry about how to break ties about who gets to the rebound first.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a line by itself, output the maximum expected number of points your team can get by placing its five players perfectly, rounded to two decimals.</p>

<p>Each data set should be followed by a blank line.</p>