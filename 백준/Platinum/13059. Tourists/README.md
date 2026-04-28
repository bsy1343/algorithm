# [Platinum IV] Tourists - 13059

[문제 링크](https://www.acmicpc.net/problem/13059)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 184, 정답: 113, 맞힌 사람: 89, 정답 비율: 58.553%

### 분류

수학, 트리, 최소 공통 조상, 조화수

### 문제 설명

<p>In Tree City, there are n tourist attractions uniquely labeled 1 to n. The attractions are connected by a set of n &minus; 1 bidirectional roads in such a way that a tourist can get from any attraction to any other using some path of roads.</p>

<p>You are a member of the Tree City planning committee. After much research into tourism, your committee has discovered a very interesting fact about tourists: they LOVE number theory! A tourist who visits an attraction with label x will then visit another attraction with label y if y &gt; x and y is a multiple of x. Moreover, if the two attractions are not directly connected by a road the tourist will necessarily visit all of the attractions on the path connecting x and y, even if they aren&rsquo;t multiples of x. The number of attractions visited includes x and y themselves. Call this the length of a path.</p>

<p>Consider this city map:</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13059/1.png" style="height:231px; width:620px" /></p>

<p>Here are all the paths that tourists might take, with the lengths for each:</p>

<pre>
1 &rarr; 2 = 4, 1 &rarr; 3 = 3, 1 &rarr; 4 = 2, 1 &rarr; 5 = 2, 1 &rarr; 6 = 3, 1 &rarr; 7 = 4,
1 &rarr; 8 = 3, 1 &rarr; 9 = 3, 1 &rarr; 10 = 2, 2 &rarr; 4 = 5, 2 &rarr; 6 = 6, 2 &rarr; 8 = 2,
2 &rarr; 10 = 3, 3 &rarr; 6 = 3, 3 &rarr; 9 = 3, 4 &rarr; 8 = 4, 5 &rarr; 10 = 3</pre>

<p>To take advantage of this phenomenon of tourist behavior, the committee would like to determine the number of attractions on paths from an attraction x to an attraction y such that y &gt; x and y is a multiple of x. You are to compute the sum of the lengths of all such paths. For the example above, this is: 4 + 3 + 2 + 2 + 3 + 4 + 3 + 3 + 2 + 5 + 6 + 2 + 3 + 3 + 3 + 4 + 3 = 55.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The first line of input will consist of an integer n (2 &le; n &le; 200,000) indicating the number of attractions. Each of the following n&minus;1 lines will consist of a pair of space-separated integers i and j (1 &le; i &lt; j &le; n), denoting that attraction i and attraction j are directly connected by a road. It is guaranteed that the set of attractions is connected.</p>

### 출력

<p>Output a single integer, which is the sum of the lengths of all paths between two attractions x and y such that y &gt; x and y is a multiple of x.</p>