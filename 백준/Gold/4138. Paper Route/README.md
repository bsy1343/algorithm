# [Gold III] Paper Route - 4138

[문제 링크](https://www.acmicpc.net/problem/4138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 23, 맞힌 사람: 14, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>As a poor, tuition-ridden student, you&#39;ve decided to take up a part time job as a paperboy/papergirl.&nbsp;You&#39;ve just been handed your paper route: a set of addresses (conveniently labelled 1 to <em>N</em>).</p>

<p>Every morning, you start at the newspaper office (which happens to be address number 0). You have to plan a route to deliver a newspaper to every address - and you also want to get to class right after you&#39;re done.&nbsp;Conveniently, there are only <em>N</em> roads in your area connecting the addresses, and each of them takes a known time to traverse.&nbsp;Also, you&#39;ve precalculated the time it takes to get to Waterloo campus from each address, including the newspaper office (through some combination of biking, busing, or hitching a ride).&nbsp;How soon can you be done delivering papers and be in your seat at school?</p>

### 입력

<p>First, there will be a single integer <em>N</em> (the number of addresses, 1 &le; <em>N</em> &le; 100,000).</p>

<p>Next, there will be <em>N</em>+1 lines, each with an integer <em>c<sub>i</sub></em> (starting with <em>i</em> = 0, 0 &le; <em>c<sub>i</sub></em> &le; 1,000,000,000), the time it takes to get from location <em>i</em> to campus.</p>

<p>Finally, the input will contain <em>N</em> lines, each with three integers <em>a</em>, <em>b</em>, <em>c</em> (0 &le; <em>a</em>, <em>b</em> &le; <em>N</em>, <em>a</em> != <em>b</em>, 0 &le; <em>c</em> &le; 1,000). Each of these lines describes a road between locations <em>a</em> and <em>b</em> taking <em>c</em> minutes to traverse.</p>

<p>It is guaranteed that you will be able to reach all the addresses. (Remember that location 0 is the newspaper office.)</p>

### 출력

<p>Output the minimum time it will take to deliver all the papers and get to class.</p>

### 힌트

<p>It&#39;s actually better to visit all the addresses, go back to the office, and get to school from there.</p>

<p>An example route: 0 -&gt; 1 -&gt; 0 -&gt; 2 -&gt; 0 -&gt; school = 1 + 1 + 2 + 2 + 1 = 7</p>