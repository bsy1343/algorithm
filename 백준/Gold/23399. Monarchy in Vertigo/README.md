# [Gold III] Monarchy in Vertigo - 23399

[문제 링크](https://www.acmicpc.net/problem/23399)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 15, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 트리, 깊이 우선 탐색, 스택, 오프라인 쿼리, 덱

### 문제 설명

<p>Monarchy succession can be a tricky topic as it might take into account multiple factors such as descent, sex, legitimacy, and religion. Usually, the Crown is inherited by a sovereign&rsquo;s child or by a childless sovereign&rsquo;s nearest collateral line. Not really straightforward, right? And that&rsquo;s one of the reasons why, all over the world, monarchy is on the edge.</p>

<p>Nlogonia is still ruled by a monarchy though, luckily with simple succession rules. In general, there are only two aspects to take into account: &ldquo;children comes before siblings&rdquo; and &ldquo;older comes before younger&rdquo;.</p>

<p>The reign servants maintain a beautiful and enormous tapestry where the bloodline of Constant, Nlogonia&rsquo;s first ruler, is drawn in the shape of a tree. Whenever a new family member is born a new branch from the parent to the child is drawn in the tapestry. This is such an important event that legend says that when Constant&rsquo;s descendants have a child they will never die before watching their child&rsquo;s name added to the tapestry. When someone dies, a cross is drawn close to that person&rsquo;s name. Whenever the current monarch dies, the tapestry is used by the servants to determine who the next ruler should be. In order to determine who that person is, the servants start from Constant and traverse the tree according to the rules described earlier, &ldquo;children comes before siblings&rdquo; and &ldquo;older comes before younger&rdquo;. They descend the tree starting from Constant, followed by Constant&rsquo;s first child, followed by that child&rsquo;s first child, and so on, until reaching the first person alive or a family member that has no children left to follow, in which case they then go back to that person&rsquo;s parent and move into that parent&rsquo;s next child, repeating the process until the new monarch is determined.</p>

<p>After thousands of years in power Constant&rsquo;s bloodline is huge. To maintain the tapestry and, when the time comes, to determine who the next monarch should be are lengthy processes and Nlogonian servants decided it&rsquo;s time to modernize. They want to create a program to be used to maintain Constant&rsquo;s bloodline, which can also point who the next monarch should be after a ruler&rsquo;s tragic death. Given the importance of this task, the monarchy servants want to test the program by checking that it produces the correct output for all events that happened so far. There is one issue though, none of them is really good with programming and that&rsquo;s why they came after you for help.</p>

<p>More technically, each person in Constant&rsquo;s bloodline will be represented by a unique positive integer identifier. Whenever a new child is born, they take the next lowest unique identifier. Constant&rsquo;s identifier is equal to 1, and initially he&rsquo;s the only person alive. You will be given many events to process, in chronological order. Whenever someone dies, you should help the monarchy servants to figure out who the current monarch is. It&rsquo;s guaranteed that there will always be someone alive to rule.</p>

### 입력

<p>The first line contains an integer Q (1 &le; Q &le; 10<sup>5</sup>), representing how many events should be processed. The following Q lines contain two integers t<sub>i</sub> and x<sub>i</sub> each, representing the i-th event type and argument. If t<sub>i</sub> is equal to 1, then it means that person with identifier x<sub>i</sub> had a new child. If t<sub>i</sub> is equal to 2, then it means that person with identifier x<sub>i</sub> died.</p>

### 출력

<p>For each event in which someone dies, you should print a line with an integer, representing the identifier of the current monarch.</p>