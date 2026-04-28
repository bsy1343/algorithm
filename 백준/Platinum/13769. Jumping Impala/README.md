# [Platinum III] Jumping Impala - 13769

[문제 링크](https://www.acmicpc.net/problem/13769)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 5, 맞힌 사람: 4, 정답 비율: 14.815%

### 분류

(분류 없음)

### 문제 설명

<p>Vlad the impala is both excited and nervous, as in a few months he will be participating in the annual challenge event where his herd will choose its leader for the coming year. As the eldest, he will be the first to undertake the challenge and will become the new leader if he succeeds. If Vlad does not succeed, the second eldest will then undertake the challenge and so on.</p>

<p>The impalas want a leader who can lead them safely to grazing grounds. Along the way, there are many predators and the challenge event is designed to test skills needed to avoid predators. Past volcanic activity has created a crocodile infested circular lake with a lushly vegetated circular island located exactly on the lake&rsquo;s centre. The challenge is to go from the outer edge of the lake to the island, graze for a couple of hours, then come back to the outer edge and finally make a second trip out to the island and again return back to the outer edge. Impalas are so frightened by the crocodiles that if an impala touches the water, it freezes and awaits its fate. Fortunately, there are some (unit radius) circular stones in the lake that impalas may use. By using these, it is not necessary to go to the island in a single bound from the lake&rsquo;s outer edge. Unfortunately, not only can crocodiles grab an impala in the water, but they can also grab an impala from a stone (but not the island or outer edge of the lake). However, Vlad has noticed that the crocodiles, which are slow by comparison with a leaping impala, always position themselves to exploit the impala tendency to reuse a previous route, e.g. returning from grazing on the island via the same stones as used on the way to the island. Indeed, the crocodiles never grab an impala from a stone that it is visiting for the first time. Vlad aims to exploit this weakness in the crocodile strategy. (As the first to attempt the challenge, he&rsquo;s not in a position to become leader by the usual manner&mdash;being the lucky impala that happens to attempt the challenge when the crocodiles are too full of previous challenge participants to be interested in another!)</p>

<p>An impala can leap (up to) a certain distance any number of times and turn arbitrarily tightly, so Vlad is working on improving his maximum leap distance and wants to know what it needs to be for him to be able to go to and from the island twice in safety (i.e. without ever revisiting any stone or touching the water). As Vlad has failed to &ldquo;get real&rdquo;, he wants to know the relevant integer value, e.g. if he needs to be able to leap at least 2.01, you&rsquo;ll have to tell him 3 to be on the safe side. You can assume that Vlad can leap from the exact edge of one object to the exact edge of another and that it is safe to leap over a previously visited stone without landing on it.</p>

### 입력

<p>The input will contain a single test case.</p>

<p>The input starts with a line containing the radius of the lake, L (4 &le; L &le; 10<sup>9</sup> ), the radius of the island, R (1 &le; R &le; L &minus; 3), and the number of stones in the lake, S (4 &le; S &le; 1 000). The next S lines contain the information about the stones, one stone per line. Each line describing a stone contains two integers, the x&minus; and y&minus;coordinates of its centre, regarding the lake centre as the origin (each coordinate will have absolute value no more than 10<sup>9</sup> ). These stones will be fully in the water. Stones may touch each other, the island, or the lake&rsquo;s outer edge, but there will be no overlaps between these items.</p>

### 출력

<p>Output the integer value Vlad wants to know. You can be assured that Vlad has to jump a positive distance in order to complete the challenge&mdash;otherwise, it wouldn&rsquo;t be a challenge!</p>