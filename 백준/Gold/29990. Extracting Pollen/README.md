# [Gold II] Extracting Pollen - 29990

[문제 링크](https://www.acmicpc.net/problem/29990)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 17, 맞힌 사람: 16, 정답 비율: 84.211%

### 분류

스위핑

### 문제 설명

<p>Spring has arrived, ushering in a season of hard work at the Swarm of Bees Company (SBC). With the blooming of N beautiful flowers in the garden, each flower boasts a certain quantity of pollen grains. The SBC enforces strict rules to keep the bees industrious in their pollen collection.</p>

<ol>
	<li>The first rule pertains to the amount of pollen grains collected: when a bee visits a flower, it must gather the sum of the digits in its current pollen quantity. For instance, if a bee visits a flower with 123 pollen grains, it must collect 1 + 2 + 3 = 6 grains, leaving the flower with 123 &minus; 6 = 117 grains. Similarly, if the flower holds 201 grains, the bee must gather 2 + 0 + 1 = 3 grains, leaving 198 grains remaining.</li>
	<li>All bees must form a queue at the start of the day; the bee at the front of the queue must collect pollen from one of the flowers with the largest amount pollen. If a bee visits a flower with 0 grains of pollen, it collects zero grains. After collecting pollen from a flower, the bee ends its shift and returns to the hive.</li>
</ol>

<p>Gertrude finds these rules bewildering and seeks help to determine the pollen amount she must collect when it&rsquo;s her turn. Getrude has amazingly sharp sight and noticed that she is currently the K-th bee in the SBC-defined order.</p>

### 입력

<p>The first line contains two integers N (1 &le; N &le; 10<sup>6</sup>) and K (1 &le; K &le; 10<sup>9</sup>), representing the number of flowers and Gertrude&rsquo;s position in the bee line, respectively. The second line contains N integers, where the i-th integer F<sub>i</sub> (1 &le; F<sub>i</sub> &le; 10<sup>6</sup> for 1 &le; i &le; N) denotes the initial quantity of pollen grains of the i-th flower.</p>

### 출력

<p>Output a single integer Q representing the amount of pollen Gertrude will collect.</p>