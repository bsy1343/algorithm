# [Platinum III] Evacuation Plan - 7412

[문제 링크](https://www.acmicpc.net/problem/7412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7412.%E2%80%85Evacuation%E2%80%85Plan/36ca107a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7412.%E2%80%85Evacuation%E2%80%85Plan/36ca107a.png" data-original-src="https://upload.acmicpc.net/1ee236d5-4f3f-47f3-86aa-42690aff2681/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float: right;" />The City has a number of municipal buildings and a number of fallout shelters that were build specially to hide municipal workers in case of a nuclear war. Each fallout shelter has a limited capacity in terms of a number of people it can accommodate, and there&#39;s almost no excess capacity in The City&#39;s fallout shelters. Ideally, all workers from a given municipal building shall run to the nearest fallout shelter. However, this will lead to overcrowding of some fallout shelters, while others will be half-empty at the same time.</p>

<p>To address this problem, The City Council has developed a special evacuation plan. Instead of assigning every worker to a fallout shelter individually (which will be a huge amount of information to keep), they allocated fallout shelters to municipal buildings, listing the number of workers from every building that shall use a given fallout shelter, and left the task of individual assignments to the buildings&#39; management. The plan takes into account a number of workers in every building - all of them are assigned to fallout shelters, and a limited capacity of each fallout shelter - every fallout shelter is assigned to no more workers then it can accommodate, though some fallout shelters may be not used completely.</p>

<p>The City Council claims that their evacuation plan is optimal, in the sense that it minimizes&nbsp;<i>the total time to reach fallout shelters</i>&nbsp;for all workers in The City, which is the sum for all workers of the time to go from the worker&#39;s municipal building to the fallout shelter assigned to this worker.</p>

<p>The City Mayor, well known for his constant confrontation with The City Council, does not buy their claim and hires you as an independent consultant to verify the evacuation plan. Your task is to either ensure that the evacuation plan is indeed optimal, or to prove otherwise by presenting another evacuation plan with the smaller total time to reach fallout shelters, thus clearly exposing The City Council&#39;s incompetence.</p>

<p>During initial requirements gathering phase of your project, you have found that The City is represented by a rectangular grid. The location of municipal buildings and fallout shelters is specified by two integer numbers and the time to go between municipal building at the location (X<sub>i</sub>,&nbsp;Y<sub>i</sub>) and the fallout shelter at the location (P<sub>j</sub>,&nbsp;Q<sub>j</sub>) is D<sub>i,j</sub>&nbsp;= |X<sub>i</sub>&nbsp;- P<sub>j</sub>| + |Y<sub>i</sub>&nbsp;- Q<sub>j</sub>| + 1 minutes.</p>

### 입력

<p>The input file consists of The City description and the evacuation plan description. The first line of the input file consists of two numbers N and M separated by a space. N (1&nbsp;&le;&nbsp;N&nbsp;&le;&nbsp;100) is a number of municipal buildings in The City (all municipal buildings are numbered from 1 to N). M (1&nbsp;&le;&nbsp;M&nbsp;&le;&nbsp;100) is a number of fallout shelters in The City (all fallout shelters are numbered from 1 to M).</p>

<p>The following N lines describe municipal buildings. Each line contains there integer numbers X<sub>i</sub>, Y<sub>i</sub>, and B<sub>i</sub>&nbsp;separated by spaces, where X<sub>i</sub>, Y<sub>i</sub>&nbsp;(-1000&nbsp;&le;&nbsp;X<sub>i</sub>,&nbsp;Y<sub>i</sub>&nbsp;&le;&nbsp;1000) are the coordinates of the building, and B<sub>i</sub>&nbsp;(1&nbsp;&le;&nbsp;B<sub>i</sub>&nbsp;&le;&nbsp;1000) is the number of workers in this building.</p>

<p>The description of municipal buildings is followed by M lines that describe fallout shelters. Each line contains three integer numbers P<sub>j</sub>, Q<sub>j</sub>, and C<sub>j</sub>&nbsp;separated by spaces, where P<sub>i</sub>, Q<sub>i</sub>&nbsp;(-1000&nbsp;&le;&nbsp;P<sub>j</sub>,&nbsp;Q<sub>j</sub>&nbsp;&le;&nbsp;1000) are the coordinates of the fallout shelter, and C<sub>j</sub>&nbsp;(1&nbsp;&le;&nbsp;C<sub>j</sub>&nbsp;&le;&nbsp;1000) is the capacity of this shelter.</p>

<p>The description of The City Council&#39;s evacuation plan follows on the next N lines. Each line represents an evacuation plan for a single building (in the order they are given in The City description). The evacuation plan of i<sup>th</sup>&nbsp;municipal building consists of M integer numbers E<sub>i,j</sub>&nbsp;separated by spaces. E<sub>i,j</sub>&nbsp;(0&nbsp;&le;&nbsp;E<sub>i,j</sub>&nbsp;&le;&nbsp;1000) is a number of workers that shall evacuate from the i<sup>th</sup>&nbsp;municipal building to the j<sup>th</sup>&nbsp;fallout shelter.</p>

<p>The plan in the input file is guaranteed to be&nbsp;<i>valid</i>. Namely, it calls for an evacuation of the exact number of workers that are actually working in any given municipal building according to The City description and does not exceed the capacity of any given fallout shelter.</p>

### 출력

<p>If The City Council&#39;s plan is optimal, then write to the output file the single word&nbsp;<code>OPTIMAL</code>. Otherwise, write the word&nbsp;<code>SUBOPTIMAL</code>&nbsp;on the first line, followed by N lines that describe your plan in the same format as in the input file. Your plan need not be optimal itself, but must be valid and better than The City Council&#39;s one.</p>