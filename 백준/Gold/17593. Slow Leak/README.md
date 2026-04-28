# [Gold II] Slow Leak - 17593

[문제 링크](https://www.acmicpc.net/problem/17593)

### 성능 요약

시간 제한: 14 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 146, 정답: 47, 맞힌 사람: 38, 정답 비율: 35.849%

### 분류

데이크스트라, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>You are an avid cyclist and bike every day between your home and school. Usually, your ride is uneventful and you bike along the shortest path between home and school. After school this afternoon you realized you have a slow leak in your bike tire&mdash;the tire can hold some air, but not for long. Refilling the tire allows you to ride your bike for some distance, after which your tire goes flat again and it becomes impossible to ride any further (and you refuse to walk your bicycle).</p>

<p>Luckily for you, your city has installed several bike repair stations at intersections throughout town where you can refill your tire and bike again until the tire goes flat. There&rsquo;s a repair station at your school too, so that you can fill up your tire before you start on your trip home.</p>

<p>You&rsquo;ve calculated how far you can bike before your tire runs out of air and you know the layout of your town, including all the intersections, distances between them, and the locations of the repair stations. What is the shortest possible trip from school to your home that you can take without becoming stuck due to a flat tire? (You do not become stuck if you roll into a repair station, or your home, at the exact same time as your tire goes flat.)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17593.%E2%80%85Slow%E2%80%85Leak/1f3f4c66.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17593.%E2%80%85Slow%E2%80%85Leak/1f3f4c66.png" data-original-src="https://upload.acmicpc.net/41f54764-0c8b-4e2e-a5a2-98113e31464e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 249px;" /></p>

<p style="text-align: center;">Figure I.1: An illustration of the two sample inputs.</p>

### 입력

<p>The first line of input contains four integers <em>n</em>, <em>m</em>, <em>t</em>, and <em>d</em>, satisfying 2 &le; <em>n</em> &le; 500, 0 &lt; <em>m</em> &le; <em>n</em>(<em>n</em> &minus; 1)/2, 0 &lt; <em>t</em> &lt; <em>n</em> and 0 &lt; <em>d</em> &lt; 2<sup>31</sup>. The value <em>n</em> represents the number of intersections in the city, <em>m</em> represents the number of roads in the city, <em>t</em> is the number of repair stations and <em>d</em> is the distance that you can bike (starting with a fully inflated tire) before your tire goes flat again. The intersections are numbered from 1 to <em>n</em>. Your school is at intersection 1 and your home is at intersection <em>n</em>.</p>

<p>The second line of input contains <em>t</em> integers, with values between 2 and <em>n</em> &minus; 1, inclusive. These are the intersections&nbsp;where the repair stations are located (excluding your school&rsquo;s repair station). All integers on this line are unique.</p>

<p>The next <em>m</em> lines represent the roads in your town. Each has three integers <em>i</em>, <em>j</em>, <em>k</em>, where 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>n</em>, and 0 &lt; <em>k</em> &lt; 2<sup>31</sup>. These three integers represent that there is a direct road from intersection <em>i</em> to intersection <em>j</em> of length <em>k</em>. Roads can be traveled in either direction. There is at most one road between any two intersections.</p>

### 출력

<p>Print the minimum total distance you need to travel to reach home from school without getting stuck due to a flat tire. If the trip is not possible, output the word <code>stuck</code> on a single line instead.</p>

<p>It is guaranteed that if the trip is possible, the minimum distance <em>D</em> satisfies 0 &lt; <em>D</em> &lt; 2<sup>31</sup>.</p>

### 힌트

<p>In the first sample input, if your tire did not have a leak then the shortest path home would have a distance of 9, going from the school through intersections 3 and 5. However, due to the leak, you can only travel a distance of 4 before you need to refill the tire, requiring you to use the repair stations at intersections 2 and 5, for a total distance of 12.</p>

<p>In the second sample input, if your tire did not have a leak, then the shortest path home would have a distance of 12. But since your tire only lasts for a distance of 10, there&rsquo;s no path where your bike tire will not go flat somewhere along the way. Even when using repair station at intersection 2, you get stuck before you can reach either your home or the repair station at intersection 5.</p>