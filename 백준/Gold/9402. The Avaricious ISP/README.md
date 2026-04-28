# [Gold I] The Avaricious ISP - 9402

[문제 링크](https://www.acmicpc.net/problem/9402)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>&quot;Who can pay more money than the lonely, nevertheless affluent, internet user?&quot; said the head of the Avaricious Council of Money-makers (ACM), as the concluding remarks of her talks.</p>

<p>As a prestigious member of the council, you feel so lucky to be also the head of an Internet Service Provider. &ldquo;Let&rsquo;s build a new network. Yeah! And &hellip; we can charge the users for the traffic. This cannot be better! I&rsquo;m going to be rich.&rdquo; These are the thoughts that enter your mind immediately after the ACM head&rsquo;s talks.</p>

<p>Your network manager, a techie as you might guess, is not so good with economics. She doesn&rsquo;t understand anything about money. All she cares about is the so-called &ldquo;topology of the network.&rdquo; But remember the last time you tried to argue with her. You don&rsquo;t want that to happen again; so just listen to her.</p>

<p>She insists on having two wireless antennas connected to each other by an underground cable. Each antenna can cover a circle of arbitrary radius, centered on the antenna. But, no point in the plane (yes, we&rsquo;re like those people who think the Earth is flat) should be covered by both antennas; it might be disastrous, your network manager suggests, as a device in the coverage of both antennas can be confused to death!</p>

<p>Don&rsquo;t worry though. There are some potential customers, located in some known points on the plane. Each will join your network if any of your antennas cover her. Each customer i has a known value d<sub>i</sub> of traffic-desire. The amount of daily traffic between customers i and j would be equal to d<sub>i</sub> &times; d<sub>j</sub> , provided that they are both covered by your network.</p>

<p>Because of the technical difficulties which your network manager points, you can only measure the amount of traffic passing through the underground cable. Hence, you should try to maximize the traffic passing through the cable; i.e., the traffic between pairs of users connected to different antennas. You can do that, or you can try to fire your network manager and devise a better plan. Of course, you are suggested to go with the first option.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains a single integer 1 &le; N &le; 200, the number of potential customers. N lines follow, each containing the integer 1 &le; d<sub>i</sub> &le; 200 followed by a pair of integers &minus;10<sup>6</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>6</sup> showing the coordinates of the potential customer. The input terminates with a line containing &ldquo;0&rdquo;. For your convenience, the input data sets are designed so that no three potential customers of any given test lie on a common straight line.</p>

### 출력

<p>For each test case, write a single line containing the maximum traffic passing through the underground cable, assuming you choose the best possible location and radius of coverage for each antenna.</p>