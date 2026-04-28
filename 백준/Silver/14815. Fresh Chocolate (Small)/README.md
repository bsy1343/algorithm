# [Silver IV] Fresh Chocolate (Small) - 14815

[문제 링크](https://www.acmicpc.net/problem/14815)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 107, 맞힌 사람: 92, 정답 비율: 67.153%

### 분류

수학, 그리디 알고리즘, 애드 혹, 정수론

### 문제 설명

<p>You are the public relations manager for a chocolate manufacturer. Unfortunately, the company&#39;s image has suffered because customers think the owner is cheap and miserly. You hope to undo that impression by offering a free factory tour and chocolate tasting.</p>

<p>Soon after starting the new project, you realized that the company owner&#39;s reputation is well-deserved: he only agreed to give away free chocolate if you would minimize the cost. The chocolate to be given away comes in packs of&nbsp;<strong>P</strong>&nbsp;pieces. You would like to open new packs for each tour group, but the owner insists that if there are leftover pieces from one group, they must be used with the next tour group before opening up any new packs.</p>

<p>For instance, suppose that each pack contains&nbsp;<strong>P</strong>=3 pieces, and that a tour group with 5 people comes. You will open two packs to give one piece to each person, and you will have one piece left over. Suppose that after that, another tour group with 6 people comes. They will receive the leftover piece, and then you will open two more packs to finish giving them their samples, and so you will have one piece left over again. If two groups with 4 people each come right after, the first of those will get the leftover piece plus a full pack, and the last 4 person group will get their pieces from two newly opened packs. Notice that you cannot open new packs until all leftovers have been used up, even if you plan on using all of the newly opened pack immediately.</p>

<p>In the example above, 2 out of the 4 groups (the first and last groups) got all of their chocolate from freshly opened packs. The other 2 groups got some fresh chocolate and some leftovers. You know that giving out leftovers is not the best way to undo the owner&#39;s miserly image, but you had to accept this system in order to get your cheap boss to agree to the project. Despite the unfavorable context, you are committed to doing a good job.</p>

<p>You have requests from&nbsp;<strong>N</strong>&nbsp;groups, and each group has specified the number of people that will come into the factory. Groups will come in one at a time. You want to bring them in in an order that maximizes the number of groups that get only fresh chocolate and no leftovers. You cannot reject groups, nor have a group get chocolate more than once, and you need to give exactly one piece to each person in each group.</p>

<p>In the example above, if instead of 5, 6, 4, 4, the order were 4, 5, 6, 4, a total of 3 groups (all but the 5 person group) would get only fresh chocolate. For that set of groups, it is not possible to do better, as no arrangement would cause all groups to get only fresh chocolate.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of two lines. The first line contains two integers&nbsp;<strong>N</strong>, the number of groups coming for a tour, and&nbsp;<strong>P</strong>, the number of pieces of chocolate per pack. The second line contains&nbsp;<strong>N</strong>&nbsp;integers&nbsp;<strong>G<sub>1</sub></strong>,&nbsp;<strong>G<sub>2</sub></strong>, ...,&nbsp;<strong>G<sub>N</sub></strong>, the number of people in each of the groups.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>G<sub>i</sub></strong>&nbsp;&le; 100, for all i.</li>
	<li>2 &le;&nbsp;<strong>P</strong>&nbsp;&le; 3.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of groups that will receive only fresh chocolate if you bring them in in an order that maximizes that number.</p>

### 힌트

<p>Sample Case #1 is the one explained in the statement. Besides the possible optimal order given above, other orders like 6, 5, 4, 4 also maximize the number of groups with only fresh chocolate, although the groups that get the fresh chocolate are not necesarily the same. Notice that we only care about the number of groups that get the best experience, not the total number of people in them.</p>

<p>In Sample Case #2, the groups are the same as in Case #1, but the packs contain two pieces each. In this case, several ways of ordering them &mdash; for instance, 4, 4, 6, 5 &mdash; make all groups get only fresh chocolate.</p>

<p>In Sample Case #3, all groups are single individuals, and they will all eat from the same pack. Of course, only the first one to come in is going to get a freshly opened pack.</p>