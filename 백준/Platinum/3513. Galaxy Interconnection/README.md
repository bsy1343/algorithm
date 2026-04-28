# [Platinum IV] Galaxy Interconnection - 3513

[문제 링크](https://www.acmicpc.net/problem/3513)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 31, 정답: 7, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

그래프 이론, 그래프 탐색, 해 구성하기, 깊이 우선 탐색

### 문제 설명

<blockquote>
<p>And then, eight hundred and eight years ago, there occurred an event of such great importance that it marked a new era in the history of mankind &mdash; the Era of the Great Circle.</p>

<p style="text-align: right;">Andromeda: A Space-Age Tale</p>

<p style="text-align: right;">Ivan Yefremov</p>
</blockquote>

<p>More than 1000 years passed from the first ACM ICPC. Several civilizations of our Galaxy, including the Earth, are united in the Great Circle whose members exchange and relay scientific and cultural information. Due to the distribution of gravity and dark energy flows in galaxy, there are bidirectional communication channels between some planets. Via these channels, civilizations can distribute knowledge across all the Great Circle.</p>

<p>It&rsquo;s now the time to distribute researches between civilizations: each planet has to choose one of k main research areas (such as Repagular Calculus or Given String Theory).</p>

<p>The choice of k was not accidental. The Great Circle started from Initial Circle &mdash; a set of k planets that were connected with channels forming a cycle. Later new channels were investigated and built and new planets were connected to the Great Circle. However due to high energy cost of communication channels, each planet of the Great Circle has strictly less than k channels.</p>

<p>Two planets connected with direct channel shouldn&rsquo;t choose the same research area: they&rsquo;d better choose different ones and share research results.</p>

<p>There is one more limitation. Periodically civilizations send space expeditions in order to explore new planets and visit neighbors from the Great Circle. Expeditions are planned in such a way that spaceships can fly from one planet to another if these planets are connected with communication channel. This helps to prepare the expedition: to build refuel stations, optimize ship communication systems, etc.</p>

<p>Some expeditions, so-called Research Audits, are planned in such a way that a space ship starts from some planet, then makes k &minus; 1 jumps, visiting total of k planets (including origin). These k planets together should provide all k research areas: the expedition will check the progress of researching.</p>

<p>Your task is to choose one research area for each planet in such a way that:</p>

<ul>
	<li>there are no two planets connected by communication channel with the same research area;</li>
	<li>it is possible to send Research Audit expedition from every planet of the Great Circle.</li>
</ul>

### 입력

<p>First line of the input file contains three integer numbers: n, k and m &mdash; the number of planets in the Great Circle, the number of research areas and the number of communication channels correspondingly (3 &le; n &le; 5000; 3 &le; k &le; min(n, 10); 1 &le; m &le; 10000).</p>

<p>The following m lines describe channels, one per line. Communication channel is described by two integer numbers &mdash; identifiers of the planets it connects. Planets are identified by integer numbers from 1 to n in such a way that planets from 1 to k form the Initial Cycle.</p>

### 출력

<p>Output exactly n integers in one line, i-th integer should identify a research area for planet i (an integer number from 1 to k).</p>