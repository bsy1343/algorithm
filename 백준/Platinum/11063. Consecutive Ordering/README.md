# [Platinum IV] Consecutive Ordering - 11063

[문제 링크](https://www.acmicpc.net/problem/11063)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 318, 정답: 116, 맞힌 사람: 41, 정답 비율: 20.098%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>An interval graph is the intersection graph of family F = {I<sub>1</sub>, I<sub>2</sub>, ..., I<sub>n</sub>} of closed intervals on the real line, where two vertices, v<sub>i</sub> and v<sub>j</sub>, are connected with an edge if and only if their corresponding intervals, I<sub>i</sub> and I<sub>j</sub>, intersect. The family F is usually called an interval representation for the graph. A unit interval graph is an interval graph with an interval representation in which all the intervals have the same length. Refer to Figure 1 for an example of a unit interval graph and its interval representation.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11063.%E2%80%85Consecutive%E2%80%85Ordering/d033447b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11063.%E2%80%85Consecutive%E2%80%85Ordering/d033447b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11063/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:76px; width:567px" /></p>

<p style="text-align: center;">(a) A unit interval graph G.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11063.%E2%80%85Consecutive%E2%80%85Ordering/b9d2b9e5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11063.%E2%80%85Consecutive%E2%80%85Ordering/b9d2b9e5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11063/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:133px; width:490px" /></p>

<p style="text-align: center;">(b) An interval representation of the graph G.&nbsp;</p>

<p style="text-align: center;">Figure 1. A unit interval graph and its interval representation.&nbsp;</p>

<p>The closed neighbourhood N[v<sub>i</sub>] of a vertex v<sub>i</sub> of a graph G refers to the set of vertices adjacent to v<sub>i</sub> along with v<sub>i</sub> itself, i.e., N[v<sub>i</sub>] = {v<sub>i</sub>} &cup; {v<sub>j</sub> : (v<sub>j</sub>, v<sub>i</sub>) is an edge of G}. For the graph G shown in Figure 1(a), we have N[v<sub>1</sub>] = {v<sub>1</sub>, v<sub>2</sub>, v<sub>3</sub>} and N[v<sub>5</sub>] = {v<sub>2</sub>, v<sub>3</sub>, v<sub>4</sub>, v<sub>5</sub>, v<sub>6</sub>}. Under the ordering (v<sub>1</sub>, v<sub>2</sub>, ..., v<sub>17</sub>) of the vertices of G in which the position of v<sub>i</sub>, denoted by &rho;(v<sub>i</sub>), is i for all v<sub>i</sub>, the closed neighbourhood N[v<sub>i</sub>] of every vertex v<sub>i</sub> is consecutive, i.e., the positions of vertices in N[v<sub>i</sub>] are integers which follow one after another, without gaps, from smallest to largest. An ordering of the vertices of a graph is said to be consecutive if the closed neighborhood of every vertex of the graph is consecutive. For the graph G of Figure 1(a), the ordering (v<sub>1</sub>, v<sub>2</sub>, ..., v<sub>15</sub>, v<sub>17</sub>, v<sub>16</sub>) with v<sub>16</sub> and v<sub>17</sub> being switched, where &rho;(v<sub>17</sub>) = 16, &rho;(v<sub>16</sub>) = 17, and &rho;(v<sub>i</sub>) = i for all v<sub>i</sub> &ne; v<sub>16</sub>, v<sub>17</sub>, is also consecutive. However, (v<sub>2</sub>, v<sub>1</sub>, v<sub>3</sub>, v<sub>4</sub>, ..., v<sub>17</sub>) is not a consecutive ordering because the closed neighbourhood of v<sub>5</sub> is not consecutive.</p>

<p>Given n closed intervals of the same length, I<sub>1</sub>, I<sub>2</sub>, ..., I<sub>n</sub>, in a non-decreasing order of their left endpoints and an ordering (v<sub>i<sub>1</sub></sub>, v<sub>i<sub>2</sub></sub>, ..., v<sub>i<sub>n</sub></sub>) of the vertices of the unit interval graph defined on the n intervals, write a program to test whether the ordering is consecutive or not.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case begins with a line containing two positive integers n and l, where n &le; 100,000 and l &le; 100,000,000, respectively representing the number and the length of intervals. It follows n lines containing, one by one, the left endpoints of intervals, I<sub>1</sub>, I<sub>2</sub>, ..., I<sub>n</sub>, in which the left endpoint of I<sub>i</sub> is always less than or equal to that of I<sub>j</sub> if i &lt; j. You may assume that the endpoints, left or right, of intervals are between -100,000,000 and 100,000,000, inclusive. It follows n lines again, containing an ordering of the vertices of the unit interval graph defined on the n intervals, one vertex per line.</p>

### 출력

<p>Your program is to write to standard output. For each test case, print exactly one line that contains an integer indicating whether the given ordering is consecutive. If yes, the integer must be 1; otherwise -1.</p>