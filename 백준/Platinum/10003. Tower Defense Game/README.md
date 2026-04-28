# [Platinum III] Tower Defense Game - 10003

[문제 링크](https://www.acmicpc.net/problem/10003)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 33, 맞힌 사람: 24, 정답 비율: 52.174%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>Bytie is playing the computer game Tower Defense. His aim is to construct guard towers, so that they protect all of his domain. There are multiple towns in Bytie&#39;s domain, some of which are linked by bidirectional roads. If Bytie erects a guard tower in a city, then the tower protects its city and all the cities directly linked with it by roads.</p>

<p>Just as Bytie was pondering over the placement of guard towers in his domain, his elder sister Bytea entered the room. She glanced at the map displayed on the screen, and after a moment exclaimed: &quot;Oi, what is there to think about, clearly k towers suffice!&quot;.</p>

<p>Angered by his sister spoiling the fun, Bytie showed his sister the door, and began wondering what to do next. Pride will not let him construct more than k towers. He has an up his sleeve though: he can research a technology that will allow him to construct improved guard towers. An improved guard tower protects not only the town it was erected in and its immediate neighbors but also the towns that are further away. Formally, an improved guard tower built in the town u protects the town v if either of the following holds:</p>

<ul>
	<li>u=v;</li>
	<li>there is a direct road from u to v;</li>
	<li>or there is such a town w that there are direct roads from u to w and from w to v.</li>
</ul>

<p>Of course, Bytie still strives to erect at most k towers, but he has no qualms about making these the improved guard towers.</p>

### 입력

<p>In the first line of the standard input, there are three integers, n, m, and k (2 &le; n &le; 500,000, 0 &le; m &le; 1,000,000, 1 &le; k &le; n), separated by single spaces, that specify, respectively, the number of towns and roads in Bytie&#39;s domain, and the number k given by Bytea.</p>

<p>The towns in Bytie&#39;s domain are numbered from 1 to n. Next, m lines describing the roads follow. Each of those lines holds two integers, a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>,b<sub>i</sub> &le; n, ai&ne;bi), indicating that the towns no. a<sub>i</sub> and b<sub>i</sub> are directly linked by a bidirectional road. Each pair of towns is linked by at most a single road.</p>

### 출력

<p>Your program is to print two lines, describing the placement of improved guard towers in Bytie&#39;s domain, to the standard output. The first line is to hold an integer r (1 &le; r &le; k), the number of improved guard towers that Bytie should construct. The second line is to specify the placement of these by providing r pairwise disjoint integers that are the numbers of town where the improved guard towers are to be built. The town numbers can be given in an arbitrary order.</p>

<p>If more than one solution exists, any solution can be printed. Let us remind that any placement of no more than k improved towers will do - you need not minimize their number. You may assume that Bytea was correct, i.e., that the whole domain of Bytie can indeed be protected by k plain (not improved) guard towers. Thus a solution always exists.</p>