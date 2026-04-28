# [Platinum V] Family Fortune - 4088

[문제 링크](https://www.acmicpc.net/problem/4088)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 12, 맞힌 사람: 9, 정답 비율: 37.500%

### 분류

다이나믹 프로그래밍, 재귀, 트리

### 문제 설명

<p>While studying the history of wealthy families, researchers want to know just how much of a fortune each family has amassed. There are various &#39;net worth&#39; figures for each individual throughout history, but totaling them is complicated by double counting, caused by inheritance. One way to estimate the wealth of a family is to sum up the net worth of a set of K people such that no one in the set is an ancestor or a descendant of anyone else in the set. The wealth of the family is the maximum sum achievable over all such sets of K people. Since historical records contain only the net worth of male family members, the family tree is a simple tree in which every male has exactly one father and a non-negative number of sons. Also, there is exactly one person who is an ancestor of all other family members.</p>

<p>Given information about a family tree, what is the wealth of the family, by this measure?</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with two integers:</p>

<pre>N K</pre>

<p>Where N (1 &le; N &le; 100,000) is the total number of family members in the records, and K (1 &le; K &le; 1,000) is the size of the desired set of people.</p>

<p>Each of the next N lines will hold two integers:</p>

<pre>P W</pre>

<p>Where P (0 &le; P &le; N) indicates the parent of that family member. The family members are numbered from 1 to N, with the parent and fortune of family member i appearing on the ith line. There will be a single root, with P=0. The tree will not have a depth greater than 1,000, and, of course, it won&rsquo;t have any cycles. W (1 &le; W &le; 1,000) is the wealth (in millions) of that family member.</p>

<p>The input will end with a line with two 0s.</p>

### 출력

<p>For each test case, output a single integer on its own line, which is the maximum sum (in millions) of the fortunes of a set of K family members in the tree, where no member of the set is an ancestor or descendant of any other member of the set. If you cannot find K such nodes, then output 0. Output no extra spaces, and do not separate answers with blank lines.</p>