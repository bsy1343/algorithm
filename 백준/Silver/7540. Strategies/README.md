# [Silver V] Strategies - 7540

[문제 링크](https://www.acmicpc.net/problem/7540)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 97, 정답: 51, 맞힌 사람: 46, 정답 비율: 52.874%

### 분류

구현, 그리디 알고리즘, 정렬

### 문제 설명

<p>Bill, Steve and Linus participate in programming contests just like the one you&rsquo;re competing in right now. They have different strategies and we&rsquo;d like to find out whose strategy is the best.</p>

<p>Bill simply solves the problems in the order he gets them from the contest organizers. Steve first reads all the problems and then solves them in increasing order of difficulty. Linus also reads all problems first, but he&rsquo;s quite ambitious and thus solves them in decreasing order of difficulty.</p>

<p>The difficulty of a problem is measured in minutes it takes the guys to solve it. We have collected statistics and we&rsquo;ve consulted the oracle Larry so we know for all kinds of problems how long the guys will need. We have also found out that the three of them always need the same time for each problem (which depends on the difficulty of the problem), so they only differ by their strategies.</p>

<p>For several contests, we&rsquo;d like you to tell us the winner, the number of problems he solved and his score. The score for a single problem is the time in minutes from start of the contest until you solve it. The overall score is the sum of scores of the problems you solved. The guys never make mistakes so you don&rsquo;t have to deal with penalties. The winner is the one who solved the most problems, and in case of a tie, the one with the lowest score. If there&rsquo;s still a tie, then they agree that Steve wins because he always brings delicious apple pie.</p>

### 입력

<p>The first line contains the number of scenarios. Each scenario describes one contest and its first line tells you how long the contest lasts (in minutes, from 30 to 1440) and the number of problems (from 3 to 24). In a second line you&rsquo;ll get the difficulties of the problems, as explained above they tell you how many minutes (from 1 to 600) the guys need in order to solve the problems.</p>

### 출력

<p>The output for every scenario begins with a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1. Then print a single line telling who wins, the number of problems he solves and his score. Use the exact format as shown below in the sample output, even if the winner only solves 0 or 1 problems. Terminate the output for the scenario with a blank line.</p>