# [Platinum V] Cellular Network - 8930

[문제 링크](https://www.acmicpc.net/problem/8930)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>A cellular network is a radio network made up of a number of cells each served by a base station located in the cell. The base station receives call signals from mobile users (mobiles) in the cell it serves, which then connects the calls to the wired land-line telephone network. When a call is requested to connect to a mobile, the cellular network must know in which cell the mobile is located so that the call is routed to the base station of the cell appropriately.</p>

<p>Mobiles move from once cell to another in a cellular network. Whenever a mobile reports its new cell as it crosses boundaries of cells, the cellular network would know its exact cell at any time and finding (paging) the mobile becomes a trivial task. But it is usually infeasible for a mobile to report its new location each time it enters a new cell because of the insufficiencies of resources such as the radio bandwidth. But normally at the time of a call arrival, the cellular network knows a limited number of cells where the mobile is located. In this situation, a lot of paging strategies are developed to locate a mobile efficiently. The ultimate goal of paging strategies is to minimize both the time delay and cost of paging until the mobile is found.</p>

<p>Now we define our problem formally. The location area is the set of n cells C = {c<sub>1</sub>, c<sub>2</sub>, &hellip;, c<sub>n</sub>} such that the mobile is guaranteed to be in one of these cells at the time of a call arrival. Suppose that it is possible to page any subset of these n cells in a unit of time (paging rounds) and find out if the mobile is located in one of the cells paged. The fastest strategy to find the cell where the mobile is located is to page all the n cells in the first and only round. However this strategy uses a lot of wireless bandwidth.</p>

<p>In many cases, the cellular network knows about the whereabouts of the mobile. This knowledge can be modeled with n probability values, where the probability of the mobile being present in a cell can be estimated for each of these n cells at the time of a call arrival. Let p<sub>i</sub> be the probability that the mobile is located at the cell c<sub>i</sub> and all the probabilities are independent. A sequential paging strategy is to page the cells sequentially in n paging rounds terminating once the mobile is found. Then the average cost of paging (number of cells paged), \(\bar { C } \) , and the average paging delay (number of paging rounds) in locating the mobile, \(\bar { D } \) , can be expressed as follows:</p>

<p style="text-align:center">\[\bar { C } = \sum_{i=1}^{n}{(i \times p_i)}\text{, }\bar { D } = \sum_{i=1}^{n}{(i \times p_i)} \text{.}\]</p>

<p>The parallel paging strategy is to page the cells in a collection of cells simultaneously. Sequential paging strategy has lower paging cost than parallel paging strategy, but at the expense of larger paging delay. The method of parallel paging is to partition the cells in a location area into a series of indexed groups referred to as paging zones. Let Z<sub>1</sub>, Z<sub>2</sub>, &hellip;, Z<sub>w</sub> be the partition of the location area C (i.e., a partition of C into w groups), where each Z<sub>i</sub> is non-empty and corresponds to a distinct paging zone. When a call arrives for a mobile, the cells in the first paging zone Z<sub>1</sub> are paged simultaneously in the first round and then if the m obile is not found in the first round of paging, all the cells in the second paging zone Z<sub>2</sub> are paged, and so on. Let the number of cells in the paging zone Z<sub>i</sub> be denoted by n<sub>i</sub> = | Z<sub>i</sub> |, and let &pi;i be the corresponding zone probabilities of the users in the paging zone Z<sub>i</sub>, where \(\pi_i = \sum_{c_j \in Z_i} {p_j}\). Then the average cost of paging (number of cells paged), \(\bar { C } \) , and the average paging delay (number of paging rounds) in locating the mobile, \(\bar { D } \), can be expressed as follows:</p>

<p>\[\bar{C} = \sum_{i=1}^{w}{\left(\sum_{j=1}^{i}{n_j} \right) \pi_i} \text{, } \bar{D} = \sum_{i=1}^{w}{(i \times \pi_i)} \text{.}\]</p>

<p>In parallel paging strategy, there is a tradeoff between bandwidth for time. For example, we increases the number of paging zones, then the paging cost could be decreased. If we decrease the number of paging zones, then the paging cost could be increased. Furthermore, for a fixed number w of paging zones, the paging cost could be different to the strategies how the cells in location area are partitioned.</p>

<p>For example, there are n=5 cells in a location area C = {c<sub>1</sub>, c<sub>2</sub>, &hellip;, c<sub>5</sub>} and the probability of each cells in C are as follows:</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<td>c<sub>i</sub></td>
			<td>c<sub>1</sub></td>
			<td>c<sub>2</sub></td>
			<td>c<sub>3</sub></td>
			<td>c<sub>4</sub></td>
			<td>c<sub>5</sub></td>
		</tr>
		<tr>
			<td>p<sub>i</sub></td>
			<td>0.3</td>
			<td>0.05</td>
			<td>0.1</td>
			<td>0.3</td>
			<td>0.25</td>
		</tr>
	</tbody>
</table>

<p>If the cells in C are partitioned into two paging zones Z<sub>1</sub> = { c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub> }, Z<sub>2</sub> = { c<sub>4</sub>, c<sub>5</sub> }, the average cost of paging \(\bar{C}\), and the average paging delay in locating the mobile, \(\bar{D}\) , are:</p>

<ul>
	<li>\(\bar{C}\) = n<sub>1</sub>&pi;<sub>1</sub> + (n<sub>1</sub> + n<sub>2</sub>)&pi;<sub>2</sub> = 3(0.3 + 0.05 + 0.1) + (3+2)(0.3 + 0.25) = 3 &times; 0.45 + 5 &times; 0.55 = 4.1</li>
	<li>\(\bar{D}\) = 1&pi;<sub>1</sub> + 2&pi;<sub>2</sub> = 1(0.3 + 0.05 + 0.1) + 2(0.3 + 0.25) = 1 &times; 0.45 + 2 &times; 0.55 = 1.55</li>
</ul>

<p>If the cells in C are partitioned into two paging zones Z<sub>1</sub> = { c<sub>1</sub>, c<sub>4</sub> }, Z<sub>2</sub> = { c<sub>2</sub>, c<sub>3</sub>, c<sub>5</sub> }, the average cost of paging, \(\bar{C}\), and the average paging delay in locating the mobile, \(\bar{D}\), are:</p>

<ul>
	<li>\(\bar{C}\) = n<sub>1</sub>&pi;<sub>1</sub>&nbsp;+ (n<sub>1</sub>&nbsp;+ n<sub>2</sub>)&pi;<sub>2</sub>&nbsp;= 2(0.3 + 0.3) + (3+2)(0.05 + 0.1 + 0.25) = 2 &times; 0.6 + 5 &times; 0.4 = 3.2</li>
	<li>\(\bar{D}\) = 1&pi;<sub>1</sub>&nbsp;+ 2&pi;<sub>2</sub>&nbsp;= 1(0.3 + 0.3) + 2(0.05 + 0.1 + 0.25) = 1 &times; 0.6 + 2 &times; 0.4 = 1.4</li>
</ul>

<p>Given the number of cells in a location area C, the probabilities of each cells that a mobile is located at the cell, and the fixed number w of paging zones, write a program to partition the cells in C into w paging zones such that the average cost of paging to find the location of the mobile is minimized.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case consists of two lines. The first line of each test case contains two integers. The first integer, n, is the number of cells in a location area, and the second integer, w, is the number of paging zones, where 1 &le;&nbsp;w &le; n &le; 100 . The second line of each test case contains n integers u<sub>1</sub>, u<sub>2</sub>, &hellip;, u<sub>n</sub>, where the probability p<sub>i</sub> for each cell c<sub>i</sub> in C is p<sub>i</sub> = u<sub>i</sub> / (u<sub>1</sub> + u<sub>2</sub> + ... + u<sub>n</sub>). All integers in the second line are between 1 and 10,000.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain the minimum average cost of paging to find the location of the mobile. The output should have a precision of exactly 4 digits after decimal point. You may round to the 4 digits after decimal point or round off at the 4-th digit after decimal point.</p>