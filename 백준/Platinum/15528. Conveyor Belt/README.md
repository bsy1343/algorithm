# [Platinum I] Conveyor Belt - 15528

[문제 링크](https://www.acmicpc.net/problem/15528)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 17, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

자료 구조, 그리디 알고리즘, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p><em>Awesome Conveyor Machine</em>&nbsp;(ACM) is the most important equipment of a factory of&nbsp;<em>Industrial Conveyor Product Corporation</em>&nbsp;(ICPC). ACM has a long conveyor belt to deliver their products from some points to other points. You are a programmer hired to make efficient schedule plan for product delivery.</p>

<p>ACM&#39;s conveyor belt goes through <em>N</em>&nbsp;points at equal intervals. The conveyor has plates on each of which at most one product can be put. Initially, there are no plates at any points. The conveyor belt moves by exactly one plate length per unit time; after one second, a plate is at position 1 while there are no plates at the other positions. After further 1 seconds, the plate at position 1 is moved to position 2 and a new plate comes at position 1, and so on. Note that the conveyor has the unlimited number of plates: after <em>N</em>&nbsp;seconds or later, each of the <em>N</em>&nbsp;positions has exactly one plate.</p>

<p>A delivery task is represented by positions&nbsp;<em>a</em>&nbsp;and&nbsp;<em>b</em>; delivery is accomplished by putting a product on a plate on the belt at&nbsp;<em>a</em>, and retrieving it at <em>b</em>&nbsp;after&nbsp;<em>b</em>&minus;<em>a</em> seconds (<em>a</em> &lt; <em>b</em>). (Of course, it is necessary that an empty plate exists at the position at the putting time.) In addition, putting and retrieving products must be done in the following manner:</p>

<ul>
	<li>When putting and retrieving a product, a plate must be located just at the position. That is, products must be put and retrieved at integer seconds.</li>
	<li>Putting and retrieving at the same position&nbsp;<em>cannot</em>&nbsp;be done at the same time. On the other hand, putting and retrieving at the different positions can be done at the same time.</li>
</ul>

<p>If there are several tasks, the time to finish all the tasks may be reduced by changing schedule when each product is put on the belt. Your job is to write a program minimizing the time to complete all the tasks... wait, wait. When have you started misunderstanding that you can know all the tasks initially? New delivery requests are coming moment by moment, like plates on the conveyor! So you should update your optimal schedule per every new request.</p>

<p>A request consists of a start point&nbsp;aa, a goal point&nbsp;bb, and the number&nbsp;pp&nbsp;of products to deliver from&nbsp;<em>a</em> to&nbsp;<em>b</em>. Delivery requests will be added&nbsp;<em>Q</em> times. Your (true) job is to write a program such that for each&nbsp;1 &le; <em>i</em> &le; <em>Q</em>, minimizing the entire time to complete delivery tasks in requests 1 to&nbsp;<em>i</em>.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre>
N Q
a<sub>1</sub> b<sub>1</sub> p<sub>1</sub>
⋮
a<sub>Q</sub> b<sub>Q</sub> pQ</pre>

<p>A first line includes two integers <em>N</em> and <em>Q</em> (2 &le; <em>N</em> &le; 10<sup>5</sup>, 1 &le; <em>Q</em> &le; 10<sup>5</sup>): <em>N</em> is the number of positions the conveyor belt goes through and <em>Q</em> is the number of requests will come. The <em>i</em>-th line of the following <em>Q</em> lines consists of three integers <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, and <em>p<sub>i</sub></em> (1 &le; <em>a<sub>i</sub></em> &lt; <em>b<sub>i</sub></em> &le; <em>N</em>, 1 &le; <em>p<sub>i</sub></em> &le; 10<sup>9</sup>), which mean that the <em>i</em>-th request requires <em>p<sub>i</sub></em> products to be delivered from position <em>a<sub>i</sub></em> to position <em>b<sub>i</sub></em>.</p>

### 출력

<p>In the <em>i</em>-th line, print the minimum time to complete all the tasks required by requests 1 to <em>i</em>.</p>

### 힌트

<p>Regarding the first example, the minimum time to complete only the first request is 4 seconds. All the two requests can be completed within 4 seconds too. See the below figure.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15528/1.png" style="height:245px; width:400px" /></p>