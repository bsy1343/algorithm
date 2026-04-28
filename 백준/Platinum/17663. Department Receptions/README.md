# [Platinum V] Department Receptions - 17663

[문제 링크](https://www.acmicpc.net/problem/17663)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 1, 정답 비율: 20.000%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 격자 그래프

### 문제 설명

<p>After you&rsquo;ve walked and received your degree (and moved your tassel), it&rsquo;s finally time to go and raid &mdash; pardon, visit &mdash; the department receptions. Unfortunately, you only have limited time to do so, because you have an appointment to meet your parents and friends for a photo shoot. So your goal is to eat as much good food as possible in the limited time. The emphasis is on &ldquo;good;&rdquo; it is well known that food quality varies between different departments,<sup>4</sup> so you want to choose carefully which receptions you attend.</p>

<p>There are a few snags to watch out for: (1) some receptions do access control, and won&rsquo;t let you in unless you have some kind of access (like being a student in their department, or being friends with one of the staff members); (2) there are places with larger crowds, which slow you down; and (3) if you don&rsquo;t eat enough, you might just drop from being famished before you reach the truly delicious food. Write a program to compute the maximum total food points you can consume.</p>

<p>Campus will be represented as a rectangular map. In any one step, you can move one square up, down, left, or right (but not diagonally). Each step you take burns one unit of energy, and each unit of food you consume restores one unit of energy. Consuming a unit of food requires you to stay in a food spot for one unit of time. In addition to your start and finish square (which will be marked by &lsquo;S&rsquo; and &lsquo;T&rsquo; on the map), there are the following types of squares:</p>

<ul>
	<li>Move squares, denoted by &lsquo;.&rsquo;, &lsquo;:&rsquo;, &lsquo;;&rsquo;, and &lsquo;#&rsquo;. There&rsquo;s no food or access control. Stepping onto such a square takes time: one unit for &lsquo;.&rsquo;, two units for &lsquo;:&rsquo;, three units for &lsquo;;&rsquo;, and four units for &lsquo;#&rsquo;. Think of &lsquo;.&rsquo; as an empty walkway and &lsquo;#&rsquo; as the huge crowds around Tommy Trojan or the chocolate fountain.</li>
	<li>Access controlled squares, denoted by capital letters A&ndash;H. These are locations where some department has set up a checkpoint to keep greedy students away from their food. You can only enter such a square if you have that privilege &mdash; you will be given the list of all your privileges as part of the input. Entering an access controlled square takes one unit of time. By the way, so does entering the start or finish square.</li>
	<li>Food squares, denoted by digits 1&ndash;5. Entering a food square takes one unit of time. Then, with each time step you wait (i.e., don&rsquo;t move), you gain one unit of energy and the given number of food points.</li>
</ul>

<p>Your goal is to start at &lsquo;S&rsquo;, arrive at &lsquo;T&rsquo; by a given time, never have your energy drop to 0 or below (including in the final step when you arrive at &lsquo;T&rsquo;), and maximize the total number of food points you got along the way.</p>

<p><sup>4</sup>How come EE always has much better food than CS?</p>

### 입력

<p>The first line is the number 1 &le; K &le; 100 of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of the data set contain four integers h, w, e, t with 1 &le; h, w &le; 30, 1 &le; e, t &le; 100 and one string of up to 8 distinct upper-case letters from A&ndash;H. h and w are the height and width of the map, e is your initial energy level, and t is the number of time steps until you meet your parents and friends. The string (which might be empty) describes your access privileges.</p>

<p>This is followed by h lines of exactly w characters each. Each character is exactly one of those described above (letters &lsquo;A&rsquo;&ndash;&lsquo;H&rsquo;, &lsquo;S&rsquo;, &lsquo;T&rsquo;, digits 1&ndash;5, &lsquo;.&rsquo;, &lsquo;:&rsquo;, &lsquo;;&rsquo;, &lsquo;#&rsquo;). There will be exactly one &lsquo;S&rsquo; and exactly one &lsquo;T&rsquo; in the map.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the maximum total number of food points you can gain and arrive at the meeting point at time t or earlier. If it is impossible for you to arrive at the meeting point at time t or earlier, output &ldquo;Impossible&rdquo; instead.</p>

<p>Each data set should be followed by a blank line.</p>

### 힌트

<p>You start out really hungry (energy: 4), so all you can manage with your initial energy level is to make it to the bad food in the top left corner. You now need to eat enough to make it somewhere else. Unfortunately, because of the access control letters &lsquo;B&rsquo; and the really slow squares in the top right, you cannot make it to the locations of quality 4 and 5 in time to make your meeting at time 37. So you eat the minimum amount of food to make it to the level 3 food on the left, almost at the bottom. Instead of going straight down (which would be slow), you go one square to the right, using your access privileges for &lsquo;D&rsquo;, &lsquo;A&rsquo;, and &lsquo;E&rsquo; along the way. You eat level-3 food for as long as you can (and enough to safely make it to the meeting spot), then leave to make it to the meeting location in time. Overall, you will spend 7 units of time eating bad food (because that&rsquo;s how much energy you need to make it to level-3 food), and 11 units of time eating level-3 food, for a total of 7 + 3 &middot; 11 = 40 food points.</p>

<p>Instead of initially heading to the top-left corner, you could have gone to the level-1 food in the top middle. But even if you eat there, because of the &lsquo;B&rsquo; access control and the slow squares in the top right, you won&rsquo;t be able to eat enough level-4 or level-5 food to do better, and heading for level-2 food (which you could do) will give you fewer food points as well.</p>