# [Platinum I] Multisect - 15537

[문제 링크](https://www.acmicpc.net/problem/15537)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 20, 맞힌 사람: 16, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>We are developing the world&rsquo;s coolest AI robot product. After the long struggle, we finally managed to send our product at revision R<sub>RC</sub> to QA team as a release candidate. However, they reported that some tests failed! Because we were too lazy to set up a continuous integration system, we have no idea when our software corrupted. We only know that the software passed all the test at the past revision R<sub>PASS</sub>. To determine the revision R<sub>ENBUG</sub> (RP<sub>ASS</sub> &lt; R<sub>ENBUG</sub> &le; R<sub>RC</sub>) in which our software started to fail, we must test our product revision-by-revision.</p>

<p>Here, we can assume the following conditions:</p>

<ul>
	<li>When we test at the revision R, the test passes if R &lt; R<sub>ENBUG</sub>, or fails otherwise.</li>
	<li>It is equally possible, which revision between R<sub>PASS</sub> + 1 and R<sub>RC</sub> is R<sub>ENBUG</sub>.</li>
</ul>

<p>From the first assumption, we don&rsquo;t need to test all the revisions. All we have to do is to find the revision R such that the test at R &minus; 1 passes and the test at R fails. We have K testing devices. Using them, we can test at most K different revisions simultaneously. We call this &ldquo;parallel testing&rdquo;. By the restriction of the testing environment, we cannot start new tests until a current parallel testing finishes, even if we don&rsquo;t use all the K devices.</p>

<p>Parallel testings take some cost. The more tests fail, the more costly the parallel testing becomes. If i tests fail in a parallel testing, its cost is T<sub>i</sub> (0 &le; i &le; K). And if we run parallel testings multiple times, the total cost is the sum of their costs.</p>

<p>Of course we want to minimize the total cost to determine R<sub>ENBUG</sub>, by choosing carefully how many and which revisions to test on each parallel testing. What is the minimum expected value of the total cost if we take an optimal strategy?</p>

### 입력

<p>The input consists of a single test case with the following format.</p>

<pre>
R<sub>PASS</sub> R<sub>RC</sub> K
T<sub>0</sub> T<sub>1</sub> ... T<sub>K</sub></pre>

<p>R<sub>PASS</sub> and R<sub>RC</sub> are integers that represent the revision numbers of our software at which the test passed and failed, respectively. 1 &le; R<sub>PASS</sub> &lt; R<sub>RC</sub> &le; 1,000 holds. K (1 &le; K &le; 30) is the maximum number of revisions we can test in a single parallel testing. T<sub>i</sub> is an integer that represents the cost of a parallel testing in which i tests fail (0 &le; i &le; K). You can assume 1 &le; T<sub>0</sub> &le; T<sub>1</sub> &le; &middot; &middot; &middot; &le; T<sub>K</sub> &le; 100,000.</p>

### 출력

<p>Output the minimum expected value of the total cost. The output should not contain an error greater than 0.0001.</p>