# [Bronze III] Batter Up - 15096

[문제 링크](https://www.acmicpc.net/problem/15096)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 504, 정답: 451, 맞힌 사람: 427, 정답 비율: 90.658%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>While the Chicago Cubs were ecstatic with their 2016 World Series championship, they were eliminated from the playoffs in 2017. Looking ahead to 2018 they are beginning to embrace the more data-driven analysis of player&rsquo;s values known as Sabermetrics.</p>

<p>For example, a player&rsquo;s batting average is calculated by dividing the total number of base hits by the total number of official at-bats. One limitation of using the batting average to evaluate players is that it treats all hits equally, rather than taking into account doubles, triples or home runs. For this reason, analysts often prefer to consider what is known as the slugging percentage, which distinguishes between different hit outcomes. To calculate the slugging percentage, the total number of bases of all hits is divided by the total numbers of time at bat, that did not result in walks, or at-bats.</p>

<p>More specifically, an at-bat can earn 0, 1, 2, 3 or 4 bases (these are referred to as official at-bats). Furthermore, some at-bats, such as those that result in a base-on-balls (i.e., a &ldquo;walk&rdquo;) are not considered in either the player&rsquo;s batting average or slugging percentage.</p>

<p>For example, if a player hits a triple (3 bases), strikes out (0 bases), and hits a double (2 bases), their slugging percentage would be (3+0+2)/3 &asymp; 1.6667. If a player hits a single (1 base), walks, and hits a home run (4 bases), the slugging level would be (1+4)/2 = 2.5. Notice that in this case, the denominator is two, not three, because the walk does not count towards the slugging percentage.</p>

### 입력

<p>The input is composed of two lines. The first line contains a single positive integer n (1 &le; n &le; 100) that specifies the number of at-bats. The second line contains n integers, separated by spaces, each describing one of those at-bats. Strike-outs, singles, doubles, triples, and home runs are represented as 0, 1, 2, 3, 4, respectively. Walks are represented as -1. You may assume that there will always be at least one official at-bat (i.e., at least one at-bat will not be a walk).</p>

### 출력

<p>Display the player&rsquo;s slugging percentage as a real number, accurate to within an absolute or relative error of 10<sup>&minus;3</sup>. We recommend that you do not round the value that you calculate.</p>