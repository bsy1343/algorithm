# [Gold III] Cruise Quail - 16091

[문제 링크](https://www.acmicpc.net/problem/16091)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>The Cruise Quail is a mysterious flightless bird that lives on the ground of Madagascar&rsquo;s SubTropical forest (MST forest). Like salmons, which go up and down the same river at given dates, cruise quails have specific migration patterns even though they cannot fly. These patterns are the main research topic of scientists in the Union of Animal Finders.</p>

<p>Over the years, these scientists have identified a list of nesting areas, where cruise quails may nest, as well as routes connecting the nesting areas, along which cruise quails may walk. They know that every cruise quail has one nesting area for summer and another nesting area for winter (which is necessarily different). During the yearly migration, each cruise quail goes from its summer nesting area to its winter nesting area by taking a migration path that follows the routes (it may pass through other nesting areas along the way); and then the quail will go back from its winter nesting area to its summer nesting area following a different migration path. A cruise quail always takes a completely different path to get back to the summer nesting area, i.e., no route can be part of the two migration paths.</p>

<p>To learn more about cruise quails, the scientists intend to photograph them, using cameras that should be installed in the MST forest along some of the routes. When a route is equipped with a camera, then the camera will automatically trigger when a cruise quail passes by (in either direction). However, it is not always easy to equip routes with cameras, and each route thus has a cost that indicates how costly it is to install a camera on that route.</p>

<p>The scientists want to take a picture of each cruise quail every year, while minimizing the cost spent to install cameras. Specifically, they want to ensure that no matter which nesting areas and migration paths are followed by the cruise quails, it is the case that every cruise quail will pass by at least one route equipped with a camera along one of its two migration paths; and they want to know what is the minimal total cost of installing cameras to guarantee this.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16091.%E2%80%85Cruise%E2%80%85Quail/eeb85269.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16091.%E2%80%85Cruise%E2%80%85Quail/eeb85269.png" data-original-src="https://upload.acmicpc.net/590f22fb-65c1-4236-9467-80bf85db7ea0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 181px; height: 156px;" /></p>

<p style="text-align: center;">Figure 4: MST forest example</p>

<p>Consider, for instance, the nesting areas and routes in Figure 4, where the cost of installing a camera on a route is indicated as an integer next to it. Cruise quails can migrate along any route in any direction. A possible path for the migration of a cruise quail could be (v<sub>1</sub>, v<sub>2</sub>, v<sub>5</sub>, v<sub>4</sub>, v<sub>1</sub>). For this particular path, the cost-optimal solution would be to install a camera on the route from v<sub>1</sub> to v<sub>4</sub>. Considering all possible routes that cruise quails can take, the cost-optimal solution on this example is to place cameras along routes from v<sub>1</sub> to v<sub>4</sub> and from v<sub>3</sub> to v<sub>6</sub>, at a total cost of 5 (i.e., 1 + 4). This ensures that every possible migration path passes by at least one route that is equipped with a camera.</p>

### 입력

<p>The input file consists of multiple test cases. The first line of the input file consists of a single integer indicating the number of test cases. Each test case follows. The first line of each test case consists of two integers p and r separated by a single space. The integer 3 &le; p &le; 2 000 is the number of nesting areas, and the integer 3 &le; r &le; 400 000 is the number of routes. The rest of the test case consists of r lines. For 1 &le; i &le; r, the i-th line describes the i-th route, and consists of three integers u<sub>i</sub>, v<sub>i</sub>, and c<sub>i</sub>, each separated by a single space: 1 &le; u<sub>i</sub> &le; p and 1 &le; v<sub>i</sub> &le; p are the nesting areas connected by the i-th route, and 1 &le; c<sub>i</sub> &le; 3 000 is the cost of equipping the i-th route with a camera. There are no loops, i.e., we have x<sub>i</sub>&nbsp;&ne;&nbsp;y<sub>i</sub> for all 1 &le; i &le; r. Furthermore, all migration routes are distinct, i.e., for all i, j with 1 &le; i &lt; j &le; r, we have (u<sub>i</sub>, v<sub>i</sub>) &ne; (u<sub>j</sub>, v<sub>j</sub>) and (u<sub>i</sub>, v<sub>i</sub>) &ne;&nbsp;(v<sub>j</sub>, u<sub>j</sub>).</p>

### 출력

<p>For each test case in the input, your program should produce one line consisting of one integer that indicates the minimum total cost of equipping routes of the MST forest with cameras so as to guarantee that each cruise quail will pass by at least one route equipped by a camera during its migration. There should be no blank lines in your output.</p>