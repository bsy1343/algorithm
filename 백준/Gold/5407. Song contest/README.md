# [Gold II] Song contest - 5407

[문제 링크](https://www.acmicpc.net/problem/5407)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

자료 구조, 기하학, 해시를 사용한 집합과 맵, 구현, 수학, 정렬, 집합과 맵

### 문제 설명

<p>Every year, the continent of Cacophonea organises the Cacophonean Song Contest, for which each of its nations presents an act by a national singer or group. Each Cacophonean inhabitant may televote for any act which is not from his nation, so a nation can never vote for its own act. In the end, each of the s Cacophonean nations will award points to r acts. The act which received most votes from a certain nation will get r points from this nation, the act with the second largest amount of votes will get r &minus; 1 points, etc., so the act with the rth largest amount of votes gets 1 point and less popular acts get no points from the voting nation. The final ranking of the song contest will then be decided by the total amount of points each nation received.&nbsp;</p>

<p>Music producer Dustin has been eagerly following the Cacophonean Song Contest for many years. Lately, he has observed that in certain nations, televotes are politically rather than artistically motivated:</p>

<ul>
	<li>Politically voting nations prefer acts from neighbouring nations. More specifically, the Euclidean distance between their capital and another nation&#39;s capital is their popularity mea- sure, irregardless of the artistic quality of the corresponding act. Hence, the nation with the closest capital will get most votes and the nation with the farthest capital will receive the least votes, which could yield no points at all if r &lt; s &minus; 1. It will never occur that two or more capitals will have the same distance to a certain capital.</li>
	<li>Nations that vote quality-motivated will, as the name suggests, award points to nations according to an indisputable act ranking based on each act&#39;s artistic quality. In this ranking, there will be no ties so each nation has its own unique rank.</li>
</ul>

<p>However, Dustin has heard he can influence the voting behaviour of other nations: an artist can find favour of politically voting nations by giving them special attention during his act (e.g. by singing parts in their local dialects, waving their flags, etcetera). The more a politically voting nation will receive such attention in an act, the higher it will rank it. Of course this will be at the cost of the original act and might result in terribly campy results. Therefore, nations that vote according to artistic quality will punish such behaviour.</p>

<p>More specifically, Dustin can divide an act into exactly s &minus; 1 parts. Originally, all parts are dedicated to the nation of the performer (i.e. they reflect his original artistic ideas), but this can be changed:</p>

<ul>
	<li>For each part in the act that will be dedicated to a certain politically voting nation, that nation will rank the performer&#39;s nation one place higher (unless the performer&#39;s nation is already ranked first). As each nation has a unique ranking position, the nation that originally was at that higher rank will then be ranked one place lower.</li>
	<li>Quality-motivated voting nations do not like these soft-soaping attempts at all. Therefore, for each part in the act that will be dedicated to a nation which is not the original performer&#39;s nation, quality-motivated nations will rank the original performer&#39;s nation one place lower (unless the performer&#39;s nation is already ranked lowest).</li>
</ul>

<p>Only the fact that a certain amount of parts is dedicated to a certain nation will influence voting behaviour: the exact part dedication sequence in the total act is not of interest here.</p>

<p>Dustin wants to use this knowledge (which no other Cacophonean producer has) to produce a smashing act, yielding as much points in the overall results as possible. You are asked to determine what the largest possible overall point score is he can obtain for an act, when he optimally exploits the described act-changing practices.</p>

### 입력

<ul>
	<li>The first line of input consists of the integer number n, the number of test cases;</li>
	<li>Then, for each test case:
	<ul>
		<li>A line with an integer number s (1 &lt; s &le; 100), indicating the number of participating nations in the song contest;</li>
		<li>Then, for each nation:
		<ul>
			<li>A line containing:
			<ul>
				<li>A string c (not containing any spaces) with the nation&#39;s name, followed by a space. Within a test case, there will not be multiple nations sharing the same name;</li>
				<li>A character indicating the nation&#39;s voting behaviour: `q&#39; if the voting behaviour is quality-motivated and `p&#39; if the behaviour is politically motivated.</li>
			</ul>
			</li>
			<li>A line containing:
			<ul>
				<li>The location of the nation&#39;s capital, expressed in an (x, y) integer coordinate (&minus;10000 &le; x &le; 10000, &minus;10000 &le; y &le; 10000). x and y are separated by a space. Furthermore, y is followed by a space;</li>
				<li>The actual artistic quality rank q of the nation&#39;s act. This is a unique number in the range 1 ...s.</li>
			</ul>
			</li>
		</ul>
		</li>
		<li>A line with an integer number r (0 &lt; r &le; s &minus; 1), indicating to how many nations each nation will attribute points;</li>
		<li>A line with the name of the nation for which Dustin should produce a song, achieving as much points as possible.</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case, the output contains a single line with a single integer number: the maximal amount of points an act can obtain in the overall final score, if act-changing practices were performed in an optimal way.</p>