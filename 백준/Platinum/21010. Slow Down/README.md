# [Platinum II] Slow Down - 21010

[문제 링크](https://www.acmicpc.net/problem/21010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 30, 맞힌 사람: 29, 정답 비율: 47.541%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Slow Town has N junctions numbered from 1 to N which are connected by M bi-directional roads such that from any junction we can always go to any other junction by traversing one or more roads. The time needed to traverse the j<sup>th</sup> road which connects junction u<sub>j</sub> and junction v<sub>j</sub> is t<sub>j</sub> unit.</p>

<p>Andi lives at junction 1 and his office is at junction N. Andi always goes out from his home at a fixed schedule and takes a route which allows him to arrive at the office as early as possible. Budi, Andi&rsquo;s supervisor, observes that Andi always arrives at the office way too early; this often causes issues with the security guards. Budi wishes Andi to slow down and arrive at the office at least 1 unit of time later than his usual. However, any negotiation between Andi and Budi is failed as Andi does not want to change his habit of going to the office which is going out at a fixed schedule and arriving at the office as early as possible.</p>

<p>Chandra, Budi&rsquo;s supervisor, thought that if they could not change Andi, then why don&rsquo;t they change the roads instead so that Andi&rsquo;s traveling time is longer? Yes, Chandra is able to do so as he has some influences in the town hall.</p>

<p>Specifically, Chandra can alter the time needed to traverse the j<sup>th</sup> road from t<sub>j</sub> to any other integer larger than t<sub>j</sub>. Let the new traversing time be t&#39;<sub>j</sub>, then the cost to alter the j<sup>th</sup> road&rsquo;s traversing time from t<sub>j</sub> to t&#39;<sub>j</sub> is t&#39;<sub>j</sub> &minus; t<sub>j</sub>.</p>

<p>Budi has gathered all the required information, and now he needs to calculate the minimum total cost required by Chandra to alter the roads such that the fastest traveling time from Andi&rsquo;s home to his office is increased by at least 1 unit of time. As a new intern in this office, help Budi to calculate the minimum required total cost.</p>

<p>For example, consider the following town with N = 7 junctions and M = 8 roads. Andi&rsquo;s home is at junction 1 and his office at junction 7. In this town, Andi needs at least 11 unit to go from his home to his office, e.g., via junction 1 &rarr; 2 &rarr; 5 &rarr; 7 or 1 &rarr; 4 &rarr; 6 &rarr; 7 with a total traveling time of 11 unit.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21010.%E2%80%85Slow%E2%80%85Down/3684b1a4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21010.%E2%80%85Slow%E2%80%85Down/3684b1a4.png" data-original-src="https://upload.acmicpc.net/0e39dea5-a0fe-4f21-83ec-58bc32ddea1f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 258px; height: 153px;" /></p>

<p>If Budi wishes Andi to arrive at least 1 unit of time later than his usual, then any route from Andi&rsquo;s home to his office needs to have a traveling time of at least 11 + 1 = 12 unit. There are several ways to achieve this, e.g., alter the traversing time of road (1, 2) from 2 to 3 and road (1, 4) from 3 to 4 with a total cost of 1 + 1 = 2. Alternatively, we can also alter the traversing time of road (2, 5) from 4 to 5 and road (6, 7) from 2 to 3 with a total cost of 1 + 1 = 2. There are also many other possible solutions. Overall, the minimum total cost to alter the roads to satisfy Budi&rsquo;s wish in this example is 2.</p>

### 입력

<p>Input begins with a line containing two integers: N M (2 &le; N &le; 1000; 1 &le; M &le; 20 000) representing the number of junctions and roads in Slow Town, respectively. The next M lines each contains three integers: u<sub>j</sub> v<sub>j</sub> t<sub>j</sub> (1 &le; u<sub>j</sub> &lt; v<sub>j</sub> &le; N; 1 &le; t<sub>j</sub> &le; 10<sup>6</sup>) representing a bi-directional road in Slow Town and its traversing time, respectively. It is guaranteed that there is at most one road connecting any pair of junctions and we can always go from any junction to any other junction through one or more roads.</p>

### 출력

<p>Output in a line an integer representing the minimum total cost required to alter the roads such that Andi&rsquo;s traveling time from his home to his office is increased by at least 1 unit of time.</p>