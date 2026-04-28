# [Platinum V] Going to the Movies - 5136

[문제 링크](https://www.acmicpc.net/problem/5136)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 12, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Alan Turing and Edsger Dijkstra don&rsquo;t get a chance to go to the movies very often. The main reason is that they&rsquo;re European, and the cinema is more of an American tradition. So, naturally, in their rare visits to the States, they get together with their colleagues every weekend and veg out in front of the big screen until Monday. While the group of colleagues has no trouble finding a quick route to the theater, they are getting tired of sitting through every movie together due to their preferences being vastly different. Turing, for instance, thoroughly enjoys romance movies, whereas Dijkstra doesn&rsquo;t care for them. This makes choosing movies extremely difficult! And they can&rsquo;t all split up individually to go see different titles. For what would be the purpose of getting together as a group in the first place? They wouldn&rsquo;t even be able to discuss the movies they saw, as not everyone would have seen the same ones.</p>

<p>To solve this dilemma, they&rsquo;ve come up with a scheme to minimize the number of films they have to see in order to satisfy each group member. The plan is to aggregate everyone&rsquo;s movie preferences into a master list, containing items such as &ldquo;romance&rdquo;, &ldquo;action&rdquo;, and &ldquo;horror&rdquo;. Then for each movie, they will determine which preferences it satisfies on the list. From this point, all that&rsquo;s left to do is to find the smallest set of movies that satisfies the entire list. That&rsquo;s where you come in.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains two integers: M, the number of movies, and P, the number of preferences on the list, where 1 &le; M &le; 30 and 1 &le; P &le; 20. This is followed by M lines, where the ith line describes movie i. Each line contains between 1 and P integers that specify which preferences the movie satisfies, where the preferences are indexed from 1 to P.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the minimum number of movies that satisfy everyone&rsquo;s preferences. If the preferences cannot all be satisfied, output &ldquo;Impossible&rdquo; instead. Each data set should be followed by a blank line.</p>