# [Platinum II] Bio Trip - 17853

[문제 링크](https://www.acmicpc.net/problem/17853)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Ollie MacDonald is in charge of a biological reserve used to study the nesting habits of birds. Scattered throughout the reserve are various types of nesting boxes, and one of Ollie&rsquo;s tasks is to regularly check on the boxes. The only way to travel between the boxes is via a set of dirt roads which meet at various junctions in the reserve, and the only way for Ollie to travel on these roads is with an old, beat up tractor (funding hasn&rsquo;t been the greatest for the past few years). Recently, a problem has developed with the steering mechanism of the tractor which limits the turning angles available. Since the junctions are relatively small, the roads that Ollie can take when entering a junction can be restricted. For example, in Figure B.1, if Ollie enters the junction from road A he may be able to leave on either roads B or C, but if he enters via road B, the constrained turning angle may only allow him to leave on road A (the same could happen if he entered on road C).</p>

<p>In addition, due to uneven terrain, it is possible that traveling a road in one direction may take longer than traveling the road in the opposite direction.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17853.%E2%80%85Bio%E2%80%85Trip/05c902f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17853.%E2%80%85Bio%E2%80%85Trip/05c902f0.png" data-original-src="https://upload.acmicpc.net/bbce7107-df37-4f0d-a7df-6701721fdcce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 110px; height: 199px;" /></p>

<p style="text-align: center;">Figure B.1: Sample junction.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17853.%E2%80%85Bio%E2%80%85Trip/cfe59ade.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17853.%E2%80%85Bio%E2%80%85Trip/cfe59ade.png" data-original-src="https://upload.acmicpc.net/cebc88c5-816e-42f3-b9ae-c502b3e0da32/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 159px; height: 221px;" /></p>

<p style="text-align: center;">Figure B.2: Map of Sample Input 1.</p>

<p>As an example, Figure B.2 illustrates the map of the reserve described in the first sample input. In this map, there are two ways to reach junction 3 and return to the biostation: visit all junctions in order in 9 minutes, or travel to junction 3 first, turn left and travel to junction 2 and then back to the start, for a total of 7 minutes.</p>

<p>Note that in this map, the travel times between two junctions is the same no matter which direction Ollie travels. This is not always the case with other maps.</p>

<p>Note also that the tractor cannot travel from the start to junction 3 and then turn right and head for junction 4, since that would require a 135-degree turn but the tractor can only make a 90-degree turn. Ollie also cannot make a U-turn &mdash; a 180-degree turn &mdash; and return to the biostation directly.</p>

<p>The junction at the biostation is large enough for Ollie to turn the tractor in any direction, so he can take any road leading from the biostation.</p>

<p>Given a layout of the roads, turning restrictions on the tractor and a destination box which Ollie needs to visit, he would like to know the minimum time he needs in order to get to the box and back.</p>

### 입력

<p>Input starts with a line containing four integers n d &alpha;<sub>1</sub> &alpha;<sub>2</sub>, where n (2 &le; n &le; 1 000) is the number of junctions (numbered 1 to n), d is the junction containing the bird box to visit, and &alpha;<sub>1</sub> and &alpha;<sub>2</sub> (0 &lt; &alpha;<sub>1</sub>, &alpha;<sub>2</sub> &le; 180) specify the allowed turning angles in degrees (see Figure B.3). The biostation is at junction 1 and is where Ollie&rsquo;s journey both starts and ends. Following this are n lines specifying the dirt roads. Each of these lines has the form m d<sub>1</sub> t<sub>1</sub> a<sub>1</sub> d<sub>2</sub> t<sub>2</sub> a<sub>2</sub> . . . d<sub>m</sub> t<sub>m</sub> a<sub>m</sub>. The i<sup>th</sup> of these lines indicates that there are m dirt roads intersecting at junction i. The first of these roads ends at junction d<sub>1</sub>, needs t<sub>1</sub> minutes to travel and leaves junction i at angle a<sub>1</sub> (where 0 is east, 90 is north, etc.); the second of these roads ends at junction d<sub>2</sub>, needs t<sub>2</sub> minutes to travel and leaves junction i at angle a<sub>2</sub>, etc. The maximum value of m for any junction is 5 and the maximum value for any t<sub>i</sub> is 20.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17853.%E2%80%85Bio%E2%80%85Trip/3ab3e522.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17853.%E2%80%85Bio%E2%80%85Trip/3ab3e522.png" data-original-src="https://upload.acmicpc.net/2e40137a-97f0-4a59-b46f-e3af8960fe6f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 273px; height: 247px;" /></p>

<p style="text-align: center;">Figure B.3: Turning angle specification.</p>

### 출력

<p>Output the minimum time for Ollie to travel from the biostation to the bird box at junction d and back to the biostation. If it is not possible for Ollie to complete the trip, output impossible.</p>