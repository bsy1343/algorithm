# [Gold V] League Tables - 15185

[문제 링크](https://www.acmicpc.net/problem/15185)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 152, 정답: 48, 맞힌 사람: 24, 정답 비율: 26.667%

### 분류

구현, 정렬

### 문제 설명

<p>League football (known in some circles as soccer) has been played in England since 1888 and is the most popular winter game through most of Europe, just as rugby is in New Zealand. English newspapers and many Websites publish the latest results and the current tables.</p>

<p>With English football, each team plays every other team both home and away, and at the end of the season, the team with most points wins the title. Points are awarded for winning (3 points) or drawing (1 point each). Teams level on points are separated by the larger goal difference, that is goals for (ie scored) minus goals against (ie conceded). If this is level, the team who has scored more goals is placed first.</p>

<p>In this problem you will be given a list of teams and their current record, followed by a list of matches. You have to update the record of each team who has a result recorded and output a correctly sorted league table.</p>

### 입력

<p>The first line contains a single integer, T (8 &lt;= T &lt;= 30), which is the number of teams in the league. The next 2 x T lines each contain the current record of one team as follows:</p>

<pre>
&lt;name&gt;
&lt;games played&gt; &lt;wins&gt; &lt;draws&gt; &lt;losses&gt; &lt;goals for&gt; &lt;goals against&gt; &lt;points&gt;</pre>

<p>The first line contains the team name which consists of one or more words, which may contain numbers. No name will be longer than 30 characters.</p>

<p>All numbers on the second line are non-negative integers less than 150.</p>

<p>The next line contains a single integer, G (0 &lt; G &lt;= (T/2)), which is the number of games recorded. There then follow 4 x G lines, each containing data on one game as follows:</p>

<pre>
&lt;home team name&gt;
&lt;home team score&gt;
&lt;away team name&gt;
&lt;away team score&gt;</pre>

<p>The two teams will both be from the preceding list of teams. The scores will each be a non-negative integer less than 20.</p>

### 출력

<p>T lines giving the updated record of each team from the input, name followed by data all on 1 line. Teams are to be sorted by highest points, then highest goal difference, then most goals scored, then alphabetical order (case insensitive, numbers before letters).</p>