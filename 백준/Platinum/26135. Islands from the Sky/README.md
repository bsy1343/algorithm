# [Platinum III] Islands from the Sky - 26135

[문제 링크](https://www.acmicpc.net/problem/26135)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 39, 맞힌 사람: 30, 정답 비율: 62.500%

### 분류

기하학, 이분 탐색, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>You might never have heard of the island group of Iceepeecee, but that suits their inhabitants just fine. Located in a remote part of the South Pacific, they are truly off the beaten track, without any regular air or sea traffic, and they have remained a tropical paradise with unspoiled local fauna and flora.</p>

<p>Being off the map is great when you don&rsquo;t want to be overrun by hordes of tourists, but not so ideal when you actually do need a map for some reason. One such reason came up recently: Iceepeecee&rsquo;s central government needs an exact map of the islands to apportion government funds. Even tropical paradises need money, so Iceepeecee needs a map!</p>

<p>The easiest way to create a map would be an aerial survey. After dismissing chartering planes as too expensive, building an air balloon as too dangerous, and fitting carrier pigeons with cameras as too cruel to animals, they had a brilliant idea. Even with its remote location, there are still plenty of commercial airplanes crossing the skies above Iceepeecee. What if one mounted cameras on flights that are already scheduled to fly anyway? That would be a cheap solution to the problem!</p>

<p>Iceepeecee&rsquo;s plan is to install line-scan cameras on the planes. These cameras point straight downwards and collect images one line segment at a time, orthogonal to the flight path. The photographed line segment will be determined by the altitude that the plane is flying at, and the camera&rsquo;s aperture angle &theta; (see Figure F.1). Greater angles &theta; mean that the camera can see more, but also that the camera is more expensive.</p>

<p>Moreover, Iceepeecee wants to make sure that each island is observed in its entirety by at least one flight. That means it is not sufficient that an island is only partially photographed by multiple flights, even if the combination of the photographs covers the whole island.</p>

<p>Flight paths follow straight line segments in three-dimensional space, that is, (x<sub>1</sub>, y<sub>1</sub>, z<sub>1</sub>) &minus; (x<sub>2</sub>, y<sub>2</sub>, z<sub>2</sub>) (see Figure F.2), where the z-coordinates give the altitude of the plane. Photographs are taken only along these line segments.</p>

<p>Given the location of their islands and flights, Iceepeecee wants to find the smallest aperture angle &theta; that allows for a successful survey. Can you help?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26135.%E2%80%85Islands%E2%80%85from%E2%80%85the%E2%80%85Sky/1f4e01ec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26135.%E2%80%85Islands%E2%80%85from%E2%80%85the%E2%80%85Sky/1f4e01ec.png" data-original-src="https://upload.acmicpc.net/e1ed84d2-0f8e-4727-b4f2-05f185c52bd6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 208px; height: 132px;" /></p>

<p style="text-align: center;">Figure F.1: A view of the plane, shown head-on. Its camera points downward and can see the part of the ground underneath the plane that is shown in green. How much is visible depends on the aperture angle &theta;.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26135.%E2%80%85Islands%E2%80%85from%E2%80%85the%E2%80%85Sky/0916fca3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26135.%E2%80%85Islands%E2%80%85from%E2%80%85the%E2%80%85Sky/0916fca3.png" data-original-src="https://upload.acmicpc.net/8916a9ce-8a45-45bb-b849-06ea8c66fd83/-/crop/267x278/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 134px; height: 139px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26135.%E2%80%85Islands%E2%80%85from%E2%80%85the%E2%80%85Sky/edb9ea73.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26135.%E2%80%85Islands%E2%80%85from%E2%80%85the%E2%80%85Sky/edb9ea73.png" data-original-src="https://upload.acmicpc.net/8916a9ce-8a45-45bb-b849-06ea8c66fd83/-/crop/300x278/334,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 139px;" /></td>
		</tr>
		<tr>
			<td>(a) Three islands (shown in black) and two flight paths (red and green). Altitudes are not shown.</td>
			<td>(b) The shaded areas represent the ground visible on the two flight paths for an optimally chosen &theta;.</td>
		</tr>
		<tr>
			<td colspan="2">Figure F.2: Surveying three islands via two flight paths. This corresponds to the first sample input.</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input describes a set of islands and flight paths. It starts with a line containing two integers n and m, the number n of islands, and the number m of flight paths, respectively (1 &le; n, m &le; 100). This is followed by descriptions of the n islands. Each island description starts with a line containing a single integer ni , the number of vertices of the polygon describing the i<sup>th</sup> island (3 &le; n<sub>i</sub> &le; 100). It is followed by ni lines, each containing two integers x<sub>ij</sub>, y<sub>ij</sub> (|x<sub>ij</sub>|, |y<sub>ij</sub>| &le; 10<sup>6</sup>), specifying the vertices for the i<sup>th</sup> island in counterclockwise order. Each island&rsquo;s polygon is simple, that is, its vertices are distinct and no two edges of the polygon intersect or touch, other than consecutive edges which touch at their common vertex. Different islands do not intersect or touch.</p>

<p>The input concludes with another m lines, each describing a flight path. Each such line contains six integers x<sub>1</sub>, y<sub>1</sub>, z<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, z<sub>2</sub> (|x<sub>i</sub>|, |y<sub>i</sub>|, |z<sub>i</sub>| &le; 10<sup>6</sup>, z<sub>i</sub> &gt; 0 and (x<sub>1</sub>, y<sub>1</sub>) &ne; (x<sub>2</sub>, y<sub>2</sub>)). They specify that a flight takes place from (x<sub>1</sub>, y<sub>1</sub>, z<sub>1</sub>) to (x<sub>2</sub>, y<sub>2</sub>, z<sub>2</sub>).</p>

### 출력

<p>Output the smallest angle &theta; (in degrees) that allows for a complete survey of the islands with the given flights. The answer should be exact to an absolute or relative error of 10<sup>-6</sup>. If there is no such angle, then output <code>impossible</code>. The input is chosen such that if the coordinates of the island vertices are changed by at most &plusmn;10<sup>-8</sup> , then the answer will not change more than the allowed rounding error.</p>