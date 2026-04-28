# [Gold IV] Tian Ji -- The Horse Racing - 5071

[문제 링크](https://www.acmicpc.net/problem/5071)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 115, 정답: 24, 맞힌 사람: 22, 정답 비율: 28.947%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>Here is a famous story in Chinese history.&nbsp;</p>

<blockquote>
<p>That was about 2300 years ago. General Tian Ji was a high official in the country Qi. He likes to play horse racing with the king and others.&nbsp;</p>

<p>Both of Tian and the king have three horses in different classes, namely, regular, plus, and super. The rule is to have three rounds in a match; each of the horses must be used in one round. The winner of a single round takes two hundred silver dollars from the loser.&nbsp;</p>

<p>Being the most powerful man in the country, the king has so nice horses that in each class his horse is better than Tian&#39;s. As a result, each time the king takes six hundred silver dollars from Tian.&nbsp;</p>

<p>Tian Ji was not happy about that, until he met Sun Bin, one of the most famous generals in Chinese history. Using a little trick due to Sun, Tian Ji brought home two hundred silver dollars and such a grace in the next match.&nbsp;</p>

<p>It was a rather simple trick. Using his regular class horse race against the super class from the king, they will certainly lose that round. But then his plus beat the king&#39;s regular, and his super beat the king&#39;s plus. What a simple trick. And how do you think of Tian Ji, the high ranked official in China?&nbsp;</p>
</blockquote>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5071/1.png" style="height:202px; width:752px" /></p>

<p>Were Tian Ji lives in nowadays, he will certainly laugh at himself. Even more, were he sitting in the ACM contest right now, he may discover that the horse racing problem can be simply viewed as finding the maximum matching in a bipartite graph. Draw Tian&#39;s horses on one side, and the king&#39;s horses on the other. Whenever one of Tian&#39;s horses can beat one from the king, we draw an edge between them, meaning we wish to establish this pair. Then, the problem of winning as many rounds as possible is just to find the maximum matching in this graph. If there are ties, the problem becomes more complicated, he needs to assign weights 0, 1, or -1 to all the possible edges, and find a maximum weighted perfect matching...&nbsp;</p>

<p>However, the horse racing problem is a very special case of bipartite matching. The graph is decided by the speed of the horses -- a vertex of higher speed always beat a vertex of lower speed. In this case, the weighted bipartite matching algorithm is a too advanced tool to deal with the problem.&nbsp;</p>

<p>In this problem, you are asked to write a program to solve this special case of matching problem.</p>

### 입력

<p>The input consists of up to 50 test cases. Each case starts with a positive integer n ( n&lt;=1000) on the first line, which is the number of horses on each side. The next n integers on the second line are the speeds of Tian&#39;s horses. Then the next n integers on the third line are the speeds of the king&#39;s horses. The input ends with a line that has a single `0&#39; after the last test case.</p>

### 출력

<p>For each input case, output a line containing a single number, which is the maximum money Tian Ji will get, in silver dollars.</p>